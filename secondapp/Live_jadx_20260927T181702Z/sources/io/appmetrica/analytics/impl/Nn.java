package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Nn implements InterfaceC4958c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f96249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4958c3 f96250b;

    public Nn(@Nullable Object obj, @NonNull InterfaceC4958c3 interfaceC4958c3) {
        this.f96249a = obj;
        this.f96250b = interfaceC4958c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4958c3
    public final int getBytesTruncated() {
        return this.f96250b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f96249a + ", metaInfo=" + this.f96250b + fw.b.f85383j;
    }
}
