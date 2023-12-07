public class ListaCola {
    NodoLista head;
    NodoLista tail;

    ListaCola() {
        head = null;
        tail = null;
    }

    boolean estaVacia() {
        return head == null;
    }

    void insertarHead(Object a) {
        NodoLista nuevoNodo = new NodoLista(a);
        if (estaVacia()) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        }
    }

    void insertarTail(Object a) {
        NodoLista nuevoNodo = new NodoLista(a);
        if (estaVacia()) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.siguiente = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    void recorrerLista() {
        NodoLista actual = head;
        while (actual != null) {
            System.out.print(actual.elemento + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
