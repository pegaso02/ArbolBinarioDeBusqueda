import java.lang.System;
public class ABB {


    Nodo raiz;

    /*Insertar datos*/
    public Nodo insertarDatos(Nodo raiz, int dato){
        if(raiz == null){
            raiz = new Nodo(dato);
            return raiz;
        } else if (dato < raiz.dato) {
            raiz.izquierdo = insertarDatos(raiz.izquierdo, dato);
        } else if (dato > raiz.dato) {
            raiz.derecho = insertarDatos(raiz.derecho, dato);
        }
        return raiz;
    }

    public void insertarDatos(int dato){
        raiz = insertarDatos(raiz, dato);
    }

    /*Recorrer Arbol*/

    public void recorrerArbol(Nodo raiz){
        if(raiz != null){
            recorrerArbol(raiz.izquierdo);
            System.out.println(raiz.dato+" imprimiendo");
            recorrerArbol(raiz.derecho);

        }else{
            return;
        }
    }

    public void recorrerArbol(){
        recorrerArbol(raiz);
    }

}
