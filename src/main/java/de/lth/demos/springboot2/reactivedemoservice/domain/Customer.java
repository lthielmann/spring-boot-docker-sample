package de.lth.demos.springboot2.reactivedemoservice.domain;

public class Customer {

    private int id;

    public Customer() {
    }

    public Customer( final int id ) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Customer setId( final int id ) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return String.format( "Customer{id=%d}", id );
    }
}
