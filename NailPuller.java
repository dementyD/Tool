package Guru;

public class NailPuller extends Tool {
    private String workNailPuller = "Вырываю";

    public NailPuller(Workable decoratedWorkable) {
        super(decoratedWorkable);
    }

    public NailPuller() {

    }

    @Override
    public String getSoundWork() {
        return workNailPuller;
    }
}
