package collectiontype;

import java.util.List;

public class Book {
    private List<String> lists;

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void test(){
        System.out.println(lists);
    }
}
