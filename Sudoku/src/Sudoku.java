public class Sudoku {
    private static final int SIZE = 9;
    private int[][] board;

    public Sudoku() {
        board = new int[SIZE][SIZE];
    }

    // Método para exibir o tabuleiro
    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != SIZE - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != SIZE - 1) {
                System.out.println("---------------------");
            }
        }
    }

    // Método para verificar se um número pode ser colocado em uma posição específica
    public boolean isValidMove(int row, int col, int num) {
        // Verifica a linha e a coluna
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Verifica o bloco 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Método para resolver o Sudoku usando backtracking
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValidMove(row, col, num)) {
                            board[row][col] = num;

                            if (solve()) {
                                return true;
                            }

                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // Método para gerar um tabuleiro de Sudoku
    public void generateBoard() {
        // Limpa o tabuleiro
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }

        // Preenche o tabuleiro com uma solução válida
        solve();

        // Remove alguns números para criar o jogo
        int numbersToRemove = 40; // Ajuste este valor para mudar a dificuldade
        while (numbersToRemove > 0) {
            int row = (int) (Math.random() * SIZE);
            int col = (int) (Math.random() * SIZE);
            if (board[row][col] != 0) {
                board[row][col] = 0;
                numbersToRemove--;
            }
        }
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.generateBoard();
        System.out.println("Tabuleiro de Sudoku:");
        sudoku.displayBoard();

        System.out.println("\nResolvendo o Sudoku...");
        if (sudoku.solve()) {
            sudoku.displayBoard();
        } else {
            System.out.println("Não foi possível resolver o Sudoku.");
        }
    }
}