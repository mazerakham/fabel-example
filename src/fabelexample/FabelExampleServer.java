package fabelexample;

import bowser.WebServer;
import fabel.JSXHandler;

public class FabelExampleServer {

  public void start() {
    WebServer server = new WebServer("Fabel Example Server", 8080, false)
        .controller(new FabelExampleController());
    server.add(new JSXHandler(server));
  }

  public static void main(String... args) {
    new FabelExampleServer().start();
  }
}
