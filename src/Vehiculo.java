public class Vehiculo {
    private String adquiridoEnFecha;
    private Double cotizacionEnUSD;
    private String marca;
    private String patente;
    private Boolean esIndustriaNacional;

    public Vehiculo (String adquiridoEnFecha, Double cotizacionEnUSD, String marca, String patente, Boolean esIndustriaNacional){
        this.adquiridoEnFecha = adquiridoEnFecha;
        this.cotizacionEnUSD = cotizacionEnUSD;
        this.marca = marca;
        this.patente = patente;
        this.esIndustriaNacional = esIndustriaNacional;
    }
    public Boolean esIndustriaNacional(){
        return esIndustriaNacional;
    }
}
