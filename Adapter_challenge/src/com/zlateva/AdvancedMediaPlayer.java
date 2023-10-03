package com.zlateva;

public interface AdvancedMediaPlayer {
    void loadFileName(String fileName);

    void listen();

}

class VlcPlayer implements AdvancedMediaPlayer {
    String fileName;
    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vls file. Name : " + fileName);
    }
}


class Mp4Player implements AdvancedMediaPlayer {
    String fileName;
    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name : "+fileName);
    }
}
