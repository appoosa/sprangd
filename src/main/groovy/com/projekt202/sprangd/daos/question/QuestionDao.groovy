package com.projekt202.sprangd.daos.question

import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author Ben Bays <ben.bays@projekt202.com>
 * @since 02/09/2016
 */
interface QuestionDao extends JpaRepository<QuestionEntity,Long> {

}
