package com.sevenlist.gssg

import com.sevenlist.gssg.configuration.ApplicationConfiguration
import com.sevenlist.gssg.service.GreetingMessageFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

import javax.inject.Inject
import javax.inject.Named

@Named
class Application {

    @Inject
    private GreetingMessageFactory greetingMessageFactory

    static main(args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext()
        ctx.register(ApplicationConfiguration);
        ctx.refresh()
        ctx.registerShutdownHook()

        String name = (args.size() > 0) ? args[0] : 'Nobody'
        ctx.getBean(Application).sayHelloTo(name)
    }

    void sayHelloTo(String name) {
        println greetingMessageFactory.createGreetingMessage(name)
    }
}
