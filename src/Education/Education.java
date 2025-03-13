package Education;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

import static Education.University.*;
import static java.util.stream.Collectors.toMap;

public class Education {
    public static void main(String[] args) {
        HashSet<Students> listOfStudents = new HashSet<>();

        Students student1 = new Students("Калашников Михаил", 1, "САУ-11", (HashMap<String, Integer>) Stream.of(
                new AbstractMap.SimpleEntry<>("Матанализ", 3),
                new AbstractMap.SimpleEntry<>("Инжграф", 2),
                new AbstractMap.SimpleEntry<>("Термех", 3)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
        Students student2 = new Students("Достоевский Федор", 2, "ЭКД-11", (HashMap<String, Integer>) Stream.of(
                new AbstractMap.SimpleEntry<>("Химия", 3),
                new AbstractMap.SimpleEntry<>("Физика", 3),
                new AbstractMap.SimpleEntry<>("Философия", 5)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
        Students student3 = new Students("Хабенский Константин", 6, "Крови", (HashMap<String, Integer>) Stream.of(
                new AbstractMap.SimpleEntry<>("Сопромат", 3),
                new AbstractMap.SimpleEntry<>("Физкультура", 4),
                new AbstractMap.SimpleEntry<>("Валеология", 3)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        printStudents(listOfStudents);

        kickStudent222(listOfStudents);
        printStudents(listOfStudents);

        studentCourseUp(listOfStudents);
        printStudents(listOfStudents);

        printStudents(listOfStudents,2);
        printStudents(listOfStudents,3);
        printStudents(listOfStudents,6);
    }
}
