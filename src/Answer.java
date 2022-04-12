//Мы сделали так, что ссылка "a" больше не ссылается на объект "Python", а ссылается на ссылку "b",
//который в свою очередь ссылается на объект "Java".
//Таким образом на объкт "Python" нет никакой ссылки и она просто занимает память, что делает ее кандидатом на удаление.

public class Answer {
    public static void main(String[] args) {
        String a, b;
        a = new String("Python");
        b = new String("Java");
        a = b; //ответ
        System.out.println(a + "\n" + b);
    }
}
