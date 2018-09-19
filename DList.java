public class DList<T>{
  private DNode<T> header, trailer;
  private int size;

  public DList(){
    size = 0;
    header = new DNode<>(null, null, null);
    trailer = new DNode<>(null, header, null);
    header.setNext(trailer);
  }
  public int getSize(){
    return size;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public DNode<T> getFirst(){
    if(isEmpty())
      throw new Exception("Empty");
    return header.getNext();
  }
  public DNode<T> getLast(){
    if(isEmpty())
      throw new Exception("Empty");
    return trailer.getPrev();
  }
  public DNode<T> getNext(DNode<T> a){
    DNode<T> ans = a.getNext();
    if(ans == null|| and == trailer)
      throw new Exception("No such Node");
    return ans;
  }
  public DNode<T> getPrev(DNode<T> a){
    DNode<T> ans = a.getPrev();
    if(ans == null|| ans == header)
      throw new Exception("No such Node");
    return ans;
  }
  public void addBefore(T d, DNode<T> a){
    DNode<T> x = new DNode<T>(d, a.getPrev(), a);
    DNode<T> temp = a.getPrev();
    temp.setNext(x);
    a.setPrev(x);
    size++;
  }
  public void addAfter(T d, DNode<T> a){
    DNode<T> x = new DNode<T>(d, a,a.getNext());
    DNode<T> temp = a.getNext();
    a.setNext(x);
    temp.setPrev(x);
    size++;
  }
  
}