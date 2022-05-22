import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    public String saveGame(String path, GameProgress gameProgress) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
            return "Файл создан";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    public String zipFiles(String path, List<String> files) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(path))) {
            for (String f : files) {
                FileInputStream fis = new FileInputStream(f);
                ZipEntry entry = new ZipEntry(f);
                zout.putNextEntry(entry);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
                zout.closeEntry();
            }
            return "Архив создан";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
