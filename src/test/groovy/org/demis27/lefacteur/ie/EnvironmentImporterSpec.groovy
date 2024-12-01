package org.demis27.lefacteur.ie

import org.demis27.lefacteur.ImportExportFormat
import spock.lang.Specification

class EnvironmentImporterSpec extends Specification {

    def 'Import an environment from postman'() {
        given: 'We create an environment importer'
        EnvironmentImporter importer = new EnvironmentImporter()

        when: 'we import a postman environment export file'
        def environment = importer.importEnvironment("", ImportExportFormat.POSTMAN)

        then: 'the LeFacteur environment is not null'
        environment != null
    }
}
