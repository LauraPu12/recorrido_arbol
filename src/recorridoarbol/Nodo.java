
package recorridoarbol;

public class Nodo<T> { //la T es para decir el tipo, manejar nodos de cualquier tipo
    private T dato; 
    private Nodo[]hijo; 

    public Nodo(T dato, Nodo[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }
    Nodo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public T getDato() {
        return dato;
    }

    public Nodo[] getHijo() {
        return hijo;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijo(Nodo[] hijo) {
        this.hijo = hijo;
    }
    public void setHijo(int pos, T dato){ //nuevo hijo en una posicion especifica
        Nodo[] nuevoHijo = new Nodo[pos + 1]; //nuevo arreglo, donde el tamaño depende de la posicion
        
        nuevoHijo[pos] = new Nodo(dato, null);//en la posicion indicada se crea, un nuevo nodo con el dato recibido
        
        this.hijo = nuevoHijo; //el nuevo arreglo se asigna como hijos del nodo actual
    }
    public void preOrden(){
        System.out.print(this.dato + ","); //imprimir dato del nodo actual
        if(hijo == null)return;//si no tiene hijos termina el metodo
        
        for (Nodo n : hijo){ //recorre cada hijo del arreglo
            
            if (n != null)//verifica que el nodo no sea null
            
            n.preOrden();
    }
    }
}
