package ProjetoBancoDigital;

// Transferir
// Conferir saldo
// Receber saldo
// Sair

public class Recursos {


    static double saldo;


    public static void ConferirSaldo(){
        System.out.println("Saldo atual: " +saldo + " reais.");
    }

    public static void AdicionarSaldo(double valor){
        saldo += valor;

    }

    public static void TrasnsferirSaldo(double valor){
        saldo -= valor;
        if(saldo < 0){
            System.out.println("Transação não realizada, saldo insuficiente.");
            saldo += valor;
        } else {
            System.out.println(valor + " reais transferido com sucesso.");
        }
    }


}
