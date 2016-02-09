package com.projekt202.sprangd.daos.question

import javax.annotation.Generated
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

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
@Entity
class QuestionEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id

    @Column(nullable = false)
    String question

    @Column(nullable = false)
    String answer
}
