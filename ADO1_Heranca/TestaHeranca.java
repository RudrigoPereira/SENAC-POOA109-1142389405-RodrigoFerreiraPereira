package POO.ADO1_Heranca;
/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
 //
 /*
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. - FEITO
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite. - FEITO
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite. - FEITO
 * Realize 1 saque na conta poupanca que exceda o saldo. - FEITO
 * Imprima os dados das contas para conferir se estao corretas. - FEITO
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
import java.text.DateFormat;
import java.util.Date;

public class TestaHeranca {
/*-----------------------------------------------*
 *SENAC - TADS - Programação Orientada a Objetos *
 *      Autor: 1142389405 - Rodrigo F Pereira    *
 *-----------------------------------------------*
 *Objetivo: <<ADO 01 - Herança>>                 *
 *                                               *
 *Descrição: implementar uma aplicação para      *
 *           gestão de conta corrente de um      *
 *           determinado banco.                  *
 *-----------------------------------------------*
 *                                               *
 * ----------------------------------------------*/
    public static void main(String args[]) {
    	Date pegandoData = new Date();
    	String strData = DateFormat.getDateInstance(DateFormat.SHORT).format(pegandoData);
    	
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        Cliente cliente2 = new Cliente("Cliente 2", "987789");
        
        Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
        conta.saque(560);
        conta.imprimeDados();
        System.out.println();
        
        ContaEspecial contaEsp1 = new ContaEspecial(800, "741853", cliente1, ag1, 1000); // 1a. conta especial
        contaEsp1.saque(950);
        contaEsp1.imprimeDados();
        System.out.println();
        
        ContaEspecial contaEsp2 = new ContaEspecial(650, "741854", cliente2, ag1, 1000); // 2a. conta especial
        contaEsp2.saque(2000);
        contaEsp2.imprimeDados();
        System.out.println();
        
        ContaPoupanca contaPoup = new ContaPoupanca(500, "741855", cliente1, ag1, strData); // conta poupanca
        contaPoup.saque(1500);
        contaPoup.imprimeDados();    
        System.out.println();
    }
}
