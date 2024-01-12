package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Ce steag este acesta?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Ce steag este acesta?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Ce steag este acesta?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazilia", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Ce steag este acesta?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgia",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Ce steag este acesta?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "Franta",
            "Fiji", "Finlanda", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Ce steag este acesta?",
            R.drawable.ic_flag_of_germany,
            "Germania", "Georgia",
            "Grecia", "nici unul", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Ce steag este acesta?",
            R.drawable.ic_flag_of_denmark,
            "Ungaria", "Egipt",
            "Danemarca", "Etiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Ce steag este acesta?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Iran",
            "Spania", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Ce steag este acesta?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Noua Zeelanda",
            "Rusia", "Portugalia", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Ce steag este acesta?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Iordania",
            "Sudan", "Israel", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}