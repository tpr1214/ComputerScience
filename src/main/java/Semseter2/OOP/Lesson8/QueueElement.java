package Semseter2.OOP.Lesson8;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueueElement <T>{
    private T value;
    private Set<T> friend;


    public QueueElement(T value) {
        this.value = value;
       this.friend = new HashSet<>();
    }

    public T getValue() {
        return value;
    }

    public Set<T> getFriend() {
        return friend;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setFriend(Set<T> friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "value=" + this.value +
                ",\n friend=" + this.friend ;
    }

//    public void addFriend(T friends){
//       this.friend.add(friends);
//    }
//    public boolean isFriendOf(){
//        return
//    }
}
