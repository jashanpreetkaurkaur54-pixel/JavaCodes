import java.util.Scanner;

public class TicTacToe {

    // method to print board
public static void printBoard(char[][] board) {
for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
 System.out.print(board[i][j] + " ");
            }
 System.out.println();
        }
    }

    // method to check winner
public static boolean checkWin(char[][] board, char player) {
for (int i = 0; i < 3; i++) {
if (board[i][0] == player &&
board[i][1] == player &&
board[i][2] == player) {
 return true;
            }
        }
 for (int j = 0; j < 3; j++) {
if (board[0][j] == player &&
     board[1][j] == player &&
    board[2][j] == player) {
    return true;
            }
 }
if (board[0][0] == player &&
 board[1][1] == player &&
 board[2][2] == player) {
return true;
        }
 if (board[0][2] == player &&
 board[1][1] == player &&
board[2][0] == player) {
 return true;
        }
return false;
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
char[][] board = {
 {'-', '-', '-'},
{'-', '-', '-'},
{'-', '-', '-'}
        };
 char player = 'X';
 int moves = 0;
  while (true) {

            // print board
printBoard(board);

            // input
 System.out.println("Player " + player + " turn (enter row and column 0-2): ");
    int row = sc.nextInt();
    int col = sc.nextInt();

            // validation
    if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
    System.out.println("Invalid move! Try again.");
    continue;
            }

            // place move
    board[row][col] = player;
    moves++;
    
  if (checkWin(board, player)) {
 printBoard(board);
 System.out.println("Player " + player + " wins!");
                break;
            }

            // check draw
 if (moves == 9) {
 printBoard(board);
 System.out.println(" It's a draw!");
break;
            }

            // switch player
 if (player == 'X') {
 player = 'O';
} else {
player = 'X';
            }
        }

        sc.close();
    }
}