package com.sevenlist.gssg.service

import com.sevenlist.gssg.TestcaseWithSpringSupport

import javax.inject.Inject

class GreetingMessageFactoryTest extends TestcaseWithSpringSupport {

    @Inject
    GreetingMessageFactory greetingMessageFactory

    def "returns Hello, Bob! when name is Bob"() {
        when:
        String greetingMessage = greetingMessageFactory.createGreetingMessage('Bob')

        then:
        greetingMessage == 'Hello, Bob!'
    }

}
