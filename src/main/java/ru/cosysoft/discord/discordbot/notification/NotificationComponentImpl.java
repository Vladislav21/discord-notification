package ru.cosysoft.discord.discordbot.notification;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import ru.cosysoft.discord.discordbot.discord.DiscordComponent;
import ru.cosysoft.discord.discordbot.notification.dto.DiscordNotificationDto;

@Component
@RequiredArgsConstructor
public class NotificationComponentImpl implements NotificationComponent {

    private final DiscordComponent discordComponent;

    @Override
    @SneakyThrows
    public boolean sendDiscordMessage(final DiscordNotificationDto dto) {
        return discordComponent.sendMessage(dto);
    }
}