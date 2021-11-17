package com.company;

public class SharedResource {

    private Worker owner;

    public SharedResource(Worker owner) {
        this.owner = owner;
    }
    public Worker getOwner() {
        return owner;
    }
    public synchronized void setOwner(Worker owner) {
        System.out.println("Old owner :: " + this.owner.getName());
        this.owner = owner;
        System.out.println("New owner :: " + owner.getName());
    }
}
