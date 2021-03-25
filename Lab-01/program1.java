import java.util.Scanner;

class players
{
    int id,n;
    String name;
    int no_matches_played,sum=0;
    int scores[];
    double avg_runs; 

    Scanner sc = new Scanner(System.in);

    players()
    {
        System.out.println("Enter the Player Id: ");
        id = sc.nextInt();

        System.out.println("Enter The Name of Player: ");        
        name = sc.next();

        System.out.println("Enter The Number of Matches Played By " + name + " : ");        
        no_matches_played = sc.nextInt();

        scores = new int[no_matches_played];

        System.out.println("Enter the Runs Scored in Each Match: ");
        for(int i=0;i<no_matches_played;i++)
        {
            scores[i] = sc.nextInt();
        }
    }

    double calcAvg()
    {
        for(int i=0;i<no_matches_played;i++)
        {
            sum += scores[i];
        }
        return avg_runs = sum / no_matches_played;
    } 

    void display() 
    {
        System.out.println("The Details of the Player whose Average Score is Greater is as Follows: ");
        System.out.println("Player Id : "+id);
        System.out.println("Player Name : "+name);
        System.out.println("Number of Matches Played By the Player : "+no_matches_played);
        System.out.println("Avg Runs Scored : "+avg_runs);
    }
}

class program1
{
    public static void main(String args[])
    {
        players p1 = new players();
        double avg1 = p1.calcAvg();

        players p2 = new players();
        double avg2 = p2.calcAvg();

        if(avg1 > avg2)
        {
            p1.display();
        }
        else
        {
            p2.display();
        }
    }
}