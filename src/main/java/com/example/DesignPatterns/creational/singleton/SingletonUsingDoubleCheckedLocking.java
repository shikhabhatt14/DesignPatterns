package com.example.DesignPatterns.creational.singleton;

public class SingletonUsingDoubleCheckedLocking {

    private static volatile SingletonUsingDoubleCheckedLocking instance;

    //The volatile keyword in Java is a non-access modifier applied to variables,
    // ensuring that their values are read from and written to main memory rather
    // than cached in thread-local memory. This mechanism guarantees visibility of
    // changes across multiple threads. When a variable is declared volatile, any
    // modification made by one thread is immediately visible to other threads,
    // preventing data inconsistency issues. However, volatile does not ensure
    // atomicity for compound operations (e.g., incrementing a variable). For such
    // cases, synchronization mechanisms like synchronized blocks or atomic classes
    // are necessary. The volatile keyword serves as a lightweight synchronization
    // tool, primarily addressing visibility concerns in multi-threaded environments.

    private SingletonUsingDoubleCheckedLocking() {
        System.out.println("Singleton is implemented using double checked locking.");
    }

    public static SingletonUsingDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonUsingDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonUsingDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Something is done using double checked locking.");
    }

}
