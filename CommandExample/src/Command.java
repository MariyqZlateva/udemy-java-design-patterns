public interface Command {
    void execute();
    // could add an undo or redo commands
}

class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    // store previous stat for undo, String someState

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }


    @Override
    public void execute() {
        // save previous state, in case undo called someState = ....
        this.fileSystem.openFile();
    }
}
class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    // store previous stat for undo, String someState


    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called someState = ....
        this.fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    // store previous stat for undo, String someState


    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called someState = ....
        this.fileSystem.writeFile();
    }
}