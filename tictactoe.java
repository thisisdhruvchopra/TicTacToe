import java.security.cert.X509CRLEntry;
import java.util.*;import java.util.Random;
class tictactoe
{
    char player1, player2, choice; 
    char arr[][] = { { 'a', 'b' , 'c' }, 
            { 'd', 'e' , 'f' },
            { 'g', 'h' , 'i' } };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        tictactoe obj = new tictactoe();
        essentials esn = new essentials();

        esn.TypeEffect("W E L C O M E   T O   T I C-T A C-T O E", 10);

        esn.timeloop(400);

        esn.TypeEffect("\nDO YOU WANT TO PLAY WITH A FRIEND OR WITH A COMPUTER?\n", 10);

        System.out.println("A)FRIEND\nB)COMPUTER\n");

        int c1 = 0; char x;
        do{
            if(c1 > 0){
                System.out.println("\nPLEASE CHOOSE THE CORRECT OPTION\n");
                System.out.println("A) FRIEND \nB) COMPUTER \n");
            }
            x = sc.next().charAt(0);
            c1++;
            if(x =='A' || x == 'a' || x =='B' || x == 'b')
                break;
        }
        while(x !='A' || x != 'a' || x !='B' || x != 'b');
        System.out.println();

        switch(x)
        { 
            case 'a':
            case 'A':

            obj.input();

            esn.TypeEffect("\nWHICH PLAYER WANTS TO START FIRST?\n", 10);

            System.out.println("A) PLAYER 1\nB) PLAYER 2\n");

            int c = 0; char a;
            do{
                if(c > 0){
                    System.out.println("\nPLEASE CHOOSE THE CORRECT OPTION\n");
                    System.out.println("A) PLAYER 1\nB) PLAYER 2\n");
                }
                a = sc.next().charAt(0);
                c++;
                if(a =='A' || a == 'a' || a =='B' || a == 'b')
                    break;
            }
            while(a !='A' || a != 'a' || a !='B' || a != 'b');

            System.out.println();

            int preferencenum = 0;
            if(a=='A'||a=='a')
                preferencenum = 1;
            else if(a=='B'||a=='b')
                preferencenum = 2;

            esn.loading("L O A D I N G"); System.out.println();

            esn.TypeEffect("BELOW IS YOUR GRID CONTAINING ALPHABETS AS YOU SEE.\nYOU MAY CHOOSE THE ALPHABET TO PLACE YOUR TOKEN WHEN PROMPTED.\n", 10);

            esn.TypeEffect(". . . . . . . . . . . . . . . . . . . . .\n\n",5);

            char y = 'a';

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(y+"  |  ");
                    y++;
                }
                if(i==2)
                    break;
                System.out.println("\n_______________");
            }

            esn.TypeEffect("\n\n\n. . . . . . . . . . . . . . . . . . . . .",5);

            System.out.println("\n\nPLEASE CHOOSE NOW\n");

            obj.choice(preferencenum);
            esn.TypeEffect("\n\nT H A N K   Y O U   F O R   P L A Y I N G. . . ",15);
            esn.timeloop(400);
            System.out.println("\nDO YOU WANNA PLAY AGAIN ?\n\nY for YES.\nN for NO.\n");
            char choice=sc.next().charAt(0);
            switch(choice)
            {
                case 'y':
                case 'Y': main(args);;
                break;
                case 'n':
                case 'N':System.exit(0);
                break;
            }

            break;

            case 'b':
            case 'B':

            obj.input2();

            esn.TypeEffect("\nWHOM DO YOU WANT TO START FIRST?\n", 10);

            System.out.println("A)YOU\nB)COMPUTER\n");

            int c2 = 0; char b;
            do{
                if(c2 > 0){
                    System.out.println("\nPLEASE CHOOSE THE CORRECT OPTION\n");
                    System.out.println("A) YOU \nB) COMPUTER \n");
                }
                b = sc.next().charAt(0);
                c2++;
                if(b =='A' || b == 'a' || b =='B' || b == 'b')
                    break;
            }
            while(b !='A' || b != 'a' || b !='B' || b != 'b');

            System.out.println(); 

            int preferencenum1 = 0;
            if(b=='A'||b=='a')
                preferencenum1 = 1;
            else if(b=='B'||b=='b')
                preferencenum1 = 2;

            esn.loading("L O A D I N G"); System.out.println();

            esn.TypeEffect("BELOW IS YOUR GRID CONTAINING ALPHABETS AS YOU SEE.\nYOU MAY CHOOSE THE ALPHABET TO PLACE YOUR TOKEN WHEN PROMPTED.\n\n", 10);

            char y1 = 'a';
            if(b=='A'||b=='a')
            {
                esn.TypeEffect(". . . . . . . . . . . . . . . . . . . . .\n",5);
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print(y1+"  |  ");
                        y1++;
                    }
                    if(i==2)
                        break;
                    System.out.println("\n________________");
                }
                esn.TypeEffect("\n\n. . . . . . . . . . . . . . . . . . . . .",5);
            }

            System.out.println("\n\nPLEASE CHOOSE NOW\n");
            obj.choice2(preferencenum1);
            esn.TypeEffect("\n\nT H A N K   Y O U   F O R   P L A Y I N G. . . ",15);
            System.out.println("\nDO YOU WANNA PLAY AGAIN ?\nY for YES.\nN for NO.\n");
            char choice2=sc.next().charAt(0);
            System.out.println("\n\n");
            switch(choice2)
            {
                case 'y':
                case 'Y': main(args);
                break;
                case 'n':
                case 'N':System.exit(0);
                break;
            }
            break;
        }
    }

    void choice(int preferencenum){
        Scanner sc = new Scanner(System.in);int c=0;int used[]= new int[9];int o=0;
        while(true)
        {
            if(preferencenum==1)
            {
                System.out.print("PLAYER1's TURN~ ");
                preferencenum++;
            }
            else if(preferencenum==2)
            {
                System.out.print("PLAYER2's TURN~ ");
                preferencenum--;
            }
            System.out.println();
            int counter = 0; 
            do{

                if(counter > 0)
                    System.out.println("\nOOPSIE! TRY AGAIN\n\nPLAYER "+preferencenum+"'s TURN:");
                choice = sc.next().charAt(0);
                choice = Character.toUpperCase(choice);
                counter++;
                if(choice >= 'A' && choice <= 'I')
                    break;
            }
            while(choice < 'A' && choice > 'I');
            System.out.println("\n\n. . . . . . . . . . . . . . . . . . . . .\n");
            choice = Character. toLowerCase(choice);

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    char m = arr[i][j];
                    if(m==choice){
                        if(preferencenum==2){
                            arr[i][j]=player1;
                            break;
                        }
                        else if(preferencenum==1){
                            arr[i][j]=player2;
                            break;
                        }
                    }
                }
            }
            print(arr);c++;
            if(o<9)
                used[o]=(int)choice;
            o++;
            System.out.println("\n\n. . . . . . . . . . . . . . . . . . . . .\n\n");
            if(check()==true || c==9)
                break;
        }
        if(check()==false && c==9)
        {
            System.out.print("DRAW.");
        }
        else if(preferencenum==1)
        {
            //preferencenum++;
            System.out.println("CONGRATULATIONS PLAYER2 WINS!!! ");
        }
        else if(preferencenum==2)
        {
            //preferencenum--;
            System.out.println("CONGRATULATIONS PLAYER1 WINS!!! ");
        }
    }

    void choice2(int preferencenum){
        Scanner sc = new Scanner(System.in);int c=0;
        int used[]= new int[9];int o=0;boolean finish;
        while(true)
        {
             finish = true;
            if(preferencenum==1)
            {
                System.out.print("YOUR TURN~ ");
                preferencenum++;
            }
            else if(preferencenum==2)
            {
                preferencenum--;
            }
            System.out.println();
            int counter = 0; 
            if(preferencenum == 2)
            {
                do{
                    if(counter > 0)
                        System.out.println("\nPLEASE DONOT SELECT THE ALREADY SELECTE. TRY AGAIN\n\nYOUR TURN:");
                    choice = sc.next().charAt(0);
                    choice = Character. toLowerCase(choice);
                    counter++;
                    
                }
                while((choice==used[0] || choice==used[1] || choice==used[2] || choice==used[3] || choice==used[4] || choice==used[5] || 
                choice==used[6] || choice==used[7] || choice==used[8]));
            }
            else if(preferencenum == 1)
            {
                if(o==0)
                {
                    int min = 97;int max = 105;int range = 9;
                    int random=0;

                    do {
                        random = (int)(Math.random() * range) + min;
                        choice=(char)random;
                    }
                    while(random==used[0] || random==used[1] || random==used[2] || random==used[3] || random==used[4] || random==used[5] || 
                    random==used[6] || random==used[7] || random==used[8]);

                    Random random2 = new Random();
                    String setOfCharacters = "e"+choice;
            
                    int randomInt = random2.nextInt(setOfCharacters.length());
                    char randomChar = setOfCharacters.charAt(randomInt);
                    
                }

                else
                {
                    bestmove(used, o);
                }
                

            }

            System.out.println("\n\n. . . . . . . . . . . . . . . . . . . . .\n");
            choice = Character. toLowerCase(choice);
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    char m = arr[i][j];
                    if(m==choice){
                        if(preferencenum==2){
                            arr[i][j]=player1;
                            break;
                        }
                        else if(preferencenum==1){
                            arr[i][j]=player2;
                            break;
                        }
                    }
                }
            }
            print(arr);
            System.out.println("\n\n. . . . . . . . . . . . . . . . . . . . .\n\n"); 
            used[o]=(int)choice;
            o++;

            
            if(check()==true || o==9)
                break;

            
        }
        if(check()==false && o==9)
        {
            System.out.print("DRAW.");
        }
        else if(preferencenum==2)
        {
            System.out.println("CONGRATULATIONS YOU WIN!!! ");
        }
        else if(preferencenum==1)
        {  
            System.out.println("COMPUTER WINS. BAD LUCK! TRY AGAIN. ");
        }
    }

    boolean check()
    {
        if((arr[0][0]==arr[1][1]) && (arr[1][1]==arr[2][2]) && (arr[0][0]==arr[2][2]))
            return true;
        else if((arr[2][0]==arr[1][1]) && (arr[1][1]==arr[0][2]) && (arr[0][2]==arr[2][0]))
            return true;
        else if((arr[0][0]==arr[0][1]) && (arr[0][1]==arr[0][2]) && (arr[0][2]==arr[0][0]))
            return true;
        else if((arr[2][0]==arr[2][1]) && (arr[2][1]==arr[2][2]) && (arr[2][0]==arr[2][2]))
            return true;
        else if((arr[0][0]==arr[1][0]) && (arr[1][0]==arr[2][0]) && (arr[0][0]==arr[2][0]))
            return true;
        else if((arr[0][1]==arr[1][1]) && (arr[1][1]==arr[2][1]) && (arr[2][1]==arr[0][1]))
            return true;
        else if((arr[0][2]==arr[1][2]) && (arr[1][2]==arr[2][2]) && (arr[2][2]==arr[0][2]))
            return true;
        else if((arr[1][0]==arr[1][1]) && (arr[1][1]==arr[1][2]) && (arr[1][2]==arr[1][0]))
            return true;
        else
            return false;
    }

    void bestmove(int used[],int o)
    {
        //checks for its win
        
        if( ((arr[0][0] == player2 && arr[0][2] == player2) && (arr[0][1]!=player1 )) || 
            ((arr[1][1] == player2 && arr[2][1] == player2) && (arr[0][1]!=player1 )) )
        {
            choice = 'b';
        }

        else if( ( (arr[1][0] == player2 && arr[1][2] == player2) && (arr[1][1] != player1) ) || 
                 ( (arr[0][2] == player2 && arr[2][0] == player2) && (arr[1][1] != player1) ) || 
                 ( (arr[0][0] == player2 && arr[2][2] == player2) && (arr[1][1] != player1) ) || 
                 ( (arr[0][1] == player2 && arr[2][1] == player2) && (arr[1][1] != player1) ) )
                
        {
            choice = 'e';
        }
        
        else if( ( (arr[2][0] == player2 && arr[2][2] == player2) && (arr[2][1]!=player1) ) || 
                 ( (arr[0][1] == player2 && arr[1][1] == player2) && (arr[2][1]!=player1) ) )
        {
            choice = 'h';
        }

        else if( (arr[0][0] == player2 && arr[2][0] == player2) && (arr[1][0]!=player1) )
        {
            choice = 'd';
        }

        else if( (arr[0][2] == player2 && arr[2][2] == player2) && (arr[1][2]!=player1) )
        {
            choice = 'f';
        }

        else if( ( (arr[0][0] == player2 && arr[1][1] == player2) && (arr[2][2]!=player1) ) ||   
                 ( (arr[0][2] == player2 && arr[1][2] == player2) && (arr[2][2]!=player1) )  ||
                 ( (arr[2][0] == player2 && arr[2][1] == player2) && (arr[2][2]!=player1) )  )
        
        {
            choice = 'i';
        }

        else if( ((arr[1][1] == player2 && arr[0][2] == player2) && (arr[2][0]!=player1) ) ||
                 ((arr[0][0] == player2 && arr[1][0] == player2) && (arr[2][0]!=player1) ) ||
                 ((arr[2][1] == player2 && arr[2][2] == player2) && (arr[2][0]!=player1) ) ) 

        {
            choice = 'g';
        }

        else if( ((arr[1][1] == player2 && arr[2][2] == player2) && (arr[0][0]!=player1) ) ||
                 ((arr[0][1] == player2 && arr[0][2] == player2) && (arr[0][0]!=player1) ) ||  
                 ((arr[1][0] == player2 && arr[2][0] == player2) && (arr[0][0]!=player1) ) )  
        {
            choice = 'a';
        }

        else if( ((arr[1][1] == player2 && arr[2][0] == player2) && (arr[0][2]!=player1) ) || 
                 ((arr[1][2] == player2 && arr[2][2] == player2) && (arr[0][2]!=player1) ) ||   
                 ((arr[0][0] == player2 && arr[0][1] == player2) && (arr[0][2]!=player1) ) )
        {
            choice = 'c';
        }

        //checks to prevent the oponent to win

        else if( ((arr[0][0] == player1 && arr[0][2] == player1) && (arr[0][1]!=player2 )) || 
            ((arr[1][1] == player1 && arr[2][1] == player1) && (arr[0][1]!=player2 )) )
        {
            choice = 'b';
        }

        else if( ( (arr[1][0] == player1 && arr[1][2] == player1) && (arr[1][1] != player2) ) || 
                 ( (arr[0][2] == player1 && arr[2][0] == player1) && (arr[1][1] != player2) ) || 
                 ( (arr[0][0] == player1 && arr[2][2] == player1) && (arr[1][1] != player2) ) || 
                 ( (arr[0][1] == player1 && arr[2][1] == player1) && (arr[1][1] != player2) ) )  
        {
            choice = 'e';
        }
        
        else if( ( (arr[2][0] == player1 && arr[2][2] == player1) && (arr[2][1]!=player2) ) || 
                 ( (arr[0][1] == player1 && arr[1][1] == player1) && (arr[2][1]!=player2) ) )
        {
            choice = 'h';
        }

        else if( (arr[0][0] == player1 && arr[2][0] == player1) && (arr[1][0]!=player2) )
        {
            choice = 'd';
        }

        else if( (arr[0][2] == player1 && arr[2][2] == player1) && (arr[1][2]!=player2) )
        {
            choice = 'f';
        }

        else if( ( (arr[0][0] == player1 && arr[1][1] == player1) && (arr[2][2]!=player2) ) ||   
                 ( (arr[0][2] == player1 && arr[1][2] == player1) && (arr[2][2]!=player2) )  ||
                 ( (arr[2][0] == player1 && arr[2][1] == player1) && (arr[2][2]!=player2) )  )
        
        {
            choice = 'i';
        }

        else if( ((arr[1][1] == player1 && arr[0][2] == player1) && (arr[2][0]!=player2) ) ||
                 ((arr[0][0] == player1 && arr[1][0] == player1) && (arr[2][0]!=player2) ) ||
                 ((arr[2][1] == player1 && arr[2][2] == player1) && (arr[2][0]!=player2) ) ) 

        {
            choice = 'g';
        }

        else if( ((arr[1][1] == player1 && arr[2][2] == player1) && (arr[0][0]!=player2) ) ||
                 ((arr[0][1] == player1 && arr[0][2] == player1) && (arr[0][0]!=player2) ) ||  
                 ((arr[1][0] == player1 && arr[2][0] == player1) && (arr[0][0]!=player2) ) )  
        {
            choice = 'a';
        }

        else if( ((arr[1][1] == player1 && arr[2][0] == player1) && (arr[0][2]!=player2) ) || 
                 ((arr[1][2] == player1 && arr[2][2] == player1) && (arr[0][2]!=player2) ) ||   
                 ((arr[0][0] == player1 && arr[0][1] == player1) && (arr[0][2]!=player2) ) )
        {
            choice = 'c';
        }

        //else it just randomises

        else
        {
            randomiser(used,o);
        }     
    }
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        essentials esn = new essentials();
        esn.TypeEffect("PLEASE CHOOSE EITHER O OR X\n",10);
        essentials obb = new essentials();
        int c = 0;
        System.out.print("Player1: ");
        do{
            if(c > 0)
                System.out.print("\nPLEASE CHOOSE EITHER O OR X ONLY\n\nPlayer 1: ");
            player1 = sc.next().charAt(0);
            c++;
            if(player1 =='X' || player1 == 'O' || player1 =='x' || player1 == 'o')
                break;

        }
        while(player1 !='X' || player1 != 'O' || player1 !='x' || player1 != 'o');
        player1 = Character. toUpperCase(player1);
        if(player1 == 'X')
        {
            player2 = 'O';
            System.out.println("Player2: O");
        }

        else 
        {
            player2 = 'X';
            System.out.println("Player2: X");
        }
    }

    void input2() 
    {
        Scanner sc = new Scanner(System.in);
        essentials esn = new essentials();
        esn.TypeEffect("PLEASE CHOOSE EITHER O OR X\n",10);
        essentials obb = new essentials();
        int c = 0;
        System.out.print("YOU: ");
        do{
            if(c > 0)
                System.out.print("\nPLEASE CHOOSE EITHER O OR X ONLY\nYOU: ");
            player1 = sc.next().charAt(0);
            c++;
            if(player1 =='X' || player1 == 'O' || player1 =='x' || player1 == 'o')
                break;

        }
        while(player1 !='X' || player1 != 'O' || player1 !='x' || player1 != 'o');
        player1 = Character. toUpperCase(player1);
        if(player1 == 'X')
        {
            player2 = 'O';
            System.out.println("COMPUTER: O");
        }

        else 
        {
            player2 = 'X';
            System.out.println("COMPUTER: X");
        }
    }

    void print(char array[][])
    {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j]+"  |  ");
            }
            if(i==2)
                break;
            System.out.println("\n________________");
        }
    }
    void randomiser(int used[],int o)
    {
        int min = 97;int max = 105;int range = 9;

        int random=0;

        do {
            random = (int)(Math.random() * range) + min;
            choice=(char)random;
            }
        while(random==used[0] || random==used[1] || random==used[2] || random==used[3] || random==used[4] || random==used[5] || 
        random==used[6] || random==used[7] || random==used[8]);
        
    }
}


class essentials
{
    void loading(String s)
    {
        System.out.print(s);
        for(int i=0;i<10;i++)
        {
            for(int z=0;z<75;z++)
                for(long x=0;x<9999999;x++);
            System.out.print(".");
        }
        System.out.println();
    }

    void TypeEffect(String s, int factor)
    {
        int l=s.length();
        char arr[]=new char[l];
        for(int i=0;i<l;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<l;i++)
        {
            for(int z=0;z<factor;z++)
                for(long x=0;x<9999999;x++);
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    void timeloop(int factor)
    {
        for(int z=0;z<factor;z++)
            for(long x=0;x<9999999;x++);
    }
}