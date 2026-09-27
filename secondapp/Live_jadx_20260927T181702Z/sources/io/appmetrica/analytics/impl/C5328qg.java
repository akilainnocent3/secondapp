package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C5328qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f98198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5203lg f98199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ma f98200c;

    public C5328qg(Oa oa2, InterfaceC5203lg interfaceC5203lg, Ma ma2) {
        this.f98198a = oa2;
        this.f98199b = interfaceC5203lg;
        this.f98200c = ma2;
    }

    public final void a(@Nullable C5278og c5278og) {
        if (this.f98198a.a(c5278og)) {
            this.f98199b.a(c5278og);
            this.f98200c.a();
        }
    }

    @NonNull
    @k.h1(otherwise = 5)
    public final InterfaceC5203lg b() {
        return this.f98199b;
    }

    @NonNull
    @k.h1(otherwise = 5)
    public final Ma c() {
        return this.f98200c;
    }

    @NonNull
    @k.h1(otherwise = 5)
    public final Oa a() {
        return this.f98198a;
    }
}
