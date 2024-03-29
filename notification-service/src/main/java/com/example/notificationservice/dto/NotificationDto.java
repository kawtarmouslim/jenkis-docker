package com.example.notificationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {

    private Long id;
    private Long relatedId;
    private String message;
    private LocalDateTime createdAt;
    private boolean seen;
    private Long userReceiver;
}
