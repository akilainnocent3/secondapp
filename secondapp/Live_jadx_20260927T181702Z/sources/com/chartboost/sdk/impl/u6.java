package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf.b f41086a;

    public u6(xf.b download) {
        kotlin.jvm.internal.m0.p(download, "download");
        this.f41086a = download;
    }

    public final xf.b a() {
        return this.f41086a;
    }

    public final String b() {
        String id2 = this.f41086a.f144891a.f48583b;
        kotlin.jvm.internal.m0.o(id2, "id");
        return id2;
    }

    public final float c() {
        return this.f41086a.b();
    }

    public final int d() {
        return this.f41086a.f144892b;
    }

    public final long e() {
        return this.f41086a.f144894d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6) && kotlin.jvm.internal.m0.g(this.f41086a, ((u6) obj).f41086a);
    }

    public final String f() {
        String string = this.f41086a.f144891a.f48584c.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        return this.f41086a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f41086a + gi.j.f86771d;
    }
}
