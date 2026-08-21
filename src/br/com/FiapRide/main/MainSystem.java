// Define localização de onde a classe está "guardada"
package br.com.fiapride.main;

// importa classe que se encontra no mesmo projeto
import br.com.fiapride.model.Passenger;

public class MainSystem {
    public static void main(String[] args) {
        // Instancia passageiro (autoexplicativo)
        Passenger passenger1 = new Passenger();
        passenger1.name = "Rubens";
        passenger1.cash = 120.20;

        Passenger passenger2 = new Passenger();
        passenger2.name = "Isaque";
        passenger2.cash = 301.50;

        System.out.println("--- FiapRide System ---");
        System.out.println(
            "Passenger name: " + passenger1.name +
            ", cash: " + passenger1.cash
        );

        System.out.println(
            "Passenger name: " + passenger2.name +
            // `String.format` foi usado para definir quantidade de casa decimais para ser exibido com println, devido a suas propiedades
            ", cash: " + String.format("%.2f", passenger2.cash)
        );
    }
}
