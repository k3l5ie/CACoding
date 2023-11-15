package use_case.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearOutputData {

    private ArrayList<String> users;

    public ClearOutputData(List<String> users) {
        this.users = (ArrayList<String>) users;
    }

    public ArrayList<String> getUsers() {
        return users;
    }
}
