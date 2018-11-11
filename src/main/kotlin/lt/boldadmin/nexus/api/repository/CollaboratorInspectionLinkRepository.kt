package lt.boldadmin.nexus.api.repository

import lt.boldadmin.nexus.api.type.entity.CollaboratorInspectionLink

interface CollaboratorInspectionLinkRepository {

   fun existsByLink(link: String): Boolean

    fun existsById(id: String): Boolean

    fun save(inspectionLink: CollaboratorInspectionLink)

    fun findById(id: String): CollaboratorInspectionLink

    fun findByLink(link: String): CollaboratorInspectionLink

    fun deleteById(id: String)

}