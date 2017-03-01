/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumo;

/**
 *
 * @author aguadulce
 */
public class Zumo {
    private int litros;//contenido actual del deposito de zumo.
    private int precio_litro;
    private String sabor;
    private int litros_max;//capacidad máxima del deposito.

    /*Constructor por defecto*/
    public Zumo() {
    }
    /*Constructor por parámetros*/
    public Zumo(int litros, int precio_litro, String sabor, int litros_max) {
        this.litros = litros;
        this.precio_litro = precio_litro;
        this.sabor = sabor;
        this.litros_max = litros_max;
    }
    
    /*Método que permite consultar el contenido actual que tiene el deposito*/
    public int obtenerLitros(){
        return litros;
    }
    
    
    /*Método que permite sacar zumo del deposito siempre y cuando
    se tenga el dinero suficientes.Este método se probará con JUnit*/
    public void sacarZumo(int litros, int dinero) throws Exception
    {
        if (dinero <= 0) {
            throw new Exception("Es necesaria una cantidad de dinero positiva para sacar zumo");
        }


        if (dinero <(litros*precio_litro)) {
            throw new Exception("No tiene suficiente dinero");
        }
               //capturar pantalla y meter en word
        if (litros>40){
             throw new Exception("No puede sacarse una cantidad superior al contenido del deposito");
        }
        
        if (litros<0){
                         throw new Exception("No puede sacar una cantidad negativa de litros");       
        }
        
        if (this.litros - litros<0){
                       throw new Exception("No queda zumo disponible");       
     
        }
        
            this.litros =this.litros - litros;
    }

    
    /*Método que permite rellenar el deposito de zumo siempre y cuando
    la capacidad no se sobrepase. Este método sera probado con JUnit.*/
    public void rellenar(int litros) throws Exception

{
	if ((this.litros + litros)>this.litros_max )
        {throw new Exception("No se puede sobrepasar la capacidad del depósito");}
        
       //capturar pantalla y meter en word
        if ( litros<0 )
        {throw new Exception("No se puede recargar un numero negativo de litros");}	
	
		
		
	this.litros=this.litros + litros;

	
}

}

