package Quitation;

public class EmployeeDataTable {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String user;
    private String pass;
    public EmployeeDataTable(int id,String name,String address,String mobile,String user,String pass){
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.user = user;
        this.pass = pass;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public String getmobile(){
        return mobile;
    }
    public String getuser(){
        return user;
    }
    public String getpass(){
        return pass;
    }
}
