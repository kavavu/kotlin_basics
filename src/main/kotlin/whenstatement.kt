fun main(args: Array<String>){
    var chr='A'
    when(chr){

        'A','E','I','O','U'   -> println("$chr is vowel")
        else ->println("$chr is a consonant")

    }
    var mynum=78
    when(mynum){
        in 1..9 -> println("$mynum is a single digit")
        in 10..99 -> println("$mynum is a double digit")
        in 100..999 -> println("$mynum is a triple digit")
    }

}