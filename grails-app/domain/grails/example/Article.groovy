package grails.example

import grails.rest.Resource

@Resource
class Article {
    String title
    People author

    static constraints = {
    }
}
