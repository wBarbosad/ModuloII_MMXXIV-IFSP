import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {
       
        Carro carro1 = new Carro("HB20", 70000.00);
        Moto moto1 = new Moto("Fize", 30000.00);

        moto1.acelerar();
        carro1.acelerar();
        moto1.frear();
        carro1.frear();
    }
}
