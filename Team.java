public class Team
{
    private String name;
    private int games, points, goalDifference;
    
    /**
     * constructor
     * @param name 
     */
    public Team(String name)
    {
        this.name = name;
    }

    /**
     * return the team name
     * @return name
     */
     
     public String getName(){ 
         return name;
     };
    
    /**
     * returns the number of points
     * @return points
     */
     public int getPoints(){
         return points;
     };
    
    /**
     * returns the number of games played
     * @return games
     */
     public int getGames(){
         return games;
     };
    
    /** 
     * returns the total goal difference
     * @return goal difference
     */
     public int getGoalDifference(){
        
         return goalDifference;
     };
    
    /**
     * called at the end of each game to update the stats
     * @param goalsFor goals scored
     * @param goalsAgainst goals conceded
     */ 
    public void addResult(int goalsFor, int goalsAgainst)
    {
        if(goalsFor > goalsAgainst){
           points += 3;
        } else if(goalsFor == goalsAgainst){
           points += 1;
        };
        
       goalDifference = goalsFor - goalsAgainst;
    }    
}