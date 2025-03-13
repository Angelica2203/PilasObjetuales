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
    public Stack<Vehiculo> Eliminar(Stack<Vehiculo>pila)
    {
        String dato;
        dato = JOptionPane.showInputDialog("Ingrese el que desea eliminar ");
        for (Vehiculo vehiculo : pila) 
        {
            if (vehiculo.getMarca().equalsIgnoreCase(dato)) 
            {
                pila.remove(vehiculo);//Es de lista pero sirve para eliminar cualquier posicion
                System.out.println("Registro eliminado");
            }
        }
        return pila;
    }
    
}
 