package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ei implements InterfaceC4958c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f95776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4958c3 f95777b;

    public Ei(@NonNull Object obj, @NonNull InterfaceC4958c3 interfaceC4958c3) {
        this.f95776a = obj;
        this.f95777b = interfaceC4958c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4958c3
    public final int getBytesTruncated() {
        return this.f95777b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f95776a + ", metaInfo=" + this.f95777b + fw.b.f85383j;
    }
}
