SongProcessingLinkedList

This project uses a simply linked list data structure to produce a sorted list.

To so do, I instantiated four classes. 

- The fisrt one is the 'Artist.java'. This class represents the artist node and has a 
  constructor that accepts an artist node. Therefore, the node has contains only a certain
  artist name.
  
- The second class is the 'CVSReader.java'. This class' goal is to read a CSV file and store the
  data inside a one dimensional array. Hence, the method has a constructor that accepts
  two paraments -- a string 'path' which is the path of file to be read and an integer 
  variable 'row' as the second parameter that contains the number of row in the path file.
  
  The class has a 'getData()' function as well. That method reads driectly from the 'path'
  file and stores the artists name inside 'myList', which is a 1-Dimensional string array.
  Finally, the 'getData' return 'myList'.
  
- The third class 'TopStreamingArtistLinkedList.java' is the most important class. This class
  is the linked list one and has three methods. The class uses the 'Artist' node. The first
  method 'isEmpty()' checks whether the linked list is empty or not. The next method 
