package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f96440a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC5062g4 interfaceC5062g4) {
        this.f96440a.add(interfaceC5062g4);
    }

    public final void b(@NonNull InterfaceC5062g4 interfaceC5062g4) {
        this.f96440a.remove(interfaceC5062g4);
    }

    public final List<InterfaceC5062g4> a() {
        return this.f96440a;
    }
}
