package ar.com.utnfrsr.accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;

    //Metodo insertar es abstracto y sin cuerpo
    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
