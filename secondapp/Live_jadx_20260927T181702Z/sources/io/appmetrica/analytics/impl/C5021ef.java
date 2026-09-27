package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5021ef implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C5351rf f97274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C4996df> f97275b;

    public C5021ef(@NonNull C5351rf c5351rf, @NonNull List<C4996df> list) {
        this.f97274a = c5351rf;
        this.f97275b = list;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @NonNull
    public final List<C4996df> a() {
        return this.f97275b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @Nullable
    public final Object b() {
        return this.f97274a;
    }

    @Nullable
    public final C5351rf c() {
        return this.f97274a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f97274a + ", candidates=" + this.f97275b + fw.b.f85383j;
    }
}
