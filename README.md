# Gatling-Load-Testing-Report

# Company : * CODETECH IT SOLUTIONS

* Intern Name: * TALLAM HARIKA

* Intern Id: * CTIS5321

* Domain :* Software Testing

* Duration: * 4weeks

* Mentor: * Neela Santhosh


## Objectives

To perform advanced load testing on a web application using gatling and analyze system performance under simulated heavy loads


## Tools & Technologies Used

- Gatilng(scala-based load testing tool)
- java JDK


## Target Application

* **URL:** https://reqres.in
* **Endpoint Tested:** `/api/users?page=2`
* **Request Type:** HTTP GET


## Test Scenario

- Simulated 100 concurrent users
- Ramp-up time: 30 seconds
- Each user sends HTTP GET request to the /users endpoint

## Test Script

The load test was written using Gatling DSL in scala. The script simulates multiple users accessing the API simultaneously to measure performance

## Performance Matrics Analyzed
- Response Time(Minimum, Maximum, Average)
- Requests per Second
- Successful vs failure Requests
- Load distribution over time

## Result summary
- The system handled concurrent users successfully
- No request failure observed
- Response times remained within acceptable limits
- Performance remained stable under heavy load


## Conclusion
The load testing exercise confirms that the tested application performs reliably under simulated heavy user load. The system maintained stable response times and achieved a 100% success rate without errors, demonstrating strong readiness for production-level traffic conditions.

## Delivarables
- gatling simulation script
- Load testing report (HTML)
- Documentation of test results

## output windows

# graph1
![Image]https://github.com/tallamharika/LoadGatling_Task4/blob/main/graph1.jpeg


# graph2
![Image]https://github.com/tallamharika/LoadGatling_Task4/blob/main/graph2.jpeg


# graph3
![Image]https://github.com/tallamharika/LoadGatling_Task4/blob/main/graph3.jpeg
