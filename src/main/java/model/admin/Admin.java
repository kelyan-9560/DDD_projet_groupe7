package model.admin;

import java.util.Objects;

public class Admin {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Admin setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return id == admin.id && Objects.equals(name, admin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
