// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The properties of the managed service identities assigned to this resource.
 */
@Fluent
public final class ManagedServiceIdentity {
    /*
     * The Active Directory tenant id of the principal.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The active directory identifier of this principal.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The type of managed identity assigned to this resource.
     */
    @JsonProperty(value = "type", required = true)
    private ManagedServiceIdentityType type;

    /*
     * The identities assigned to this resource by the user.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of ManagedServiceIdentity class.
     */
    public ManagedServiceIdentity() {
    }

    /**
     * Get the tenantId property: The Active Directory tenant id of the principal.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId property: The active directory identifier of this principal.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the type property: The type of managed identity assigned to this resource.
     * 
     * @return the type value.
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity assigned to this resource.
     * 
     * @param type the type value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The identities assigned to this resource by the user.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The identities assigned to this resource by the user.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model ManagedServiceIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedServiceIdentity.class);
}
