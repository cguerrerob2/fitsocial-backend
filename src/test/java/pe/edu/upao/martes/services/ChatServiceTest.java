package pe.edu.upao.martes.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pe.edu.upao.martes.models.ChatMessage;
import pe.edu.upao.martes.models.Community;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChatServiceTest {

    private ChatService chatService;

    @BeforeEach
    public void setUp() {
        chatService = new ChatService();
    }

    @Test
    public void testSaveCommunityChatMessage() {
        // Datos de prueba
        ChatMessage message = new ChatMessage();
        message.setSender("User123");
        message.setContent("Hello, world!");
        message.setDate("2023-11-05");

        // Llamar al método del servicio
        ChatMessage result = chatService.saveCommunityChatMessage(message);

        // Verificar que el resultado es el esperado
        assertEquals(message, result);
    }

    @Test
    public void testListCommunityChatMessages() {
        // Datos de prueba
        ChatMessage message1 = new ChatMessage();
        message1.setSender("User123");
        message1.setContent("Hello, world!");
        message1.setDate("2023-11-05");

        ChatMessage message2 = new ChatMessage();
        message2.setSender("User456");
        message2.setContent("Hi there!");
        message2.setDate("2023-11-06");

        chatService.saveCommunityChatMessage(message1);
        chatService.saveCommunityChatMessage(message2);

        // Llamar al método del servicio
        List<ChatMessage> result = chatService.listCommunityChatMessages();

        // Verificar que el resultado es el esperado
        assertEquals(2, result.size());
        assertEquals(message1, result.get(0));
        assertEquals(message2, result.get(1));
    }
}
