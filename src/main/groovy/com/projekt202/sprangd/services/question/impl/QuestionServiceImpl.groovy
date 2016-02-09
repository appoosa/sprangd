package com.projekt202.sprangd.services.question.impl

import com.projekt202.sprangd.daos.question.QuestionDao
import com.projekt202.sprangd.services.question.QuestionDoc
import com.projekt202.sprangd.services.question.QuestionService

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao

    QuestionServiceImpl(final QuestionDao qd) {
        this.questionDao = qd
    }

    @Override
    List<QuestionDoc> getAll() {
        questionDao.all.collect { new QuestionDoc( question: it.question, answer: it.answer) }
    }
}
