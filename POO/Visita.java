package POO;
import java.util.Date;
public class Visita {
    private Cliente cliente;
    private double importe;
    private Date fecha ;
    Visita(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha=fecha;
        importe=0;
    }
    public void setCliente(Cliente c){
        this.cliente=c;
    }
    public void setImporte(double importe){
        this.importe=importe;
    }
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public double getImporte(){
        return importe;
    }
    public Date getFecha(){
        return fecha;
    }
    public double getImporte(double importe){
            this.importe=importe-(importe*cliente.getDescuento()/100);
        return this.importe;
    }
}