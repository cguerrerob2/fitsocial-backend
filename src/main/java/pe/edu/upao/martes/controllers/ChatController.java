package pe.edu.upao.martes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.martes.models.ChatMessage;
import pe.edu.upao.martes.services.ChatService;

import java.util.List;

@RestController
@RequestMapping("communities")
@CrossOrigin(origins = "http://localhost:4200")
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    private final ChatService communityService;

    @Autowired
    public ChatController(ChatService communityService) {
        this.communityService = communityService;
    }

    @GetMapping("/")
    public List<ChatMessage> listCommunityChat() {
        return communityService.listCommunityChatMessages();
    }

    @PostMapping("/")
    public ChatMessage sendMessage(@RequestBody ChatMessage message) {
        ChatMessage savedMessage = communityService.saveCommunityChatMessage(message);
        messagingTemplate.convertAndSend("/topic/community-messages", savedMessage);
        return savedMessage;
    }
}

