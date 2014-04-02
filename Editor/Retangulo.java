public class Retangulo extends FiguraPt {
    int largura;
    int altura;
    
    public Retangulo(int x, int y, int largura, int altura) {
        super(x, y); // chamar construtor de FiguraPt
        this.largura = largura;
        this.altura = altura;
    }
    
    public boolean dentro(int x, int y) {
        return (x >= this.x) && (x <= this.x + largura) &&
          (y >= this.y) && (y <= this.y + altura);
    }

    public void escala(double f) {
        altura *= f;
        largura *= f;
    }
    
    public void desenhar(Canvas c) {
        c.retangulo(x, y, largura, altura, 1, 1, 1);
    }
}