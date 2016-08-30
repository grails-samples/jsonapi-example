import grails.example.Article
import grails.example.People

class BootStrap {

    def init = { servletContext ->
        def gump = new People(name: "Mr. Gump")
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
