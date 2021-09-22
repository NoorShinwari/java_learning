package com.javaLearning;

import org.w3c.dom.Node;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        // TODO Auto-generated method stub
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // TODO Auto-generated method stub

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();

            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // preformRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // TODO Auto-generated method stub
        if (root == null) {
            System.out.println("You have reached to the end of the list");
        } else {
            traverse(this.root.previous());
            System.out.println(this.root.getValue());
            traverse(this.root.next());

        }

    }

}
