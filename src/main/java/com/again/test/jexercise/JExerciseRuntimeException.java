package com.again.test.jexercise;

/**
 * Created by dogrex on 2018/2/20.
 */
public class JExerciseRuntimeException extends RuntimeException {
    public JExerciseRuntimeException() {
    }

    public JExerciseRuntimeException(String message) {
        super(message);
    }

    public JExerciseRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JExerciseRuntimeException(Throwable cause) {
        super(cause);
    }
}
