## JTE with Java Classes 1: Adding Objects
---
### Description
In this lab, we will cover how to use JTEs with your Javalin web application.

---
### Steps
1. In src -> main -> java -> objects -> WaterBottle.java, add fields brandName(string) and amount (int).
2. Create a constructor for the class.
3. In src -> main -> java -> Main.java create a WaterBottle object with any values for the fields. Amount should vary from 0 - 100 with 0 being empty and 100 being full.
4. In the same file, create a new handler for sending the WaterBottle object to waterBottle.jte. Use ctx.render and Collections.singletonMap for this.
5. Create a route for the handler. 
6. In src -> main -> jte -> waterBottle.jte add the required parameter to receive the object from the handler. Use the same name for the parameter that you used for the key in the singletonMap.
7. In the file within the body tags, create an if-else if-else statement with conditions based on the amount:
* if amount is less than or equal to 0, then have the web page display: “I’m dying of thirst.” 
* else if(amount is 100), then have the web page display: "I'm always hydrated."
* else amount is greater than 50 but less than 100, then have the web page display: "I am content."
---
### Sample Output
```
I'm always hydrated.
```
---
