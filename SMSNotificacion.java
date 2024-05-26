class SMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
