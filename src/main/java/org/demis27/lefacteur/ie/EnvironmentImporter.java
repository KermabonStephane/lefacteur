package org.demis27.lefacteur.ie;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.demis27.lefacteur.ImportExportFormat;
import org.demis27.lefacteur.environment.Environment;
import org.demis27.lefacteur.ie.postman.PostmanEnvironment;
import org.demis27.lefacteur.ie.postman.PostmanMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EnvironmentImporter {

    ObjectMapper mapper = new ObjectMapper();
    public Environment importEnvironment(String filename, ImportExportFormat format) throws IOException {
        return importEnvironment(new FileInputStream(filename), format);
    }

    public Environment importEnvironment(InputStream input, ImportExportFormat format) throws IOException {
        PostmanEnvironment postmanEnvironment = mapper.readValue(input, PostmanEnvironment.class);
        return PostmanMapper.toEnvironment(postmanEnvironment);
    }

}