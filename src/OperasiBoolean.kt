fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 75
    val nilaiExtra = 90

    val apakahLulusUjian = nilaiUjian >= 75
    val apakahLulusAbsen = nilaiAbsen >= 75
    val apakahLulusExtra = nilaiExtra >= 75
    val apakahLulus = apakahLulusUjian && apakahLulusAbsen //False
    val apakahLulus1 = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra

    println(apakahLulus)
    println(apakahLulus1)


}