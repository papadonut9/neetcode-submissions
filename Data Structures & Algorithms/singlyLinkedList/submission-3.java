class LinkedList {
  private class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;
  private int size;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size)
      return -1;

    Node now = head;
    for (int i = 0; i < index; i++) now = now.next;

    return now.data;
  }

  public void insertHead(int val) {
    /*
    take existing data at head
    next data at */
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
    size++;
  }

  public void insertTail(int val) {
    Node newNode = new Node(val);
    size++;

    if (head == null) {
      head = newNode;
      return;
    }

    Node now = head;
    while (now.next != null) now = now.next;

    now.next = newNode;
  }

  public boolean remove(int index) {
    // traverse to index
    // copy to

    if (index < 0 || index >= size)
      return false;

    if (index == 0) {
      if (head == null)
        return false;
      int data = head.data;
      head = head.next;
      size--;
      return true;
    }
    Node now = head;
    for (int i = 0; i < index - 1; i++) now = now.next;

    int data = now.next.data;
    now.next = now.next.next;
    size--;
    return true;
  }

  public ArrayList<Integer> getValues() {
    ArrayList<Integer> res = new ArrayList();
    Node now = head;
    if (size == 0)
      return res;
    while (now != null) {
      res.add(now.data);
      now = now.next;
    }
    return res;
  }
}
