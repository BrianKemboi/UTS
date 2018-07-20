package timetable.generator;

import timetable.table.TableCell;
import timetable.table.TableChart;

import java.util.ArrayList;

/**
 * The Generator of the timetable*/
public class Generator {
    static TableChart tableChart;
    TableCell tableCell;

    Room room;
    Unit unit;

    ArrayList<Room> roomsList;
    ArrayList<Unit> unitsList;

    Generator (TableChart tableChart){
        this.tableChart = tableChart;
    }




    public TableChart getTableChart() {
        return tableChart;
    }

    public void setTableChart(TableChart tableChart) {
        this.tableChart = tableChart;
    }

    public TableCell getTableCell() {
        return tableCell;
    }

    public void setTableCell(TableCell tableCell) {
        this.tableCell = tableCell;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void generate(){

    };
}
