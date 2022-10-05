package alishev.spring.core;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    //IoC
    //kaxvacutyun enq nerarkum konstruktori mijocov
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public MusicPlayer(){}
    //kaxvacutyun enq nerarkum Set methodi mijocov
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing :" + " " + music.getSong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
