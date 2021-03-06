package lt.boldadmin.nexus.api.repository

import lt.boldadmin.nexus.api.type.entity.Project

interface ProjectRepository {

    fun save(project: Project)

    fun findById(id: String): Project

    fun findByCollaboratorId(id: String): Collection<Project>

    fun findByOrderNumberIsGreaterThanEqual(orderNumber: Short): Collection<Project>

}
