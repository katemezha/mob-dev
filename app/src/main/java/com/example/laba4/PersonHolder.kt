package com.example.laba4

import android.util.Log

typealias PersonListener = (person: Person?) -> Unit

object PersonHolder {

    val personsList = mutableListOf<Person>()
    private val myListener = mutableSetOf<PersonListener>()

    init {
        personsList.add(
            Person(
                R.drawable.napoleon,
                "Наполеон Бонапарт",
                "1769-1821",
                "Император французов в 1804-1814 и 1815 годах, полководец и государственный деятель, заложивший основы современного французского государства, один из наиболее выдающихся деятелей в истории Запада.",
                "МУЖЧИНА"))
        personsList.add(
            Person(
                R.drawable.ekaterina,
                "Екатерина Великая",
                "1729-1796",
                "Императрица и Самодержица Всероссийская. Политик просвещённого абсолютизма. Дочь князя Ангальт-Цербстского, Екатерина взошла на престол в результате дворцового переворота против своего мужа - Петра III, вскоре погибшего при невыясненных обстоятельствах.",
                "ЖЕНЩИНА"))
        personsList.add(
            Person(
                R.drawable.leonardo,
                "Леонардо да Винчи",
                "1452-1519",
                "Итальянский художник и учёный, изобретатель, писатель, музыкант, один из крупнейших представителей искусства Высокого Возрождения, яркий пример «универсального человека».",
                "МУЖЧИНА"))
        personsList.add(
            Person(
                R.drawable.edison,
                "Томас Алва Эдисон",
                "1847-1931",
                "Американский изобретатель и предприниматель, получивший в США 1093 патента и около 3 тысяч в других странах мира; создатель фонографа; усовершенствовал телеграф, телефон, киноаппаратуру, разработал один из первых коммерчески успешных вариантов электрической лампы накаливания.",
                "МУЖЧИНА"))
        personsList.add(
            Person(
                R.drawable.koko,
                "Коко Шанель",
                "1883-1971",
                "Французский модельер, основательница модного дома Chanel. Оказала существенное влияние на европейскую моду XX века; единственный человек из мира моды, кого журнал «Тайм» внёс в список ста самых влиятельных людей XX века.",
                "ЖЕНЩИНА"))
        personsList.add(
            Person(
                R.drawable.kennedy,
                "Джон Кеннеди",
                "1917-1963",
                "Американский политический, государственный и общественный деятель, 35-й президент США.",
                "МУЖЧИНА"))
        personsList.add(
            Person(
                R.drawable.merlin,
                "Мерлин Манро",
                "1926-1962",
                "Американская киноактриса, секс-символ 1950-х годов, певица и модель. Стала одним из наиболее культовых образов американского кинематографа и всей мировой культуры. ",
                "ЖЕНЩИНА"))
        personsList.add(
            Person(
                R.drawable.tesla,
                "Никола Тесла",
                "1856-1943",
                "Изобретатель в области электротехники и радиотехники сербского происхождения, учёный, инженер, физик.",
                "МУЖЧИНА"))
        personsList.add(
            Person(
                R.drawable.frida,
                "Фрида Кало",
                "1907-1954",
                "Мексиканская художница, наиболее известная автопортретами. Мексиканская культура и искусство народов доколумбовой Америки оказали заметное влияние на её творчество.",
                "ЖЕНЩИНА"))
        personsList.add(
            Person(
                R.drawable.einshtein,
                "Альберт Эйнштейн",
                "1879-1955",
                "Физик-теоретик, один из основателей современной теоретической физики, лауреат Нобелевской премии по физике 1921 года.",
                "МУЖЧИНА"))
    }
    fun getPersons(): MutableList<Person> {
        return personsList
    }

    fun addListener(listener: PersonListener) {
        myListener.add(listener)
    }

    fun sendMessage() {
        Log.i("my_tag", "Send")
        for (listener in myListener)
            listener.invoke(personsList.firstOrNull())
        if (personsList.count() > 0)
            personsList.removeAt(0)
    }
}