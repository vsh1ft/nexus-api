package lt.boldadmin.nexus.api.type.entity

import lt.boldadmin.nexus.api.type.annotation.UniqueProjectName
import lt.boldadmin.nexus.api.type.valueobject.Address
import javax.validation.Valid
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@UniqueProjectName
class Project(

    var id: String? = null,

    @field:Size(min = 1, message = "Project name required")
    var name: String = "",

    @field:Valid
    @field:NotNull(message = "Project address required")
    var address: Address = Address(),

    @field:Min(value = 0, message = "Project order number must be a positive number")
    var orderNumber: Short = 0

) {

    fun incrementOrderNumber() {
        this.orderNumber++
    }
}
