package ar.com.utnfrsr.test;
import ar.com.utnfrsr.accesodatos.ImplementacionMySql;
import ar.com.utnfrsr.accesodatos.IAccesoDatos;
import ar.com.utnfrsr.accesodatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        //imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);

    }
    public static void imprimir (IAccesoDatos datos){
        datos.listar();
    }
}
