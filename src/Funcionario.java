
public class Funcionario {
	private static int matricula=16100;
	private String nome;
	private double salario;
	private final double salarioMinimo=350;
 
 	public Funcionario(){
 		matricula++;
 	}
 	
 
 	public String getNome()throws IllegalArgumentException {
 		return nome;
 	}
 	public void setNome(String nome){
 		if(nome.length()>40){
 			
				throw new IllegalArgumentException("ERRO! ultrapassou 40 caracteres");
		}
		else
		{
			this.nome=nome;
		}
 	}
 	public double getSalario(){
	
 		return salario;
 	}
 	
 	public void aumentarSalario(double aumento) {
 		
 		double verificacao = salario+aumento;
 		double salarioImpedido=this.salario*1.10;
 		
 		if(verificacao >= salarioImpedido) {
			throw new AumentoAbsurdoException("ERRO! aumento absurdo de salario"); 
		}
 		else
 		{
 			if(aumento>0){
 				salario=verificacao;
 			}
 		}
 		
 	}
 	public void setSalario(double salario)throws AumentoAbsurdoException {
		
		if(salario < salarioMinimo) {	 
			throw new ViolacaoCltException(157,"salario inferior a o teto"); 
		}
		else 
		{
			this.salario=salario;
		}
 	}
 	public int getMatricula() {
 		return matricula;
 	}
}
