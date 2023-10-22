package use_case.clear_users;

import entity.User;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    //my todo check if userFactory is needed...

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    // my todo, complete this...
    // doesn't take in input data
    @Override
    public void execute(){

        User user = userDataAccessObject.get();

        ClearOutputData clearOutputData = new ClearOutputData();
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
