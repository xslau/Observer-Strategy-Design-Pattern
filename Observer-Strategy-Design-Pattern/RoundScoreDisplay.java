/**
 * Creates returnable statement representing hole stats for round including Golfer strokes and par value
 * @author Xzavian Slaughter
 */
public class RoundScoreDisplay implements Observer{

    private Subject golfer; 
    private int strokesTotal; 
    private int parTotal; 

     /**
     * Constructor: Intializes Observer for Golfer for round
     * @param golfer instance of Abstract Class Subject
     */
    public RoundScoreDisplay(Subject golfer){

        this.golfer = golfer; 
        golfer.registerObserver(this);
    }

    /**
     * Intakes Golfer strokes and par values and adds them to total for par and strokes for round score display
     * @param strokes Number of Golfer
     * @param par Designated par for round
     */
    public void update(int strokes, int par){

        parTotal += par; 
        strokesTotal += strokes; 

        displayRoundScore();
    }

    /**
     * Outputs the Golfer hole stats for round such as total strokes, total par, and total performance in relation to par 
     */
    private void displayRoundScore() {

        System.out.println("\nRound Stats:"); 
        System.out.println("Par: " + parTotal); 
        System.out.println("Strokes: " + strokesTotal); 

        if(strokesTotal < parTotal){

            System.out.println((parTotal - strokesTotal) + " under par"); 

        } else if (strokesTotal == parTotal){

            System.out.println("Making par"); 

        } else {

            System.out.println((strokesTotal - parTotal) + " over par"); 
        }
    }
    
}
