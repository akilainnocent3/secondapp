package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Vi implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds.p f55693a;

    public Vi(ds.p pVar) {
        this.f55693a = pVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        kotlin.jvm.internal.m0.p(message, "message");
        Uri data = message.getData();
        message.getTopic();
        Objects.toString(data);
        ds.p pVar = this.f55693a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        kotlin.jvm.internal.m0.o(topic, "getTopic(...)");
        pVar.invoke(messageData, topic);
    }
}
