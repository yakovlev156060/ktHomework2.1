fun main(){
    val amount =611111

    var rezult:Int=(amount*0.0075F).toInt()
    var rezultRuble:Int=0
    var rezultPenny:Int=0

    if(rezult<3500){
        rezultRuble= 35
        rezultPenny= 0
    }
    else{
        rezultRuble=rezult/100
        rezultPenny=rezult-rezultRuble*100;
    }

    println("Комиссия: $rezultRuble рублей $rezultPenny копеек")
}