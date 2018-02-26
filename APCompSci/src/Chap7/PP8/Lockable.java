package Chap7.PP8;
public interface Lockable {
    void setKey(int key);
    void lock(int key);
    void unlock(int key);
    boolean locked();
}
