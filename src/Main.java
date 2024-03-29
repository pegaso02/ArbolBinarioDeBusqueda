public class Main {
    public static void main(String[] args) {

        ABB arbolBinario = new ABB();
        arbolBinario.insertarDatos(50);
        arbolBinario.insertarDatos(30);
        arbolBinario.insertarDatos(70);
        arbolBinario.insertarDatos(20);
        arbolBinario.insertarDatos(40);
        arbolBinario.insertarDatos(60);
        arbolBinario.insertarDatos(80);


        arbolBinario.recorrerArbol(); // Llama al método recorrerArbol



    }
}
