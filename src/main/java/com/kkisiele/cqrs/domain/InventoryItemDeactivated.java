package com.kkisiele.cqrs.domain;

import com.kkisiele.cqrs.Event;

import java.util.UUID;

public final class InventoryItemDeactivated implements Event {
    private final UUID id;

    public InventoryItemDeactivated(UUID id) {
        this.id = id;
    }

    public UUID id() {
        return this.id;
    }
}
