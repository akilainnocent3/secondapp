package com.unity3d.services.core.properties;

import java.util.UUID;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SessionIdReader {

    @l
    public static final SessionIdReader INSTANCE = new SessionIdReader();

    @l
    private static final String sessionId;

    static {
        String string = UUID.randomUUID().toString();
        m0.o(string, "randomUUID().toString()");
        sessionId = string;
    }

    private SessionIdReader() {
    }

    @l
    public final String getSessionId() {
        return sessionId;
    }
}
