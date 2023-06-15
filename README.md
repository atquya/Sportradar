# Sportradar
This is a task for sportRadar

The task is to create a live score feed of football matches in WC.

This does not contain any API.

So the countries and Score count will be random. 

Now this is a simple library where the scoreboard supports the following operations:

1. Start a new match, assuming initial score 0 – 0 and adding it the scoreboard.
   
2. Updated score.
   
3. Finished match. This removes a match from the scoreboard.
   
4. A summary of matches in progress ordered by their total score. The matches with the
same total score is in returned ordered by the most recently started match in the
scoreboard.

Finally, In my understanding this is how the task could be completed as a simple library.
