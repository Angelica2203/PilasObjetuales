public class Vehiculo 
{
    private String marca;
    private  String color;
    private  double  precio;

    public Vehiculo() 
    {
    }

    public Vehiculo(String color, String marca, double precio) 
    {
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    
}
