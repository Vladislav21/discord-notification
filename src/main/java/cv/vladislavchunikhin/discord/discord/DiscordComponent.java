package cv.vladislavchunikhin.discord.discord;

import cv.vladislavchunikhin.discord.discord.dto.DiscordDto;

public interface DiscordComponent {
    boolean sendMessage(DiscordDto dto);
}
