
package ejemploobjetos;

public class EjemploObjetos {
    
    public static void main(String[] args) {
        //instanciamos//
        Semaforo unsemaforo = new Semaforo();
        
        //le damos valor a la variable//
        unsemaforo.ponColor("verde");
       
        String valor = unsemaforo.dameColor();// a traves del medoto dameColor, me esta devolviendo un valor de tipo String//
        System.out.println("color ="+ valor);//visualizo pantalla resultado =null al no haberle dicho que sea verde//
        
        
        Semaforo otroSemaforo = new Semaforo();//creamos otro semaforo con color ambar//
        otroSemaforo.ponColor("ambar");
        //visualizo de nuevo//
        System.out.println("color2 ="+otroSemaforo.dameColor());
        //añado un comentario
        
        //añado otro comentario
        
        
        
        
    }
    
}
