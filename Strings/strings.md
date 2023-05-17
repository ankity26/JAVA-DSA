# Strings And StringBuilder

--- 

In Java, a String is an object that represents a sequence of characters. It is a built-in class in the Java API, and it is part of the java.lang package. Strings are immutable, which means that once a String object is created, its contents cannot be changed.
## Creating Strings
In Java, you can create a string in several ways. Here are some common ways to create strings:
### Using String literal:

	String str = "Hello World";

### Using String constructor:
    
    String str = new String("Hello World");
### Using StringBuilder:

    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(" World");
    String str = sb.toString();

### Here are some common methods that can be used with String objects in Java:

- length(): This method returns the length of the string in terms of the number of characters.


- charAt(int index): This method returns the character at the specified index position.


- substring(int beginIndex): This method returns a new string that is a substring of the original string, starting from the specified index position and going to the end of the string.


- substring(int beginIndex, int endIndex): This method returns a new string that is a substring of the original string, starting from the specified beginIndex and going up to but not including the endIndex.


- equals(Object obj): This method compares the string with the specified object for equality.


- equalsIgnoreCase(String anotherString): This method compares the string with the specified string for equality, ignoring case differences.


- indexOf(int ch): This method returns the index of the first occurrence of the specified character in the string.


- indexOf(String str): This method returns the index of the first occurrence of the specified substring in the string.


- replace(char oldChar, char newChar): This method returns a new string that is a copy of the original string, with all occurrences of the specified oldChar replaced with the specified newChar.

## StringBuilder in Java
Everytime we modifie a object it creates new object to tackle this problem StringBuilders are used.StringBuilder is a mutable sequence of characters. It is also a class in the Java API and it is part of the java.lang package. Unlike Strings, StringBuilder objects can be modified. StringBuilder is more efficient than concatenating strings using the + operator.

### Here are some common methods that can be used with StringBuilder objects in Java:
- append(String str): This method adds the specified string to the end of the StringBuilder object.


- insert(int offset, String str): This method inserts the specified string into the StringBuilder object at the specified offset position.


- delete(int startIndex, int endIndex): This method deletes the characters in the StringBuilder object from the specified startIndex up to but not including the endIndex.


- reverse(): This method reverses the order of the characters in the StringBuilder object.


- toString(): This method converts the StringBuilder object into a String object.
