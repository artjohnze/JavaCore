package Section7.EXCERCISE.Solutioncode;

public class Exercise16 {
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}

//
//The isPalindrome method is designed to determine if a given number is a palindrome. A palindrome is a number that reads the same forwards and backwards, like 121 or 1331.
//
//
//
//Initialization:
//
//Declare two integer variables: reverse and original.
//
//Initialize both variables with the given number. For example, if the number is 121, original and reverse will both start as 121.
//
//Loop Setup:
//
//The while loop will continue executing as long as original is not 0. This is because we're gradually breaking down the number into its digits during each iteration of the loop.
//
//Loop Execution:
//
//Inside the loop, we perform the following steps repeatedly until original becomes 0:
//
//Extract the Last Digit:
//
//Calculate the last digit of the original number using original % 10. This operation gives us the remainder when original is divided by 10, which is the last digit of the number.
//
//Building the Reversed Number:
//
//Multiply the current value of reverse by 10. This makes space for the next digit we're going to add.
//
//Add the last digit obtained in the previous step to reverse. This effectively adds the last digit to the reversed number.
//
//Update original:
//
//Update the original number by removing its last digit. This is done by dividing original by 10 (original /= 10).
//
//Loop Continuation:
//
//After each iteration of the loop, original becomes smaller because its last digit has been removed.
//
//The loop continues as long as there are digits left in the original number.
//
//Loop Termination:
//
//When the original number becomes 0 (all digits have been processed), the loop stops.
//
//        Comparison:
//
//Once the loop ends, the reverse number contains the digits of the original number in reverse order.
//
//Compare the reverse number with the original number. If they are equal, it means the number is a palindrome.
//
//        In summary, the while loop breaks down the original number into its digits, constructs the reverse of the number, and then compares the reversed number with the original number to determine if it's a palindrome. This process effectively checks if the number reads the same forwards and backwards.
//}
