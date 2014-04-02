public class Circulo extends FiguraPt {
    int raio;
    
    public Circulo(int x, int y, int raio) {
        super(x, y); // chamando construtor de FiguraPt
        this.raio = raio;
    }
    
    public boolean dentro(int x, int y) {
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)) <= raio;
    }

    public void escala(double f) {
        raio *= f;
    }
    
    public void desenhar(Canvas c) {
        c.circulo(x, y, raio, 1, 1, 1);
    }
}