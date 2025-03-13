package Education;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class University extends HashSet {
    Students students;

//    public static void main(String[] args) {
//        HashSet<Students> listOfStudents = new HashSet<>();
//
//
//        Students student1 = new Students("Калашников Михаил", 1, "САУ-11", (HashMap<String, Integer>) Stream.of(
//                new AbstractMap.SimpleEntry<>("Матанализ", 3),
//                new AbstractMap.SimpleEntry<>("Инжграф", 2),
//                new AbstractMap.SimpleEntry<>("Термех", 3)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
//        Students student2 = new Students("Достоевский Федор", 2, "ЭКД-11", (HashMap<String, Integer>) Stream.of(
//                new AbstractMap.SimpleEntry<>("Химия", 3),
//                new AbstractMap.SimpleEntry<>("Физика", 3),
//                new AbstractMap.SimpleEntry<>("Философия", 5)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
//        Students student3 = new Students("Хабенский Константин", 6, "Крови", (HashMap<String, Integer>) Stream.of(
//                new AbstractMap.SimpleEntry<>("Сопромат", 3),
//                new AbstractMap.SimpleEntry<>("Физкультура", 4),
//                new AbstractMap.SimpleEntry<>("Валеология", 3)).collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
//
//        listOfStudents.add(student1);
//        listOfStudents.add(student2);
//        listOfStudents.add(student3);
//
//        printStudents(listOfStudents);
//
//        //kickStudent(listOfStudents);
//
//        kickStudent222(listOfStudents);
//
//        studentCourseUp(listOfStudents);
//
//        printStudents(listOfStudents, 2);
//        printStudents(listOfStudents, 3);
//        printStudents(listOfStudents, 6);
//    }

    public University(Students students) {
        this.students = students;
    }

    // Отчисление студентов
    static void kickStudent(HashSet<Students> hs) {
        hs.forEach(students -> {
            AtomicInteger sum = new AtomicInteger();
            sum.set(0);
            int size = students.score.size();
            double result;
            for (Map.Entry<String, Integer> entry : students.score.entrySet()) {
                int value = entry.getValue();
                sum.set(sum.get() + value);
            }
            result = (double) sum.get() / size;
            if (result < 3) hs.remove(students);
        });
    }

    static void kickStudent222(HashSet<Students> hs) {
        Iterator<Students> iterator = hs.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            double average = student.score.values().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);
            if (average < 3) {
                iterator.remove();
            }
        }
    }

    // Перевод студента на следующий курс
    static void studentCourseUp(HashSet<Students> hs) {
        hs.forEach(students -> {
            AtomicInteger sum = new AtomicInteger();
            sum.set(0);
            int size = students.score.size();
            double result;
            for (Map.Entry<String, Integer> entry : students.score.entrySet()) {
                int value = entry.getValue();
                sum.set(sum.get() + value);
            }
            result = (double) sum.get() / size;
            if (result >= 3) {
                if (students.course < 6) {
                    students.course += 1;
                } else {
                    students.group += " Работа над дипломом";
                }
            }
        });
    }

    // Список студентов
    static void printStudents(HashSet<Students> students) {
        students.forEach(student -> {
            System.out.println("\nСтудент: " + student.name + "\nКурс: " + student.course + "\nГруппа: " + student.group + "\nУспеваемость: ");
            for (Map.Entry<String, Integer> entry : student.score.entrySet()) {
                System.out.print("\t" + entry.getKey() + ": " + entry.getValue() + "\n");
            }
        });
    }

    // Список студентов курса
    static void printStudents(HashSet<Students> students, int c) {
        students.forEach(student -> {
            if (student.course == c) {
                System.out.println("\nСтудент: " + student.name + "\nКурс: " + student.course + "\nГруппа: " + student.group + "\nУспеваемость: ");
                for (Map.Entry<String, Integer> entry : student.score.entrySet()) {
                    System.out.print("\t" + entry.getKey() + ": " + entry.getValue() + "\n");
                }
            }
        });
    }
}