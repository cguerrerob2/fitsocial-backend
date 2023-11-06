package pe.edu.upao.martes.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.ChatMessage;
import pe.edu.upao.martes.models.Community;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private final List<ChatMessage> communityChatMessages = new ArrayList<>();
    private final List<Community> communities = new ArrayList<>();

    public List<ChatMessage> listCommunityChatMessages() {
        return new ArrayList<>(communityChatMessages);
    }

    public ChatMessage saveCommunityChatMessage(ChatMessage message) {
        message.setId(generateMessageId());
        communityChatMessages.add(message);
        return message;
    }

    public Community createCommunity(Community community) {
        community.setId(generateCommunityId());
        communities.add(community);
        return community;
    }

    public List<Community> listCommunities() {
        return new ArrayList<>(communities);
    }

    private long generateMessageId() {
        // Implement your logic to generate unique message IDs here
        // You can use timestamps, random numbers, or any other suitable method
        // For simplicity, let's use a simple incrementing ID
        long lastId = communityChatMessages.isEmpty() ? 0 : communityChatMessages.get(communityChatMessages.size() - 1).getId();
        return lastId + 1;
    }

    private long generateCommunityId() {
        // Implement your logic to generate unique community IDs here
        // You can use timestamps, random numbers, or any other suitable method
        // For simplicity, let's use a simple incrementing ID
        long lastId = communities.isEmpty() ? 0 : communities.get(communities.size() - 1).getId();
        return lastId + 1;
    }
}
