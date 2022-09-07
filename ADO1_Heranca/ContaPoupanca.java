package POO.ADO1_Heranca;
/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta - FEITO
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo - FEITO
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta - FEITO
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho - FEITO
 */
public class ContaPoupanca extends Conta{
	private String dataAniversario;

	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dataAniversario) {
		super(saldoInicial, num, tit, ag);
		this.dataAniversario = dataAniversario;
	}
	
	public ContaPoupanca(String num, Cliente tit, Agencia ag, String dataAniversario) {
		super(num, tit, ag);
		this.dataAniversario = dataAniversario;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("======================================");
        System.out.println("***********CONTA POUPANCA*************");
        super.imprimeDados();
        System.out.println("Data de aniversario: " + dataAniversario);
        System.out.println("========================================");
	}
}
