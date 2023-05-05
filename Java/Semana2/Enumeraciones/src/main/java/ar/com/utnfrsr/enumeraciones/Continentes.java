package ar.com.utnfrsr.enumeraciones;

public enum Continentes {
    AFRICA(53, "1100 millones"),
    EUROPA(46, "700 millones"),
    ASIA(44, "600 millones"),
    AMERICA(34, "500 millones"),
    OCEANIA(14, "30 millones");

    private final int paises;
    private String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    //Metodo get
    public int getPaises() {
        return paises;
    }

    public String getHabitantes() {
        return habitantes;
    }
}
