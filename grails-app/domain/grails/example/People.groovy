package grails.example

import grails.rest.Resource

@Resource(uri='/people', formats=['json'])
class People {
    String name
    static constraints = {
    }
}
