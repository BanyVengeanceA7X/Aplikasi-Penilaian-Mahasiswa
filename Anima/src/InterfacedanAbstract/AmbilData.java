package InterfacedanAbstract;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class AmbilData implements TemplateData {
    protected String sql;
    private final Connection Koneksi=new Koneksi().getKoneksi();
    private ResultSet  rs;
    private Statement st;

    @Override
    public void Pesan(String text){
        JOptionPane.showMessageDialog(null, text);
    }
    
    public abstract boolean validasiData();
    
    @Override
    public int getDaftar(){
       setSQL();
        try {
            st = Koneksi.createStatement();
            st.executeUpdate(sql);
            return 0;
        } catch (SQLException ex) {

            
                Pesan(
                   "Gagal Mendaftar \n"+
                            ex.getMessage());   
            
        
        }
        return -1;
   }
   public abstract  void setSQL();
}

