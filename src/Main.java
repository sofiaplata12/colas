public class Main {
    public static void main(String[] args) {
        Queue cola = new Queue();

        System.out.println("¿Vacía al inicio? " + cola.isEmpty()); // true

        cola.insert(10);
        cola.insert(20);
        cola.insert(30);

        System.out.println(cola); // [10, 20, 30]
        System.out.println("Tamaño: " + cola.size()); // 3

        System.out.println("Extract: " + cola.extract()); // 10
        System.out.println(cola); // [20, 30]

        System.out.println("¿Contiene 20? " + cola.search(20)); // true
        System.out.println("¿Contiene 99? " + cola.search(99)); // false

        cola.insert(40);
        System.out.println(cola); // [20, 30, 40]

        cola.clear();
        System.out.println("¿Vacía después de clear()? " + cola.isEmpty()); // true
        System.out.println("Tamaño después de clear(): " + cola.size()); // 0
    }
}