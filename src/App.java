import com.edu.uce.negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido1 = new Pedido("Dylan Soto", "Coca Cola", 1200.0, "dyst@example.com");
        PedidoService service = new PedidoService();
        service.registrar(pedido1);
    }
}
