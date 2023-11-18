fun main(args: Array<String>) {
    println("Введите число для возведения в степень: ")
    var chislo: Int = readln()!!.toInt();
    println("Введите степень: ")
    var stepen: Int = readln()!!.toInt();
    var sum: Int = 0;
    var jaa: Int = 1;
    if (stepen > 1)
    {
        while(stepen >= jaa)
        {
            sum += chislo * chislo;
            jaa++;
        }
        println("Ответ: ");
        print(sum);
    }
    else
    {
        println("Ответ: ");
        print(chislo);
    }
}