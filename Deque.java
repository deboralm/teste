public class Deque<Item> implements Iterable<Item> {
  private Node first;
  private Node current;
  private int n;
  bla bla bla
  private class Node {
    Item item;
    Node next;
    Node ev;
  }

  public Deque() {
    this.fsit = null;
    this.n = 0;
  }

  public boolean isEmpty(){
    return n==0;
  }

  public int size(){
    return this.n;
  }

  public void addFirst(Item item) {
    Node old_first = first;
    first = new Node();
    first.item = item;
    first.next = old_first;
    this.n += 1;
  }

  public void addLast(Item item) {
    int pos=;

    DequeIterator dequeIterator = new DequeIterator<Item>();
    while (dequeIterator.hasNext() == True) {
        last = dequeIterator.next();
    }

    Node old_last = last;

  }

  public Item removeFirst() {
  }                // remove and return the item from the front

  public Item removeLast()
                 // remove and return the item from the end

  public Iterator<Item> iterator() {
    return new DequeIterator();
  }

  private class DequeIterator implements Iterator<Item> {
    private Node current = first;

    public boolean hasNext() {
      return current != null;
    }

    public Item next() {
      Item item = current.item;
      current = current.next;
      return item;
    }
  }

  public static void main(String[] args)   // unit testing (required)
}
