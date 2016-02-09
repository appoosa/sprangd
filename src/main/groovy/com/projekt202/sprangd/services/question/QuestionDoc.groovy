package com.projekt202.sprangd.services.question

import groovy.transform.AutoClone
import groovy.transform.Canonical
import groovy.transform.ToString

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
@AutoClone
@Canonical
@ToString(cache=true, includeNames=true, includePackage=false)
class QuestionDoc {
    String question
    String answer
}
