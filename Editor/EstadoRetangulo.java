public class EstadoRetangulo implements Estado {
    ModeloEditor modelo;
    Toggle t;

    public EstadoRetangulo(ModeloEditor modelo, Toggle t) {
        this.modelo = modelo;
        this.t = t;
    }
    
    public void selecionar(int x, int y) {
        modelo.mudaEstado(new EstadoDesenhoRet(modelo, x, y, t));
    }
    public void parcial(int x, int y) {}
    public void terminar(int x, int y) {}
    public void desenhar(Canvas c) {}

    public void sair() {
        t.toggle();
    }
}
