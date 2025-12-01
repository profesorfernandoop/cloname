public interface DaoPrestamo {
    void registrarPrestamo(Prestamo prestamo);
    void devolverPrestamo(int idPrestamo);
}
