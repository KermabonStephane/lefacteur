package org.demis27.lefacteur.ie


import spock.lang.Specification

class EnvironmentImporterSpec extends Specification {

    def 'Import an environment from postman'() {
        given: 'We create an environment importer'
        EnvironmentImporter importer = new EnvironmentImporter()
        and: 'a postman environment as an input stream'
        def input = EnvironmentImporter.getResourceAsStream("todo-postman-environment.json")

        when: 'we import a postman environment export file'
        def environment = importer.importEnvironment(input)

        then: 'the LeFacteur environment is not null'
        environment != null
        and: 'all elements are copied'
        environment.elements.size() == 4
        and: 'url element have the right value'
        environment.getElement("url").isPresent()
        environment.getElement("url").get().value == 'localhost'
    }
}
