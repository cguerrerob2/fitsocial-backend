package pe.edu.upao.martes.repositories.interfaces;

import pe.edu.upao.martes.models.ChatMessage;

import java.util.List;

public interface IMessageRepository {
    List<ChatMessage> getAllMessages();
    ChatMessage saveMessage(ChatMessage message);
    // Agrega otros métodos según sea necesario
}
