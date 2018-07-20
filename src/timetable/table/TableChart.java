package timetable.table;

import java.util.ArrayList;

public class TableChart {
    ArrayList<TableCell> tableCells;
    int size;

    TableChart(ArrayList<TableCell> tableCells, int size){
        this.tableCells = tableCells;
        this.size = size;

    }

    public ArrayList<TableCell> getTableCells() {
        return tableCells;
    }

    public void setTableCells(ArrayList<TableCell> tableCells) {
        this.tableCells = tableCells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


