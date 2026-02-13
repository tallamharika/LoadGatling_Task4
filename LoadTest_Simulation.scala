// Import Gatling core and HTTP DSL libraries
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

// Define a new simulation class
class LoadTestSimulation extends Simulation {

  // Define HTTP protocol configuration
  // baseUrl is the website we are testing
  val httpProtocol = http
    .baseUrl("http://demo.testfire.net")  // Base URL of the demo web application
    .inferHtmlResources()                 // Automatically fetch embedded resources (images, CSS, JS)

  // Define scenario: sequence of actions that virtual users will perform
  val scn = scenario("Demo Load Test")   // Name of the scenario
    .exec(http("Home Page").get("/"))    // Step 1: Open the Home Page
    .pause(2)                            // Wait for 2 seconds to simulate real user think time
    .exec(http("Login Page").get("/login.jsp"))  // Step 2: Go to Login Page
    .pause(2)                            // Pause 2 seconds before entering credentials
    .exec(http("Do Login")               // Step 3: Submit login form
      .post("/login.jsp")
      .formParam("uid", "jsmith")        // Username
      .formParam("passw", "demo123"))    // Password
    .pause(2)                            // Wait 2 seconds before next action
    .exec(http("Account Summary").get("/bank/main.jsp")) // Step 4: Navigate to Account Summary
    .pause(2)                            // Pause 2 seconds
    .exec(http("Logout").get("/logout.jsp")) // Step 5: Logout from the application

  // Setup the simulation
  setUp(
    scn.inject(atOnceUsers(10))          // Inject 10 virtual users simultaneously
  ).protocols(httpProtocol)               // Use the HTTP protocol configuration defined above
}
