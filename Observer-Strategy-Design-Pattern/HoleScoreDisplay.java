public class HoleScoreDisplay implements Observer{

    private Subject golfer; 
    private int strokes; 
    private int par; 

    public HoleScoreDisplay(Subject golfer) {

        this.golfer = golfer; 
       
    }

    public void update(int strokes, int par) {

        golfer.notifyObserver(strokes, par);
        displayCurrentScore();
    }

    private void displayCurrentScore() {

        System.out.println("Current Hole Stats"); 
        System.out.println("Par " + par); 
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
