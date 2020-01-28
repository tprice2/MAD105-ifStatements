/*
Pseudocode
Variables:
temperature, tempDescription

Process:

Initialize the temperature variable as a double and the tempDescription variable as a string.

Ask the user to enter a temperature value between 92.0 and 104.0.

Assign the number the user enters to the variable temperature.

If the temperature is less than 97.5, then set the tempDescription variable to "Low".

If the temperature is between 97.5 and 99.5,then set the tempDescription variable to "Normal".

If the temperature is greater than 99.5, then set the tempDescription variable to "High".

Print the tempDescription variable
*/


fun main(args: Array<String>)
{
    var temperature = 0.0
    var tempDescription = ""

    println("Please enter a temperature between 92.0 and 104.0:")
    temperature = readLine()!!.toDouble()

    if (temperature < 97.5)
        tempDescription = "Low"
    else if (temperature >=97.5 && temperature <=99.5)
        tempDescription = "Normal"
    else if (temperature > 99.5)
        tempDescription = "High"

    print(tempDescription)
}