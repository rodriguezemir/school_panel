package me.rodriguezemir.school_panel.object;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Student {

    @Getter
    private final String name;
    @Getter
    private final int age;

}
