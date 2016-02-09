package com.projekt202.sprangd.daos.question.impl

import groovy.transform.TypeChecked
import groovy.util.logging.Slf4j

import com.projekt202.sprangd.daos.question.QuestionDao
import com.projekt202.sprangd.daos.question.QuestionEntity

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@TypeChecked
@Slf4j
class QuestionDaoImpl implements QuestionDao {
    @Override
    List<QuestionEntity> getAll() {
        log.info 'Querying database for all questions'
        [ new QuestionEntity(question: 'How many planets are there?', answer: '8') ]
    }
}
