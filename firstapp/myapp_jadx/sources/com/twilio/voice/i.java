package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements EventPublisher.EventPublisherListener {
    @Override // com.twilio.voice.EventPublisher.EventPublisherListener
    public final void onError(VoiceException voiceException) {
        CallInviteProxy.lambda$new$2(voiceException);
    }
}
