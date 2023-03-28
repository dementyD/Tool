package Guru;

public abstract class Tool implements Workable {
    protected Workable decoratedWorkable;

    public Tool(Workable decoratedWorkable) {
        this.decoratedWorkable = decoratedWorkable;
    }

    public Tool() {

    }

    public abstract String getSoundWork();

    public void work() {
        System.out.println(getSoundWork());
        if (decoratedWorkable == null) {
            return;
        }
        decoratedWorkable.work();
    }
}