import model.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println();
        System.out.println("Виконаємо запис відео");
        player.record();
        player.pause();
        player.record();
        player.stop();
        System.out.println("---------------------------------");
        System.out.println("Виконаємо відтворення раніше записаного відео");
        player.play();
        player.pause();
        player.play();
        player.stop();
    }
}