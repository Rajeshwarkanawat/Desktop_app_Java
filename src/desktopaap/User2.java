package desktopaap;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajeshwar kanawat
 */
class User2 {
        private int id,qty;
        private String item;
        
        public User2(int id,String item,int qty){
    
                this.id= id;
                this.item = item;
                this.qty=qty;
        }
        public int getid(){
            return id;
        }
        public String getitem(){
            return item;
        }
     
        public int getqty(){
            return qty;
        }
        
        
        
}