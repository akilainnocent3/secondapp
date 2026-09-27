package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f99052a;

    public V(InterfaceC5568i interfaceC5568i) {
        this.f99052a = interfaceC5568i.a();
    }

    public final void a(C5571l c5571l) {
        for (T t10 : this.f99052a) {
            C5572m c5572m = null;
            if (c5571l != null) {
                C5571l c5571l2 = c5571l.f99098a ? c5571l : null;
                if (c5571l2 != null) {
                    c5572m = c5571l2.f99099b;
                }
            }
            t10.a(c5572m);
        }
    }
}
