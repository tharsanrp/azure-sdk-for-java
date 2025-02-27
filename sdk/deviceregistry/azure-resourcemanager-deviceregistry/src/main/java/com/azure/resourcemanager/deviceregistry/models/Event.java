// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the event properties.
 */
@Fluent
public final class Event {
    /*
     * The name of the event.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The address of the notifier of the event in the asset (e.g. URL) so that a client can access the event on the
     * asset.
     */
    @JsonProperty(value = "eventNotifier", required = true)
    private String eventNotifier;

    /*
     * The path to the type definition of the capability (e.g. DTMI, OPC UA information model node id, etc.), for
     * example dtmi:com:example:Robot:_contents:__prop1;1.
     */
    @JsonProperty(value = "capabilityId")
    private String capabilityId;

    /*
     * An indication of how the event should be mapped to OpenTelemetry.
     */
    @JsonProperty(value = "observabilityMode")
    private EventsObservabilityMode observabilityMode;

    /*
     * Protocol-specific configuration for the event. For OPC UA, this could include configuration like,
     * publishingInterval, samplingInterval, and queueSize.
     */
    @JsonProperty(value = "eventConfiguration")
    private String eventConfiguration;

    /**
     * Creates an instance of Event class.
     */
    public Event() {
    }

    /**
     * Get the name property: The name of the event.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the event.
     * 
     * @param name the name value to set.
     * @return the Event object itself.
     */
    public Event withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the eventNotifier property: The address of the notifier of the event in the asset (e.g. URL) so that a client
     * can access the event on the asset.
     * 
     * @return the eventNotifier value.
     */
    public String eventNotifier() {
        return this.eventNotifier;
    }

    /**
     * Set the eventNotifier property: The address of the notifier of the event in the asset (e.g. URL) so that a client
     * can access the event on the asset.
     * 
     * @param eventNotifier the eventNotifier value to set.
     * @return the Event object itself.
     */
    public Event withEventNotifier(String eventNotifier) {
        this.eventNotifier = eventNotifier;
        return this;
    }

    /**
     * Get the capabilityId property: The path to the type definition of the capability (e.g. DTMI, OPC UA information
     * model node id, etc.), for example dtmi:com:example:Robot:_contents:__prop1;1.
     * 
     * @return the capabilityId value.
     */
    public String capabilityId() {
        return this.capabilityId;
    }

    /**
     * Set the capabilityId property: The path to the type definition of the capability (e.g. DTMI, OPC UA information
     * model node id, etc.), for example dtmi:com:example:Robot:_contents:__prop1;1.
     * 
     * @param capabilityId the capabilityId value to set.
     * @return the Event object itself.
     */
    public Event withCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
        return this;
    }

    /**
     * Get the observabilityMode property: An indication of how the event should be mapped to OpenTelemetry.
     * 
     * @return the observabilityMode value.
     */
    public EventsObservabilityMode observabilityMode() {
        return this.observabilityMode;
    }

    /**
     * Set the observabilityMode property: An indication of how the event should be mapped to OpenTelemetry.
     * 
     * @param observabilityMode the observabilityMode value to set.
     * @return the Event object itself.
     */
    public Event withObservabilityMode(EventsObservabilityMode observabilityMode) {
        this.observabilityMode = observabilityMode;
        return this;
    }

    /**
     * Get the eventConfiguration property: Protocol-specific configuration for the event. For OPC UA, this could
     * include configuration like, publishingInterval, samplingInterval, and queueSize.
     * 
     * @return the eventConfiguration value.
     */
    public String eventConfiguration() {
        return this.eventConfiguration;
    }

    /**
     * Set the eventConfiguration property: Protocol-specific configuration for the event. For OPC UA, this could
     * include configuration like, publishingInterval, samplingInterval, and queueSize.
     * 
     * @param eventConfiguration the eventConfiguration value to set.
     * @return the Event object itself.
     */
    public Event withEventConfiguration(String eventConfiguration) {
        this.eventConfiguration = eventConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventNotifier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property eventNotifier in model Event"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Event.class);
}
