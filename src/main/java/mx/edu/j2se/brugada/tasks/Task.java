package mx.edu.j2se.brugada.tasks;

public class Task {

    public String title;        //title
    public int time;            //time
    public int start;           //start
    public int end;             //end
    public int interval;        //interval
    public boolean active;      //is active
    public boolean repeated;    //is repeated

    /** Constructs an inactive task to run at a specified time without repeating with a given name.*/
    public Task (String title, int time){

    }

    /** Constructs an inactive task to run within the specified time range with the set repetition interval and
     *  with a given name.*/
    public Task (String title, int start, int end, int interval){
    }

    /** Method for reading the task name.*/
    public String getTitle() {
        return title;
    }

    /** Method for setting the task name.*/
    public void setTitle(String title) {
        this.title = title;
    }

    /**Method for reading the task status.*/
    public boolean isActive(){
        return active;
    }

    /**Method for setting the task status.*/
    public void setActive(boolean active){
        this.active = active;
    }
    /** If the task is a repetitive one, the method must return the start time of the repetition.*/
    public int getTime(){
        return time;
    }

    /** If the task was a repetitive one, it should become non-repetitive.*/
    public void setTime(int time){
        this.time = time;
    }

    /** if the task is a non-repetitive one, the method must return the start time of the execution.*/
    public int getStartTime(){
        return start;
    }
    /** If the task is a non-repetitive one, the method must return the end time of the execution. */
    public int getEndTime(){
        return end;
    }

    /** if the task is a non-repetitive one, the method must return 0.*/
    public int getRepeatInterval(){
        return interval;
    }

    /**if the task is a non-repetitive one, it should become repetitive.*/
    public void setTime(int start, int end, int interval){
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    /**To check the task for repeatability use the boolean isRepeated() method*/
    public boolean isReapeated(){
        return repeated;
    }

    /** Returns the next start  time  of  the  task  execution  after  the  current  time.*/
    public int nextTimeAfter(int time) {
        return -1;
    }

}
