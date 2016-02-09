package com.projekt202.sprangd

import groovy.transform.TypeChecked
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Initial entry point for spring boot application
 *
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02 /09/2016
 */
@TypeChecked
@SpringBootApplication
class Application {

    static void main(final String[] args) {
        SpringApplication.run(Application, args)
    }

}
