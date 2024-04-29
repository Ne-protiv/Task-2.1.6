public class Solution {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Dog barbos = new Dog();
        barsik.SayHello();
        barbos.SayHello();
        barbos.catchCat(barsik);
    }

    public static class Cat {
        public void SayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void SayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat barsik) {
            System.out.println("Кошка поймана");
            SayHello();
            barsik.SayHello();
        }
    }
}
