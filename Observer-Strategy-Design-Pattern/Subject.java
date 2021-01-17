public interface Subject {

    public void registerObserver(Observer observer); 
    public void removeObserve(Observer observer); 
    public void notifyObserver(int strokes, int par); 
}