public class Main {
    public static void main(String[] args) {
        // Тренировка
        System.out.println("Тренировка");
        String phone = "+7 60 064 65-78";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79600646578";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача");
        }
        System.out.println(" ");
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan ";
        String middleName  = "Ivanovich ";
        String lastName  = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(" ");
        // Задание 2
        System.out.println("Задание 2");
        String fullNameCopy2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCopy2);
        System.out.println(" ");
        // Задание 3
        System.out.println("Задание 3");
        String fullName3 = "Иванов Семён Семёнович";
        String fullNameCopy3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameCopy3);
    }
}