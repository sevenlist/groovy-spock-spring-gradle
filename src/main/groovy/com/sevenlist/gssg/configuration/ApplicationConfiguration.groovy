package com.sevenlist.gssg.configuration

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = [
        'com.sevenlist.gssg',
        'com.sevenlist.gssg.service'
])
class ApplicationConfiguration {

    /*
    @Bean
    ThirdPartyClass thirdPartyObject() {
        new ThirdPartyClass()
    }
    */
}
