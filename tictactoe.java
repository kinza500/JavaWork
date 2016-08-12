import java.io.IOException;
import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {
		char[][] arr = new char[][] {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		char choice;String pos;int row,col;
		Scanner s = new Scanner(System.in);	
		int player1=0,player2=0;
		for(int i=1;i<=9;i++)
		{
			
			if(i%2!=0)
			{
				System.out.println("Player 1,Please enter your position[row,col]");
			    choice = 'O';
			}
			else
			{
				System.out.println();
		        System.out.println("Player 2,Please enter your position[row,col]");
		        choice = 'X';
			}
			pos = s.next();
            row = Character.getNumericValue(pos.charAt(0));
            col = Character.getNumericValue(pos.charAt(2));
            if(arr[row][col]!= ' ')
            {
                System.out.println("Place is already occupied...Mark somewhereelse");	
                i--;
                continue;
            }
            else
            {
               arr[row][col] = choice;
            }
            
            System.out.println(arr[0][0]+"   |   "+arr[0][1]+"   |   "+arr[0][2]);
            System.out.println("-----------------");
            System.out.println(arr[1][0]+"   |   "+arr[1][1]+"   |   "+arr[1][2]);
            System.out.println("-----------------");
            System.out.println(arr[2][0]+"   |   "+arr[2][1]+"   |   "+arr[2][2]);   
            
          //For checking who won
                  if(arr[0][0]=='O' && arr[1][0]=='O' && arr[2][0]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X')
                  {
                	  player2++;
                  }
                  if(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X')
                  {
                	  player2++;
                  }
                  if(arr[0][2]=='O' && arr[1][2]=='O' && arr[2][2]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X')
                  {
                	  player2++;
                  }
                  
                  if(arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X')
                  {
                	  player2++;
                  }
                  if(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X')
                  {
                	  player2++;
                  }
                  if(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X')
                  {
                	  player2++;
                  }
                  if(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X')
                  {
                	  player2++;
                  }
                  if(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O')
                  {
                	 player1++;
                  }
                  else if (arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X')
                  {
                	  player2++;
                  }
                                                	
            	if(player1==1)
            	{
            		System.out.println();
            		System.out.println("*****////****PLAYER 1 WON *****////****!!!!");
            		break;
            	}
            	else if(player2==1) 
            	{
            		System.out.println();
            		System.out.println("*****////****PLAYER 2 WON *****////****!!!!");
            		break;
            	}
            	//For checking who won	
		}
		System.out.println();
		System.out.println("**********G A M E  O V E R************");
	}

}
