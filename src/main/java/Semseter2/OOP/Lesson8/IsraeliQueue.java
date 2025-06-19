package Semseter2.OOP.Lesson8;

import java.util.ArrayList;
import java.util.List;

public class IsraeliQueue<T> {
    private List<QueueElement<T>> queue;


    public IsraeliQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public String toString() {
        String outpot="";
        for (int i=0; i<this.queue.size(); i++){
            outpot+=(i+1)+"."+this.queue.get(i)+"\n\n\n";
        }
        return outpot;
    }

    public void join(QueueElement<T>element) {
        for(int i=0; i<this.queue.size(); i++){
            QueueElement<T>current =this.queue.get(i);
//            if(element.isFriendOf(current.getValue())){
//                this.queue.add(i+1,element);
//                return;
//            }
        }

        this.queue.add(element);
    }
    public boolean isEmpty(){
        return this.queue.isEmpty();
    }

    public QueueElement<T> peek(){
        if(!this.isEmpty()) {
            return this.queue.get(0);
        }else {
            return null;
        }
    }

    public QueueElement<T> pop () {
        if(!this.isEmpty()) {
            QueueElement<T>firstElement =this.queue.get(0);
            System.out.println("Processing"+firstElement);
            this.queue.remove(0);
            return firstElement;
        }else {
            return null;
        }
    }


}
