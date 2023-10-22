package com.abdelhakim.holyquran

/**
 * Data class representing a chapter (surah) of the Holy Quran.
 *
 * @param name The name of the surah in Arabic.
 * @param type The type of the surah, which can be either "مكيّة" (Meccan) or "مدنيّة" (Medinan).
 * @param englishName The name of the surah in English.
 * @param number The numerical identifier of the surah.
 * @param numberOfVerses The total number of verses (ayat) in the surah.
 * @param numberOfWords The total number of words in the surah.
 * @param numberOfLetters The total number of letters in the surah.
 * @param verses An array of strings containing the text of each verse in the surah.
 */

data class Surah(
    val name: String,
    val type: String,
    val englishName: String,
    val number: Int,
    val numberOfVerses: Int,
    val numberOfWords: Int,
    val numberOfLetters: Int,
    val verses: Array<String>
)

