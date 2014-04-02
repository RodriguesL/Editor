
public interface Estado {
    void selecionar(int x, int y);
    void parcial(int x, int y);
    void terminar(int x, int y);
    void desenhar(Canvas c);
    void sair();
}