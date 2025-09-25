import week10.people.Person;
import week10.people.Teacher;
import week10.people.Student;

import java.util.*;

public class Main {

        //Ex 29.1
        /*Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);*/

        //Ex 29.2
        /*Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());*/

        //Ex 29.3

            /*Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
            System.out.println( olli );
            olli.study();
            System.out.println( olli );*/
        //Ex 29.4
        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );

        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );*/

        //Ex 29.5

        public static void printDepartment(List<Person> people){
            for (Person person : people) {
                System.out.println(person);

            }
        }
        public static void main(String[] args) {
            List<Person> people = new ArrayList<Person>();
            people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
            people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

            printDepartment(people);
        }
}
