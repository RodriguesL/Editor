public abstract class FiguraPt implements Figura {
    // ponto de controle
    int x;
    int y;
        
    public FiguraPt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    //public abstract boolean dentro(int x, int y);
    //public abstract void desenhar(Canvas c);
    //public abstract void escala(double f);
}
