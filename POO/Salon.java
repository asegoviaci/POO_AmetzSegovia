package POO;
import java.util.Date;
public class Salon {
    Cliente [] clientes;
    Visita [] visitas ;
    int numCli;
    int numVis;
    Salon(int numCli , int numVis){
        this.clientes= new Cliente[numCli];
        this.visitas=new Visita[numVis];
        this.numCli=0;
        this.numVis=0;
    }
    public String getCliente(String DNI){
        for (int i=0 ; i<clientes.length;i++){
            if (DNI.equals(clientes[i].getDNI())){
                return clientes[i].toString();
            }
        }
        return "no existe";
    }
    public void anadir(Cliente c){
        if (clientes.length>=numCli){
            clientes[numCli]=c;
            numCli++;
        }
        else System.out.println("Lleno");
    }
    public void bajaCliente(Cliente c){
        for (int i=0 ; i<clientes.length;i++){
            if (clientes[i].getDNI().equals(c.getDNI())){
                c.setSocio(false);
                c.settipo("");
                System.out.println("Echo");
                break;
            }
        }
        System.out.println("No encontrado");
    }
    public void setMenbresia(Cliente c, String tipo){
        for (int i=0 ; i<clientes.length;i++){
            if (clientes[i].getDNI().equals(c.getDNI()) && c.getSocio()){
                c.settipo(tipo);
                break;
            }
        }
    }
    public void anadirVisita(String DNI, Date fecha){
        for (int i=0 ; i<clientes.length;i++) {
            if (clientes[i].getDNI().equals(DNI)) {
                Visita a = new Visita(clientes[i], fecha);
                if (numVis < visitas.length) {
                    visitas[numVis] = a;
                    numVis++;
                    break;
                }
            }
        }
    }
    public void getVisitasCliente(Cliente c){
        for (int i=0 ; i<visitas.length ;i++){
            if (visitas[i].getCliente().getDNI().equals(c.getDNI())){
                System.out.println(visitas[i].toString());
            }
        }
    }
    public void mostrarClinetes(){
        for (int i=0 ; i<clientes.length;i++){
            System.out.println(clientes[i].toString());
        }
    }
    public void mostrarvisitas(){
        for (int i=0 ; i<visitas.length;i++){
            System.out.println(visitas[i].toString());
        }
    }
}