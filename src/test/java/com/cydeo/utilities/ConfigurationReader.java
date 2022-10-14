package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//This class is only 1 time we are creating in utilities package
public class ConfigurationReader {

    //1- create the object of Properties class
    //We need properties class to use methods coming from class like load(), getProperty ("key")
    //it is static because we are using it in static method and static block
    //it is private because I will use only this class
 private static    Properties properties = new Properties();

 // we want to open the properties file and load to properties object ONLY ONCE before reading
    //having static block because static runs first

    static {


     try{
    // 2- Create the object FileInputStream
    //We need this object to an open pile as a stream in Java memory
    FileInputStream file = new FileInputStream("configuration.properties");


        //3. Load the properties object using FileInputStream object
        //Load properties object with file we opened using FileInputStream
        properties.load(file);


        //close the file after loading
         //if we do not close the file , it will stay in java memory like scanner

        file.close();

        }catch (IOException e){
         e.printStackTrace();
    }
}

    /**
     * This method is used to read value from configuration.properties file
     * @param keyword -> key name in configuration.properties file
     * @return -> value for the key. returns null if key is not found
     *driver.get(ConfigurationReader.getProperty("env")
     *
     */
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
}
}