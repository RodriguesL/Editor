public class EstadoDesenhoRet implements Estado {
    ModeloEditor modelo;
    int x;
    int y;
    int largura;
    int altura;
	Toggle t;
    
    public EstadoDesenhoRet(ModeloEditor modelo, int x, int y, Toggle t) {
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {}
    public void parcial(int x, int y) {
        largura = x - this.x;
        altura = y - this.y;
    }
    public void terminar(int x, int y) {
        largura = x - this.x;
        altura = y - this.y;
        Figura fig = new Retangulo(this.x, this.y, largura, altura);
        modelo.figuras.add(fig);
        modelo.feito(new ComandoFigura(fig));
        modelo.mudaEstado(new EstadoRetangulo(modelo, modelo.tret));
    }
    public void desenhar(Canvas c) {
        c.retangulo(x, y, largura, altura, 1, 1, 1);
    }
    
    public void sair() {
    	t.toggle();
    }
}
