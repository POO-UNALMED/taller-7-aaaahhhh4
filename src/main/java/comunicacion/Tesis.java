package comunicacion;


public class Tesis extends Escrito {
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	

	public Tesis(String origen, String titulo, String autor, int paginas
			,String id,String[] arg, String conc, String ref, String inter) {
		super(origen, titulo, autor, paginas);
		idea= id; argumentos = arg; conclusion= conc; referencias=ref; interpretacion=inter;
		// TODO Auto-generated constructor stub
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public static String[] getArgumentos() {
		return argumentos;
	}

	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return palabrasPagina*5;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idea + "\n"
				+ argumentos.length + "\n"
				+ conclusion + "\n"
				+ referencias + "\n"
				+ interpretacion;
	}

}
