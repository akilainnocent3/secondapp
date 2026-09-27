package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CacheEventSender implements Serializable {

    @l
    private final IEventSender eventSender;

    public CacheEventSender(@l IEventSender eventSender) {
        m0.p(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final boolean sendEvent(@l CacheEvent eventId, @l Object... params) {
        m0.p(eventId, "eventId");
        m0.p(params, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, eventId, Arrays.copyOf(params, params.length));
    }
}
