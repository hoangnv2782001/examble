package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * -Aspect: An aspect is a class that implements enterprise application concerns that cut across
 * multiple classes, such as transaction management. Aspects can be a normal class configured
 * through Spring XML configuration or we can use Spring AspectJ integration to define a class
 * as Aspect using @Aspect annotation.
 *
 * -Aspect is a class in which we define Pointcuts and Advices.
 *
 * -JoinPoint :a JoinPoint is a point in the execution flow of a method where an Aspect (new behavior)
 * can be plugged in.
 *
 *-Pointcut: Pointcut is expressions that are matched with join points to determine whether
 * advice needs to be executed or not.
 *
 * -Advice: Advices are actions taken for a particular join point. In terms of programming,
 * they are methods that get
 * executed when a certain join point with matching pointcut is reached in the application.
 *   +Before Advice: These advices runs before the execution of join point methods. We can use
 *   @Before annotation to mark an advice type as Before advice
 *
 *   +After (finally) Advice: An advice that gets executed after the join point method finishes executing,
 *   whether normally or by throwing an exception. We can create after advice using @After annotation
 *
 *   +AfterReturning: Runs after the advised method successfully completes ie without any runtime
 *   exceptions. It is denoted by @AfterReturning annotation.
 *
 *   +Around: This is the strongest advice among all the advice since it wraps around and runs
 *   before and after the advised method. This type of advice is used where we need frequent access
 *   to a method or database like- caching. It is denoted by @Around annotation.
 *
 *   +AfterThrowing: Runs after the advised method throws a Runtime Exception.
 *   It is denoted by @AfterThrowing annotation.
 *
 * -Target Object: They are the object on which advices are applied. Spring AOP is implemented u
 * sing runtime proxies so
 * this object is always a proxied object
 */
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.demo.controller.*.*.(..)")
    public void loggingController(){

    }

    @Before("loggingController()")
    public void beforeLogging(){
        System.out.println("before controller run");
    }

    @After("loggingController()")
    public void afterLogging(){
        System.out.println("after controller run");
    }

    @AfterThrowing("within(com.example.demo.controller.*)")
    public void logExceptions(JoinPoint joinPoint){
        System.out.println("Exception thrown "+joinPoint.toString());
    }

    @Around("loggingController()")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before ....");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After "+value);
        return value;
    }
}
