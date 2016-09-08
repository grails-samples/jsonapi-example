import grails.example.Article
import grails.example.Person

class BootStrap {

    def init = { servletContext ->
        def gump = new Person(name: "Mr. Gump")
        gump.save(failOnError:true)
        def article = new Article(
            author: gump,
            title: 'Save the Gumbo'
        )
        article.save(failOnError:true)
    }
    def destroy = {
    }
}
