// Define localização de onde a classe está "guardada"
package br.com.fiapride.main;

// importa classe que se encontra no mesmo projeto
import br.com.fiapride.model.Passenger;

public class MainSystem {
    public static void main(String[] args) {
        // String name, double balance, char gender, int rides, float stars
        // Stars devem estar entre 0 e 5!
        Passenger passenger1 = new Passenger("Rubens", 120.20, 'M', 2, 4.5f);
        Passenger passenger2 = new Passenger("Isaque", 301.50, 'M', 12, 4.7f);

        System.out.println("--- FiapRide System ---");
        System.out.println(
            "Passenger name: " + passenger1.name +
            ", cash: " + passenger1.balance
        );

        System.out.println(
            "Passenger name: " + passenger2.name +
            // `String.format` foi usado para definir quantidade de casa decimais para ser exibido com println, devido a suas propiedades
            ", cash: " + String.format("%.2f", passenger2.balance)
        );
    }


}
