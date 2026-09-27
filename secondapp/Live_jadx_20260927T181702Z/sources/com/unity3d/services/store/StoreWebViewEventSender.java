package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StoreWebViewEventSender {

    @l
    private final IEventSender eventSender;

    public StoreWebViewEventSender(@l IEventSender eventSender) {
        m0.p(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final void send(@l StoreEvent event, @l Object... params) {
        m0.p(event, "event");
        m0.p(params, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, event, Arrays.copyOf(params, params.length));
    }
}
