package POO;
public class Cliente {
    private String nombre;
    private String DNI;
    private boolean socio;
    private String tipo;
    private int descuento;
    public void Cliente(String nombre, String DNI, boolean  socio, String tipo){
        this.nombre=nombre;
        this.DNI=DNI;
        this.socio=socio;
        this.tipo=tipo;
    }
    public void Cliente( String nombre, String DNI){
        this.nombre=nombre;
        this.DNI=DNI;
        socio=false;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    public void setSocio(boolean socio){
        this.socio=socio;
    }
    public  String getnombre(){
        return nombre;
    }
    public  String getDNI(){
        return DNI;
    }
    public boolean getSocio(){
          return socio;
    }
    public void settipo(String tipo){
        this.tipo=tipo;
    }
    public  String gettipo(){
        return tipo;
    }
    public int getDescuento(){
        if (socio){
            if (tipo=="platino"){
                descuento=10;
            }else if (tipo=="oro"){
                descuento=15;
            }if (tipo=="premium") {
                descuento=20;
            }
        }
        return descuento;
    }
    public  String toString(){
        return String.format("Nombre: "+getnombre()+" DNI: " +getDNI()+" Socio: " +getSocio()+" Tipo: " +gettipo());
    }
}