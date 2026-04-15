package com.edu.uce.negocio;

public class SMS implements Notificador {
    public void enviar(String tipo, String mensaje) {

        System.out.println("Se envia el SMS al numero : " + tipo);
        System.out.println("Con el mensaje: " + mensaje);

    }

}
