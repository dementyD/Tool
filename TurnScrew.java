package Guru;

public class TurnScrew extends Tool {
    private String workTurnScrew = "Кручу";

    public TurnScrew(Workable decoratedWorkable) {
        super(decoratedWorkable);
    }

    public TurnScrew() {

    }

    @Override
    public String getSoundWork() {
        return workTurnScrew;
    }
}







