package plots;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class command_execution {

    /**
     * executes the git log command in the src folder
     *
     * @return Stringlist with the git log commands
     */
    public static ArrayList<String> get_logs() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        // cd into the src folder and execute the git log command
        processBuilder.command("bash", "-c", "cd src/ && git log");
        try {

            Process process = processBuilder.start();

            ArrayList<String> loglines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                // add every git log line to the Stringlist
                loglines.add(line);
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                return loglines;
            } else {
                //abnormal...
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
