public class Ponto extends FiguraPt {
    public Ponto(int x, int y) {
        // chamando construtor de FiguraPt
        super(x, y);
    }
    
    public boolean dentro(int x, int y) {
        return (x == this.x) && (y == this.y);
    }
    
    public void desenhar(Canvas c) {
        c.retangulo(x, y, 1, 1, 1, 1, 1);
    }
    
    public void escala(double f) {}
}