package kz.training.learn.collection.aircompany;

public interface Setting {
    void start();
    default void flight(){}
    void landing();
}
