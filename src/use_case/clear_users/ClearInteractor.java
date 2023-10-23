package use_case.clear_users;

import java.util.ArrayList;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(){
        List<String> users = userDataAccessObject.getUsers();
        userDataAccessObject.delete();

        ClearOutputData clearOutputData = new ClearOutputData(users, false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
