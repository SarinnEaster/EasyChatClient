package com.easychat.fx.serializer;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
public interface Serializer {
    Serializer Default = new JsonSerializer();
    byte getSerializerAlgorithm();
    
    <T> byte [] serializer(T t);
    
    <T> T deSerializer(Class<T> clazz, byte[] bytes);
}
