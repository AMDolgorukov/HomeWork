import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class University {
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
        Students student3 = new Students("Хабенский Константин", 3, "Крови", (HashMap<String, Integer>) Stream.of(
                new AbstractMap.SimpleEntry<>("Сопромат", 3),
                new AbstractMap.SimpleEntry<>("Физкультура", 4),
                new AbstractMap.SimpleEntry<>("Валеология", 3)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        kick(listOfStudents);

        listOfStudents.forEach(student -> {
            System.out.println("Студент: " + student.name + "\nКурс: " + student.course + "\nГруппа: " + student.group + "\nУспеваемость: ");
            for (Map.Entry<String, Integer> entry : student.score.entrySet()){
                System.out.print("\t"+entry.getKey()+": "+entry.getValue()+"\n");
            }
        });
    }

    static void kick(HashSet<Students> hs) {
        hs.forEach(students -> {
            AtomicInteger sum = new AtomicInteger();
            sum.set(0);
            int size = students.score.size();
            double result;
            for (Map.Entry<String, Integer> entry : students.score.entrySet()){
                int value = entry.getValue();
                sum.set(sum.get() + value);
                System.out.println(sum); // ПОЧИСТИТЬ!!!
            }
            result = (double) sum.get() / size;
            if (result<3) hs.remove(students);
            System.out.println(result); // ПОЧИСТИТЬ!!!
        });
    }
}