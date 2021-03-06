package com.heroslender.herostackdrops.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Item;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

public class ItemUpdateEvent extends EntityEvent {
    private static final HandlerList handlers = new HandlerList();

    @Getter @Setter private String hologramTextFormat;
    @Getter @Setter private int quantity;

    public ItemUpdateEvent(Item item, String hologramTextFormat, int quantity) {
        super(item);
        this.hologramTextFormat = hologramTextFormat;
        this.quantity = quantity;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Item getEntity() {
        return (Item) this.entity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
