# JSONAPI
Example  Application for demoing jsonapi support within grails-views using the `1.1.0.BUILD-SNAPSHOT` of [grails-views](https://github.com/grails/grails-views)
* json:api [http://jsonapi.org](http://jsonapi.org).
* grails-views wiki [https://github.com/grails/grails-views/wiki/JSONAPI](https://github.com/grails/grails-views/wiki/JSONAPI).

## Demo
* run the app: `./gradlew bootRun` or `grails run-app`
* `curl -i -H "Accept: application/json" http://localhost:8080/people/1`
* `curl -i -H "Accept: application/json" http://localhost:8080/articles/1`
* error example: `curl -i -H "Accept: application/json" http://localhost:8080/forced/validationError`