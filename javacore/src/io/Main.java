package io;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        f.createNewFile();

        Object o = new Object(){
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };

        System.out.println(o.equals(112));
    }

     class  tt{
        static void tt(){

        };
    }
}
