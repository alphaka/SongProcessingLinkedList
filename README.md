SongProcessingLinkedList

This project uses a simply linked list data structure to produce a sorted list.

To so do, I instantiated four classes.

- The first one is 'Artist.java'. This class represents the artist node and has a
  constructor that accepts an artist node. Therefore, the node has contains only a certain
  artist name.
  
- The second class is 'CVSReader.java'. This class' goal is to read a CSV file and store the
  data inside a one-dimensional array. Hence, the method has a constructor that accepts
  two paraments —- a string 'path' which is the path of the file to be read, and an integer
  variable 'row' as the second parameter that contains the number of rows in the path file.
  The class has a 'getData()' function as well. That method reads directly from the 'path'
  file and stores the artist's name inside 'myList', which is a 1-Dimensional string array.
  Finally, the 'getData' return 'myList'.
  
- The third class 'TopStreamingArtistLinkedList.java' is the most important because it is the
  linked list one and has three methods. The class uses the 'Artist' node and ts first method is
  'isEmpty()' which checks whether the 'first' Artist node is empty or not. The second method is
  'sortInsertion()'. That method takes a string as a parameter and uses it to create a node. That node
  is finally placed in the appropriate alphabetical order in the linked list. The last method is
  'display()' and simply display the linked list.
  
- The Main class utilizes the two previous classes and to produce the list.
