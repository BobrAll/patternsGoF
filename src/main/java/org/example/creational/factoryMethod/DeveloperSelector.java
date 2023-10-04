package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.developers.*;

import java.util.HashMap;

public class DeveloperSelector {
    public static HashMap<String, Developer> map = new HashMap<>();

    static {
        map.put("low level programming", new CDeveloper());
        map.put("big data", new PythonDeveloper());
        map.put("high-load enterprise app", new JavaDeveloper());
        map.put("old dying technologies", new PhpDeveloper());
    }

    static Developer getDeveloper(String requirements) {
        return map.get(requirements.toLowerCase());
    }
}
