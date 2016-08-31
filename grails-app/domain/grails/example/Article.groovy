package grails.example

import grails.rest.Resource

@Resource(uri='/articles')
class Article {
    String title
    People author

    static constraints = {
    }
}
