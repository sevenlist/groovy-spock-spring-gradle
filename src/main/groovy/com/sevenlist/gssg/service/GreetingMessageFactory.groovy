package com.sevenlist.gssg.service

import javax.inject.Named

@Named
class GreetingMessageFactory {

    String createGreetingMessage(String name) {
        "Hello, $name!"
    }
}
