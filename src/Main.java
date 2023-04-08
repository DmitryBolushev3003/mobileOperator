// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int initialAmount = 20;
       int deposit = 1080;
       int bonus = deposit / 100;
       int balans = initialAmount + deposit + bonus;

       if (deposit > 1000) {
           System.out.println("Спасибо за пополнение счета на сумму " + deposit +  ", вам начислено бонусов " + bonus);
       } else {
           System.out.println("Спасибо за пополнение счета, на сумму " + deposit + " к сожалению сумма зачислений не предпологает начисления бонусов(" );
       }
        System.out.println("Ваш баланс составляет " + balans);
    }
}