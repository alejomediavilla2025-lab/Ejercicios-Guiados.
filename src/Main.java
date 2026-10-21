public class Main {
    public static void main(String[] args) {

        System.out.println("=== CONTADOR INICIAL ===");
        System.out.println("Total: " + Producto.getTotalCreados());

        Producto producto1 =
                new Producto("Mouse", 20, "Tecnologia");

        Producto producto2 =
                new Producto("Teclado", 35, "Computacion");

        Producto producto3 =
                new Producto("Monitor", 150, "Electronica");

        System.out.println("\n=== PRODUCTOS CREADOS ===");

        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Categoria: " + producto1.getCategoria());
        System.out.println("ID: " + producto1.getId());

        System.out.println("\nNombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Categoria: " + producto2.getCategoria());
        System.out.println("ID: " + producto2.getId());

        System.out.println("\nNombre: " + producto3.getNombre());
        System.out.println("Precio: " + producto3.getPrecio());
        System.out.println("Categoria: " + producto3.getCategoria());
        System.out.println("ID: " + producto3.getId());

        System.out.println("\n=== CONTADOR FINAL ===");
        System.out.println("Total de productos creados: "
                + Producto.getTotalCreados());

        System.out.println("\n=== MODIFICAR PRODUCTO ===");

        producto1.setPrecio(25);

        System.out.println("Nuevo precio del mouse: "
                + producto1.getPrecio());
    }
}

