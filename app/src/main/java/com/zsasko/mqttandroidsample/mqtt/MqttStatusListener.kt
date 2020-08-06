package com.zsasko.mqttandroidsample.mqtt

import org.eclipse.paho.client.mqttv3.MqttMessage

/**
 * Listener that notifies when MQTT connection status has changed, topic subscription is done or
 * MQTT message is arrived.
 */
interface MqttStatusListener {
    fun onConnectComplete(reconnect: Boolean, serverURI: String)
    fun onConnectFailure(exception: Throwable)
    fun onConnectionLost(exception: Throwable)
    //
    fun onTopicSubscriptionSuccess()
    fun onTopicSubscriptionError(exception: Throwable)
    //
    fun onMessageArrived(topic: String, message: MqttMessage)
}