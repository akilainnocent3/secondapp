package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4969ce implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97114a;

    public C4969ce(@NonNull String str) {
        this.f97114a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        if (obj != null) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f97114a + " is null.");
    }

    @NonNull
    public final String a() {
        return this.f97114a;
    }
}
