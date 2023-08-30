public class Automovil {
    private Boolean esAGas;
    private Double cilindrada;
    public Boolean esEconomico(Boolean esAGas, Double cilindrada){
        return esAGas || cilindrada < 1200;
    }
}
