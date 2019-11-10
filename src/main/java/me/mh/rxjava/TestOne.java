package me.mh.rxjava;

import io.reactivex.*;

public class TestOne {

    public static void main(String[] args) {
        System.out.println("RX Java");

        Observable<String> hello = Observable.just("Howdy!");
        Observable<String> howdy = Observable.just("Howdy!");
        howdy.subscribe(System.out::println);
        Observable.just("Hello", "World")
          .subscribe(System.out::println);
          
        
        List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
            );
    }
}