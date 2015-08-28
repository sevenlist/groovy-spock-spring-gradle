package com.sevenlist.gssg

import com.sevenlist.gssg.configuration.ApplicationConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = TestContextConfiguration)
abstract class TestcaseWithSpringSupport extends Specification {

    @Configuration
    @Import(ApplicationConfiguration)
    static class TestContextConfiguration {

        /*
        @Bean
        ThirdPartyClass thirdPartyObject() {
            new SomeOtherThirdPartyClassForTests()
        }
        */
    }
}