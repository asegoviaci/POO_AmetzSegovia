package POO;
import java.util.Date;
public class Visita {
    private Cliente cliente;
    private double importe;
    private Date fecha ;
    public Visita(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha=fecha;
        importe=0;
    }
    public void setCliente(Cliente c){
        this.cliente=c;
    }
    public void setImporte(double imp){
        this.importe=imp;
    }
    public void setFecha(Date fe){
        this.fecha=fe;
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
    public String toString(){
        return cliente.toString() + " Fecha: " + fecha+ "Importe: " + importe;
    }
}