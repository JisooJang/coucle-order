package com.example.coucleorder.config;

import com.example.coucleorder.model.BaseEntity;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;

import java.time.LocalDateTime;

public class BeforeSaveListener extends AbstractMongoEventListener<BaseEntity> {
    @Override
    public void onBeforeSave(BeforeSaveEvent<BaseEntity> event) {
        LocalDateTime dateTime = LocalDateTime.now();
        if(event.getSource().getCreatedAt() == null) {
            event.getSource().setCreatedAt(dateTime);
        }
        event.getSource().setLastUpdatedAt(dateTime);

        super.onBeforeSave(event);
    }
}
