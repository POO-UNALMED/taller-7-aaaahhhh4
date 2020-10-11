package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas
			,String fe, String prim, String inter) {
		super(origen, titulo, autor, paginas);
		fecha=fe;
		primicia=prim;
		interpretacion=inter;
		// TODO Auto-generated constructor stub
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return palabrasPagina*10*this.getPaginas();
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getOrigen()+ "\n" +
				this.getTitulo() + "\n"
				+this.getAutor() + "\n"
				+this.getPaginas() + "\n"
				+ fecha + "\n"
				+ primicia;
	}

}
