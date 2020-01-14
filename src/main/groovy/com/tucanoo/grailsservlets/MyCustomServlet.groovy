package com.tucanoo.grailsservlets

import groovy.util.logging.Slf4j

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Slf4j
class MyCustomServlet extends HttpServlet {

  /**
   * Initialize the servlet.
   * @see HttpServlet#init().
   */
  void init() throws ServletException {
    log.debug("Initialising Custom Servlet");
  }

  /**
   * Process GET request.
   * @see HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse).
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    log.debug("FileServlet processRequest");

    // Send back some JSON
    response.setContentType("application/json")
    response.getWriter().print("{result:'OK'}")

    log.debug("FileServlet processRequest --");
  }
}
