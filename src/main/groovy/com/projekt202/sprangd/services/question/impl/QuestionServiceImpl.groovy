package com.projekt202.sprangd.services.question.impl

import groovy.util.logging.Slf4j

import com.projekt202.sprangd.daos.question.QuestionDao
import com.projekt202.sprangd.daos.question.QuestionEntity
import com.projekt202.sprangd.services.question.QuestionDoc
import com.projekt202.sprangd.services.question.QuestionService

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@Slf4j
class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao

    QuestionServiceImpl(final QuestionDao qd) {
        this.questionDao = qd
    }

    /**
     * {@inheritDoc}
     */
    @Override
    QuestionDoc create(final QuestionDoc questionDoc) {
        final QuestionDoc output = questionDoc.clone()

        log.info "Persisting new question: $questionDoc"
        final QuestionEntity savedEntity = questionDao.saveAndFlush(
                new QuestionEntity(
                        question: questionDoc.question,
                        answer: questionDoc.answer )
        )


        output.id = savedEntity.id
        log.info "Generated ID: ${output.id}"
        output
    }


    @Override
    List<QuestionDoc> getAll() {
        questionDao.findAll().collect {
            new QuestionDoc( id: it.id, question: it.question, answer: it.answer)
        }
    }
}
