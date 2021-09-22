package com.javalearning;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    private static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independant language");
        languages.put("Python",
                "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "There in lies madness");
        System.out.println(languages.get("Java"));

    }

}
