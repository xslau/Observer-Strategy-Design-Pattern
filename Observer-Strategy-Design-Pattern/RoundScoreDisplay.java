public class RoundScoreDisplay implements Observer{

    private Subject golfer; 
    private int strokesTotal; 
    private int parTotal; 

    public RoundScoreDisplay(Subject golfer){

        this.golfer = golfer; 
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par){

        parTotal += par; 
        strokesTotal += strokes; 

        displayRoundScore();
    }

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
