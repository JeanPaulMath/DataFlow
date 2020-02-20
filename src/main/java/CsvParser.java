import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    private List fileRows = new ArrayList();

    public CsvParser(String input) throws IOException, CsvValidationException {

        if (check(input)) {
            readCsv(input);
        }
    }

    protected void readCsv(String csvinfile) throws IOException, CsvValidationException {

        // Open a file & input stream for use with CSVReader (to create a reader object)
        FileInputStream csvStream = new FileInputStream(csvinfile);
        InputStreamReader inputStream = new InputStreamReader(csvStream,
                StandardCharsets.UTF_8);
        CSVReader reader = new CSVReader(inputStream);

        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            fileRows.add(nextLine);
        }

        // Closes the reader
        reader.close();
    }

    protected void printCsv() {
        //organizes the info from the csv file
        for (Object row : fileRows) {

            for (String fields : (String[]) row) {
                System.out.print(fields + ", ");
            }
            System.out.println("\b\b\n---------------------");
        }
    }

    private boolean check(String cfile) {
        if (!Files.exists(Paths.get(cfile))) {
            System.out.println("File does not exist");
            return false;

        }
        return true;
    }

}
