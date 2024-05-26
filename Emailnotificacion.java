class EmailNotificacion implements Notificacion {
        public void enviarMensaje(String mensaje) {
            System.out.println("Enviando email: " + mensaje);
        }
}