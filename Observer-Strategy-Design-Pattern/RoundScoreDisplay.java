public class RoundScoreDisplay implements Observer{

    private Subject golfer; 
    private int strokesTotal; 
    private int parTotal; 

    public RoundScoreDisplay(Subject golfer){

        this.golfer = golfer; 
    }

    public void update(int strokes, int par){

        golfer.notifyObserver(strokes, par);
        displayRoundScore();
    }

    private void displayRoundScore() {

        System.out.println("Current Round Stats"); 
        System.out.println("Par: " + parTotal); 
        System.out.println("Strokes: " + strokesTotal); 

        if(strokesTotal < parTotal){

            System.out.println((parTotal - strokesTotal) + " under par"); 

        } else if (strokesTotal == parTotal){

            System.out.println("Made par"); 

        } else {

            System.out.println((strokesTotal - parTotal) + " over par"); 
        }
    }
    
}
