# HolyQuran Android Kotlin Library

The HolyQuran Android Library empowers developers to seamlessly incorporate comprehensive Quranic data into Android applications. It provides essential Surah details such as name, type, English name, number, verses, words, and letters, facilitating easy access to Quranic information within your Android projects.

![alt text](https://github.com/khaouitiabdelhakim/HolyQuran/blob/master/HolyQuran.png)


```
If you find this repository useful or it has helped you,
please don't forget to leave a ⭐️, or even follow my GitHub account.
Your support motivates me to continue providing helpful resources.
Thank you for your appreciation! 🌟🚀💖😊👍

If you'd like to support further, consider buying me a coffee:
```
[![Buy Me A Coffee](https://img.shields.io/badge/Buy%20Me%20A%20Coffee--yellow.svg?style=for-the-badge&logo=buy-me-a-coffee)](https://www.buymeacoffee.com/kh.abdelhakim)

## Example Usage

```kotlin
// Example of accessing the 3rd verse of the 4th Surah in the Holy Quran
val holyQuran = HolyQuran()
val thirdVerseFourthSurah: String = holyQuran.hafsVersion[3].verses[2]
```

## Features

- Access detailed Surah information including name, type, English name, number of verses, words, and letters.
- Retrieve specific verses of Surahs easily.
- Translation available in 49 world languages.


## Supported Languages for Translation:
Russian, Chinese, Hindi, Spanish, Portuguese, Bengali, Urdu, Italian, Vietnamese, Turkish, Thai, Polish, German, Dutch, Icelandic, Hausa, Albanian, Persian, Azerbaijani, Swahili, Tajik, Tamil, Pashto, Malayalam, Malay, Sinhala, Amharic, Kurdish (Sorani), Bulgarian, Kazakh, Filipino, Sindhi, Korean, Japanese, Swedish, Norwegian, Somali, Croatian, Yoruba, Fulani, Tatar, Uyghur, Kyrgyz, Punjabi, Javanese, Telugu

```kotlin
val germanVerse: String = germanQuran.verses[3][2]
// Example of accessing the 3rd verse of the 4th Surah in German translation:
// Und wenn ihr befürchtet, nicht gerecht hinsichtlich der Waisen zu handeln ...
```

## Installation

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        // Other repositories
        maven { url = "https://jitpack.io" }
    }
}
```

### Step 2. Add the dependency

```groovy
dependencies {
    implementation ("com.github.khaouitiabdelhakim:HolyQuran:Tag")
}
```

## Contribution

This project is open to contributions. Feel free to contribute to the development of this library by forking the repository, making your changes, and creating pull requests.

## License
This project is licensed under the MIT License 

```
Copyright 2024 KHAOUITI ABDELHAKIM

Licensed under the MIT License
You may obtain a copy of the License at

http://opensource.org/licenses/MIT

Unless required by applicable law or agreed to in writing, software
distributed under the MIT License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the MIT License.
```
