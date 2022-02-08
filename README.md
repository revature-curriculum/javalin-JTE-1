## JTE with Java Classes 1: Adding Objects
---
### Description
In this lab, we will cover how to use JTEs with your Javalin web application.

---
### Steps
1. In src -> main -> java -> objects -> WaterBottle.java, add fields in the class brandName and amount. Also create a constructor for the class.
2. In src -> main -> java -> objects -> Main.java create a new route and handler for sending a WaterBottle object to waterBottle.jte. Also create an instance of WaterBottle to send.
3. In src -> main -> jte -> waterBottle.jte create an if-else if-else statement with conditions based on the amount:
* if amount is less than or equal to 0, then have the web page display: “I’m dying of thirst.” 
* else if(amount is 100), then have the web page display: "I'm always hydrated."
* else amount is greater than 50 but less than 100, then have the web page display: "I am content."
---
### Sample Output
```
I'm always hydrated.
```
---
