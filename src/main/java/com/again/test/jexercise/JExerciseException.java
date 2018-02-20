package com.again.test.jexercise;

/**
 * Created by dogrex on 2018/2/20.
 */
public class JExerciseException extends Exception {
    public JExerciseException() {
    }

    public JExerciseException(String message) {
        super(message);
    }

    public JExerciseException(String message, Throwable cause) {
        super(message, cause);
    }

    public JExerciseException(Throwable cause) {
        super(cause);
    }
}
