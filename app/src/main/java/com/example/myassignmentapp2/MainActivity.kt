package com.example.myassignmentapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.TextView.BufferType
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.result)
        val textEntered = findViewById<EditText>(R.id.textEntered)
        val check_name_button = findViewById<Button>(R.id.check_name_button)
        val clearButton = findViewById<Button>(R.id.clearButton)
        clearButton.setOnClickListener{textEntered.text.clear()}






        check_name_button.setOnClickListener{
            val textEntered= textEntered.text.toString()


             if (textEntered == "20"){
                result.text = "Heath Legder(died 22 Jan 2008) was an Australian actor known from his most famous role as TheJoker."
            }
            else if (textEntered == "21" ){
                result.text = "JuiceWrld(died Dec 8 2019)was an American Rapper."
            }
            else if (textEntered =="22"){
                result.text = "Aaliyah(died Aug 25 2001) was an amrican R&B singer."
            }
            else if (textEntered == "23"){
                result.text = "Bhagat Singh (died Mar 23,1931) was a Civl Rights leader."
            }
            else if (textEntered == "24"){
                result.text = "Notorious B.I.G(died Mar 9,1997) was a famous rapper from Brooklyn,NY."
            }
            else if (textEntered == "25" ){
                result.text = "Tupac Shakur(died Sep 13,1996) was a famous rapper from  City."
            }
            else if (textEntered == "26" ){
                result.text = "Mac Miller(died Sep 7,2018) was a famous rapper from Pittsburgh."
            }
            else if (textEntered == "27" ){
                result.text = "Amy Winehouse(Jul 23,2011) was a famous soul singer from London."
            }
            else if (textEntered =="28" ){
                result.text = "Avici(died Apr 20,2018) was a famous DJ fro Stockholm Sweden."
            }
            else if (textEntered == "29" ){
                result.text = "Percy Bysshe Shelley(died Jul 8, 1822)was a poet from England born in the late 1790s."
            } else if (textEntered == "30" ){
                result.text = "Eazy-E (Died Mar 26,1995) was a rapper from Compton Cal."
            }
            else if (textEntered == "31" ){
                result.text = "Minnie Riperton(Died Jul 12,1979)was a soul singer from Chicago."
            }
            else if (textEntered == "32" ){
                result.text = "Bruce Lee(died Jul 20,1973) was a master of martial arts and a movie Actor."
            }
            else if (textEntered == "33" ){
                result.text = "Nipsey Hustle(died Mar 31,2019) was a rapper from Los Angeles."
            }
            else if (textEntered == "34"){
                result.text = "Yokozuna(died Oct 23,2000) was a famous Wrestler from San Francisco."
            }
            else if (textEntered == "35"){
                result.text = "Wolfgang Amadeus Mozart(died Dec 5,1791) as a Composer from Salzburg,Austria."
            }
            else if (textEntered == "36"){
                result.text = "Bray Wyatt(died Aug 24,2023) was a wreslter from Brooksville."
            }
            else if (textEntered == "37" ){
                result.text = "Raphael(died Apr 6,1520) was a famous Italian painter."
            }
            else if (textEntered == "38"){
                result.text = "John F.Kennedy Jr(died Jul 16,1999)was former prsidents JFK's son and also an Entrepeneur."
            }
            else if (textEntered == "39" ){
                result.text = "Malcom X(died feb 21,1965) and Martin Luther King JR.(died Apr 4,1968) were both Civil rights leaders."
            }
            else if (textEntered == "40" ){
                result.text = "Paul Walker(died Nov 30,2013) was a famous movie actor."
            }
            else if (textEntered == "41" ){
                result.text = "Kobe Bryant(died Jan 26,2020)was a famous Basketball."
            }
            else if (textEntered == "42"){
                result.text = "Elvis Presley(died Aug 16,1977) was a famous Rock singer from Tupelo,Mississipi"
            }
            else if (textEntered == "43" ){
                result.text = "Chadwick Boseman(died Aug 28,2020) as a famous movie known mostly for his role as Black Panther."
            }
            else if (textEntered == "44" ){
                result.text = "F.Scott Fitzgerald(died Dec 21,1940)was a famous Novelist from Minnesota."
            }
            else if (textEntered == "45"){
                result.text = "Freddie Mercury(died Nov 24,1991) was a famous rock Singer from Zanzibar City ,Tanzania."
            }
            else if (textEntered == "46" ){
                result.text = "John F.Kennedy(died Nov 22,1963) was a US President that was assasinated."
            }
            else if (textEntered =="47" ){
                result.text = "Grigori Rasputin(died Dec 30,1916) was a famous Religious Leader from Pokrovskoye,Russia."
            }
            else if (textEntered == "48"){
                result.text = "Charkes I of England(died Jan 30,1649) was the King of England."
            }
            else if (textEntered ==  "49" ){
                result.text = "Verne Troyer( died Apr 21,2018) was a famous movie actor."
            }
            else if (textEntered == "50" ){
                result.text = "Michael Jackson(died June 25,2009)was a the KingOfPop and the most successful singer in American History."
            }
            else if (textEntered == "51"){
                result.text = "Napolean Bonaparte(died May 5,1821)was a famous Emperor born in Ajaccio, France."
            }
            else if (textEntered == "52" ){
                result.text = "Bob Ross(died Jul 4,1995) was a famous Painter that brought life to his paintings."
            }
            else if (textEntered == "53"){
                result.text = "George Michael(died Dec 25,2016)was a famous Pop Singer."
            }
            else if (textEntered =="54" ){
                result.text = "Charles II of England (died Feb 6,1685)was the King of England."
            }
            else if (textEntered == "55"){
                result.text = "Ken Block(died jan 2023) was a Race Car  Driver(arguibly the best) born in Long Beach Cal."
            }
            else if (textEntered == "56"){
                result.text = "Abraham Lincon(died Apr 15,1865) was the US President who helped abolish slavery andled the country through the horrific Civil war."
            }
            else if (textEntered == "57"){
                result.text = "Prince(died Apr 21,2016) was an amrican Pop Singer."
            }
            else if (textEntered == "58"){
                result.text = "Barry White(died Jul 4,2003)was an american R&B Singer from Galveston Texas."
            }
            else if (textEntered == "59" ){
                result.text = "Teddy Pendergrass(died Jan13,2010) as a famous R&B singer with 5 grammy nominations."
            }
            else if (textEntered =="60" ){
                result.text = "Diego Maradona(Died Nov 25,2020)was an Argentinian Soccer Legend with a drug problem."
            }
            else if (textEntered == "61"){
                result.text = "Puyi(Died Oct 17,1967) was a Chinese Emperor."
            }
            else if (textEntered == "62"){
                result.text = "Dexter King(Died jan 22,2024) was a movie actor but best known as the son of Political Leader MLK.Jr."
            }
            else if (textEntered == "63" ){
                result.text = "Robin Williams(died Aug 11,2014)was a Movie Actor from Chicago."
            }
            else if (textEntered == "64"){
                result.text = "Napolean III(died Jan 9,1873)was a World Leader with one hand!!!."
            }
            else if (textEntered =="65" ){
                result.text = "Walt Disney(died Dec 15,1996)was an Entrepreneur who founded the Disney Company and created the iconic character MICKEY MOUSE!!."
            }
            else if (textEntered == "66" ){
                result.text = "Tom Clancy(died Oct 2,2013) was a famous Novelist from Boltimore"
            }
            else if (textEntered == "67") {
                result.text =
                    "George Washington(died Dec 14,1799) was oe of the fouding farthers of the United States ."
            }
            else if (textEntered == "68") {
                result.text = "MIGUEL DE CERVANTES(diedApr 23, 1616 age 68) was a novelist from spain"
            }
            else if (textEntered == "69") {
                result.text = "Alexander Hamilton, one of the Founding Fathers of the United States. He was born on January 11, 1755, and died on July 12, 1804"
            }

            else if (textEntered == "70") {
                result.text = "Louis Vuitton (died Feb 27, 1892 (age 70)) was a fashion designer from France"
            }
            else if (textEntered == "72") {
                result.text = "Frank Sinatra JR.(died Mar 16,2016)son of legendary crooner Frank Sinatra"
            }

            else if (textEntered == "74") {
                result.text = "Muhammad Ali (died  Jun 3, 2016)Legendary boxer"
            }

            else if (textEntered == "75") {
                result.text = "Rocky Johnson(died Jan 15,2020)NWA Georgia Champion best known for being the father of wrestler turned actor The Rock."
            }

            else if (textEntered == "76") {
                result.text = "Albert Einstein(died Apr 18,1955)Physicist was and iconic genius and legendary theoretical physicist"
            }

            else if (textEntered == "78") {
                result.text = "Mahatma Gandhi(died Jan 30,1948)Passive resistance leader who successfully led India in a nonviolent revolution"
            }
            else if (textEntered == "80") {
                result.text = "Henry Parkes (died Apr27,1896)Remembered as one of Australia's Founding Fathers, Parkes served as the seventh Premiere of New South Wales."
            }

            else if (textEntered == "82") {
                result.text = "Neil Armstrong(died Aug 25,2012)first person to set foot on the moon on July 20, 1969"
            }

            else if (textEntered == "84") {
                result.text = "Benjamin Franklin(died Apr 17,1790)Founding Father of the United States who became known for his political works"
            }

            else if (textEntered == "86") {
                result.text = "Nikola Tesla(died Jan7,1943)Electrical engineer, mechanical engineer, and physicist who invented the electrical motor, arc lighting, and AC power. "
            }

            else if (textEntered == "88") {
                result.text = "Charlie Chaplin(died Dec 25,1977)Comedic silent film icon who gained world fame for portraying his character"
            }
        else if (textEntered == "90"){
            result.text = "Jean Arthur was an American actress counted amongst the topmost actresses of the 1930s and 1940s."
        }

            else if (textEntered == "92") {
                result.text = "Rosa Parks(Oct24,2005)Civil rights activist who became known as \"The first lady of civil rights\" after she was arrested for refusing to give up her seat on a bus in 1955"
            }

            else if (textEntered == "94") {
                result.text = "George H.W.Bush(died Nov30,2018)The 41st President of the United States who also served as vice president, congressman, ambassador, director of the CIA, and served in World War II"
            }
            else if (textEntered =="96") {
                result.text = "Queen Elizabeth II(died sep 8,2022)She became the longest reigning monarch in British history."
            }

            else if (textEntered == "98") {
                result.text = "Dorothy Vaughan(died Nov10,2008)Mathematician most well known for her work with the National Advisory Committee for Aeronautics"
            }
            else if (textEntered == "100") {
                result.text = "Glynis Johns(Died Jan 4,2024)Actress who played a suffragette mom in Mary Poppins and appeared in the sitcom Glynis from Pretoria,South Africa"
            }


            else {
                    result.text = "There is no historical figure "
                }




            }        }
    }


