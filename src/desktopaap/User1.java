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
class User1 {
        private int id,qty,saleprice,total;
        private String item,cnm,city;
        
        public User1(int id,String item,String cnm, String city, int qty, int saleprice, int total){
    
                this.id= id;
                this.item = item;
                this.cnm= cnm;
                this.city=city;
                this.qty=qty;
                this.saleprice=saleprice;
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
        public int getsaleprice(){
            return saleprice;
        }
        public int gettotal(){
            return total;
        }
        
}