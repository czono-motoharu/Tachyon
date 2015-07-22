package com.example.data

import com.mchange.v2.c3p0.ComboPooledDataSource
import org.slf4j.LoggerFactory
import org.squeryl.{Session, SessionFactory}
import org.squeryl.adapters.MySQLAdapter

trait DatabaseInit {
  val logger = LoggerFactory.getLogger(getClass)

  val databaseUsername = "root"
  val databasePassword = "root"
  val databaseConnection = "jdbc:mysql://localhost:3306/TachyonDb"

  var cpds = new ComboPooledDataSource

  def configureDb(){
    cpds.setDriverClass("com.mysql.jdbc.Driver")
    cpds.setJdbcUrl(databaseConnection)
    cpds.setUser(databaseUsername)
    cpds.setPassword(databasePassword)

    cpds.setMinPoolSize(1)
    cpds.setAcquireIncrement(1)
    cpds.setMaxPoolSize(50)

    SessionFactory.concreteFactory = Some( () => connection )

    def connection = {
      logger.info("Creating connection with c3po connection pool")
      Session.create(cpds.getConnection, new MySQLAdapter)
    }

  }

  def closeDbConnection() {
    logger.info("Closing c3po connection pool")
    cpds.close()
  }

}