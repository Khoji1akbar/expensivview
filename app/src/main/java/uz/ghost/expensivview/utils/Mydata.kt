package uz.ghost.expensivview.utils

object Mydata {


    val map = HashMap<String, ArrayList<String>>()
    val titleList = ArrayList<String>()
    fun addElement(){
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("Compputer Acsesuar")
        titleList.add("Home Entertainment")
        titleList.add("TVs by brand")
        titleList.add("Kitchen Apliances")

        val listMobiles= ArrayList<String>()
        listMobiles.add("Mi")
        listMobiles.add("Samsung")
        listMobiles.add("Iphone")
        listMobiles.add("Huwaie")
        listMobiles.add("Oppo")

        val listLaptops = ArrayList<String>()
        listLaptops.add("Noutbuk")
        listLaptops.add("planshet")
        listLaptops.add("Makbook")
        listLaptops.add("CNET")
        listLaptops.add("New Atlas")

        val listComputer = ArrayList<String>()
        listComputer.add("Fleshka")
        listComputer.add("Mishka")
        listComputer.add("Printer")
        listComputer.add("Klaviyatura")
        listComputer.add("Kuler")

        val listHome = ArrayList<String>()
        listHome.add("Universal")
        listHome.add("DreamWork")
        listHome.add("CBS")
        listHome.add("SONY")
        listHome.add("WARNER  BROS")

        val listTVS = ArrayList<String>()
        listTVS.add("Netflix")
        listTVS.add("Sunny")
        listTVS.add("Web OS")
        listTVS.add("Youtube")
        listTVS.add("Konka")

        val listkitchen = ArrayList<String>()
        listkitchen.add("Qoshiq")
        listkitchen.add("Sanchqi")
        listkitchen.add("Pichoq")
        listkitchen.add("Piyola")
        listkitchen.add("Chini")

        map[titleList[0]] = listMobiles
        map[titleList[1]] = listLaptops
        map[titleList[2]] = listComputer
        map[titleList[3]] = listHome
        map[titleList[4]] = listTVS
        map[titleList[5]] = listkitchen


    }
}