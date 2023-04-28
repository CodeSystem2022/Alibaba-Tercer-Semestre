
package mundopc;

import ar.com.system2023.mundopc.Computadora;
import ar.com.system2023.mundopc.Monitor;
import ar.com.system2023.mundopc.Orden;
import ar.com.system2023.mundopc.Raton;
import ar.com.system2023.mundopc.Teclado;


public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor(" HP", "13");  //importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", " HP" );
        Raton ratonHP = new Raton("Bluetooth", " HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //creamos objetos de diferente marca
        Monitor monitorGamer = new Monitor(" Gamer", "32"); 
        Teclado tecladoGamer = new Teclado("Bluetooth", " Gamer" );
        Raton ratonGamer = new Raton("Bluetooth", " Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorDell = new Monitor(" Dell", " 24"); 
        Teclado tecladoDell = new Teclado(" Bluetooth", " Dell" );
        Raton ratonDell = new Raton(" Bluetooth", " Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        
        Monitor monitorSamsung = new Monitor(" Samsung", " 42"); 
        Teclado tecladoSamsung = new Teclado(" Bluetooth", " Samsung" );
        Raton ratonSamsung = new Raton(" Bluetooth", " Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        Monitor monitorApple = new Monitor(" Apple", " 24"); 
        Teclado tecladoApple = new Teclado(" Bluetooth", "Apple" );
        Raton ratonApple = new Raton(" Bluetooth", " Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);

        Monitor monitorAsus = new Monitor(" Asus", " 24"); 
        Teclado tecladoAsus = new Teclado(" Bluetooth", " Asus" );
        Raton ratonAsus = new Raton(" Bluetooth", " Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        Monitor monitorCx = new Monitor(" Cx", " 21"); 
        Teclado tecladoCx = new Teclado(" Bluetooth", " Cx" );
        Raton ratonCx = new Raton(" Bluetooth", " Cx");
        Computadora computadoraCx = new Computadora("Computadora Cx", monitorCx, tecladoCx, ratonCx);
        
        Monitor monitorLenovo = new Monitor(" Lenovo", " 32"); 
        Teclado tecladoLenovo = new Teclado(" Bluetooth", " Lenovo" );
        Raton ratonLenovo = new Raton(" Bluetooth", " Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorAcer = new Monitor(" Acer", " 21"); 
        Teclado tecladoAcer = new Teclado(" Bluetooth", " Acer" );
        Raton ratonAcer = new Raton(" Bluetooth", " Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        Monitor monitorHuawei = new Monitor(" Huawei", " 18"); 
        Teclado tecladoHuawei = new Teclado(" Bluetooth", " Huawei" );
        Raton ratonHuawei = new Raton(" Bluetooth", " Huawei");
        Computadora computadoraHuawei = new Computadora("Computadora Huawei", monitorHuawei, tecladoHuawei, ratonHuawei);
        
        Monitor monitorQ = new Monitor(" Q", " 18"); 
        Teclado tecladoQ = new Teclado(" Bluetooth", " Q" );
        Raton ratonQ = new Raton(" Bluetooth", " Q");
        Computadora computadoraQ = new Computadora("Computadora Q", monitorQ, tecladoQ, ratonQ);
        
         Orden orden1 = new Orden();//Inicializamos arreglo vacio
         
         
        
        orden1.agregarCompu(computadoraHP);
        orden1.agregarCompu(computadoraGamer);
        orden1.agregarCompu(computadoraDell);
        orden1.agregarCompu(computadoraSamsung);
        orden1.agregarCompu(computadoraApple);
        orden1.agregarCompu(computadoraAsus);
        orden1.agregarCompu(computadoraCx);
        orden1.agregarCompu(computadoraLenovo);
        orden1.agregarCompu(computadoraAcer);
        orden1.agregarCompu(computadoraHuawei);
        orden1.agregarCompu(computadoraQ);
        orden1.mostrarOrden();
        
        
        Orden orden2 = new Orden();// nueva lista
        Computadora computadoraVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoCx, ratonDell);
         
        orden2.agregarCompu(computadoraVarias);
        orden2.mostrarOrden();
    }
}
