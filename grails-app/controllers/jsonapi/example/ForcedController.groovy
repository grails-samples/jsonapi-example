package jsonapi.example

import grails.example.Article

class ForcedController {

    def validationError() {
        Article article = new Article()
        article.title = ""
        article.validate()

        render(view: '/article/show', model: [article: article])
    }

    def serverError() {
        throw new RuntimeException("Example RuntimeError")
    }
}
