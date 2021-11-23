package mx.edu.j2se.brugada.tasks;

public class ArrayTaskList {

    private Task[] arrayTask = new Task[0];

    /**Adds the specified task to the list.*/
    void add (Task task){
        Task[] newArray = new Task[arrayTask.length + 1];
        for(int i = 0; i < arrayTask.length ; i++) {
            newArray[i] = arrayTask[i];
        }
        newArray[arrayTask.length] = task;
        arrayTask = newArray;
    }

    /**Removes a task from the list and returns true, if such a task was in the list.
     * If the list contains the same task several times, any of them should be removed.*/
    boolean remove (Task task){
        Task[] newArray = new Task[arrayTask.length -1];
        int counter = 0;

        for (Task x : arrayTask) {
            if (!x.equals(task)) {
                newArray[counter] = x;
                counter++;
            }
        }

        if (counter == arrayTask.length) {
            return false;
        } else {
            Task[] copy = new Task [arrayTask.length - 1];
            for (int k = 0, j = 0; k < arrayTask.length; k++) {
                if (k != counter) {
                    copy[j++] = arrayTask[k];
                }
            }
            arrayTask = copy;
            return true;
        }
    }
    /**Returns the number of tasks in the list.*/
    int size() {
        return arrayTask.length;
    }

    /** Returns a task which takes the specified place in the list the index of the first task is 0*/
    Task getTask(int index){
        return arrayTask[index];
    }

    /** Returns a subset of tasks that are scheduled for execution at least once after the "from" time, and not later
     *  than the "to" time.*/
    Task[] ArrayTaskListincoming (int from, int to) {

        int counter = 0;
        Task[] newArray = new Task[1];
        for (Task x : arrayTask) {
            if (x.start >= from && x.end <= to){
                counter++;
            }
        }
        Task[] incomingTasks = new Task[counter];
        counter = 0;
        for (Task x : arrayTask) {
            if (x.start >= from && x.end <= to){
                incomingTasks[counter] = x;
                counter++;
            }
        }
        return  incomingTasks;
        }

}
