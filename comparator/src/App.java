import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    // sort in order of decreasing score; if or more players have the same score,
    //  sort those players alphabetically by nam
    @Override
    public int compare(Player arg0, Player arg1) {
        if(arg0.score == arg1.score) {
            return Integer.compare(arg0.name.length(), arg1.name.length());
        }
        else {
            return arg1.score - arg0.score;
        }
    }

    
}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

    }
}
