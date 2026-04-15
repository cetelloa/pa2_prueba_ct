import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        Pedido pedido2 = new Pedido("Carlos Tello","Pilsener", 15.2, "cetello@uce.edu.ec","0960430290");
        PedidoService service = new PedidoService();
        service.registrar(pedido2);
    }
}
