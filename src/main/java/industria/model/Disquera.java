package industria.model;

public class Disquera {
    private String disquera;
    private String pais;
    private String direccion;
    private String telefono;

    public Disquera(){

    }

    public Disquera(String disquera, String pais, String direccion, String telefono) {
        this.disquera = disquera;
        this.pais = pais;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
