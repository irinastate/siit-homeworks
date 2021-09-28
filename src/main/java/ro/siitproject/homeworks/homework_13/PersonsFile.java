package ro.siitproject.homeworks.homework_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonsFile {
    public static List<Person> readInput(Path path) throws Exception {
        List<Person> persons = new ArrayList<>();
        Charset charSets = StandardCharsets.US_ASCII;
        BufferedReader br = Files.newBufferedReader(path, charSets);
        String line = br.readLine();

        while (line != null) {
            String[] lineSplit = line.split(",");
            persons.add(PersonsFile.takeInputFromCSV(lineSplit));
            line = br.readLine();
        }
        return persons;
    }

    private static Person takeInputFromCSV(String[] inputs) {
        String firstName = inputs[0];
        String lastName = inputs[1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(inputs[2], formatter);
        return new Person(firstName, lastName, dateOfBirth);
    }

    public static void writeInputToCSV(Path path, List<Person> persons) throws Exception {
        File file = path.toFile();
        PrintWriter printWriter = new PrintWriter(file);
        persons.stream()
                .map(Person::toString)
                .forEach(printWriter::println);

        printWriter.close();
    }
}

