import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.exceptions.CsvValidationException;

public class Main {

    public static void main(String[] args) throws IOException, CsvValidationException {

        CsvParser csvP = new CsvParser("src/Data/bookstore.csv");
        csvP.printCsv();


        Gson gsonFile = new Gson();
        JsonReader jsonFile = new JsonReader(new FileReader("src/Data/authors.json"));

        //loads json reader with file reader
        // AuthorPar[] authorJson = gsonFile.fromJson(jsonFile, AuthorPar.class);

       /* for (var element : authorJson){
            System.out.println(element);
        }

        */
    }

}
