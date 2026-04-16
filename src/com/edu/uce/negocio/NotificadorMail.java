package com.edu.uce.negocio;

public class NotificadorMail implements Notificador {
     
    public void enviar(String tipo, String mensaje){

        System.out.println("Se envia el mail al correo : "+tipo);
        System.out.println("Con el mensaje: "+mensaje);

        
    }

   /*  public void enviarSMS(int numero, String mensaje) {

        System.out.println("Se envia el SMS al numero : " + numero);
        System.out.println("Con el mensaje: " + mensaje);
    }*/

}
