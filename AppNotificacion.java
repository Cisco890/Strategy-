class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje en la aplicación: " + mensaje);
    }
}