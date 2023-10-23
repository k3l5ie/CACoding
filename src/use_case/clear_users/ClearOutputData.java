package use_case.clear_users;

import java.util.List;

public class ClearOutputData {
    private boolean useCaseFailed;

    private final List<String> users;

    public ClearOutputData(List<String> users, boolean useCaseFailed) {
        this.useCaseFailed = useCaseFailed;
        this.users = users;
    }

    public List<String> getUsers() {
        return users;
    }
}
