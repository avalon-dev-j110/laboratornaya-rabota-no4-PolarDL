package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
        //чтобы поменять коммент коммита
	    String[] strings = null;
            strings = new String[] {"телевидение", "рамка", "комиссия", "враг", "тень", "огонь", "процесс", "особенность", "звонок", "вина", "кровь", "сторона", "князь", "услуга", "палата", "покупатель", "мина", "участник", "длина", "качество"};
            
            System.out.println("Массив из 20 случайных строк: " + Arrays.toString(strings));
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = null;
            persons = new Person[20];
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            persons[0] = new PersonImpl("Добрыня", LocalDate.parse("1983-05-24", dateTimeFormatter));
            persons[1] = new PersonImpl("Йозеф", LocalDate.parse("1975-05-24", dateTimeFormatter));
            persons[2] = new PersonImpl("Шерлок", LocalDate.parse("1964-05-24", dateTimeFormatter));
            persons[3] = new PersonImpl("Тимур", LocalDate.parse("1979-05-24", dateTimeFormatter));
            persons[4] = new PersonImpl("Шарль", LocalDate.parse("1981-05-24", dateTimeFormatter));
            persons[5] = new PersonImpl("Шарль", LocalDate.parse("1956-05-24", dateTimeFormatter));
            persons[6] = new PersonImpl("Цезарь", LocalDate.parse("1977-05-24", dateTimeFormatter));
            persons[7] = new PersonImpl("Руслан", LocalDate.parse("1962-05-24", dateTimeFormatter));
            persons[8] = new PersonImpl("Ленар", LocalDate.parse("1992-05-24", dateTimeFormatter));
            persons[9] = new PersonImpl("Остин", LocalDate.parse("1987-05-24", dateTimeFormatter));
            persons[10] = new PersonImpl("Герман", LocalDate.parse("1953-05-24", dateTimeFormatter));
            persons[11] = new PersonImpl("Зигмунд", LocalDate.parse("2002-05-24", dateTimeFormatter));
            persons[12] = new PersonImpl("Эрик", LocalDate.parse("1981-05-24", dateTimeFormatter));
            persons[13] = new PersonImpl("Рафаил", LocalDate.parse("1995-05-24", dateTimeFormatter));
            persons[14] = new PersonImpl("Зенон", LocalDate.parse("1958-05-24", dateTimeFormatter));
            persons[15] = new PersonImpl("Ждан", LocalDate.parse("1971-05-24", dateTimeFormatter));
            persons[16] = new PersonImpl("Яков", LocalDate.parse("1994-05-24", dateTimeFormatter));
            persons[17] = new PersonImpl("Жерар", LocalDate.parse("1966-05-24", dateTimeFormatter));
            persons[18] = new PersonImpl("Назар", LocalDate.parse("2010-05-24", dateTimeFormatter));
            persons[19] = new PersonImpl("Пётр", LocalDate.parse("1960-05-24", dateTimeFormatter));
            
            System.out.println("Массив из 20 случайных персон: " + Arrays.toString(persons));
            
//            if (persons[0].getBirthDate().compareTo(persons[1].getBirthDate()) > 0) {
//                System.out.println("person[0] is yonger");
//            }
//            if (persons[0].getName().compareTo(persons[1].getName()) > 0) {
//                System.out.println("persons[0].getName > persons[1].getName");            
//            } else 
//                System.out.println("persons[0].getName < persons[1].getName");
            
//            System.out.println(persons[4].compareTo(persons[5]));
//            System.out.println(persons[0].getBirthDate().isBefore(persons[1].getBirthDate()));
//            System.out.println(persons[4].getBirthDate().compareTo(persons[5].getBirthDate()));
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = null;
        sort = new SortImpl();
        
        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        MyComparator comparator = null;
        comparator = new MyComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println("Отсортировали персон с помощью sort по возрастанию: " + Arrays.toString(persons));

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println("Отсортировали строки с помощью sort по возрастанию: " + Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println("Отсортировали строки с помощью sort и comparator по убыванию:" + Arrays.toString(strings));
    }
}
