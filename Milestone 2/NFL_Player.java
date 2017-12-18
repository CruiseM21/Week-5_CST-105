package nfl_player.tester;
/*
 * Program: Pro Draft List Program
 * File: NFL_Player.java
 * Summary: Player class for main program ProDraftList
 * Author: Vincent Christaldi
 * Date: 12/13/2017
*/
public class NFL_Player 
{
    //Player Main information variables
    private String plyr_Name;
    private String plyr_Position;
    private String plyr_Height;
    private int plyr_Age;
    private int plyr_Weight;

    //Player stats variables
    private int total_Carries;
    private int total_Yards;
    private double average_Yards;
    private int interceptions;
    private double runs_To_Goal;
    private int touchdowns;
    private int seasons_Played;
    private int start_Year;

    //constructor for variables(in order from above)  
    public NFL_Player(String name, String position, String height, int age, int weight, int tot_carries, int tot_yards, double avg_Yards, int incpts, double RTG, int TDS, int year)
    {
        plyr_Name = name;
        plyr_Position = position;
        plyr_Height = height;
        plyr_Age = age;
        plyr_Weight = weight;
        total_Carries = tot_carries;
        total_Yards = tot_yards;
        average_Yards = avg_Yards;
        interceptions = incpts;
        runs_To_Goal = RTG;
        touchdowns = TDS;
        start_Year = year;
        
    }
    //default empty constructor
    public NFL_Player()
    {
        plyr_Name = "Not Available";
        plyr_Position = "Not Available";
        plyr_Height = "Not Available";
        plyr_Age = 0;
        plyr_Weight = 0;
        total_Carries = 0;
        total_Yards = 0;
        average_Yards = 0;
        interceptions = 0;
        runs_To_Goal = 0;
        touchdowns = 0;
        start_Year = 0;
    }
    
    //setter methods
    public void setName(String name)
    {
        plyr_Name = name;
    }
    public void setPosition(String position)
    {
        plyr_Position = position;
    }
    public void setHeight(String height)
    {
        plyr_Height = height;
    }
    public void setAge(int age)
    {
        plyr_Age = age;
    }
    public void setWeight(int weight)
    {
        plyr_Weight = weight;
    }
    public void setTotal_Carries(int tot_Carries)
    {
        total_Carries = tot_Carries;
    }
    public void setTotal_Yards(int tot_Yards)
    {
        total_Yards = tot_Yards;
    }
    public void setAverage_Yards(int tot_Carries, int tot_Yards)
    {
        //uset total yards / total carries to get average yards
        average_Yards = tot_Yards / tot_Carries;
    }
    public void setTDS(int TDS)
    {
        touchdowns = TDS;
    }
    public void setSeasons(int year)
    {
        //use 2018 - starting year to get seasons played
        seasons_Played = 2018-year;
    }
    
    //getter methods
    public String getName()
    {
        return plyr_Name;
    }
    public String getPosition()
    {
        return plyr_Position;
    }
    public String getHeight()
    {
        return plyr_Height;
    }
    public int getAge()
    {
        return plyr_Age;
    }
    public int getWeight()
    {
        return plyr_Weight;
    }
    public int getTotal_Carries()
    {
        return total_Carries;
    }
    public int getTotal_Yards()
    {
        return total_Yards;
    }
    public double getAverage_Yards()
    {
        return average_Yards;
    }
    public int getTDS()
    {
        return touchdowns;
    }
    public int getSeasons()
    {
        return seasons_Played;
    }
    
    
}
