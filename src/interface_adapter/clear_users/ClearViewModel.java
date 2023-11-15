package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
// TODO Complete me

public class ClearViewModel extends ViewModel{
    public static final String TITLE_LABEL = "Clear View";
    public final String OK_BUTTON_LABEL = "OK";

    private ClearState state = new ClearState();

    public ClearViewModel(){
        super("sign up");
    }
    public void setState(ClearState state){
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("clearState", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }

}
