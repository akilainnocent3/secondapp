package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ml extends HashMap {
    public Ml() {
        put(Kl.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Kl.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Kl.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
