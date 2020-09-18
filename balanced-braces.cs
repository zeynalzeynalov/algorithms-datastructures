using System;
using System.Collections.Generic;

namespace ConsoleAppBalancedBrackets
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < count; i++)
            {
                string input = Console.ReadLine();
                Console.WriteLine(isBalanced(input));
            }
        }

        static string isBalanced(string input)
        {
            string bracesOpening = "({[";
            string bracesClosing = ")}]";

            string result = string.Empty;

            Stack<char> stackBraces = new Stack<char>();

            foreach (char c in input)
            {
                if (bracesOpening.Contains(c.ToString()))
                {
                    stackBraces.Push(c);
                }
                else
                if (stackBraces.Count == 0)
                {
                    result = "NO";
                    break;
                }
                else
                if (stackBraces.Peek() != bracesOpening[bracesClosing.IndexOf(c)])
                {
                    result = "NO";
                    break;
                }
                else
                    stackBraces.Pop();
            }

            return stackBraces.Count > 0 || result == "NO" ? "NO" : "YES";
        }
    }
}
