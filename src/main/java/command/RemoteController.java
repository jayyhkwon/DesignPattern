package command;

// This is Invoker
public class RemoteController {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
