package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //create object of Properties
    //static so it can read before everything else runs and only runs once
    private static Properties properties = new Properties();

    static{


        try {

            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            //close the file
            //better to close a fileInputStream when you're done with it instead of letting GarbageCollector
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
