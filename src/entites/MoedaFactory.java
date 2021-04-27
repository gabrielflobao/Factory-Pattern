package entites;

public class MoedaFactory {

    public static MoedaInterface criarMoeda (MoedaEnum moe) {
        if(moe.equals(MoedaEnum.BRASIL)) {
            return new Real();
        } else {
            return new Dolar();
        }

    }

}
