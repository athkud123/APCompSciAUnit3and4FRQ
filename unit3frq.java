--------Question 1--------

a.) Write a code segment that prints "attending" if RSVP is true & prints "not attending" otherwise.
Write the code segment below.

if(RSVP)
{
    System.out.println("attending");
}
else
{
    System.out.println("not attending");
}

//The if-else statement here indicates that if RSVP is true, then the System must output "attending", and if RSVP is anything other than true, then "not attending" must be outputted.


b.) Write a code segment that prints the food item associated with "Selection". For example, if "Selection" is 3, the
code segment should print "pasta".
Write the code segment below. Your code segment should meet all specifications and conform to the example.

if(Selection == 1)
{
    System.out.println("Beef");
}
else if(Selection == 2)
{
    System.out.println("Chicken");
}
else if(Selection == 3)
{
    System.out.println("Pasta");
}
else
{
    System.out.println("Fish");
}

//This segment of code utilizes else if statements to depict a multi selection path; based on whatever value Selection is assigned, the corresponding meat will be printed.

c.) Write a code segment that will store a dinner selection in option1 based on the values of RSVP and Selection.
The intended behavior of the code segment is described below.
If RSVP is true, the code segment should store in option1 a string indicating the person's attendance & food choice.
For example, if RSVP is true & Selection is 1, the following string should be stored in option1.
"Thanks for attending. You will be served beef."
If RSVP is false, the following string should be stored in option1, regardless of the value of Selection.
"Sorry you can't make it."
Write the code segment below. Your code segment should meet all specifications and conform to the examples.

switch(Selection)
{
    case 1:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served beef.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;
    case 2:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served chicken.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;
    case 3:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served pasta.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;
    default:
    if(RSVP)
    {
        option1 = "Thanks for attending. You will be served fish.";
    }
    else
    {
        option1 = "Sorry you can't make it.";
    }
    break;
}

//Based on the given directions, each designated string of attendance and food choice is stored within option 1 as outlined by the questions. This is done by using else statements to show different cases of these scenarios ocurring. All data is stored in option 1 and the code is based onn whether RSVP is true or not.


d.) Write a code segment that will print true if the strings option1 & option2 contain the same values & will print
false otherwise.
Write the code segment below.

if(option1 == option2)
{
    System.out.println("true");
}
else
{
    System.out.println("false");
}

// Once again, if statements and operators are used here to show the two selection router.If option 1 is equal to option 2, then print out true, but if they aren't equal then print ou false.




--------Question 2--------
    
 Write the method drawSquare below
 Precondition: 0 <= x < 10, 0 < y <= 10, len > 0
 Draws square on 10x10 (x,y) grid
 Print square's side length and area
 Upper left cornerof square willl be located

 
public class Draw
{
    public void drawLine(int x1, int y1, int x2, int y2)
    {
    }
    public void drawSquare (int x, int y, int Len)
    {
        if (Len > y && y <= (10 - x))
        {
            Len = y;
        }
        else if (Len > (10 - x) && (10 - x) <= y)
        {
            Len = 10 - x;
        }
        drawLine (x, y, x + Len, y);
        drawLine (x, y, x, y - Len);
        drawLine(x, y - Len, x + Len, y - Len);
        drawLine (x + Len, y, x + Len, y - Len);
        System.out.println("The area is: " + Len * Len);
        System.out.println("The perimeter is: " + Len * 4);
    }
}

// This code satisfies all conditions listed in the problem.
