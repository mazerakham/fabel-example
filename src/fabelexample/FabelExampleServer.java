package fabelexample;

import bowser.WebServer;
import fabel.JSXHandler;
import ox.Log;

public class FabelExampleServer {

  public void start() {
    WebServer server = new WebServer("Fabel Example Server", 8080, false)
        .controller(new FabelExampleController());
    server.add(new JSXHandler(server));
    server.start();
    Log.debug("Server started on port 8080.");
  }

  public static void main(String... args) {
    new FabelExampleServer().start();
  }
}
