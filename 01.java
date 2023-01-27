using System;
using System.Reflection;
using System.Text;

public class Example
{
   public static void Main()
   {
      StringBuilder sb = new StringBuilder();
      ShowSBInfo(sb);
      sb.Append("This is a sentence.");
      ShowSBInfo(sb);
      for (int ctr = 0; ctr <= 10; ctr++) {
         sb.Append("This is an additional sentence.");
         ShowSBInfo(sb);
      }   
   }
   
   private static void ShowSBInfo(StringBuilder sb)
   {
      foreach (var prop in sb.GetType().GetProperties()) {
         if (prop.GetIndexParameters().Length == 0)
            Console.Write("{0}: {1:N0}    ", prop.Name, prop.GetValue(sb));
      }
      Console.WriteLine();
   }
}