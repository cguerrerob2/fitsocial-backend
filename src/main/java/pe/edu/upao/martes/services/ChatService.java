package pe.edu.upao.martes.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.ChatMessage;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private final List<ChatMessage> communityChatMessages = new ArrayList<>();

    public List<ChatMessage> listCommunityChatMessages() {
        return new ArrayList<>(communityChatMessages);
    }

    public ChatMessage saveCommunityChatMessage(ChatMessage message) {
        message.setId(generateMessageId());
        communityChatMessages.add(message);
        return message;
    }

    private long generateMessageId() {
        // Implement your logic to generate unique message IDs here
        // You can use timestamps, random numbers, or any other suitable method
        // For simplicity, let's use a simple incrementing ID
        long lastId = communityChatMessages.isEmpty() ? 0 : communityChatMessages.get(communityChatMessages.size() - 1).getId();
        return lastId + 1;
    }
}
