package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5029en implements Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mn f97303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97304b;

    public C5029en(@NonNull Mn mn2, @Nullable Object obj) {
        this.f97303a = mn2;
        this.f97304b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.f97303a.a(obj) ? this.f97304b : obj;
    }
}
