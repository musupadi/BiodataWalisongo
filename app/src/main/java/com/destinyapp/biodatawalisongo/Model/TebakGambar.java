package com.destinyapp.biodatawalisongo.Model;

import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class TebakGambar {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.sunanampel),
                    "",
                    "A",
                    "Sunan Ampel",
                    "Sunan Drajat",
                    "Sunan Giri",
                    "Sunan Bonang"
            },
            {"2",
                    String.valueOf(R.drawable.sunangiri),
                    "",
                    "B",
                    "Sunan Ampel",
                    "Sunan Giri",
                    "Sunan Muria",
                    "Sunan Bonang"
            },
            {"3",
                    String.valueOf(R.drawable.sunankalijaga),
                    "",
                    "D",
                    "Sunan Ampel",
                    "Sunan Giri",
                    "Sunan Muria",
                    "Sunan Kalijaga"
            },
            {"4",
                    String.valueOf(R.drawable.sunangunungjati),
                    "",
                    "A",
                    "Sunan Gunung Jati",
                    "Sunan Giri",
                    "Sunan Muria",
                    "Sunan Kalijaga"
            },
            {"5",
                    String.valueOf(R.drawable.sunangresik),
                    "",
                    "B",
                    "Sunan Gunung Jati",
                    "Sunan Gresik",
                    "Sunan Muria",
                    "Sunan Kalijaga"
            },

    };

    public static ArrayList<DataModel> getListData(){
        DataModel dm= null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            dm = new DataModel();
            dm.setNo(aData[0]);
            dm.setGambar(aData[1]);
            dm.setSoal(aData[2]);
            dm.setJawaban(aData[3]);
            dm.setA(aData[4]);
            dm.setB(aData[5]);
            dm.setC(aData[6]);
            dm.setD(aData[7]);
            list.add(dm);
        }
        return list;
    }
}
