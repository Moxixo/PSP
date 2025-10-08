public class Sumador {

    public static void main(String[] args) {

        // Recojo los valores que me envia el usuario en tiempo de ejecucion
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        //Realizo la suma de todos los numeros comprendidos

        int total = 0;
        for (int i = num1; i <= num2; i++){

            total += i;
        }

        // Muestro el total por pantalla
        System.out.println(total);


    }
}