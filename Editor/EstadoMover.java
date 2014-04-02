public class EstadoMover implements Estado {
    ModeloEditor modelo;
    Toggle t;

    public EstadoMover(ModeloEditor modelo, Toggle t) {
        this.modelo = modelo;
        this.t = t;
    }
       
    public void selecionar(int x, int y) {
        Figura f = modelo.figura(x, y);
        if(f != null) {
            modelo.mudaEstado(new EstadoMovendo(modelo, f, x, y, t));
        }
    }
    public void parcial(int x, int y) {}
    public void terminar(int x, int y) {}
    public void desenhar(Canvas c) {}

    public void sair() {
        t.toggle();
    }
}
