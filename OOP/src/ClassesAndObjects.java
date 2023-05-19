public class ClassesAndObjects {
    // Conceptual Overview - Classes and Objects in Java

    // What are objects?
    // Are anything that you see around you. E.g Your house, table, chair,
    // bed, etc.
    // Every object has a state and behavior.

    // Example:
    // if we consider a person as an example,
    // state of the person will be: -> (variable or property)
    // 1. complexion
    // 2. height
    // 3. weight
    // 4. eyes color

    // Similarly, The behaviour would be: -> (actions or behaviors)
    // 1. walking
    // 2. running
    // 3. crying
    // 4. running

    // Objects instance of a class in java.
    // object have state and behavior

    // What are Class
    // A Class is nothing but a blueprint or template to define an object.
    // Classes will define all the state and behavior that you wish the
    // objects to have
    // Classes are also known as User-defined Datatype in Java


    // Why do we need Classes and Objects in Java
    // 1. Java offers primitive data types which can be used normally,
    //    but if you need something customed, that is when classes and
    //    objects come into the picture
    // 2. Java also offers and easy way to simulate real world scenarios
    //    with the help of classes and objects

    // Here are examples of user class with certain state and behavior.
    // Classes can also contain
    // 1. variables
    // 2. methods
    // 3. interfaces
    // 4. member Class
    // 5. constructors

    // new keyword and memory allocation in java
    // what happens when you create a variable
    // Lets say you've declares a variables "a" as an integer for using
    // it in your program,  then you do so , java compiler allocate
    // memory space corresponding to 4 bytes of space.
    // (size of integer = 4 bytes) and allocates it to the variable that
    // you just declared.

    // Now whenever you assign a value to this variable, it sits in the memory block

    //Objects creation in java has two types
    // 1. Object declaration
    // syntax: class-name object-name; Scanner sc
    // here an object is declared and a reference variable is created in
    // memory. However, memory allocation for this object is no done.

    // 2. Object creation and memory allocation
    // syntax: object-name = new class name();
    // Here a memory for the declared object is created using a new operator
    //
    // memory. However, memory allocation for this object is no done.

    class Car{
        // class state/variables/properties/members

        String color;
        int noOfWheels;
        int noOfDoors;
        int noOfSeats;
        int horsePower;

        // methods/behavior/actions
        public void  shiftGear(){

        }
        public void  engageBreak(){

        }
        public void  accelerate(){

        }
    }


}
