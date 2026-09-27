package com.startapp.sdk.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib f74946a;

    public hb(final i7 i7Var) {
        this.f74946a = new ib(new i7() { // from class: com.startapp.sdk.internal.ul
            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                return hb.a(i7Var);
            }
        });
    }

    public static /* synthetic */ AtomicReference a(i7 i7Var) {
        return new AtomicReference(i7Var.a());
    }
}
