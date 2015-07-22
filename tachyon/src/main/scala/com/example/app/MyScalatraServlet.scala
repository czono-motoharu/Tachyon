package com.example.app

import com.example.data.DatabaseSessionSupport
import com.example.models.TachyonDb
import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends TachyonStack
  with SessionSupport
  with DatabaseSessionSupport
  with ScalateSupport
  with MethodOverride
  with FlashMapSupport {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }


  get("/yo"){
    TachyonDb.create
    redirect("/")
  }

}
