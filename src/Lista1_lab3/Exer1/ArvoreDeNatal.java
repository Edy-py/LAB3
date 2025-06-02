package Lista1_lab3.Exer1;

public class ArvoreDeNatal {
        public int linhas = 11;
        public int colunas = 15;
        public char[][] matriz = new char[linhas][colunas];

        public ArvoreDeNatal() {
            inicializarMatriz();
            desenharCopa();
            desenharTronco();
            desenharBase();
        }

        public void inicializarMatriz() {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] = ' ';
                }
            }
        }

        public void desenharCopa() {
            int meio = colunas / 2;
            for (int i = 0; i < 7; i++) {
                int quantidadeDeX = 1 + i * 2;
                int inicio = meio - i;
                for (int j = 0; j < quantidadeDeX; j++) {
                    matriz[i][inicio + j] = 'X';
                }
            }
        }

        public void desenharTronco() {
            int meio = colunas / 2;
            for (int i = 7; i <= 8; i++) {
                matriz[i][meio - 1] = 'X';
                matriz[i][meio] = 'X';
            }
        }

        public void desenharBase() {
            int meio = colunas / 2;
            matriz[9][meio - 1] = 'X';
            matriz[9][meio] = 'X';
            matriz[10][meio - 2] = 'X';
            matriz[10][meio - 1] = 'X';
            matriz[10][meio] = 'X';
            matriz[10][meio + 1] = 'X';
        }

        public void imprimir() {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }


}
