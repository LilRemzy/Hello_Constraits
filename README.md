# HelloConstraint

V tej nalogi sem naredil Aplikacijo Helloconstraints, ki ponastavi števec. Gumbi ob kliku spreminjajo barvo, postavitev pa sem prilagodil tudi za ležečo orientacijo in tablico.

## Cilji

- odpreti obstoječi projekt HelloConstraint v Android Studiu,
- v `activity_main.xml` dodati tretji gumb **Zero** med gumboma **Toast** in **Count**,
- gumbu Zero nastaviti začetno sivo ozadje (`android:backgroundTint`),
- vse tri gumbe postaviti levo od `show_count` in jih z verigo omejitev (`layout_constraintVertical_chainStyle="spread_inside"`) navpično razporediti med zgornjim in spodnjim robom elementa `show_count`,
- gumb Zero dodati tudi v postavitvi za ležečo orientacijo (`layout-land`) in za tablico (`layout-xlarge`), z istimi ID-ji in imeni metod,
- v `MainActivity.java` napisati metodo `zero(View view)`, ki števec nastavi na 0 in gumbu Zero vrne sivo barvo,
- metodo `countUp(View view)` dopolniti tako, da gumb Count spreminja svojo barvo glede na sodo ali liho vrednost (zelena/rdeča), pri čemer sem uporabil parameter `view` in ne `findViewById()`,
- ob kliku na Count gumb Zero obarvati rumeno, kar nakaže, da je aktiven,
- za barve uporabiti konstante iz razreda `Color` (`Color.GREEN`, `Color.RED`, `Color.YELLOW`, `Color.GRAY`),
- odstraniti nepotrebno kodo (odvečne odmike, podvojene atribute in nepotreben uvoz razreda `R`),
- preizkusiti aplikacijo v emulatorju telefona v pokončni in ležeči legi ter na emulatorju tablice.

## Zaslonske slike aplikacije
<img width="320" height="555" alt="Slika1" src="https://github.com/user-attachments/assets/2965ca72-8fd0-4f62-80a2-5569744ee73e" />
<img width="320" height="555" alt="Slika2" src="https://github.com/user-attachments/assets/83050988-4972-4b19-a4f3-32dc1a4c9735" />
<img width="640" height="320" alt="Slika3" src="https://github.com/user-attachments/assets/3dacd736-5e87-46c1-9526-1bae81a72c2c" />


## Odgovori na Vprašanja
1. Katera atributa omejitev na gumbu Zero omogočata, da je navpično enakomerno postavljen med ostalima
dvema gumboma?
app:layout_constraintTop_toBottomOf="@id/button_toast" in app:layout_constraintBottom_toTopOf="@id/button_count"
2. Kateri atribut omejitve na gumbu Zero poskrbi, da je vodoravno poravnan z ostalima dvema gumboma?
app:layout_constraintStart_toStartOf="parent"
3. Kateri postopek lahko uporabite, da vključite gumb Zero tudi v postavitvi xlarge in land?
c. Oba postopka sta ustrezna
4. Kakšen je pravilen podpis metode, ki jo uporabite kot vrednost atributa android:onClick v XML?
(b) public void callMethod(View view)
5. Obdelava dogodka klika (angl. click handler) za gumb Count se začne s podpisom
public void countUp(View view). Kateri pristop je učinkovitejši za spreminjanje barve ozadja?
(b) Uporabiti parameter view in na njem uporabiti setBackgroundColor().
