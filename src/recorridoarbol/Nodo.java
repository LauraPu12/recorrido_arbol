
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
        
    }
    public void preOrden(){
        System.out.print(this.dato);
        if(hijo == null)return;
        for (Nodo n : hijo){
            if (n != null)
            System.out.print(",");
            n.preOrden();
    }
    }
}
