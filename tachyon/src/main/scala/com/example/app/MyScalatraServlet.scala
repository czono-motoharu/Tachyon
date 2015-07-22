package com.example.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends TachyonStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }


  get("/yo"){
    <html>
      <body>
        <h1>Yo</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
