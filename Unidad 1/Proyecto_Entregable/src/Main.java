import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {



        Scanner sc = new Scanner(System.in);

        menu();
        int opcion = sc.nextInt();

        if(comprobarSistema()){

            abrirWindows(opcion);

        }
        else {

            abrirLinux(opcion);

        }


    }


    public static ProcessBuilder pb = new ProcessBuilder();

    public static boolean comprobarSistema(){

        String os = System.getProperty("os.name");

        if(os.contains("Windows")){

            return true;
        }
        else {

            return false;
        }

    }

    public static void abrirWindows(int opcion) throws IOException{

        Process p;

        switch(opcion){

            case(1):
                pb.command("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

            case(2):

                pb.command("notepad");
            case(3):

                pb.command("calc");
        }


    }

    public static void abrirLinux(int opcion) throws IOException{

        Process p;

        switch(opcion){

            case(1):
                pb.command("firefox");

            case(2):
                pb.command("nano");

            case(3):
                pb.command("gnome-calculator");

        }

        p = pb.start();

    }

    public static void menu(){

        System.out.println("Elige una aplicacion:");
        System.out.println("""
                     1 - Chrome (Windows) / Firefox (Linux)
                     2 - Notepad (Windows) / Nano (Linux)
                     3 - Calculadora
                     """);

    }

}