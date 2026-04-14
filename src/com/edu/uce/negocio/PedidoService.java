package com.edu.uce.negocio;

public class PedidoService {

    Pedido p1 = new Pedido();

    public void registrar(Pedido pedido) {

        System.out.println("Registrando pedido");
        System.out.println("cliente " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
        if (p1.getTotal() > 100) {
            NotificadorMail nl = new NotificadorMail();
            nl.enviar(pedido.getCorreo(), "El producto ha sido comprado");

        } else {

            SMS sms = new SMS();
            sms.enviar(pedido.getNumero(), "El producto ha sido comprado");

        }

    }

}
