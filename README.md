# ModuleProject-TripPlanner
For this project, you are going to write a program that asks the user for some information about an international trip they are taking. Based on that information you will need to do some conversions, using the correct data types, to tell them some information to help them plan their trip.


Here is my sample output:

![](img/image-1.png)


For your first project, we are going to break up the work into different parts. You’ll want to think about the process of development when approaching any project. As the course progresses you’ll be expected to do more of this planning yourself, but for now pay attention to how we break the complex problem down into smaller, easier to tackle, pieces.


**Part 1 – Greeting**



First, you’ll want to greet your user and ask them their name. As you can see above the user types their response on the same line as the question. To do this you’ll want to use a System.out.print() statement instead of a System.out.println() statement. Once your user tells you their name use it to greet them! Then ask them where they would like to go. Finally, tell your user their destination sounds like a great trip. All the code to accomplish Part 1 should be in its own method.


HINT: Some names and destinations are more than 1 word! Plan accordingly.


**Part 2 – Travel time and Budget**



For this part, you’ll want to ask the user about how much time and money they are budgeting for their trip. Ask the user:


1. How many days are they going to spend in their destination?
2. What is their total budget for the trip in USD?
3. What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EU etc…
4. The conversion rate between 1 USD to however many of that destinations currency. For example, there are 0.9 euro to 1 usd, so the user would type in 0.9



Once you have all this info (stored in the correct variable types), use it to tell the user the following information:


1. How much time the user will spend at their destination in days, hours, minutes and seconds
2. Show the user their budget in USD for the whole trip and how much they can spend in USD per day
3. Show the user their budget in the travel destination’s currency for the total trip and per day

All the code to accomplish Part 2 should be in its own method.


**HINT:** *keep in mind that if you divide integers you might lose some information when it truncates.*


**Part 3 – Time Difference**



For this part, you’ll need to ask the user about the time difference between their home and where they are going. If the destination time zone is “behind” the user’s home time zone the user should enter a negative number. For example, the time difference between Seattle and Nairobi is 9 hours, and the time difference between New York and Mexico City is -1 hours.


Show the time it will be in the travel destination when it is midnight at home and when it is noon at home. You can report these in 24 format, where midnight is 0:00 and noon is 12:00.


**HINT:** *Your answers might be greater than 24. Try using the % or mod operator to "wrap around" to 24-hour time format. For example, 12 % 24 is 12, but 25 % 24 is 1.*


All the code to accomplish Part 3 should be in its own method.


**Part 4 – Country Area**



Only three countries in the world us the "imperial system", so most countries report their distances in kilometers. For this part, ask the user the area of their travel destination country in km^2^. Then you’ll want to convert that to miles^2^ and report those results back to the user.



All the code to accomplish Part 4 should be in its own method.



**Part 5 – Round**



You may have noticed some of our math has produced numbers with lots of decimal places, making then not look very nice. In this part, you need to go back and clean up those answers so they each only have 2 decimal places.



To do this you are going to use a combination of ints and doubles.



First, multiply the number you want to reformat by 100.

Cast the result of part 1 to an int like so:

(int) answerFromOne

This will drop any decimal places 3. Convert your answer back to a double, and move the decimal place over by 2 numbers like so:


answerFromTwo / 100.0


If you follow the above steps you should find that any of your answers are not limited to only 2 decimal places, however, those decimal places won’t be rounded, they will just be the first two from the original answer.


This code will need to be added to each of the methods you wrote for parts II, III and IV.