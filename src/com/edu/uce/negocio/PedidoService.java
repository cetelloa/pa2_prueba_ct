package com.edu.uce.negocio;

public class PedidoService {

    public void registrar(Pedido pedido) {

        System.out.println("Registrando pedido");
        System.out.println("cliente " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
        
        if (pedido.getTotal() > 120) {
            NotificadorMail nl = new NotificadorMail();
            nl.enviar(pedido.getCorreo(), "El producto ha sido comprado");

        } else if (pedido.getTotal()>50){

            NotificadorWhastapp wha = new NotificadorWhastapp();
            wha.enviar(pedido.getNumero(), "El producto ha sido comprado");

        }else{
            SMS sms = new SMS();
            sms.enviar(pedido.getNumero(), "El producto ha sido comprado");
        }

    }

}
