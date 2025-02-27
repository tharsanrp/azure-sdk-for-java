// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/**
 * Protected append writes history setting for the blob container with Legal holds.
 */
@Fluent
public final class ProtectedAppendWritesHistory {
    /*
     * When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
     */
    @JsonProperty(value = "allowProtectedAppendWritesAll")
    private Boolean allowProtectedAppendWritesAll;

    /*
     * Returns the date and time the tag was added.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /**
     * Creates an instance of ProtectedAppendWritesHistory class.
     */
    public ProtectedAppendWritesHistory() {
    }

    /**
     * Get the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     *
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    /**
     * Set the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     *
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the ProtectedAppendWritesHistory object itself.
     */
    public ProtectedAppendWritesHistory withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll = allowProtectedAppendWritesAll;
        return this;
    }

    /**
     * Get the timestamp property: Returns the date and time the tag was added.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
