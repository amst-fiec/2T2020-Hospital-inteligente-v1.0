package com.example.getabed;

public class Cama {
    private String id;
    private String estado;
    private String piso;

    public Cama(String id, String estado, String piso) {
        this.id = id;
        this.estado=estado;
        this.piso=piso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Cama{" +
                "id='" + id + '\'' +
                ", estado='" + estado + '\'' +
                ", piso='" + piso + '\'' +
                '}';
    }
}
