package lt.boldadmin.nexus.api.repository

import lt.boldadmin.nexus.api.type.entity.Project
import lt.boldadmin.nexus.api.type.entity.User
import lt.boldadmin.nexus.api.type.entity.Worklog
import lt.boldadmin.nexus.api.type.entity.Collaborator

interface UserRepository {

    fun save(user: User)

    fun existsAny(): Boolean

    fun findById(id: String): User

    fun findByEmail(email: String): User

    fun existsByEmail(email: String): Boolean

    fun existsByCompanyName(name: String): Boolean

    fun findByProjectId(projectId: String): User

    fun findProjectsByUserId(userId: String): Set<Project>

    fun findCollaboratorsByUserId(userId: String): Set<Collaborator>

    fun doesUserHaveProject(userId: String, projectId: String): Boolean

    fun doesUserHaveCollaborator(userId: String, collaboratorId: String): Boolean

    fun doesUserHaveWorklog(userId: String, worklog: Worklog): Boolean

    fun isProjectNameUnique(projectName: String, projectId: String, userId: String): Boolean

}
