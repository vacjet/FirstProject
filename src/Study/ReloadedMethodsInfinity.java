package Study;

/***
 * Reloaded метод с любым количеством String-параметров
 */

public class ReloadedMethodsInfinity {
    public void sayHi(String...names) {
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        ReloadedMethodsInfinity jarvis = new ReloadedMethodsInfinity();
        jarvis.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");
    }
}
