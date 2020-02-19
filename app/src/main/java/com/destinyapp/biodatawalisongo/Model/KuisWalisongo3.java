package com.destinyapp.biodatawalisongo.Model;

import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class KuisWalisongo3 {
    public static String[][] data = new String[][]{
            {"1",
                    "",
                    "strategi dakwahnya, Sunan Drajat menciptakan tembang sebagai salah satu medianya. Tembang yang dimaksud adalah :",
                    String.valueOf(R.raw.soal8),
                    "B",
                    "A. Kinanti",
                    String.valueOf(R.raw.akinanti),
                    "B. Pangkur",
                    String.valueOf(R.raw.bpangkur),
                    "C. Dunma",
                    String.valueOf(R.raw.cdurma),
                    "D. Dandang Gula",
                    String.valueOf(R.raw.dgula),
            },
            {"2",
                    "",
                    "Maulana Malik Ibrahim atau Sunan Gresik dikenal juga dengan nama Maulana Magribi ( Syeh Magribi ) yang berasal dari magribi yang berada di negara :",
                    String.valueOf(R.raw.soal1),
                    "D",
                    "A. Palestina",
                    String.valueOf(R.raw.apalestina),
                    "B. Irak",
                    String.valueOf(R.raw.birak),
                    "C. Afrika Selatan",
                    String.valueOf(R.raw.cafrikaselatan),
                    "D. Afrika Utara",
                    String.valueOf(R.raw.dafrikautara),
            },
            {"3",
                    "",
                    "Berasal dari suku manakah Sunan Kalijaga :",
                    String.valueOf(R.raw.soal4),
                    "C",
                    "A. Suku Sunda",
                    String.valueOf(R.raw.asunda),
                    "B. Suku Betawi",
                    String.valueOf(R.raw.bbetawi),
                    "C. Suku Jawa",
                    String.valueOf(R.raw.cjawa),
                    "D. Suku Asmat",
                    String.valueOf(R.raw.dasmat),
            },
            {"4",
                    "",
                    "Sunan Kalijaga adalah seorang bangsawan, yakni putra bupati :",
                    String.valueOf(R.raw.soal3),
                    "B",
                    "A. Mataram",
                    String.valueOf(R.raw.amataram),
                    "B. Tuban",
                    String.valueOf(R.raw.btuban),
                    "C. Pajang",
                    String.valueOf(R.raw.cpajang),
                    "D. Demak",
                    String.valueOf(R.raw.ddemak),
            },
            {"5",
                    "",
                    "Dimanakah Sunan Giri ditugaskan menyiarkan agama islam oleh Sunan Ampel :",
                    String.valueOf(R.raw.soal5),
                    "A",
                    "A. Blambangan",
                    String.valueOf(R.raw.ablambangan),
                    "B. Jakarta",
                    String.valueOf(R.raw.bjakarta),
                    "C. Bekasi",
                    String.valueOf(R.raw.cbekasi),
                    "D. Aceh",
                    String.valueOf(R.raw.daceh),
            },
            {"6",
                    "",
                    "Siapakah yang menciptakan aneka cerita wayang yang bernafaskan islam :",
                    String.valueOf(R.raw.soal6),
                    "D",
                    "A. Sunan Ampel",
                    String.valueOf(R.raw.aampel),
                    "B. Sunan Muria",
                    String.valueOf(R.raw.bsunanmuria),
                    "C. Sunan Bonang",
                    String.valueOf(R.raw.cbonang),
                    "D. Sunan Kalijaga",
                    String.valueOf(R.raw.dsunankalijaga),
            },
            {"7",
                    "",
                    "Sunan Giri adalah putra dari :",
                    String.valueOf(R.raw.soal7),
                    "C",
                    "A. Maulana Magribi",
                    String.valueOf(R.raw.amagribi),
                    "B. Maulana Qosim",
                    String.valueOf(R.raw.bqosim),
                    "C. Maulana Ishaq",
                    String.valueOf(R.raw.cishaq),
                    "D. Maulana Malik",
                    String.valueOf(R.raw.dmalik),
            },
            {"8",

                    "",
                    "Sunan Giri mendidik anak – anak melalui permainan yang bernafaskan keagamaan. Dibawah ini yang tidak termasuk ciptaan Sunan Giri adalah :",
                    String.valueOf(R.raw.soal2),
                    "A",
                    "A. Tembang Sinom",
                    String.valueOf(R.raw.atembangsinom),
                    "B. Jelungan",
                    String.valueOf(R.raw.bjelubgan),
                    "C. Ilir – ilir",
                    String.valueOf(R.raw.cilirilir),
                    "D. Cublak – Cublak suweng",
                    String.valueOf(R.raw.dcublakcublak),
            },
            {"9",
                    "",
                    "Sunan Ampel wafat pada tahun 1948 dan dimakamkan di : ",
                    String.valueOf(R.raw.soal9),
                    "D",
                    "A. Masjid Agung Demak",
                    String.valueOf(R.raw.ademak),
                    "B. Tuban",
                    String.valueOf(R.raw.btuban),
                    "C. Jepara",
                    String.valueOf(R.raw.cjepara),
                    "D. Masjid Ampel Surabaya",
                    String.valueOf(R.raw.amasjidampel),
            },
            {"10",
                    "",
                    "Siapa pendiri dinasti kesultanan Banten:",
                    String.valueOf(R.raw.soal10),
                    "A",
                    "A. Sunan Gunung Jati",
                    String.valueOf(R.raw.asunangunungjati),
                    "B. Sunan Ampel",
                    String.valueOf(R.raw.bampel),
                    "C. Sunan Gresik",
                    String.valueOf(R.raw.csunangresik),
                    "D. Sunan Muria",
                    String.valueOf(R.raw.dsunanmuria),
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
