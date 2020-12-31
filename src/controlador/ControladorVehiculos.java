
package controlador;

import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;


public class ControladorVehiculos {
    
     public Vehiculo[] agregarVehiculos(){
  
        Vehiculo listaVehiculos[] = new Vehiculo[4];
        listaVehiculos[0] = new Auto("Peugeot", "206", 200000.00, 4);
        listaVehiculos[1] = new Moto("Honda", "Titán", 60000.00, "165cc");
        listaVehiculos[2] = new Auto("Peugeot", "208", 250000.00, 5);
        listaVehiculos[3] = new Moto("Yamaha", "YBR", 80500.00, "160cc");
        
        
        return listaVehiculos;
    }

    
}
