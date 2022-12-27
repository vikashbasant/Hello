package in.co.decimal.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReadCSVFile {
    public static void main(String[] args) {
        String path = "/home/decimal/Downloads/Data.csv";

        try {
            BufferedReader br = new BufferedReader (new FileReader (path));
            LocalDateTime now;
            System.out.println (now = LocalDateTime.now());
            String line;
            int count = 0;
            while((line = br.readLine()) != null){
                System.out.println (line);
                count++;
            }
            System.out.println (now = LocalDateTime.now());
            System.out.println (count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException (e);
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
    }
}
