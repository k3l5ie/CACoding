package interface_adapter.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private ArrayList<String> users = new ArrayList<>();

    public ClearState(ClearState copy){
        users = copy.users;
    }

    public ClearState() {
    }

    public  ArrayList<String> getUsers(){
        return users;
    }

    public void setUsers(ArrayList<String> users){
        this.users = users;
    }

}
