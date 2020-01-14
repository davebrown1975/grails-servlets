import com.tucanoo.grailsservlets.MyCustomServlet
import org.springframework.boot.web.servlet.ServletRegistrationBean

// Place your Spring DSL code here
beans = {
  customServlet(ServletRegistrationBean) { bean ->
    System.out.println("REGISTERING SERVLET");
    servlet = new MyCustomServlet()
    urlMappings = ["/custom/test"]
  }
}
