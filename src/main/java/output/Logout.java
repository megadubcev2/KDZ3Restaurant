package output;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Visitor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Logout {

    private final String servicedVisitorsFilePath;

    public Logout(String servicedVisitorsFilePath) {
        this.servicedVisitorsFilePath = servicedVisitorsFilePath;
    }

    public void logServicedVisitors(List<Visitor> servicedVisitors) throws IOException {
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(servicedVisitorsFilePath)))
        {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(writer, servicedVisitors);
        } catch (IOException e) {
           logError(e);
        }
    }

    public void logError(Exception e){
        System.err.println(e);
    }
}
