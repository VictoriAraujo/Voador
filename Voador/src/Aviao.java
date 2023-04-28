public class Aviao implements Voador{
    private double gasolina;

    public Aviao(double gasosa) {
        super();
        this.gasolina = gasosa;
    }
    public void gastaGasosa(double km){
        if( gasolina > 0){
            gasolina -= km;
        }
    }
    @Override
    public double voar() {
        if(gasolina == 0){
            System.out.println("Não estou voando, preciso de Gasosa!");
            return 0;
        }
        System.out.println("O avião está decolando!!");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Está planando em alta altitude!");
    }

    @Override
    public boolean pousar() {
        System.out.println("O avião está pousando!");
        return true;
    }
}
