package grails.example

import grails.plugin.json.view.api.jsonapi.DefaultJsonApiIdGenerator
import grails.web.mapping.LinkGenerator
import org.springframework.beans.factory.annotation.Autowired

class TypeAwareJsonApiIdGenerator extends DefaultJsonApiIdGenerator {
    @Autowired
    LinkGenerator linkGenerator

    List<Class> supportedClasses = [Person, Article] //TODO add a configuration option for adding items to this list

    @Override
    String generateId(Object object) {
        if (supports(object.class)) {
            return linkGenerator.link(resource: object)
        } else {
            super.generateId(object)
        }
    }

    public boolean supports(Class clazz) {
        return supportedClasses.contains(clazz)
    }
}
