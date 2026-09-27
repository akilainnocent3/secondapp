package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5032f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f97312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f97313b = Looper.getMainLooper().getThread();

    public C5032f0(InterfaceC5058g0 interfaceC5058g0, Map map) {
        this.f97312a = map;
    }
}
