package com.andi.hewanmamalia

object AnimalData {

    private val animalName= arrayOf(
         "Sapi",
        "Kambing",
        "Kelinci",
        "Kucing",
        "Tikus",
        "Gajah",
        "Lumba-Lumba",
        "Kerbau",
        "Singa",
        "Kelelawar"
    )

    private val animalDetail=arrayOf(
        "Sapi atau Lembu adalah hewan ternak anggota famili Bovidae dan subfamili Bovinae. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia.",
        "Kambing merupakan anggota dari keluarga Bovidae dan bersaudara dengan biri-biri karena keduanya tergolong dalam sub famili Caprinae. Terdapat lebih 300 jenis kambing yang berbeda-beda. Kambing adalah salah satu di antara spesies yang paling lama diternakkan, yaitu untuk susu, daging, bulu, dan kulit di seluruh dunia.",
        "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembang biak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa.",
        "Kucing adalah jenis hewan mamalia karnivora yang berasal dari keluarga Felidae. Habitat kucing adalah di darat yang biasanya berbaur dengan manusia sebagai peliharaan dan ada juga yang hidup liar. Istilah kucing ini biasanya tertuju pada hewan kucing kecil yang telah jinak dan dipelihara manusia tetapi sebenarnya istilah kucing juga bisa merujuk kepada kucing besar seperti singa dan harimau.",
        "Tikus adalah salah satu famili hewan pengerat dari ordo Rodentia. Spesies tikus yang paling dikenal adalah mencit . serta tikus got  yang ditemukan hampir di semua negara dan merupakan suatu organisme model yang penting dalam biologi juga merupakan hewan peliharaan yang populer.",
        "Gajah merupakan hewan herbivora yang dapat ditemui di berbagai habitat, seperti sabana, hutan, gurun, dan rawa-rawa. Mereka cenderung berada di dekat air. Gajah dianggap sebagai spesies kunci karena dampaknya terhadap lingkungan. Hewan-hewan lain cenderung menjaga jarak dari gajah, dan predator-predator seperti singa, harimau. hyena, dan anjing liar biasanya hanya menyerang gajah muda.",
        "Lumba-lumba adalah mamalia laut yang sangat cerdas, selain itu sistem alamiah yang melengkapi tubuhnya sangat kompleks. Sehingga banyak teknologi yang terinspirasi dari lumba-lumba. Salah satu contoh adalah kulit lumba-lumba yang mampu memperkecil gesekan dengan air, sehingga lumba-lumba dapat berenang dengan sedikit hambatan air. Hal ini yang digunakan para perenang untuk merancang baju renang yang mirip kulit lumba-lumba.",
        "Kerbau, atau biasa disebut kerbau air (untuk membedakannya dengan kerbau afrika), adalah binatang memamah biak yang menjadi ternak bagi banyak bangsa di dunia, terutama Asia. Hewan ini adalah domestikasi dari kerbau liar (orang India menyebutnya arni) yang masih dapat ditemukan di daerah-daerah Pakistan, India, Bangladesh, Nepal, Bhutan, Vietnam, China, Filipina, Taiwan, Indonesia, dan Thailand.",
        "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa berada di benua Afrika dan sebagian di wilayah India. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan & banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.",
        "Kelelawar adalah satu-satunya mamalia yang dapat terbang, dan berasal dari ordo Chiroptera dengan kedua kaki depan yang berkembang menjadi sayap."
    )
    private val animalImages=intArrayOf(
        R.drawable.sapi,
        R.drawable.kambing,
        R.drawable.kelinci,
        R.drawable.kucing,
        R.drawable.tikus,
        R.drawable.gajah,
        R.drawable.lumba,
        R.drawable.kerbau,
        R.drawable.singa,
        R.drawable.kelelawar
    )

    val listData:ArrayList<Animal>
        get() {
            val list= arrayListOf<Animal>()
            for (position in animalName.indices){
                val animal = Animal()
                animal.name= animalName[position]
                animal.detail= animalDetail[position]
                animal.photo= animalImages[position]
                list.add(animal)
            }
            return list
        }
}