import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecucion_Sumador {

    public static void main(String[] args) throws IOException {

        //declarar ProcessBuilder
        ProcessBuilder pb = new ProcessBuilder();

        //Metodo command para ejecutar comandos escritos como Strings
        pb.command("java","Sumador","1","4");

        //el metodo devuelve un objeto tipo Process que hay que recoger en una variable
        Process p = pb.start();


        // Opcion para escribir el resultaod en un txt
        //proceso.redirectOutput(new File("test.txt"));


        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


    }

}
