package command;

public class Client {

    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();

    }
}
