package lt.boldadmin.nexus.api.type.valueobject.location

import javax.validation.Valid

data class Address(
    var street: String = "",

    var postCode: String = "",

    var city: String = "",

    @field:Valid
    var country: Country = Country()
)
