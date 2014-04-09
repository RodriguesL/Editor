public class EstadoDesenhoRet implements Estado {
    ModeloEditor modelo;
    int x;
    int y;
    int largura;
    int altura;
    int x0, y0;
	Toggle t;
	Figura fig = new Retangulo (0, 0, 0, 0);
    
    public EstadoDesenhoRet(ModeloEditor modelo, int x, int y, Toggle t) {
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {}
    public void parcial(int x, int y) {
    	x0 = x;
    	y0 = y;
    	if(x-this.x>0||y-this.y>0){
        	largura = x - this.x;
        	altura = y - this.y;
        }
    	else if (x-this.x<0||y-this.y<0) {
        	largura = this.x - x;
            altura = this.y - y;
        }
    }
    
    public void terminar(int x, int y) {
    	x0 = x;
    	y0 = y;
        if(x-this.x>0||y-this.y>0){
        	largura = x - this.x;
        	altura = y - this.y;
        	fig = new Retangulo(this.x, this.y, largura, altura);
        }
        else if (x-this.x<0||y-this.y<0) {
        	largura = this.x - x;
            altura = this.y - y;
            fig = new Retangulo(x, y, largura, altura);
        }
        modelo.figuras.add(fig);
        modelo.feito(new ComandoFigura(fig));
        modelo.mudaEstado(new EstadoRetangulo(modelo, modelo.tret));
    }
    public void desenhar(Canvas c) {
    	if(x0-this.x>0||y0-this.y>0){
        	c.retangulo(x, y, largura, altura, 1, 1, 1);
        }
    	else if (x0-this.x<0||y0-this.y<0) {
    		c.retangulo(x0, y0, largura, altura, 1, 1, 1);
        }
    }
    
    public void sair() {
    	t.toggle();
    }
}
