package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5130il implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5536z0 f97589a;

    public C5130il(@NonNull C5536z0 c5536z0) {
        this.f97589a = c5536z0;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Void r10) {
        this.f97589a.getClass();
        return C5536z0.a() ? new ro(this, true, "") : new ro(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final ro a() {
        return a((Void) null);
    }
}
