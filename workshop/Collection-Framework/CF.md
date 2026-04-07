# Collection - List, Set, Queue


## List

- predefined interface present in java util
- introduced from JDK 1.2
- implemented classes of list interface is 1- Array list, 2- Linked list, 3- Vector, 4- Stack

### Generalisation OR Upcasting 

List l(refernce Variable) = new Arraylist(); new LinkedList(); new Vector(); new Stack();

### Specfication of List I
 - Insertion order is maintained 
 - Null Value is allowed 
 - Duplucate allowed 
 - list is index based

### List In-built Method 

- get()
- set()
- indexOf()
- last Index 
- add
---

## ArrayList

- Present in java.util
- Introduced from JDK 1.2
- All Specification of list interface follow by Arraylist
- Intial capacity = 10 
- Incremental capacity =  ((current capacity * 3))/ 2 + 1 

### Array list Constructor 


- Array list();

- Arraylist (Capacity) ;
- Arraylist (Collection());



## Linked List
- java util
- introduced in JDK 1.2
- Store data in Node

### Linked list Constructor

- Linked List();
- Linked LIst(Collection());


## Stack  (Legacy Classes)
- introduced in JDK 1.0
- java.util
- No Constructor

### Methods

- push()
- pop()
- peek()
- isEmpty()
- clear()


# Implementation 

```
- LinkedList<Integer> reference variable = new LinkedList<>();
- Vector<Boolean> reference variable= new Vector<>();
- Stack<Integer> refernce variable= new Stack();
```

## Stack  

- st is a reference variable

```java
st.push(1);
st.push(2);
st.push(3);
st.push(4);
System.out.println(st); -- prints [1, 2, 3, 4]
st.pop(); 
System.out.println(st); -- prints [1, 2, 3]
st.peek();
System.out.println(st) -- prints 3
st.size();
System.out.println(st) -- prints 3 
st.isEmpty();
System.out.println(st) -- prints false
```

## LinkedList

- l is a reference variable
  
```java
LinkedList<Integer> ll = new Linked List<>();
ll.add(11);
ll.add(22);
ll.add(33);
ll.add(44);
System.out.println(ll);
ll.set(0. 90);
System.out.println(ll);
LinkedList<Integer> l = new Linked List<>();
l.add(1);
l.add(2);
l.add(3);
ll.addAll(l);
System.out.println(ll);
```





  


