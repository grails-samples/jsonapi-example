package grails.example

import grails.plugin.json.view.api.internal.JsonApiIdGenerator

class ExampleJsonApiIdGenerator implements JsonApiIdGenerator {
    @Override
    String generateId(Object object) {
        return "example-${object.id}"
    }
}
