public class Main {
    public static void main(String[] args) {
        int numeroDecimal = 23;
        int base = 8;  // 13 6 3

        ListaPila listaPila = new ListaPila();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % base;
            listaPila.insertarHead(residuo);
            numeroDecimal /= base;
        }

        System.out.print("Número en base " + base + ": ");
        listaPila.recorrerLista();
    }
}
