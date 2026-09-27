package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c0> f69676a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f69676a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f69676a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f69676a.contains(c0Var);
    }
}
