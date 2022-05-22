import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();

        //1 Код создания папок и файлов из предыдущей задачи
        /*
        File dirGames = new File("C://Games");

        File dirSrc = new File(dirGames,"src");
        if(dirSrc.mkdir()) {
            log.append("Каталог " + dirSrc + " создан.\n");
        }
        File dirRes = new File(dirGames,"res");
        if(dirRes.mkdir()) {
            log.append("Каталог " + dirRes + " создан.\n");
        }
        File dirSavegames = new File(dirGames,"savegames");
        if(dirSavegames.mkdir()) {
            log.append("Каталог " + dirSavegames + " создан.\n");
        }
        File dirTemp = new File(dirGames,"temp");
        if(dirTemp.mkdir()) {
            log.append("Каталог " + dirTemp + " создан.\n");
        }
        //2
        File dirMain = new File(dirSrc, "main");
        if(dirMain.mkdir()) {
            log.append("Каталог " + dirMain + " создан.\n");
        }
        File dirTest = new File(dirSrc, "test");
        if(dirTest.mkdir()) {
            log.append("Каталог " + dirTest + " создан.\n");
        }
        //3
        File fileMain = new File(dirMain, "Main.java");
        try {
            if (fileMain.createNewFile()) {
                log.append("Файл " + fileMain + " создан.\n");
            }
        } catch (IOException ex) {
                log.append(ex.getMessage());
        }

        File fileUtils = new File(dirMain, "Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                log.append("Файл " + fileUtils + " создан.\n");
            }
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }
        //4 drawables, vectors, icons
        File dirDrawables = new File(dirRes, "drawables");
        if(dirDrawables.mkdir()) {
            log.append("Каталог " + dirDrawables + " создан.\n");
        }
        File dirVectors = new File(dirRes, "vectors");
        if(dirVectors.mkdir()) {
            log.append("Каталог " + dirVectors + " создан.\n");
        }
        File dirIcons = new File(dirRes, "icons");
        if(dirIcons.mkdir()) {
            log.append("Каталог " + dirIcons + " создан.\n");
        }
        //5
        File fileTemp = new File(dirTemp, "temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                log.append("Файл " + fileTemp + " создан.\n");
            }
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter(fileTemp, false)) {
            fileWriter.write(log.toString());
            fileWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } */

        GameProgress savegames1 = new GameProgress(100, 1, 1, 0.0);
        GameProgress savegames2 = new GameProgress(80, 3, 5, 10.5);
        GameProgress savegames3 = new GameProgress(550, 6, 10, 33.8);
        List<String> files = new ArrayList<>();
        files.add("C:\\Games\\savegames\\save1.dat");
        files.add("C:\\Games\\savegames\\save2.dat");
        files.add("C:\\Games\\savegames\\save3.dat");


        System.out.println(savegames1.saveGame(files.get(0), savegames1));
        System.out.println(savegames1.zipFiles("C:\\Games\\savegames\\zip.zip", files));

        System.out.println(savegames2.saveGame(files.get(1), savegames2));
        System.out.println(savegames2.zipFiles("C:\\Games\\savegames\\zip.zip", files));

        System.out.println(savegames3.saveGame(files.get(2), savegames3));
        System.out.println(savegames3.zipFiles("C:\\Games\\savegames\\zip.zip", files));







    }
}
