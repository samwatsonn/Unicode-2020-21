# Q6 - Strike

Given a string representation of a bowling score card, calculate the numeric score of the score card.

The scoring information for a bowling score card is provided below:

* Bowler is allowed a maximum of 10 frames.
* Each frame has 10 pins.
* Frames 1 - 9 consist of two balls (two attempts).
* Frame 10 can consist of three balls.
* If all pins are down using one ball, this is a strike (denoted by an X) and counts as 10 points.
* If all pins are down using two balls, this is a spare (denoted by a /) and counts as 10 points.
* In the event of a strike the next two balls' points count double.
* In the event of a spare the next one ball's points count double.
* In the event of a strike, the second attempt in that frame is not used.

The score card will be passed as an array of strings constituting 10 frames. The method should return an integer score.

For example, consider the following score card:

["9", "/", "7", "1", "X", "5", "1", "0", "7", "9", "0", "3", "6", "X", "3", "1", "9", "0"]

The total score in the above example is 99.
