# Game-RPS-JAVA

Purpose: increase your knowledge of threads by solving a problem using Java.

Requirements:

There is a game that some children play called rock-scissors-paper. Two contestants
each select one of the items: rock, scissors or paper, make a symbol with their hands
representing this object and then the two contestants simultaneously show their
representation of the object to the other. The winner is decided as follows:

Rock beats scissors.
Scissors beats paper.
Paper beats rock.
Combinations of similar objects are considered a draw.

1. This assignment is a group assignment. You are expected to work in a group
with one or two other students.

2. For this project you must simulate two people playing this game by writing a
program in Java that uses threads. Each player is to be represented by a thread;
the same instance of each thread must be used for all “rounds” (see next item).
Threads must be used.

3. Let the playing of the game by the two players be called a round. The code is to
simulate the playing of n-rounds of the game. For each round the values selected
by the two players are to be compared; that is, the values selected by each player
in a given round are to be compared – not values from different rounds. This
comparison is to be performed as the values are generated. It is not acceptable to
store the values in arrays and perform the comparisons at a later time.

4. You must use the following Java keywords to help synchronize your program:
synchronized, wait, notify (or notifyAll in place of notify).

5. While the program is executing, display messages that correspond to important
events. These messages are useful for debugging and should demonstrate that
the customers are processed in the correct order.

6. Run your program for the processing of at least 1000 rounds. Display summary
statistics to show that the program worked correctly. See the sample output
below for suggested statistics to gather. Note that the sum of the values of these
statistics will equal the number of rounds that were played.

Hint: When you write your synchronization code, you might need to compare the values
of which iteration each thread is in.

------------------------------------------------------------------------------------------
Sample output:

Round 992: Player 2 wins!

Round 993: Player 2 selects rock

Round 992: Player 1 loses

Round 993: Player 1 selects scissors

Round 993: Player 1 loses

Round 994: Player 1 selects scissors

Round 993: Player 2 wins!

Round 994: Player 2 selects scissors

Round 994: Player 2: Draw

Round 995: Player 2 selects scissors

Round 994: Player 1: Draw

Round 995: Player 1 selects rock

Round 995: Player 1 wins!

Round 996: Player 1 selects paper

Round 995: Player 2 loses

Round 996: Player 2 selects scissors

Round 996: Player 2 wins!

Round 997: Player 2 selects paper

Round 996: Player 1 loses

Round 997: Player 1 selects scissors

Round 997: Player 1 wins!

Round 998: Player 1 selects rock

Round 997: Player 2 loses

Round 998: Player 2 selects scissors

Round 998: Player 2 loses

Round 999: Player 2 selects scissors

Round 998: Player 1 wins!

Round 999: Player 1 selects scissors

Round 999: Player 1: Draw

Round 999: Player 2: Draw

Summary Statistics:

Number of draws: 343

Number of times scissors won: 235

Number of times rock won: 310

Number of times paper won: 112
