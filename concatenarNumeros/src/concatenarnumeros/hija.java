
package concatenarnumeros;

import java.util.Random;


public class hija extends padre {

    public hija(String nombredePropietario, String numerodeserie, String color) {
        super(nombredePropietario, numerodeserie, color);
    }
    
   
    public int generarNumeroAleatorio(int limiteSuperior) {
        Random random = new Random();
        return random.nextInt(limiteSuperior);
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    public double calcularLogaritmo(double numero) {
        return Math.log(numero);
    }

    public double calcularSeno(double anguloEnRadianes) {
        return Math.sin(anguloEnRadianes);
    }

    public double calcularCoseno(double anguloEnRadianes) {
        return Math.cos(anguloEnRadianes);
    }
    
    public double calcularTangente(double anguloEnRadianes) {
        return Math.tan(anguloEnRadianes);
    }
    
    public double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }
    
  
    
}
