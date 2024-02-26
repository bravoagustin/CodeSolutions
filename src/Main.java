import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("year:");
        int year = scanner.nextInt();

        int resultado = solution(year);
        System.out.println("result:" + resultado);
    }

    //funcion
        public static int solution (int year) {
            int resultado = 0;

            if(year > 0){
                 resultado = (year - 1) / 100 + 1;
                 Math.round(resultado);
                 System.out.println("century:" + resultado);
             }

            else {
                System.out.println("Error en la busqueda");
             }
            return resultado;
        }
}