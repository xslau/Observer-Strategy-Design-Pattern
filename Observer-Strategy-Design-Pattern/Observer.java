
/**
 * Interface for classes inheriting Observer
 */
public interface Observer {

    /**
     * Intakes Golfer strokes and par values for score display
     * @param strokes Number of Golfer
     * @param par Designated par for hole
     */
    public void update(int strokes, int par); 
    
}
