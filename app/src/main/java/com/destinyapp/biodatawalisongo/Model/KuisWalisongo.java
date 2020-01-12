package com.destinyapp.biodatawalisongo.Model;

import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class KuisWalisongo {
    public static String[][] data = new String[][]{
            {"1",
                    "",
                    "Maulana Malik Ibrahim atau Sunan Gresik dikenal juga dengan nama Maulana Magribi ( Syeh Magribi ) yang berasal dari magribi yang berada di negara :",
                    "D",
                    "Palestina",
                    "Afrika Selatan",
                    "Irak",
                    "Afrika Utara"
            },
            {"2",
                    "",
                    "Sunan Giri mendidik anak – anak melalui permainan yang bernafaskan keagamaan. Dibawah ini yang tidak termasuk ciptaan Sunan Giri adalah :",
                    "A",
                    "Tembang sinom",
                    "Ilir – ilir",
                    "Jelungan",
                    "Cublak – cublak suweng"
            },
            {"3",
                    "",
                    "Sunan Kalijaga adalah seorang bangsawan, yakni putra bupati :",
                    "C",
                    "Mataram",
                    "Pajang",
                    "Tuban",
                    "Demak"
            },
            {"4",
                    "",
                    "Berasal dari suku manakah Sunan Kalijaga :",
                    "Suku Jawa",
                    "Suku Sunda",
                    "Suku Jawa",
                    "Suku Betawi",
                    "Suku Asmat"
            },
            {"5",
                    "",
                    "Dimanakah Sunan Giri ditugaskan menyiarkan agama islam oleh Sunan Ampel :",
                    "A",
                    "Blambangan",
                    "Bekasi",
                    "Jakarta",
                    "Aceh"
            },
            {"6",
                    "",
                    "Siapakah yang menciptakan aneka cerita wayang yang bernafaskan islam :",
                    "D",
                    "Sunan Ampel",
                    "Sunan Bonang",
                    "Sunan Muria",
                    "Sunan Kalijaga"
            },
            {"7",
                    "",
                    "Sunan Giri adalah putra dari :",
                    "B",
                    "Maulana Magribi",
                    "Maulana Ishak",
                    "Maulana Qosim",
                    "Maulana Malik"
            },
            {"8",
                    "",
                    "strategi dakwahnya, Sunan Drajat menciptakan tembang sebagai salah satu medianya. Tembang yang dimaksud adalah :",
                    "C",
                    "Kinanti",
                    "Dunma",
                    "Pangkur",
                    "Dandang Gula"
            },
            {"9",
                    "",
                    "Sunan Ampel wafat pada tahun 1948 dan dimakamkan di : ",
                    "D",
                    "Masjid Agung Demak",
                    "Jepara",
                    "Tuban",
                    "Masjid Ampel, Surabaya"
            },
            {"10",
                    "",
                    "Siapa pendiri dinasti kesultanan Banten:",
                    "Jawaban",
                    "A",
                    "B",
                    "C",
                    "D"
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
