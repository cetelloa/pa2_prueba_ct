package com.edu.uce.negocio;

public class NotificadorWhastapp implements Notificador{

    public void enviar(String tipo, String mensaje){

        System.out.println("Se envia un whastapp al numero: "+tipo);
        System.out.println("Con el mensaje: "+mensaje);

        
    }

}
