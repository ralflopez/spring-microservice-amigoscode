package org.example.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String message;
}
