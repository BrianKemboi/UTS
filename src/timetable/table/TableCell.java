package timetable.table;

import javafx.scene.control.Cell;

public class TableCell {
    CellItem cellItem;

    TableCell(CellItem cellItem){
        this.cellItem = cellItem;
    }

    public CellItem getCellItem() {
        return cellItem;
    }

    public void setCellItem(CellItem cellItem) {
        this.cellItem = cellItem;
    }

    class CellItem{
        String unitCode;
        String roomName;

        CellItem (String unitCode, String roomName){
            this.unitCode = unitCode;
            this.roomName = roomName;
        }

        public String getUnitCode() {
            return unitCode;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setUnitCode(String unitCode) {
            this.unitCode = unitCode;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }
    }
}
