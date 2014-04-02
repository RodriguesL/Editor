public class EstadoCirculo implements Estado {
    ModeloEditor modelo;
    Toggle t;

    public EstadoCirculo(ModeloEditor modelo, Toggle t) {
        this.modelo = modelo;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {
        modelo.mudaEstado(new EstadoDesenhoCirc(modelo, x, y, t));
    }
    public void parcial(int x, int y) {}
    public void terminar(int x, int y) {}
    public void desenhar(Canvas c) {}

    public void sair() {
        t.toggle();
    }
}
