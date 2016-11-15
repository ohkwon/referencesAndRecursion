public class IntList {
  public int head;
  public IntList tail;
  public IntList(int h, IntList t) {
    head = h;
    tail = t;
  }

  public int size() {
    if (this.tail == null) 
      return 1;
    int next = this.tail.size();
    return next + 1;
  }

  public int iterativeSize() {
    int size = 0;
    IntList p = this;
    while (p != null) {
      size = size + 1;
      p = p.tail;
    }
    return size;
  }

  public static void iterativePrintAll(IntList p) {
    while (p.tail != null) {
      System.out.println(p.head);
      p = p.tail;
    }
  }

  public void printAll() {
    if (this.tail != null) {
      System.out.println(this.head);
      this.tail.printAll();
    }
  }
  public int get(int i) {
    if (i == 0) {
      return this.head;
    }
    return this.tail.get(i - 1);
  }

  public static IntList incrList(IntList L, int x) {
    if (L == null)
      return null;
    int newHead = L.head + x;
    IntList newTail = incrList(L.tail, x);
    return new IntList(newHead, newTail);
  }

  public static IntList dcrList(IntList L, int x) {
    if (L == null)
      return null;
    int newHead = L.head - x;
    IntList newTail = dcrList(L.tail, x);
    return new IntList(newHead, newTail);
  }
}