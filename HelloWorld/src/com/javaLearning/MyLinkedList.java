package com.javaLearning;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
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
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {

                // item means newItem is greater, move right if possible,
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // theere is no next, so insert at end of the list
                    // currentItem.setNext(item);
                    // item.setPrevious(currentItem);

                    // shortcut to the above code
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // item is less, insert before if possible,
                if (currentItem.previous() != null) {
                    // currentItem.previous().setNext(item);
                    // item.setPrevious(currentItem.previous());
                    // item.setNext(currentItem);
                    // currentItem.setPrevious(item);
                    // shortcut to the above code

                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);

                } else {

                    // there is no item at the left and new item is less the current item

                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;

            } else {
                // equal
                System.out.println(item.getValue() + " is already present, not added.");
                return false;

            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // TODO Auto-generated method stub
        if (item != null) {

        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();

                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious((currentItem.previous()));
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {

                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // TODO Auto-generated method stub

        if (root == null) {
            System.out.println("The list is empty");
        } else {

            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }

}
