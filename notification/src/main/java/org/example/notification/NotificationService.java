package org.example.notification;

import org.example.clients.notification.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    @Autowired
    NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.getToCustomerId())
                        .toCustomerEmail(notificationRequest.getToCustomerEmail())
                        .message(notificationRequest.getMessage())
                        .sender("Amigoscode")
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
