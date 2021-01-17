import java.util.ArrayList;

public class Golfer implements Subject{

    private ArrayList<Observer>observers;
    private String name;

    public Golfer(String name){

        this.name = name;
    }

	@Override
	public void registerObserver(Observer observer) {

		observers.add(observer);
	}

	@Override
	public void removeObserve(Observer observer) {
        
		observers.remove(observer);

	}

	@Override
	public void notifyObserver(int strokes, int par) {
		for (Observer observer : observers) {
            observer.update(strokes, par);
        }

    }

    public void enterScore(int strokes, int par){

       notifyObserver(strokes, par);
    }

    public String getName() {

        return this.name; 
    }
}
