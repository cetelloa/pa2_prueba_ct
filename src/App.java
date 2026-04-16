import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedido2 = new Pedido("Carlos Tello", "Pilsener", 150, "cetello@uce.edu.ec", "0960430290");
        PedidoService service = new PedidoService();
        service.registrar(pedido2);
        System.out.println("------------------------");

        Pedido pedido3 = new Pedido("Carlos Tello", "Pilsener", 20, "cetello@uce.edu.ec", "0960430290");
        service.registrar(pedido3);
        System.out.println("------------------------");

        Pedido pedido4 = new Pedido("Carlos Tello", "Pilsener", 51, "cetello@uce.edu.ec", "0960430290");
        service.registrar(pedido4);
        System.out.println("------------------------");

    }
}
