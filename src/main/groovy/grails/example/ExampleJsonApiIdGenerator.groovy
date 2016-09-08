package grails.example

import grails.plugin.json.view.api.internal.JsonApiIdGenerator

class ExampleJsonApiIdGenerator implements JsonApiIdGenerator {
    @Override
    String generateId(Object object) {
        generateIdForType object
    }

    protected String generateIdForType(object) {
        "default-id-${object.id}"
    }

    protected String generateIdForType(Article article) {
        "custom-article-id-${article.id}"
    }
}
