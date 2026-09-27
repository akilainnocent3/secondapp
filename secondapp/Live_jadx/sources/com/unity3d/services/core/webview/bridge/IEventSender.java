package com.unity3d.services.core.webview.bridge;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(@l Enum<?> r10, @l Enum<?> r11, @l Object... objArr);
}
