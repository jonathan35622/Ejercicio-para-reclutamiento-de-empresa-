package inicio;

;

import controlador.ControladorVehiculos;
import java.util.Arrays;
import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;



public class Run {

    public static void main(String[] args) {
        
        ControladorVehiculos controlVehiculo = new ControladorVehiculos();
        Vehiculo[] listaVehiculos = controlVehiculo.agregarVehiculos();
        
        Vehiculo vehiculoMasCaro = new Vehiculo();
        Vehiculo vehiculoMenosCaro = new Vehiculo();
        Vehiculo vehiculoConLetraY = new Vehiculo();
  
        vehiculoMasCaro = listaVehiculos[0];

        vehiculoMenosCaro = listaVehiculos[0];

        for (int i = 0; i < listaVehiculos.length; i++) {
            if (vehiculoMasCaro.getPrecio() < listaVehiculos[i].getPrecio()) {
                vehiculoMasCaro = listaVehiculos[i];
            }

            if (vehiculoMenosCaro.getPrecio() > listaVehiculos[i].getPrecio()) {
                vehiculoMenosCaro = listaVehiculos[i];
            }

            if (listaVehiculos[i] instanceof Auto) {
                System.out.println("Marca: " + ((Auto) listaVehiculos[i]).getMarca() + " // Modelo: " + ((Auto) listaVehiculos[i]).getModelo() + " // Puertas: " + ((Auto) listaVehiculos[i]).getPuertas() + " // Precio: $" + ((Auto) listaVehiculos[i]).getPrecio());
            }

            if (listaVehiculos[i] instanceof Moto) {
                System.out.println("Marca: " + ((Moto) listaVehiculos[i]).getMarca() + " // Modelo: " + ((Moto) listaVehiculos[i]).getModelo() + " // Cilindradas: " + ((Moto) listaVehiculos[i]).getCilindradas() + " // Precio: $" + ((Moto) listaVehiculos[i]).getPrecio());
            }
            int indexOf = listaVehiculos[i].getMarca().toUpperCase().indexOf("Y");
            if (indexOf > -1) {
                vehiculoConLetraY = listaVehiculos[i];
            }

        }
        System.out.println("================================================================================");
        System.out.println("Vehículo más caro : " + vehiculoMasCaro.toString());
        System.out.println("Vehículo más barato : " + vehiculoMenosCaro.toString());
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculoConLetraY.getMarca() + " " + vehiculoConLetraY.getModelo() + " $" + vehiculoConLetraY.getPrecio());
        System.out.println("================================================================================");
        Arrays.sort(listaVehiculos);
        imprimeArrayVehiculo(listaVehiculos);
       
    }

    
    static void imprimeArrayVehiculo(Vehiculo[] array) {
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getMarca() + " " + array[i].getModelo());
        }
    }
    
}
