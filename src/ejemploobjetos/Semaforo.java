
package ejemploobjetos;

public class Semaforo {
    //declaro los atributos//
    private String color;
    //declaro los metodos//
    public void ponColor(String c){
        color = c;
    }
    public String dameColor(){
        return color;    
    }

    void dameColor(String rojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //añado otro comentario//
    }
}
