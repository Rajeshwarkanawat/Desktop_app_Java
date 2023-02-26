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
class User {
        private int id,qty,purprice,total;
        private String item,cnm,city;
        
        public User(int id,String item,String cnm, String city, int qty, int purprice, int total){
    
                this.id= id;
                this.item = item;
                this.cnm= cnm;
                this.city=city;
                this.qty=qty;
                this.purprice=purprice;
                this.total=total;
        }
        public int getid(){
            return id;
        }
        public String getitem(){
            return item;
        }
        public String getcnm(){
            return cnm;
        }
        public String getcity(){
            return city;
        }
        public int getqty(){
            return qty;
        }
        public int getpurprice(){
            return purprice;
        }
        public int gettotal(){
            return total;
        }
        
}