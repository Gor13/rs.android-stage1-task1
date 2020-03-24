package subtask4

import java.util.regex.Matcher
import java.util.regex.Pattern

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
       // throw NotImplementedError("Not implemented")
        var map = mutableMapOf<Int, Int>()

        for (i in 0..inputString.length - 1){
           if ( inputString.get(i) == '<' ||  inputString.get(i) == '[' || inputString.get(i) == '('){
               val symbol = inputString.get(i)
               if (symbol == '<') {
                   var count = 0
                   var b = i + 1
                   var bool = true
                   while (bool){
                       if ( inputString.get(b) == '<' || inputString.get(b) == '>'){
                           if (inputString.get(b) == '<'){
                               count++
                           } else if (inputString.get(b) == '>' && count == 0){
                                   if (!map.containsValue(b)){
                                       map.put(i, b)
                                       bool = false
                                   }
                           } else{
                               count--
                           }
                       }
                       if (b < inputString.length){
                           b++
                       } else {
                           bool = false
                       }
                   }
               }
               if (symbol == '[') {
                   var count = 0
                   var b = i + 1
                   var bool = true
                   while (bool){
                       if ( inputString.get(b) == '[' || inputString.get(b) == ']'){
                           if (inputString.get(b) == '['){
                               count++
                           } else  if (inputString.get(b) == ']' && count == 0){
                               if (!map.containsValue(b)){
                                   map.put(i, b)
                                   bool = false
                               }
                           } else{
                               count--
                           }
                       }
                       if (b < inputString.length){
                           b++
                       } else {
                           bool = false
                       }
                   }
               }
               if (symbol == '(') {
                   var count = 0
                   var b = i + 1
                   var bool = true
                   while (bool){
                       if ( inputString.get(b) == '(' || inputString.get(b) == ')'){
                           if (inputString.get(b) == '('){
                               count++
                           } else if (inputString.get(b) == ')' && count == 0){
                               if (!map.containsValue(b)){
                                   map.put(i, b)
                                   bool = false
                               }
                           } else{
                               count--
                           }
                       }
                       if (b < inputString.length){
                           b++
                       } else {
                           bool = false
                       }
                   }
               }
           }
        }
        var arr = mutableListOf<String>()
        for (element in map){
            arr.add(inputString.substring(element.key + 1, element.value))
        }
        return arr.toTypedArray()
    }
}
