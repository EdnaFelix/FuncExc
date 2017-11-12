import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Funcionario f = new Funcionario();
		int opc;
		do {
			System.out.println("***MENU DE OP��ES***:\n");
			System.out.println("1-atribuir um salario ao funcionario\n2-atribuir aumento ao salario do funcinario\n3-dar nome ao funcionario\n4-exibir salario\n5-sair");
			opc = input.nextInt();
			switch (opc) {
			
				case 1:	
					System.out.print("digite o salario: ");
					double salario=input.nextDouble();
					try {
						f.setSalario(salario);
						
					}catch(ViolacaoCltException e){
						System.err.println("Erro:"+e.getCodigo()+"-"+e.getMessage());
					}
					break;
				case 2:
					System.out.print("digite o valor do aumento: ");
					double aumento=input.nextDouble();
					try {
						f.aumentarSalario(aumento);
					}catch(AumentoAbsurdoException ex){ 
						System.err.println(ex.getMessage()+"\n tente novamente!");
					}
					break;
				case 3:
					System.out.print("digite o nome: ");
					String nome= input.next();
					try{
					f.setNome(nome);
					}catch(IllegalArgumentException ex){
						System.err.println(ex.getMessage()+"\n tente novamente!");
					}
					break;
				case 4:
					System.out.printf("Salario = %.2f %n",f.getSalario());
					break;
				case 5:
					break;
			}
		}while(opc!=5);
	
	}
	
}

