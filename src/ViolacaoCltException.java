
@SuppressWarnings("serial")
public class ViolacaoCltException extends IllegalArgumentException{

	private int clt;

	public ViolacaoCltException(int cod,String mensagem){
		super(mensagem);
		clt=cod;
	}
	public int getCodigo() {
		 return clt;
	}

}
