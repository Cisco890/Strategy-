class Clasificador {
    public static NotificacionFactory getFactory(String urgencia) {
        if ("URGENTE".equalsIgnoreCase(urgencia)) {
            return new UrgenteNotificacionFactory();
        } else if ("REGULAR".equalsIgnoreCase(urgencia)) {
            return new RegularNotificacionFactory();
        } else {
            throw new IllegalArgumentException("Tipo de urgencia desconocido: " + urgencia);
        }
    }
}
