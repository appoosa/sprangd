package com.projekt202.sprangd.services.question.impl

import com.projekt202.sprangd.daos.question.QuestionDao
import com.projekt202.sprangd.daos.question.impl.QuestionDaoModule
import com.projekt202.sprangd.services.question.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@Configuration
@Import(QuestionDaoModule)
class QuestionServiceModule {

    @Bean
    @Autowired
    QuestionService getQuestionService(final QuestionDao dao) {
        new QuestionServiceImpl(dao)
    }
}
