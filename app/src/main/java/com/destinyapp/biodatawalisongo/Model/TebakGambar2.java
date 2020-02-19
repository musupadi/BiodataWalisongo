package com.destinyapp.biodatawalisongo.Model;

import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class TebakGambar2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.sunanampel),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "A",
                    "A. Sunan Ampel",
                    String.valueOf(R.raw.aampel),
                    "B. Sunan Giri",
                    String.valueOf(R.raw.bsunangiri),
                    "C. Sunan Drajat",
                    String.valueOf(R.raw.csunandrajat),
                    "D. Sunan Bonang",
                    String.valueOf(R.raw.dsunanbonang),
            },
            {"2",
                    String.valueOf(R.drawable.sunangiri),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "C",
                    "A. Sunan Ampel",
                    String.valueOf(R.raw.aampel),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Sunan Giri",
                    String.valueOf(R.raw.csunangiri),
                    "D. Sunan Bonang",
                    String.valueOf(R.raw.dsunanbonang),
            },
            {"3",
                    String.valueOf(R.drawable.sunankalijaga),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "D",
                    "A. Sunan Ampel",
                    String.valueOf(R.raw.aampel),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bsunanmuria),
                    "C. Sunan Giri",
                    String.valueOf(R.raw.csunangiri),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dsunankalijaga),
            },
            {"4",
                    String.valueOf(R.drawable.sunangresik),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "C",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Sunan Gresik",
                    String.valueOf(R.raw.csunangresik),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dkalijaga),
            },
            {"5",

                    String.valueOf(R.drawable.sunangunungjati),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "A",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Giri",
                    String.valueOf(R.raw.bsunangiri),
                    "C. Sunan Giri",
                    String.valueOf(R.raw.csunangiri),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dkalijaga),
            },
            {"6",
                    String.valueOf(R.drawable.sunanbonang),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "D",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Sunan Gresik",
                    String.valueOf(R.raw.csunangresik),
                    "D. Sunan Bonang",
                    String.valueOf(R.raw.dsunanbonang),
            },
            {"7",
                    String.valueOf(R.drawable.sunanampel),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "A",
                    "A. Sunan Ampel",
                    String.valueOf(R.raw.aampel),
                    "B. Sunan Giri",
                    String.valueOf(R.raw.bsunangiri),
                    "C. Sunan Drajat",
                    String.valueOf(R.raw.csunandrajat),
                    "D. Sunan Bonang",
                    String.valueOf(R.raw.dsunanbonang),
            },
            {"8",
                    String.valueOf(R.drawable.sunandrajat),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "C",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Sunan Drajat",
                    String.valueOf(R.raw.csunandrajat),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dkalijaga),
            },
            {"9",
                    String.valueOf(R.drawable.masjidagungdemak2),
                    "",
                    String.valueOf(R.raw.peninggalanapakah),
                    "C",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Majsid Agung Demak",
                    String.valueOf(R.raw.cmasjiddemak),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dkalijaga)
            },
            {"10",
                    String.valueOf(R.drawable.sunandrajat),
                    "",
                    String.valueOf(R.raw.siapakahdia),
                    "C",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bmuria),
                    "C. Sunan Drajat",
                    String.valueOf(R.raw.csunandrajat),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dkalijaga),


            }
    };

    public static ArrayList<DataModel> getListData(){
        DataModel dm= null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            dm = new DataModel();
            dm.setNo(aData[0]);
            dm.setGambar(aData[1]);
            dm.setSoal(aData[2]);
            dm.setSuaraSoal(aData[3]);
            dm.setJawaban(aData[4]);
            dm.setA(aData[5]);
            dm.setSuaraSoalA(aData[6]);
            dm.setB(aData[7]);
            dm.setSuaraSoalB(aData[8]);
            dm.setC(aData[9]);
            dm.setSuaraSoalC(aData[10]);
            dm.setD(aData[11]);
            dm.setSuaraSoalD(aData[12]);
            list.add(dm);
        }
        return list;
    }
}
