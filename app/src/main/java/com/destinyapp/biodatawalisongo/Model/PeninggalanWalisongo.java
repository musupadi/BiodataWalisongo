package com.destinyapp.biodatawalisongo.Model;

import com.destinyapp.biodatawalisongo.R;

import java.util.ArrayList;

public class PeninggalanWalisongo {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.masjidmenarakudus),
                    "Masjid Menara Kudus",
                    "Masjid Menara Kudus adalah masjid yang dibangun oleh Sunan Kudus pada tahun 956 Hijriah atau 1549 Masehi. Diketahui bangunan masjid ini dibangun menggunakan batu yang berasal dari Baitul Maqdis Palestina yang menjadi batu pertama pembangunan masjid ini. Keunikan dari masjid Menara Kudus ini adalah arsitekturnya bergaya Hindu yang bertujuan menghormati masyarakat sekitar yang kala itu banyak yang memeluk agama Hindu."
            },
            {String.valueOf(R.drawable.masjidagungdemak),
                    "Masjid Agung Demak",
                    "Masjid Agung Demak merupakan masjid yang dibangun oleh Raden Patah atau raja pertama Demak pada abad ke-15. Masjid yang berlokasi di Demak Jawa Tengah ini dahulu dijadikan sebagai tempat berkumpulnya para wali untuk membahas penyebaran Islam di sekitar wilayah Demak. Bahkan bangunan masjid ini juga mempunyai 4 tiang yang terbuat dari serpihan kayu."

            },
            {String.valueOf(R.drawable.masjidagungbanten),
                    "Masjid Agung Banten",
                    "Masjid Agung Banten didirikan oleh Sultan Maulana Hasanuddin yang tak lain adalah putra Sunan Gunung Jati. Masjid ini juga memiliki keunikan adanya sebuah kubah bertumpuk 5 yang menyerupai pagoda Cina. Ternyata arsitek masjid tersebut merupakan orang Cina yang bernama Tjek Ban Djut. Selain itu menara masjid ini memiliki tinggi sekitar 24 meter dan diameter bawahnya 10 meter."
            },
            {String.valueOf(R.drawable.masjidsangciptarasa),
                    "Masjid Sang Cipta Rasa di Cirebon",
                    "Masjid ini dibangun oleh Sunan Gunung Jati di tahun 1478 Masehi. Masjid yang berada di Cirebon ini memiliki keunikan yaitu adzan yang dikumandangkan oleh 7 orang secara bersamaan yang bisa menjadi simbol kekuatan umat Islam."
            },
            {String.valueOf(R.drawable.masjidsendangduwur),
                    "Masjid Sendang Duwur",
                    "Konon masjid ini dipercaya merupakan masjid yang di boyong dari Jepara menuju bukit Amitunon di Lamongan oleh Sunan Sendang Duwur atau Raden Noer Rahmad dalam waktu satu malam. Hingga saat ini masjid Sendang Duwur masih berdiri kokoh dan bisa menjadi destinasi wisata religi."
            }
    };

    public static ArrayList<DataModel> getListData(){
        DataModel dm= null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            dm = new DataModel();
            dm.setGambar(aData[0]);
            dm.setNama_walisongo(aData[1]);
            dm.setDeskripsi_walisongo(aData[2]);
            list.add(dm);
        }
        return list;
    }

}
