package lt.boldadmin.nexus.api.repository

import lt.boldadmin.nexus.api.type.entity.Collaborator
import lt.boldadmin.nexus.api.type.entity.Worklog
import lt.boldadmin.nexus.api.type.valueobject.WorkStatus

interface WorklogRepository {

    fun save(worklog: Worklog)


    fun findById(id: String): Worklog

    fun findByProjectId(projectId: String): Collection<Worklog>

    fun findByIntervalId(intervalId: String): Collection<Worklog>

    fun findByCollaboratorId(collaboratorId: String): Collection<Worklog>

    fun findFirstByIntervalId(intervalId: String): Worklog

    fun findByIntervalIdAndWorkStatusNotOrderByLatest(intervalId: String, workStatus: WorkStatus)
        : Collection<Worklog>

    fun findLatestByCollaboratorIdAndWorkStatusNot(collaboratorId: String, workStatus: WorkStatus): Worklog?

    fun findLatestByIntervalIdAndWorkStatus(intervalId: String, workStatus: WorkStatus): Worklog?

    fun findWorkingCollaboratorsByProjectId(projectId: String): Collection<Collaborator>


    fun existsByIntervalId(intervalId: String): Boolean

}