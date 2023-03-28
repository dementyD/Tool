package Guru;

public class Opener extends Tool {
    private String workOpener = "Пшшшш открыла пиво";

    public Opener(Workable decoratedWorkable) {
        super(decoratedWorkable);
    }

    public Opener() {

    }

    @Override
    public String getSoundWork() {
        return workOpener;
    }
}




