package entity;

/**
 *
 * @author haris
 */
public class handphone {
    private String id;
    private String nama;
    private String merk;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String setMerk() {
        return merk;
    }
    
    public void setMerk_laptop(String merk) {
        this.merk = merk;
    }
    
    public handphone(String id, String nama, String merk) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
    }
    
    public boolean equals(Object object) {
        handphone temp = (handphone) object;
        return id.equals(temp.getId());
    }
}
