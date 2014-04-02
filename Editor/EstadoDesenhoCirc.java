public class EstadoDesenhoCirc implements Estado {
    ModeloEditor modelo;
    int x;
    int y;
    int raio;
    Toggle t;
    
    public EstadoDesenhoCirc(ModeloEditor modelo, int x, int y, Toggle t) {
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {}
    public void parcial(int x, int y) {
        raio = (int)Math.sqrt(Math.pow(x-this.x,2) + Math.pow(y-this.y,2));
    }
    public void terminar(int x, int y) {
        raio = (int)Math.sqrt(Math.pow(x-this.x,2) + Math.pow(y-this.y,2));
        Figura fig = new Circulo(this.x, this.y, raio);
        modelo.figuras.add(fig);
        modelo.feito(new ComandoFigura(fig));
        modelo.mudaEstado(new EstadoCirculo(modelo, modelo.tcirc));
    }
    public void desenhar(Canvas c) {
        c.circulo(x, y, raio, 1, 1, 1);
    }
    
    public void sair() {
    	t.toggle();
    }
}
