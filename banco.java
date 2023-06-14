import java.util.Scanner;
public class banco {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		String cliente;
		double saldo;
		double limite;
		class conta {
			conta conta = new conta();
			private double numero;
			private String cliente;
			private double saldo;
			private double limite;
			
			public String getNome() {
				return cliente;
			}
			public void setCliente (String nome) {
				cliente = nome;
			}
			public double getNumero() {
				return numero;
			}
			public void setNumero (double numero) {
				this.numero = numero;
				}
				public void setSaldo (double saldo) {
					this.saldo = saldo;
				}
				public double getLimite() {
					return limite;
				}
				public void setLimite (double limite) {
					this.limite = limite;
				}
				
				class conta1 extends conta {
					conta1 conta = new conta1();	
					
					class conta2 extends conta {
						conta2 conta = new conta2();
						
						class conta3 extends conta {
							conta3 conta = new conta3();
							
							class conta4 extends conta {
								conta4 conta = new conta4();
								
								class conta5 extends conta {
									conta5 conta = new conta5();
									
									class dados {
											public static void main(String[] args){
											Conta1 conta = new conta1();
											conta1.setNome("Vitor Nascimento");
											conta1.setNumero("220");
											conta1.setSaldo("2000");
											conta1.setLimite("500");
											
											Conta2 conta = new conta2();
											conta2.setNome("Alexandre Vieira");
											conta2.setNumero("402");
											conta2.setSaldo("5000");
											conta2.setLimite("1000");
											
											Conta3 conta = new conta3();
											conta3.setNome("Leticia Oliveira");
											conta3.setNumero("100");
											conta3.setSaldo("600");
											conta3.setLimite("200");
											
											Conta4 conta = new conta4();
											conta4.setNome("Nicole de Souza");
											conta4.setNumero("5");
											conta4.setSaldo("100");
											conta4.setLimite("50");
											
											Conta5 conta = new conta5();
											conta5.setNome("Claudia Roberta");
											conta5.setNumero("90");
											conta5.setSaldo("10000");
											conta5.setLimite("5000");
											
											System.out.println("##### Conta1 #####);
											System.out.println("Nome.: "+conta1.getNome());
											System.out.println("Numero.: "+conta1.getNumero());
											System.out.println("Saldo.: "+conta1.getSaldo());
											System.out.println("Limite.: "+conta1.getLimite());
											
											System.out.println("##### Conta2 #####);
											System.out.println("Nome.: "+conta2.getNome());
											System.out.println("Numero.: "+conta2.getNumero());
											System.out.println("Saldo.: "+conta2.getSaldo());
											System.out.println("Limite.: "+conta2.getLimite());
											
											System.out.println("##### Conta3 #####);
											System.out.println("Nome.: "+conta3.getNome());
											System.out.println("Numero.: "+conta3.getNumero());
											System.out.println("Saldo.: "+conta3.getSaldo());
											System.out.println("Limite.: "+conta3.getLimite());
											
											System.out.println("##### Conta4 #####);
											System.out.println("Nome.: "+conta4.getNome());
											System.out.println("Numero.: "+conta4.getNumero());
											System.out.println("Saldo.: "+conta4.getSaldo());
											System.out.println("Limite.: "+conta4.getLimite());
											
											System.out.println("##### Conta5 #####);
											System.out.println("Nome.: "+conta5.getNome());
											System.out.println("Numero.: "+conta5.getNumero());
											System.out.println("Saldo.: "+conta5.getSaldo());
											System.out.println("Limite.: "+conta5.getLimite());
											
											import javax.swing.JFrame;
											import java.awt.event.ActionEvent;
											import java.awt.event.ActionListener;
											import javax.swing.JButton;
											import java.awt.GridLayout;
											
											public class banco extends JFrame{
											public static void main(String[] args) {
											JFrame banco = new JFrame("Banco")
											JButton jbConsulta = new JButton("Consulta");
											jbConsulta.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
											}
											});
											banco.add(jbConsulta);
											casa.setLayout(new GridLayout());
											casa.setVisible(true);
											
											JFrame banco = new JFrame("Banco")
											JButton jbLimpar = new JButton("Limpar");
											jbLimpar.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
											}
											});
											banco.add(jbLimpar);
											casa.setLayout(new GridLayout());
											casa.setVisible(true);
										}
								}
									}
			}
	}
}
#alias git='LANG=en_US git' alias git='LANG=en_GB git' 
