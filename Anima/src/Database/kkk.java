//try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
//            stat = conn.createStatement();
//            String sql="select * from nilai where "+ "nim='" +input_nim1.getText() +"' && kode_mk= '"+ pilihmatkul.getSelectedItem().toString()+"'";
//            ResultSet R = stat.executeQuery(sql); 
//            if(input_nim1.getText().trim().isEmpty()){             
//                JOptionPane.showMessageDialog(null, "Inputan NIM kosong!", "Data Tidak Tersimpan",2);
//            }
//                else if(!input_nim1.getText().trim().isEmpty()){              
//            }
//            if(!input_nim1.getText().trim().isEmpty() && R.next()){
//                cari = R.getString(1);                
//                JOptionPane.showMessageDialog(null, "NIM : "+cari+"\nSudah terdapat didalam data. Harap input Data baru.","Duplikat",JOptionPane.WARNING_MESSAGE);
//            }
//        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
//            JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
//        }