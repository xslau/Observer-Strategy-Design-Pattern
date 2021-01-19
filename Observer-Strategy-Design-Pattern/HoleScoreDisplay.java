/**
 * Creates returnable statement representing current hole stats including Golfer strokes and par value
 * @author Xzavian Slaughter
 */
public class HoleScoreDisplay implements Observer{

    private Subject golfer; 
    private int strokes; 
    private int par; 

    /**
     * Constructor: Intializes Observer for Golfer on current hole
     * @param golfer instance of Abstract Class Subject
     */
    public HoleScoreDisplay(Subject golfer) {

        this.golfer = golfer; 
        golfer.registerObserver(this);
        
    }

    /**
     * Intakes current Golfer strokes and par values for score display
     * @param strokes Number of Golfer
     * @param par Designated par for hole
     */
    public void update(int strokes, int par) {

        this.strokes = strokes; 
        this.par = par; 
        displayCurrentScore();
    }

    /**
     * Outputs the current Golfer hole stats such as strokes, par, and performance in relation to par 
     */
    private void displayCurrentScore() {

        System.out.println("\nCurrent Hole Stats:"); 
        System.out.println("Par: " + par); 
        System.out.println("Strokes: " + strokes); 

        if(strokes < par){

            System.out.println((par - strokes) + " under par"); 

        } else if (strokes == par){

            System.out.println("Made par"); 

        } else {

            System.out.println((strokes - par) + " over par"); 
        }
    }
}
