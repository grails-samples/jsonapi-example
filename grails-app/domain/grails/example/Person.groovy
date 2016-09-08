package grails.example

import grails.rest.Resource

@Resource(uri='/people', formats=['json'])
class Person {
    String name
    static constraints = {
    }
}
