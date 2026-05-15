
package recorridoarbol;

public class RecorridoArbol {


    public static void main(String[] args) {
        Nodo tree = new Nodo<Integer>();//crear clase Integer como clase primitiva
        tree.setDato(45);
        //tree.setHijo(new Nodo[]{new Nodo(23,null), new Nodo(11,null)});//new para cada hijo y new para cada arreglo
        Nodo[]arrNodo={new Nodo(23,null),new Nodo(11,null)};
        tree.setHijo(arrNodo);
        tree.getHijo()[0].setHijo (0, 50); //arreglo de tamaño 1
        tree.getHijo()[1].setHijo (1, 40); //arreglo de tamaño 2
        
        System.out.println("Recorrido PreOrden:");
        tree.preOrden();
        System.out.println("");//salto de linea
        
        
        
    }
    
}
