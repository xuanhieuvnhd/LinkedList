public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1,"Hoang");
        list.add(2,2);
        list.add(3,"htc");
        System.out.println(list);
        list.addFirst("Code");
        System.out.println(list);
        list.addLast("Gym");
        System.out.println(list);
        System.out.println(list.indexOf("htc"));
//        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
