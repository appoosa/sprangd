package com.projekt202.sprangd.controllers.question

import groovy.transform.TypeChecked
import groovy.util.logging.Slf4j

import com.projekt202.sprangd.services.question.QuestionDoc
import com.projekt202.sprangd.services.question.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@TypeChecked
@RestController
@Slf4j
class QuestionController {

    private final QuestionService questionService

    @Autowired
    QuestionController(final QuestionService qs) {
        this.questionService = qs
    }

    @RequestMapping(value='/questions', method=[RequestMethod.GET])
    List<QuestionDoc> list() {
        questionService.all
    }

    @RequestMapping(value='/questions', method=[RequestMethod.POST])
    QuestionDoc create(@RequestBody final QuestionDoc questionDoc) {
        questionService.create(questionDoc)
    }
}
