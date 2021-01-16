--------Question 1--------
The method longestStreak is intended to determine the longest substring of consecutive identical characters in the parameter str and print the result. For example, the call longestStreak("CCAAAAATTT!") should print the result "A 5" because the longest substring of consecutive identical characters is "AAAAA".
Complete the method below. Your implementation should conform to the example above.

public static void longestStreak(String str){
 int maxCharacterCount = 0;
    char longestSubString = str.charAt(0);
    for (int i = 0; i < str.length(); i++)
    {
        int currentMaxCharacterCount = 1;
        for (int j = i + 1; j < str.length(); j++)
        //Had trouble creating for loop, enlisted the help of Aditya
        {
            if (str.charAt(i) != str.charAt(j))
            // I learned that != means not equal to
            {
                break;
            }
            else
            {
                currentMaxCharacterCount++;
            }
        }
        if (currentMaxCharacterCount > maxCharacterCount)
        {
            maxCharacterCount = currentMaxCharacterCount;
            longestSubString = str.charAt(i);
        }
    }
    System.out.println(longestSubString + " " + maxCharacterCount);
}

--------Question 2--------

In the simulation, player 2 will always play according to the same
strategy. The number of coins player 2 spends is based on what round it is, as described below.
(a)  You will write method getPlayer2Move, which returns the number of coins that player 2 will spend in a given round of the game. In the first round of the game, the parameter round has the value 1, in the second round of the game, it has the value 2, and so on. The method returns 1, 2, or 3 based on the following rules.

-If round is divisible by 3, then return 3.
-If round is not divisible by 3 but is divisible by 2, then return 2.
-If round is not divisible by 3 and is not divisible by 2, then return 1.Complete method getPlayer2Move below by assigning the correct value to result to be returned.
/** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
*/
public int getPlayer2Move(int round)
{
int result;
  return result;
}
ANSWER:
public int getPlayer2Move(int round)
{
    int result;
    if (round % 3 == 0)
    {
        result = 3;
    }
    else if (round % 2 == 0)
    {
        result = 2;
    }
    else
    {
        result = 1;
    }
    return result;
}
//This segment of code uses if and else if statements to satisfy the conditions listed in the quesstion above. The == operator means equal to. Based on what round is divisible by, a different value will be returned.

b) Assume that getPlayer2Move works as specified, regardless of what you wrote in part (a) . You must use getPlayer1Move and getPlayer2Move appropriately to receive full credit. 
Complete method playGame below. 
/** Plays a simulated game between two players, as described in part (b). */ 

public void playGame()

{
    int player1Coins = startingCoins;
   int player2Coins = startingCoins;
    for (int round = 1; round <= maxRounds; round++)
    {
        if (player1Coins < 3 || player2Coins < 3)
        {
            break;
        }
        int player1Spends = getPlayer1Move();
        int player2Spends = getPlayer2Move(round);
        player1Coins -= player1Spends;
        player2Coins -= player2Spends;
        if (player1Spends == player2Spends)
        {
            player2Coins += 1;
            continue;
        }
        int difference = Math.abs(player1Spends - player2Spends);
        if (difference == 1)
        {
            player2Coins += 1;
            continue;
        }
        if (difference == 2)
        {
            player1Coins += 2;
            continue;
        }
    }
    if (player1Coins == player2Coins)
    {
        System.out.println("This is a tie.");
    }
    else if (player1Coins > player2Coins)
    {
        System.out.println("Player 1 wins!");
    }
    else if (player1Coins < player2Coins)
    {
        System.out.println("Player 2 wins!");
    }
}
//First, declare variables for player1coins and player 2 coins. Break flow of program if the Player 1 or Player 2 coins are less than 3. Initialize number of coins player 1 and 2 spend. Remove coins from player 1 and 2 and then find difference between amount spent by both players. If the difference is 1, add 1 to player2coins, and if the difference is 2, add 2 to player 1 coins. Depending on who has the most coins, that will result in their win. If the amount of coins both players have is equal then the game results in a tie.


