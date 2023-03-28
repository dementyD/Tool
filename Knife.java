package Guru;

public class Knife extends Tool {
    private String workKnife = "Режу";

    public Knife(Workable decoratedWorkable) {
        super(decoratedWorkable);
    }

    public Knife() {

    }

    @Override
    public String getSoundWork() {
        return workKnife;
    }
}