import java.util.HashSet;

interface Jogo {
  String getTitulo();
  int getLargura();
  int getAltura();
  void tecla(String t);
  void tique(HashSet<String> teclas, double dt);
  void desenhar(Tela t);
}