public interface Figura {
    boolean dentro(int x, int y);
    void mover(int dx, int dy);
    void escala(double f);
    void desenhar(Canvas c);
}
