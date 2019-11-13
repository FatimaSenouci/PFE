
package model;


public class VolSetter {
     private String  lblDate3;
     private String  lblFN;
     private String  lblPN;
     private String  lblTid;
     private String  lblHangar;
     private String  lblControl;

    public String getLblDate3() {
        return lblDate3;
    }

    public void setLblDate3(String lblDate3) {
        this.lblDate3 = lblDate3;
    }

    public String getLblFN() {
        return lblFN;
    }

    public void setLblFN(String lblFN) {
        this.lblFN = lblFN;
    }

    public String getLblPN() {
        return lblPN;
    }

    public void setLblPN(String lblPN) {
        this.lblPN = lblPN;
    }

    public String getLblTid() {
        return lblTid;
    }

    public void setLblTid(String lblTid) {
        this.lblTid = lblTid;
    }

    public String getLblHangar() {
        return lblHangar;
    }

    public void setLblHangar(String lblHangar) {
        this.lblHangar = lblHangar;
    }

    public String getLblControl() {
        return lblControl;
    }

    public void setLblControl(String lblControl) {
        this.lblControl = lblControl;
    }

    public VolSetter(String lblDate3, String lblFN, String lblPN, String lblTid, String lblHangar, String lblControl) {
        
        
        super();
        this.lblDate3 = lblDate3;
        this.lblFN = lblFN;
        this.lblPN = lblPN;
        this.lblTid = lblTid;
        this.lblHangar = lblHangar;
        this.lblControl = lblControl;
    }
    
    
    public VolSetter(){
        
    }
    
    
}
