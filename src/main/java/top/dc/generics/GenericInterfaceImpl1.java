package top.dc.generics;

public class GenericInterfaceImpl1<T> implements GenericInterface<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
