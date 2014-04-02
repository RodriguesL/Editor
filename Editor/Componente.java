public interface Componente {
	int getX1();        // canto superior esquerdo
	int getY1();        // canto superior esquerdo
	int getX2();        // canto inferior direito
	int getY2();        // canto inferior direito
    void desenhar(Tela t);
	// x e y abaixo sao em coordenadas do componente
	// (0,0) e o canto superior esquerdo
    void clique(int x, int y);
    void aperto(int x, int y);
    void solta(int x, int y);
    void arrasto(int x, int y);
    void movimento(int x, int y);
}
