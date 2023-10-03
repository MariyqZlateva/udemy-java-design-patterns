package com.zlateva;

public class AdvancedMediaPlayerAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFileName(fileName);
        advancedMediaPlayer.listen();
    }
}
