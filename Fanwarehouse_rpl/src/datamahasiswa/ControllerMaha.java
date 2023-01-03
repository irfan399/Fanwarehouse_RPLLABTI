package datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

class ControllerMaha {
    ArrayList<ModelMaha> ArrayData;
    DefaultTableModel tabelModel;
    
    public ControllerMaha() {
        ArrayData = new ArrayList<ModelMaha>();
    }
    
    public void InsertData(String npm, String nama, String kelas, boolean jeniskel) {
        ModelMaha mhs = new ModelMaha(npm,nama,kelas,jeniskel);
        ArrayData.add(mhs);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"NPM", "NAMA", "KELAS", "JENIS KELAMIN"};
        Object [][] objData = new Object [ArrayData.size()][4];
        int i = 0;
        
        for(ModelMaha n : ArrayData){
            String[] arrData = {n.getNpm(), n.getNama(), n.getKelas(),(n.isJeniskel())?"Barang Masuk" : "Barang Keluar"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        return tabelModel;
        }
    }