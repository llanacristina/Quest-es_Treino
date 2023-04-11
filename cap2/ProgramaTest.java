package cap2;

public class ProgramaTest {
    public static void main(String[] args){
        Conta c; //variavel
        c = new Conta(); //objeto instanciado
        c.nome_titular = "Zé";
        c.depositar(100);
        System.out.println("Titular: "+ c.nome_titular);
        System.out.println("Saldo atual: "+ c.saldo);

        c.depositar(200);
        boolean saque_efetuado = c.sacar(250);
            if(saque_efetuado){
                System.out.println("Saque efetuado com sucesso");
            } else
            System.out.println("Saque não efetuado! Saldo insuficente");
    }
    
}
