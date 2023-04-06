import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileIO {

    //Input and output methods from text files.

    static int[] readFile(String filePath){

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;

        while(scanner.hasNextInt()){
            arrayList.add(scanner.nextInt());
        }

        //Convert arrayList to int[]

        int[] asArray = new int[arrayList.size()];
        for (int j = 0; j < arrayList.size(); j++) {
            asArray[j] = arrayList.get(j).intValue();
        }

        return asArray;
    }

}
