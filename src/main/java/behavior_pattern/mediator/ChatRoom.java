package behavior_pattern.mediator;

import java.util.Date;

/**
 * @Author   zenghzong
 * @Since 2019/8/20
 * @Version 1.0
 */
public class ChatRoom {
    public static void showMsg(User user, String msg){
        System.out.println(new Date().toString() + "["+ user.getName() +"] :" + msg);
    }
}


class User{
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String msg){
        ChatRoom.showMsg(this, msg);
    }
}
