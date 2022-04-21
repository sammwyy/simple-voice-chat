package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import net.minecraft.network.chat.Component;

public class VoiceSoundSlider extends DebouncedSlider {

    public VoiceSoundSlider(int x, int y, int width, int height) {
        super(x, y, width, height, Component.empty(), VoicechatClient.CLIENT_CONFIG.voiceChatVolume.get().floatValue() / 2F);
        updateMessage();
    }

    @Override
    protected void updateMessage() {
        setMessage(getMsg());
    }

    public Component getMsg() {
        return Component.translatable("message.voicechat.voice_chat_volume", Math.round(value * 200F) + "%");
    }

    @Override
    public void applyDebounced() {
        VoicechatClient.CLIENT_CONFIG.voiceChatVolume.set(value * 2F).save();
    }
}
