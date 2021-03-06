/**
 * Copyright 2014 Sewatech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.sewatech.mqttcdi.api;

/**
 * MQTT message, with a binary content and a topic reference
 *
 * @author Alexis Hassler
 */
public class MqttMessage {

    private String topic;
    private byte[] payload;

    public MqttMessage(String topic, byte[] payload) {
        this.payload = payload;
        this.topic = topic;
    }

    public byte[] getPayload() {
        return payload;
    }

    public String asText() {
        return new String(payload);
    }

    public String getTopic() {
        return topic;
    }
}
