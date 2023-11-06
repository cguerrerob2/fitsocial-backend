package pe.edu.upao.martes.repositories;

import org.springframework.stereotype.Repository;
import pe.edu.upao.martes.models.ChatMessage;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepositoryArray implements IMessageRepository {
    private List<ChatMessage> messages = new ArrayList<>();

    @Override
    public List<ChatMessage> getAllMessages() {
        return messages;
    }

    @Override
    public ChatMessage saveMessage(ChatMessage message) {
        messages.add(message);
        return message;
    }

    // Implementa otros métodos según tus necesidades
}
