import java.util.Objects;
import java.util.Arrays;

public class GameTest 
{
    public static void main(String[] args)
    {
        Team e = new Team("E");
        Team m = new Team("M");
        Team t = new Team("T");
        Team w = new Team("W");
        Team a = new Team("A");
        
        Game s0 = new Game("23/2", m, a);
        s0.goalH();
        s0.goalH();
        s0.goalH();
        s0.whistle();
        
        Game s1 = new Game("1/3", e, m);
        Game s2 = new Game("01/3".substring(1,4), t, w);
        s1.goalH();
        s2.goalH();
        s2.goalG();
        s1.goalG();
        s2.goalH();
        s2.goalG();
        s2.goalG();
        s1.whistle();
        s2.whistle();
        
        printGame(s0);
        printGame(s1);
        printGame(s2);
        printLine(e);
        printLine(m);
        printLine(t);
        printLine(w);
        printLine(a);
        
        Game[] games = Game.getGames();
    
        System.out.println("games[0] == s0: " + (games[0] == s0 ? "PASS" : "FAIL"));
        System.out.println("games[1] == s1: " + (games[1] == s1 ? "PASS" : "FAIL"));
        System.out.println("games[2] == s2: " + (games[2] == s2 ? "PASS" : "FAIL"));
        System.out.println("games[3] == null: " + (games[3] == null ? "PASS" : "FAIL"));

        Game[] tg = Game.getGames("1/3");
        System.out.println("tg[0] == s1: " + (tg[0] == s1 ? "PASS" : "FAIL"));
        System.out.println("tg[1] == s2: " + (tg[1] == s2 ? "PASS" : "FAIL"));
        System.out.println("tg[2] == null: " + (tg[2] == null ? "PASS" : "FAIL"));

        System.out.println("e.getName().equals(E): " + (e.getName().equals("E") ? "PASS" : "FAIL"));
        System.out.println("m.getName().equals(M): " + (m.getName().equals("M") ? "PASS" : "FAIL"));
        System.out.println("t.getName().equals(T): " + (t.getName().equals("T") ? "PASS" : "FAIL"));
        System.out.println("w.getName().equals(W): " + (w.getName().equals("W") ? "PASS" : "FAIL"));
        System.out.println("a.getName().equals(A): " + (a.getName().equals("A") ? "PASS" : "FAIL"));
        
        System.out.println("e.getPoints() == 1: " + (e.getPoints() == 1 ? "PASS" : "FAIL"));
        System.out.println("m.getPoints() == 4: " + (m.getPoints() == 4 ? "PASS" : "FAIL"));
        System.out.println("t.getPoints() == 0: " + (t.getPoints() == 0 ? "PASS" : "FAIL"));
        System.out.println("w.getPoints() == 3: " + (w.getPoints() == 3 ? "PASS" : "FAIL"));
        System.out.println("a.getPoints() == 0: " + (a.getPoints() == 0 ? "PASS" : "FAIL"));
    }
    
    private static void printLine(Team t) 
    {
        System.out.println(t.getName() + " " + t.getGames() + " " + t.getGoalDifference() + " " + t.getPoints());
    }    
    
    private static void printGame(Game g)
    {
        System.out.println(g.getDate() + ": " + g.getTeamH().getName() + " " + g.getGoalsH() + ":" + g.getGoalsG() + " " + g.getTeamG().getName());
    }    
}