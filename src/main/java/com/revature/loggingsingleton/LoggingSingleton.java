package com.revature.loggingsingleton;

import java.io.BufferedWriter;

public class LoggingSingleton {
    //We want different levels of logging, example DEBUG, INFO, WARN
    //We want to be able to setup writing to a file, and printing to the console

    //Things we need to write text to a file/make our lives easier
    private static final String FILE = "log.txt";
    private static StringBuffer sb;
    //To write to a file we can use a couple of options, but we will use the BufferedWriter, because it allows to write
    //Entire lines of data to a text file
    private BufferedWriter fileWriter;

    //Let the user decide whether they want to write their output to a file or to the console or neither
    private boolean writeToFile = false;
    private boolean writeToConsole = true;

    //To create a lazy singleton you can just declare a private static instance of the object
    private static LoggingSingleton logger;

}
