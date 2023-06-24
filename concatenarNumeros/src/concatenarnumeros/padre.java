
package concatenarnumeros;

// stributos 
public class padre {
    public String nombredePropietario;// para que el usuario coloque su nombre 
    protected String numerodeserie;
    private String color;
// constructos 
    public padre(String nombredePropietario, String numerodeserie, String color) {
        this.nombredePropietario = nombredePropietario;
        this.numerodeserie = numerodeserie;
        this.color = color;
    }
//gedr and seder 
    public String getNombredePropietario() {
        return nombredePropietario;
    }

    public void setNombredePropietario(String nombredePropietario) {
        this.nombredePropietario = nombredePropietario;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
   
    public double sumar(double primerNumero, double segundoNumero,  double tercerNumero){
        return primerNumero + segundoNumero+tercerNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero ,double tercerNumero){
        return primerNumero - segundoNumero -  tercerNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero * segundoNumero* tercerNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero,double tercerNumero){
        return primerNumero / segundoNumero /tercerNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    } 
    
}
