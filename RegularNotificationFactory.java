class RegularNotificacionFactory implements NotificacionFactory {
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    public Notificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}