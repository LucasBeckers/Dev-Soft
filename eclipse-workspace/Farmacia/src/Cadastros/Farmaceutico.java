package Cadastros;

public class Farmaceutico extends Funcionario{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String registroAnvisa;

	public String getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	

@Override
public String toString() {
	return super.toString()+ ";"+ this.registroAnvisa;
}

}
