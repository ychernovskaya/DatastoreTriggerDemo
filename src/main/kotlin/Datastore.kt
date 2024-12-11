package org.example

import com.google.cloud.functions.CloudEventsFunction
import com.google.events.cloud.datastore.v1.EntityEventData
import com.google.protobuf.InvalidProtocolBufferException
import io.cloudevents.CloudEvent
import java.util.logging.Logger

class Datastore : CloudEventsFunction {
    private val logger: Logger = Logger.getLogger(Datastore::class.java.name)

    @Throws(InvalidProtocolBufferException::class)
    override fun accept(event: CloudEvent) {
        val datastoreEventData = EntityEventData.parseFrom(event.data.toBytes())

        logger.info("Function triggered by event on: ${event.source}")
        logger.info("Event type: ${event.type}")

        logger.info("Old value:")
        logger.info(datastoreEventData.oldValue.toString())

        logger.info("New value:")
        logger.info(datastoreEventData.value.toString())
    }
}
