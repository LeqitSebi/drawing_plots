package plots;

import java.util.ArrayList;
import java.util.Arrays;

import static plots.command_execution.get_logs;

public class get_values {

    public static int[] values(){
        ArrayList<String> input = get_logs();
        int [] values = new int[7];
        assert input != null;
        for (int i = 0; i < input.size(); i++) {
            String toCompare = input.get(i);
            if (toCompare.contains("Mon")){
                values[0]++;
            }if (toCompare.contains("Tue")){
                values[1]++;
            }if (toCompare.contains("Wed")){
                values[2]++;
            }if (toCompare.contains("Thu")){
                values[3]++;
            }if (toCompare.contains("Fri")){
                values[4]++;
            }if (toCompare.contains("Sat")){
                values[5]++;
            }if (toCompare.contains("Sun")){
                values[6]++;
            }
        }
        return values;
    }
}
