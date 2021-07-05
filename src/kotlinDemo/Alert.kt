package kotlinDemo

import java.util.*

data class Alert(
    val id: Int = 0,
    val infoId: Int = 0,
    val infoSlug: String = "",
    val alertId: Int = 0,
    val name: String = "",
    val state: String = "",
    val newStateDate: Date = Date(),
    val url: String = ""
)

fun main() {
    val alert = Alert(1, 1, "1", 1, "1", "1", Date(), "1")
    print(alert.toString())
    print("\n==============\n")
    print(alert.hashCode())
    alert.id

    val alertCopy = alert.copy()
    print("\n==============\n")
    print(alert.equals(alertCopy))
    print("\n==============\n")
    print(alertCopy.hashCode())

    val alertCopyTwo = alert.copy(id = 2)
    print("\n==============\n")
    print(alertCopyTwo.hashCode())
    print("\n==============\n")

    print(alert.equals(alertCopyTwo))
//    alert.url="alert_url";

    val alertNoArg = Alert()
    println(alertNoArg)
}
