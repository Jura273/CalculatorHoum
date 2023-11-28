package Callculator;

import Callculator.controller.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Program {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fh = new FileHandler("Log");
        logger.addHandler(fh);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setFormatter(simpleFormatter);
        logger.info("Старт программы");

        Controller controller = new Controller();
        controller.getResult();

        logger.log(Level.INFO, "Остановка программы");
    }
}