
package ar.com.system2023.mundopc;


public class Monitor {
    private final int idMonitor;
    private String marca;
    private String tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
        
    }
    public Monitor(String marca, String tamanio){
        this();  //llamado a constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    //completamos de modo manual getMonitor
    public int getIdMonitor(){
        return this.idMonitor;  //solo get porque es de tipo solo lectura
    }

    @Override
    public String toString() {
        return "Monitor{" + " idMonotor = " + idMonitor + ", marca = " + marca + ", tamanio = " + tamanio + '}';
    }
    
}
