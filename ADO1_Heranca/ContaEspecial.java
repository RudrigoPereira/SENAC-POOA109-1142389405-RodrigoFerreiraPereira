package POO.ADO1_Heranca;
/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta - FEITO
 * 2) Adicione o atributo limite do tipo double e o encapsule - FEITO
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. - FEITO
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) - FEITO
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido. - FEITO
 */
public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		this.limite = limite;
	}

	public ContaEspecial(String num, Cliente tit, Agencia ag, double limite) {
		super(num, tit, ag);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void imprimeDados() {
		System.out.println("======================================");
        System.out.println("***********CONTA ESPECIAL*************");
        super.imprimeDados();
        System.out.println("Limite: " + limite);
        System.out.println("========================================");
	}
	
	@Override
	public void saque(double valor) {
		System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
        if (valor > 0) {
            if (limite + saldo >= valor) {
                saldo -= valor;
                acumularCPMF(valor);
            } else
                System.out.println("Saldo e limite insuficientes para o saque");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
	}
}
