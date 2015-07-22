package com.example.models


import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{PersistenceStatus, KeyedEntity, Schema}


class User(
          val id: Long,
          val name: String,
          val mail: String,
          val google_token: String,
          val icon_url: Option[String],
          val admin: Boolean
        ) extends ScalatraRecord{
  def this() = this(0,"alice","example@example.com","XXXXXX",null,false)

}


object TachyonDb extends Schema{
  val users = table[User]("users")

  on(users)(u => declare(
  u.id is (autoIncremented)))
}


object User{
  def create(user: User):Boolean = {
    inTransaction{
      val result = TachyonDb.users.insert(user)
      if (result.isPersisted){
        true
      }else{
        false
      }
    }
  }
}




trait ScalatraRecord extends  KeyedEntity[Long] with PersistenceStatus
