package hu.petrik.szuperhosprojekt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kepregeny {
    public static ArrayList<Milliardos> szuperhosLista;
    public static void szereplok(String path) {
        szuperhosLista = new ArrayList<>();
        File f = new File(path);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("\\s+");
                Milliardos hos;
                if (line[0].equals("Vasember")) hos = new Vasember();
                else hos = new Batman();
                for (int i = 0; i < Integer.parseInt(line[1]); i++) {
                    hos.kutyutKeszit();
                }
                szuperhosLista.add(hos);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Invalid file format!");
        } catch (Exception e) {
            System.out.println("Failed to read file!");
        }
    }
    public static void szuperhosok() {
        szuperhosLista.forEach(System.out::println);
    }
}
