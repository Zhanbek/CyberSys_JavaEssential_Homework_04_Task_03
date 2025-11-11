package model;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("Відтворення...");
    }

    @Override
    public void record() {
        System.out.println("Запис...");
    }

    @Override
    public void pause() {
        System.out.println("Пауза відтворення / запису");
    }

    @Override
    public void stop() {
        System.out.println("Зупинка відтворення / запису");
    }
}
