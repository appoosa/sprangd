package com.projekt202.sprangd.services.question

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
interface QuestionService {

    /**
     * @return All known questions (that's right, all of them).
     */
    List<QuestionDoc> getAll()

    /**
     * Persist a new Question
     * @return copy of the original question with the database generated id included
     */
    QuestionDoc create(final QuestionDoc questionDoc)
}
