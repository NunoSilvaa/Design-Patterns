import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{
    private boolean started = false;
    public StringBar(){
        started = false;
        observers = new ArrayList<>();
    };

    void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }

    @Override
    public boolean isHappyHour() {
        return started;
    }

    @Override
    public void startHappyHour() {
        started = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        started = false;
        this.notifyObservers();
    }
}
