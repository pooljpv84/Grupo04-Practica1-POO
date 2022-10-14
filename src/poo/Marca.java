package poo;

public class Marca
{
    private int codigo;
    private String descripcion;

    protected String paisOrigenMarca()
    {
        return "Japón";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
