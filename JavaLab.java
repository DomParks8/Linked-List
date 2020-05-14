import java.util.LinkedList;

public class JavaLab {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list1.add("Testing");
        // 1
        System.out.println(isItEmpty(list1));
        // 2
        addNode(list1, "Testing our second method");
        System.out.println(list1);
        // 3
        makeEmpty(list1);
        // 4
        addNode(list1, "Node one");
        addNode(list1, "Node two");
        addNode(list1, "Node three");
        printNode(list1);
        // 5
        deleteNode(list1, 2);
        printNode(list1);
        // 6
        deleteOccurance(list1, "Node one");
        printNode(list1);
        // 7
        addHead(list1, "Head one");
        printNode(list1);
        // 8
        addNodeIndex(list1, 1, "Node Insertion");
        printNode(list1);
        // 9
        addNode(list2, "Node three");
        addNode(list2, "Node four");
        addNode(list2, "Node five");
        appendList(list1, list2);
        printNode(list2);
        // 10
        printReverse(list2);
    }

    // creating method for #1
    // void only executes code, doesnt return a value ^^^
    // methods like this dont have have to be defined before main method, just have
    // to be within the class scope (*public class daySeven here*)
    public static boolean isItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
    }

    public static void makeEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            System.out.println("The list was already empty");
        } else {
            list.clear();
            System.out.println("The list is now empty");
        }
    }

    public static void printNode(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void deleteNode(LinkedList<String> list, int index) {
        list.remove(index);
    }

    public static void deleteOccurance(LinkedList<String> list, String occurance) {
        list.remove(occurance);
    }

    public static void addHead(LinkedList<String> list, String head) {
        list.addFirst(head);
    }

    public static void addNodeIndex(LinkedList<String> list, int index, String node) {
        list.add(index, node);
    }

    public static void appendList(LinkedList<String> listOne, LinkedList<String> listTwo) {
        if (listOne.size() == 0) {
            return;
        } else {
            for (int i = 0; i < listOne.size(); i++) {
                addNode(listTwo, listOne.get(i));
            }
        }
    }

    public static void printReverse(LinkedList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}