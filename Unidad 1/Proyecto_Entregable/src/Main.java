import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Estas en: " + System.getProperty("os.name"));

        menu();
        int opcion = sc.nextInt();

        if(comprobarSistema()){

            try {
                abrirWindows(opcion);
            }catch (IOException e){
                System.out.println("Hubo un problema de ejecucion");
            }
        }
        else {

            try {
                abrirLinux(opcion);
            }catch (IOException e){
                System.out.println("Hubo un problema de ejecucion");
            }
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
                p = pb.start();
                break;
            case(2):
                pb.command("notepad");
                p = pb.start();
                break;
            case(3):
                pb.command("calc");
                p = pb.start();
                break;
        }


    }

    public static void abrirLinux(int opcion) throws IOException{

        Process p;

        switch(opcion){

            case(1):
                pb.command("firefox");
                p = pb.start();
                break;
            case(2):
                pb.command("x-terminal-emulator", "-e", "nano","~/miArchivo.txt");
                p = pb.start();
                break;
            case(3):
                pb.command("gnome-calculator");
                p = pb.start();
                break;

        }

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