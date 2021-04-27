package entites;

public class program {
    public static void main(String[] args) {
         MoedaFactory.criarMoeda(MoedaEnum.BRASIL).imprimirMoeda();
        MoedaFactory.criarMoeda(MoedaEnum.USA).imprimirMoeda();


    }
}
