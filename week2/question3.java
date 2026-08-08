class InventoryParser {

    void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } 
        else {
            System.out.println("Product: " + fields[0]
                    + " | SKU: " + fields[1]
                    + " | Qty: " + fields[2]);
        }
    }}


    class question3{
        public static void main(String[] args) {

        InventoryParser obj = new InventoryParser();

        obj.parseInventoryRecord("Wireless Mouse,WM-2201,150");

        obj.parseInventoryRecord("Wireless Mouse,150");
    }
}