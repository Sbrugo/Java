public class Camion extends Vehiculo implements Comparable{
    private int cantidadDeEjes;
    private Double capacidadDeCarga;

    public Camion(String adquiridoEnFecha, Double cotizacionEnUSD, String marca, String patente, Boolean esIndustriaNacional) {
        super(adquiridoEnFecha, cotizacionEnUSD, marca, patente, esIndustriaNacional);
    }

    @Override
    public int compareTo(Object o) {
        Camion camion = (Camion) o;
        Integer respuesta = 0;
        if(this.capacidadDeCarga > camion.capacidadDeCarga){
            respuesta = 1;
        } else if(this.capacidadDeCarga < camion.capacidadDeCarga){
            respuesta = -1;
        } return respuesta;
    }
}
