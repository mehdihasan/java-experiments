package me.mh.rxjava;

import java.util.Arrays;
import java.util.List;

import io.reactivex.*;

public class TestOne {

	
    public static void main(String[] args) {
        System.out.println("RX Java");

        Observable<String> hello = Observable.just("Howdy!");
        Observable<String> howdy = Observable.just("Howdy!");
        
        howdy.subscribe(System.out::println);
        
        Observable.just("Hello", "World")
          .subscribe(System.out::println);
          
    }
    
    
    private void testPusVsPull() {
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
    	
    	Observable<String> o = Observable.create(source -> {
    		source.onNext("sdfsd");
    	});
    } 
    
    
    private void testAsyncObservableMerge() {
    	Observable<String> a = Observable.create(s -> {
        	new Thread(() -> {
        		s.onNext("one");
        		s.onNext("two");
        		s.onComplete();
        	}).start();; 
        });
        
        Observable<String> b = Observable.create(s -> {
        	new Thread(() -> {
        		s.onNext("three");
        		s.onNext("four");
        		s.onComplete();
        	}).start();; 
        });
        
        Observable<String> c = Observable.merge(b, a);
        c.subscribe(System.out::println);
    }
}