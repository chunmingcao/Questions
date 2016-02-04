# InterviewQuestions

## Implement Singleton  

  class CollabController{
  
      private static CollabController instance;
  
      public static CollabController getInstance(){
      
          if(instance == null){
              synchronize(CollabController.class) {
                  if(instance == null){
                      instance = new CollabController();
                  }  
              }          
          }
          return instance;
      }
  }

## Implement Stack

  class Stack<T>{
  
      private T[] data;
      private static final DEFAULT_LENGTH = 100;
      private length;
      
      private index;
      
      public Stack<T>(){
          data= new T[DEFAULT_LENGTH ];
          index = -1;
          length = DEFAULT_LENGTH ;
      }
      
      public Stack<T>(int length){
          data= new T[length];
          index = -1;
          this.length = length ;
      }
      
      public push(T e) throws{      
          synchronize(this){
              if(index >= length-1 ){
                  throw new Exception("xxxdata");
              }
              data[++index] = e; 
          }  
      }
      
      public T pop(){   
          synchronize(this){
              if(index < 0){
                  return null;
              }
              data[index --] = null; 
          }       
      }
  }
  
## How to keep a program keep running with minimun resource?
  
    sychronized(this){
      this.wait();
    }
  
## RESTful service trasaction
  
   debtAccountService
   withraw
   deposit
   

  TreeSet vs HashSet  
  How many ways to implement thread  
  Log: duplicate key violates unique constrain  

  LinkedList vs HashTable  
  Http Code: 200, 201, 400, No authorization  
  final, finally, finalized  
  String mutable or immuatable  
  Algorithom: transfer a sorted array to a sorted balanced tree  

## Algorithm:  
  Search a string in a text.  
  Transform a Sorted Array to Sorted Balance Tree. [2, 5, 9, 11, 20, 25, 29]  

# 2/2/2016 Capital One  

#### Project you are most proud of. Dig into the detail of that project.  

#### REST /persons/id/addresses  Add a new address, use POST or PUT  

#### Database the user table become huge. How to improve the performence.   -> Split the Database?   
#### Search any content of the database.    Elastic search.    Sole   

#### SQL vs NOSQL, MongoDB vs Coxxxx  

#### Two phase of transaction commission   

#### REST PUT, DELETE all possible return code.  

#### TWO user update the same records at the same time.  

#### JPA HIBERNATE MANY TO MANY  

#### What is Dead Lock? How to avoid Dead Lock.   

#### Two-digit Lock vs Sephermore?  

#### Difference of Concurrency and Synchronous   

#### HashMap: what if the array is full, what if one list is very long and other lists are very short?    

#### Garbage Collection   

#### Hibernate   N +1 problem  

#### Spring: How the valicatoin annotation is triggered?  

#### Algorthom: the shortest path in a square.  

#### Priority Queue    


# 2/3/2016 Infosys  
#### in CSS, image sprites  
#### html local storage  
#### Jquery: two different version used in the same html page. how?  
#### JQuery Chaining. the benifits.  
Selector is only evaluated once for multiple operations. Better performance, smaller code.
Selector result can be used for multiple methods without having to assign it to a local variable. More compact code.
Multiple methods can more compactly be put on one line.
A lot more compact specifically when you want operations on consecutive different results such as $(this).next().find("span.title").closest(".section").hide();. Without chaining, you would need four different local variables where this needs none.   

#### JVM How to specify max Heap? Can it be change?  
-Xmx -Xms

#### String pool. String s = "xxx"; String s2 = new String("xxxx"); How to make s2 to the pool?  
#### Singleton vs Static class, which class in JDK implements Singleton. Singleton clone. Can Singleton be inherited?
####


