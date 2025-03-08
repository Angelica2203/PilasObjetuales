import java.util.Stack;
import javax.swing.JOptionPane;
public class metodos 
{
    public Stack<Vehiculo> LlenarPila()
    {
        Stack<Vehiculo> pila = new Stack<>();
        boolean continuar = true;
        String agregar = "";
        while (continuar) 
        {
            Vehiculo o = new  Vehiculo();
            o.setMarca(JOptionPane.showInputDialog("Ingrese la marca"));
            o.setColor(JOptionPane.showInputDialog("Ingrese el color"));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
            pila.push(o);
            agregar = JOptionPane.showInputDialog("Dese agragra mas registro S/N");
            if (agregar.equalsIgnoreCase("N")) 
            {
                continuar = false;
            }
        }
        return pila;
    }
    public void MostrarPila(Stack<Vehiculo>pila)
    {
        for (Vehiculo o : pila) 
        {
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("\n");
        }
    }
    public String Eliminar(Stack<Vehiculo>pila)
    {
        boolean eliminado = false;
        for (Vehiculo o : pila) 
        {
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("\n");
        }
    }
    
}
