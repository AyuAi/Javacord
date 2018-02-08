package de.btobastian.javacord.utils;

/**
 * An auto-closeable that does not throw any checked exceptions from its {@code close} method.
 */
public interface NonThrowingAutoCloseable extends AutoCloseable {
    @Override
    void close();
}
