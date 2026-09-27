package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47085a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f47086b;

    public final synchronized Map a() {
        try {
            if (this.f47086b == null) {
                this.f47086b = Collections.unmodifiableMap(new HashMap(this.f47085a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47086b;
    }
}
