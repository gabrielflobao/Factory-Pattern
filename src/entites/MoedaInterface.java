package entites;

public interface MoedaInterface {

    public void imprimirMoeda();

}
class Real implements MoedaInterface {


    @Override
    public void imprimirMoeda() {
        System.out.println("Moeda do Brasil : R$");

    }
}
class Dolar implements MoedaInterface {

    @Override
    public void imprimirMoeda() {
        System.out.println("Moeda do USA : US$");
    }
}
