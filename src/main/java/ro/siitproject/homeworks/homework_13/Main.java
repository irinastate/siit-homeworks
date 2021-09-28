package ro.siitproject.homeworks.homework_13;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        Path readPath = Paths.get(args[0]);
        List<Person> persons = PersonsFile.readInput(readPath);
        int month = Integer.parseInt(args[1]);
        Path writePath = Paths.get(args[2]);

        List<Person> pers = persons.stream()
                .filter(z -> z.getDateOfBirth().getMonthValue() == month)
                .sorted((Comparator.comparing(Person::getLastName)))
                .collect(Collectors.toList());
        PersonsFile.writeInputToCSV(writePath, pers);
    }
}

