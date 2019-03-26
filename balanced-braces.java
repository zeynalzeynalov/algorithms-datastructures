import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
        String openingBrace = "[{(";
        String closingBrace = "]})";
        
		while (sc.hasNext()) {
			
			String input=sc.next();
            Stack<Character> stack = new Stack<Character>();
            boolean isBalanced = true;
            for(int i=0; i<input.length();i++)
            {
                Character c = input.charAt(i);
                
                if(openingBrace.contains(c.toString()))
                    stack.push(c);
                else
                    if(stack.empty())
                    {
                        isBalanced = false;
                        break;
                    }
                else
                    if(stack.peek().equals(openingBrace.charAt(closingBrace.lastIndexOf(c))))
                        stack.pop();
					else
					{
						isBalanced=false;
						break;
					}
            }
            
            if(stack.empty () && isBalanced)
                System.out.println("true");
            else
                System.out.println("false");
		}
	}
}
