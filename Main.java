public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = Clasificador.getFactory("URGENTE");

        Notificacion email = factory.crearEmailNotificacion();
        email.enviarMensaje("Este es un mensaje urgente de email");

        Notificacion sms = factory.crearSMSNotificacion();
        sms.enviarMensaje("Este es un mensaje urgente de SMS");

        Notificacion app = factory.crearAppNotificacion();
        app.enviarMensaje("Este es un mensaje urgente en la aplicación");
    }
}