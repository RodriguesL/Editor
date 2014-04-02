public class EstadoMovendo implements Estado {
    ModeloEditor modelo;
    int x0;
    int y0;
    int x;
    int y;
    Figura f;
	Toggle t;

    public EstadoMovendo(ModeloEditor modelo, Figura f, int x, int y, Toggle t) {
        this.modelo = modelo;
        x0 = x;
        y0 = y;
        this.x = x;
        this.y = y;
        this.f = f;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {}
    public void parcial(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;
        f.mover(dx, dy);
        this.x = x;
        this.y = y;
    }
    public void terminar(int x, int y) {
        parcial(x, y);
        modelo.feito(new ComandoMover(f, x - x0, y - y0));
        modelo.mudaEstado(new EstadoMover(modelo, modelo.tmover));
    }
    public void desenhar(Canvas c) {}
    
    public void sair() {}
}
