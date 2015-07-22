import com.example.data.DatabaseInit
import org.scalatra._
import javax.servlet.ServletContext
import com.example.app._


class ScalatraBootstrap extends LifeCycle with DatabaseInit {
  override def init(context: ServletContext) {
    configureDb()
    context.mount(new MyScalatraServlet, "/*")
  }

  override def destroy(context: ServletContext) {
    closeDbConnection()
  }
}
