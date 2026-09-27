package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f95801a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f95801a = new WeakHashMap();
    }

    public final synchronized void a(@oy.l Object obj) {
        this.f95801a.put(obj, null);
        if (this.f95801a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@oy.l Object obj) {
        this.f95801a.remove(obj);
        if (this.f95801a.isEmpty()) {
            updateState(false);
        }
    }
}
