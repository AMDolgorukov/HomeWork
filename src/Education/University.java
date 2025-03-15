package Education;

import java.util.*;

public class University {

    // Отчисление студентов
    static void kickStudent(HashSet<Students> hs) {
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
        Iterator<Students> iterator = hs.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            double average = student.score.values().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);
            if (average >= 3) {
                if (student.course < 6) {
                    student.course += 1;
                } else {
                    student.group += " Работа над дипломом";
                }
            }
        }
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
    static void printStudents(HashSet<Students> students, int course) {
        students.forEach(student -> {
            if (student.course == course) {
                System.out.println("\nСтудент: " + student.name + "\nКурс: " + student.course + "\nГруппа: " + student.group + "\nУспеваемость: ");
                for (Map.Entry<String, Integer> entry : student.score.entrySet()) {
                    System.out.print("\t" + entry.getKey() + ": " + entry.getValue() + "\n");
                }
            }
        });
    }
}