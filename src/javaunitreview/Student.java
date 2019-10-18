/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunitreview;

/**
 *
 * @author vira
 */
public class Student {

        private String fname;
        private String lname;
        private String indexNo;
        private String formattedName;

         public Student(String fname, String lname, String indexNo) {
            this.fname = fname;
            this.lname = lname;
            this.indexNo = indexNo;
        }

         public String getFormattedName(){

             return getLname() + ", " + getFname();

         }
        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getIndexNo() {
            return indexNo;
        }

        public void setIndexNo(String indexNo) {
            this.indexNo = indexNo;
        }

        public int getDigitCount(){
            return indexNo.length();
        }
        
     

    }