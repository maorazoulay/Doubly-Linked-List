public class DNode<T>{
  private T data;
  private DNode<T> prev, next;

  public DNode(T d, DNode<T> p, DNode<T> n){
    data = d;
    prev = p;
    next = n;
  }
  public T getData(){
    return data;
  }
  public DNode<T> getPrev(){
    return prev;
  }
  public DNode<T> getNext(){
    return next;
  }
  public void setData(T newData){
    data = newData;
  }
  public void setPrev(DNode<T> p){
    prev = p;
  }
  public void setNext(DNode<T> n){
    next = n;
  }
}