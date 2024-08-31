import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine();
        //Synchronized(thread safe)
        StringBuffer sb1= new StringBuffer(word);
        System.out.println(sb1.reverse());
        //single threaded environment
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
      /*  String arr[] = word.trim().split(" ");
        for(int i= arr.length -1; i >=0 ;i--)
        {
            System.out.print(arr[i]+" ");
        }
*/
    }




}
/*
sc.next takes just one word in consideration.
1. String
Immutability: Strings are immutable in Java, meaning once a String object is created, it cannot be changed. Any modification results in the creation of a new String object.
Performance: Due to immutability, operations that modify a string (like concatenation) can be slower because they create a new object each time.
Thread-Safety: Strings are inherently thread-safe because they are immutable.
Usage: Ideal for scenarios where the string content won’t change frequently.
2. StringBuffer
Mutability: Unlike String, StringBuffer is mutable. You can change the content of the StringBuffer object without creating a new object.
Performance: More efficient than String for scenarios that involve frequent modifications, such as appending or deleting characters.
Thread-Safety: StringBuffer is thread-safe because all its methods are synchronized. This means only one thread can modify the object at a time.
Usage: Suitable when you need to modify strings in a multi-threaded environment.
3. StringBuilder
Mutability: Similar to StringBuffer, StringBuilder is also mutable.
Performance: StringBuilder is faster than StringBuffer because its methods are not synchronized, making it more efficient in single-threaded environments.
Thread-Safety: Not thread-safe. Since it’s not synchronized, multiple threads can access and modify the object simultaneously, leading to potential issues in a multi-threaded context.
Usage: Best choice when you need to modify strings frequently in a single-threaded environment.
Summary
String: Immutable, slower for modifications, thread-safe.
StringBuffer: Mutable, slower than StringBuilder, thread-safe.
StringBuilder: Mutable, fastest for single-threaded operations, not thread-safe.
Choose String for fixed or rarely changed text, StringBuffer for multi-threaded environments, and StringBuilder for performance-critical, single-threaded string manipulation.

methods in SBuffer and Builder
append()
insert()
delete()
reverse()
replace()
setCharAt()
capacity()
length()
substring()

 */