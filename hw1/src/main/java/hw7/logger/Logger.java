package hw7.logger;

import java.io.FileWriter;

public class Logger implements Repository{
    private static final String LOG_PATH = "hw1/src/main/java/hw7/logger/log.txt";
    @Override
    public void saveLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text + "\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
