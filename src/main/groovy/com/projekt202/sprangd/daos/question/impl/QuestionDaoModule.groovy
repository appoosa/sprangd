package com.projekt202.sprangd.daos.question.impl

import groovy.transform.TypeChecked

import com.projekt202.sprangd.daos.question.QuestionDao
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@Configuration
@TypeChecked
class QuestionDaoModule {

    @Bean
    QuestionDao createQuestionDao() {
        new QuestionDaoImpl()
    }

}
