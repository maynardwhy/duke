public class Task {
    protected String description;
    protected boolean isDone;

    public Task(){}

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    //set done
    public void setDone() {
        this.isDone = true;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }
    public String printTask() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
}
