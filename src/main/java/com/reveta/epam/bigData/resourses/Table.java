package com.reveta.epam.bigData.resourses;

public class Table {
    private String name;
    private int columnsNumber;

    public Table(String name, int columnsNumber) {
        this.name = name;
        this.columnsNumber = columnsNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Table{");
        sb.append("name='").append(name).append('\'');
        sb.append(", columnsNumber=").append(columnsNumber);
        sb.append('}');
        return sb.toString();
    }
}
