package org.demis27.lefacteur.ie;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.demis27.lefacteur.ImportExportFormat;
import org.demis27.lefacteur.environment.Environment;
import org.demis27.lefacteur.ie.postman.PostmanEnvironment;
import org.demis27.lefacteur.ie.postman.PostmanMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class EnvironmentImporter {

    public Environment importEnvironment(String filename, ImportExportFormat format) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FileInputStream input = new FileInputStream(filename);
        PostmanEnvironment postmanEnvironment = mapper.readValue(input, PostmanEnvironment.class);
        return PostmanMapper.toEnvironment(postmanEnvironment);
    }



}
