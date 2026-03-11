class Badge {
    public String print(Integer id, String name, String department) {
        if(id == null && department == null) {
            String result = name + " - OWNER";
            return result;
        }
        else if(id == null) {
            String result = name + " - " + department.toUpperCase();
            return result;
        } 
        else if(department == null) {
            String result = "[" + id + "] - " + name + " - " + "OWNER";
            return result;
        }
        else {
            String result = "[" + id + "] - " + name + " - " + department.toUpperCase();
            return result;
        }
    }
}