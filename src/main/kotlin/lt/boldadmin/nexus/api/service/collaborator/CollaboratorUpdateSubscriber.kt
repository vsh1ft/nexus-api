package lt.boldadmin.nexus.api.service.collaborator

import lt.boldadmin.nexus.api.type.entity.collaborator.Collaborator

interface CollaboratorUpdateSubscriber {
    fun notifyBefore(collaborator: Collaborator, attributeName: String, attributeValue: String)
}