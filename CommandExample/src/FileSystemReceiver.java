public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file on unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on unix OS");

    }

    @Override
    public void closeFile() {
        System.out.println("Closing file on unix OS");

    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file on Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on Windows");

    }

    @Override
    public void closeFile() {
        System.out.println("Closing file on Windows");

    }
}
