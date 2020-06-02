public class Game
{
      private int goalsTeamH = 0;
      private int goalsTeamG = 0;
      private String date;
      private Team teamH;
      private Team teamG;
      private static Game[] allGames = new Game[100];
      
      

    /**
     * constructor (automatically assigns a number to the game)
     * 
     * @param date game date
     * @param teamH home team 
     * @param teamG away team
     */
    public Game(String date, Team teamH, Team teamG)
    {
        this.date = date;
        this.teamH = teamH;
        this.teamG = teamG;
        
        for (int i = 0; i < allGames.length; i++)
           {   
              if (allGames[i] == null) {
                 allGames[i] = this;
                 break;
                };
              
             };      
       };

    /**
     * returns all the games 
     * @return games
     */
    public static Game[] getGames() 
    {
        return allGames;
    }

    /**
     * returns all the games on a given date 
     * @return games
     */
    public static Game[] getGames(String date) 
    {
        Game[] games = new Game[allGames.length];
        int gamesCounter = 0;
         
        for (int i = 0; i < allGames.length; i++) {
          if (allGames[i] == null) {
              break;
           } else if (allGames[i].date.equals(date)) {
              games[gamesCounter] = allGames[i];
              gamesCounter++;
          };
        }
        return games;
    };

    /**
     * return the date of the game
     * @return date
     */
    public String getDate()
    {
        return date;
    }
        
    /**
     * return home team
     * @return team
     */
    public Team getTeamH()
    {
      return teamH;
    }
    
    /**
     * returns away team
     * @return team
     */
    public Team getTeamG()
    {
        return teamG;
    }
    
    /**
     * returns the home team goals
     * @return goals
     */
    public int getGoalsH()
    {
        return goalsTeamH;
    }    

    /**
     * returns the away team goals
     * @return goals
     */
    public int getGoalsG()
    {
        return goalsTeamG;
    }  
    
    /**
     * called when home team scores
     */
    public void goalH() 
    {
       goalsTeamH += 1;
    }
    
    /**
     * called when away team scores
     */
    public void goalG()
    {
         goalsTeamG += 1;
    }
    
    /**
     * called at the end of the game
     */
    public void whistle()
    {
       teamH.addResult(goalsTeamH, goalsTeamG);
       teamG.addResult(goalsTeamG,goalsTeamH);
    }   
    
}
