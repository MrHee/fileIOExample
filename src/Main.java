import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] unsortedArray = fileIO.readFile("src/unsorted.txt");

        fileIO.writeFile("anotherUnsorted.txt", unsortedArray);

    }
}