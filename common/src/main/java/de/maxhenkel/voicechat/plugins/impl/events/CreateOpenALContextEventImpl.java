package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatClientApi;
import de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent;

public class CreateOpenALContextEventImpl extends ClientEventImpl implements CreateOpenALContextEvent {

    protected long context;
    protected long device;

    public CreateOpenALContextEventImpl(VoicechatClientApi api, long context, long device) {
        super(api);
        this.context = context;
        this.device = device;
    }

    @Override
    public long getContext() {
        return context;
    }

    @Override
    public long getDevice() {
        return device;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }

}