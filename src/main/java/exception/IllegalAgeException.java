package exception;

/**
 * 非法的年龄异常
 *
 * 自定义异常，通常用来定义程序中特定的错误，比如符合语法不符合某业务时
 * 导致的问题
 * 自定义异常要做到见名知意，通常异常名字就能直观反映出问题。
 * 并且自定义异常还要满足以下几个公作
 * 1：是Exception的子类，直接继承或间接继承都可以
 * 1：提供Exception定义的所有构造器
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
