package industria.model;

public class Disco {
    private Integer num_ref;
    private String album;
    private String genero;
    private String fecha_l;
    private String disquera;
    private String pais_disquera;
    private String nombre_int;

    public Disco(){

    }

    public Disco(Integer num_ref, String album, String genero, String fecha_l, String disquera, String pais_disquera, String nombre_int) {
        this.num_ref = num_ref;
        this.album = album;
        this.genero = genero;
        this.fecha_l = fecha_l;
        this.disquera = disquera;
        this.pais_disquera = pais_disquera;
        this.nombre_int = nombre_int;
    }

    public Integer getNum_ref() {
        return num_ref;
    }

    public void setNum_ref(Integer num_ref) {
        this.num_ref = num_ref;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_l() {
        return fecha_l;
    }

    public void setFecha_l(String fecha_l) {
        this.fecha_l = fecha_l;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getPais_disquera() {
        return pais_disquera;
    }

    public void setPais_disquera(String pais_disquera) {
        this.pais_disquera = pais_disquera;
    }

    public String getNombre_int() {
        return nombre_int;
    }

    public void setNombre_int(String nombre_int) {
        this.nombre_int = nombre_int;
    }
}
