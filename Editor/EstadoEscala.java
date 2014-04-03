
public class EstadoEscala implements Estado {
	 ModeloEditor modelo;
	    Toggle t;
	    int x0,x1,y0,y1;
	    Figura f;
	    public EstadoEscala(ModeloEditor modelo, Toggle t) {
	        this.modelo = modelo;
	        this.t = t;
	    }
	@Override
	public void selecionar(int x, int y) {
		 f = modelo.figura(x, y);
	       
	}

	@Override
	public void parcial(int x, int y) {
		if(x-x0>0||y-y0>0){
			float temp=Math.abs(x-x0);
			temp%=100;
			temp/=10;
			f.escala(temp);
			
		}
		//float temp =(float) Math.sqrt(Math.pow((x0+x), 2)+Math.pow(y0+x, 2))/314;
		//f.escala(temp);
	}

	@Override
	public void terminar(int x, int y) {
		if(x-x0>0||y-y0>0){
			float temp=Math.abs(x-x0);
			temp%=100;
			temp/=10;
			f.escala(temp);
			
		}
		
		//float temp =(float) Math.sqrt(Math.pow((x0+x), 2)+Math.pow(y0+x, 2))/314;
		//f.escala(temp);
		modelo.feito(new ComandoMover(f, x - x0, y - y0));
	}

	@Override
	public void desenhar(Canvas c) {
		//f.desenhar(c);
	}

	@Override
	public void sair() {
		 t.toggle();
	}

}
