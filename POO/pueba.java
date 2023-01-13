package POO;
import java.util.Date;
public class pueba {
    public static void main(String []arg){
        Cliente a=new Cliente("1", "73927518w", true, "premium");
        Cliente b=new Cliente("2", "46239123g", true, "oro");
        Cliente c=new Cliente("3", "12345678t");
        Visita d= new Visita(a, new Date());
        Visita e= new Visita(b, new Date());
        Visita f= new Visita(c, new Date());
        Salon g= new Salon(3, 2);
        g.anadir(a);
        g.anadir(b);
        g.anadir(c);
        System.out.println(g.getCliente("46239123g"));
        System.out.println(a.getSocio());
        System.out.println(d.getImporte(100));
        System.out.println(e.getImporte(100));
        System.out.println(f.getImporte(100));
        g.mostrarClinetes();
        g.bajaCliente(b);
        g.mostrarClinetes();
        System.out.println(f.getImporte(100));
    }
}