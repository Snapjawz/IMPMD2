package com.example.konin.impmd2.Models;

import com.example.konin.impmd2.R;

import java.util.ArrayList;
import java.util.List;

public class Vakken {

        String naam;
        String moduleLeider;
        String richting;
        int id;
        int EC;
        int periode;
        int plekken;

        Vakken(String naam, String moduleLeider, String richting, int id, int EC, int periode, int plekken){
            this.naam = naam;
            this.moduleLeider= moduleLeider;
            this.richting = richting;
            this.id = id;
            this.EC = EC;
            this.periode = periode;
            this.plekken = plekken;
        }

    private List<Vakken> vakken;
        private void initializeData(){
                vakken = new ArrayList<>();
                vakken.add(new Vakken("IKEMA", "Piet", "IMTD",1,3,4, 20));
                vakken.add(new Vakken("IMTPMD", "Henk", "test",3,2,1,40));
                vakken.add(new Vakken("Henk", "Klaas", "hoi",4,1,2,100));
            }
;


        public String getNaam() {
            return naam;
        }

        public String getModuleLeider() {
            return moduleLeider;
        }

        public String getRichting() {
            return richting;
        }

        public int getId() {
            return id;
        }

        public int getEC() {
            return EC;
        }

        public int getPeriode() {
            return periode;
        }

        public int getPlekken() {
            return plekken;
        }




}
