public class IntListIntroLauncher {
  public static void main(String[] args) {
    int i = 1;
    IntList p = new IntList(0, null);
    IntList og = p;
    while (i < 15) {
      p.tail = new IntList(i * 5, null);
      p = p.tail;
      i = i + 1;
    }
    System.out.println(og);
    System.out.println(og.size());
    System.out.println(og.iterativeSize());
    System.out.println(og.get(8));
    IntList.incrList(og, 25).printAll();
    IntList.dcrList(og, 30).printAll();
    og.printAll();
  }
}