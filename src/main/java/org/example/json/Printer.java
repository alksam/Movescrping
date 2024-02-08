package org.example.json;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Printer {
            public void readFile() {

                ObjectMapper om = new ObjectMapper();
                String fileName ="C:\\Users\\moham\\AppData\\Local\\Temp\\088315e9-00d1-4065-a540-e3f3fa426d4d_startcodeexam_v2.zip.d4d\\Movescrping\\src\\main\\java\\org\\example\\json\\package.json";  //https://aviationstack.com/documentation
                File jsonfile = new File(fileName);

                try {
                    FileReader fr = new FileReader(jsonfile);
                    employees Acc = om.readValue(jsonfile, employees.class);
                    System.out.println(Acc);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }



        public static void main(String[] args) {

        Printer printer = new Printer();
        printer.readFile();

        }

    }

