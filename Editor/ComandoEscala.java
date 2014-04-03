
public class ComandoEscala implements Comando{
	Figura f;
	float escala;
	
	ComandoEscala(Figura f, float escala){
		this.f=f;
		this.escala=escala;
		
	}
	@Override
	public void desfazer(ModeloEditor modelo) {
		f.escala(escala);
		
	}

	@Override
	public void refazer(ModeloEditor modelo) {
		f.escala(escala);
		
	}

}
