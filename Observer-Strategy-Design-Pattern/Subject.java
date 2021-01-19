/**
 * Interface for classes inheriting Subject
 * @author Xzavian Slauhgter
 */
public interface Subject {

    /**
     * Creates a new Observer for ArrayList Observer
     * @param observer ArrayList Observer
     */
    public void registerObserver(Observer observer); 

    /**
     * Removes an Observer from ArrayList Observer
     * @param observer ArrayList Observer
     */
    public void removeObserve(Observer observer); 

    /**
     * Allows Observers to update values within ArrayList Observer
     * @param strokes Number of Subject strokes
     * @param par Designated par for hole
     */
    public void notifyObserver(int strokes, int par); 
}