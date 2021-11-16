import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;

public class main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        ListFile lists = new ListFile();
        String CurrentInput = "";

        System.out.println("Enter the directory you would like to search through: ");
        File[] files = lists.ThisFile(Input.nextLine());

        do {
            System.out.println("Enter search file name (\"~\" to stop): ");
            CurrentInput = Input.nextLine();
            lists.SearchFiles(files, CurrentInput);
        } while(CurrentInput != "~");

        Input.close();
    }

}
