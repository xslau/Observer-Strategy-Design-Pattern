import java.util.ArrayList;

/**
 * Creates a new Golfer with indicated name and ArrayList<Observers>
 * @author Xzavian Slaughter
 */
public class Golfer implements Subject{

    private ArrayList<Observer>observers;
    private String name;

    /**
     * Constructor: Intializes name and new ArrayList for Observers
     * @param name Golfer name 
     */
    public Golfer(String name){

        this.name = name;
        observers = new ArrayList(); 
    }

    /**
     * Adds an Observer to Observers ArrayList
     * @param observer ArrayList Observer
     */
    @Override
    public void registerObserver(Observer observer) {

		observers.add(observer);
	}

    /**
     * Removes an Observer from ArrayList Observer
     * @param observer ArrayList Observer
     */
	@Override
	public void removeObserve(Observer observer) {
        
        observers.remove(observer);
        
	}

    /**
     * Updates values held by ArrayList Observers for each Observer
     * @param strokes Number of Golfer strokes
     * @param par Designated par for game
     */
	@Override
	public void notifyObserver(int strokes, int par) {
		for (Observer observer : observers) {
            observer.update(strokes, par);
        }
        
    }

    /**
     * Allows  ArrayList Observers to acquire updated values for 
     * @param strokes Number of strokes taken by Golfer
     * @param par Designated par for game 
     */
    public void enterScore(int strokes, int par){

       notifyObserver(strokes, par);
    }

    /**
     * Returns Golfer name
     * @return Golfer name
     */
    public String getName() {

        return this.name; 
    }
}
