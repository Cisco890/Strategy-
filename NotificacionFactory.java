interface NotificacionFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
