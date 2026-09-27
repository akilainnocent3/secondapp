package com.inmobi.media;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f54549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D5 f54551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H5 f54552e;

    public E5(H5 h10, String str) {
        this.f54552e = h10;
        this.f54548a = str;
        this.f54549b = new long[h10.f54762h];
    }

    public final File a(int i10) {
        return new File(this.f54552e.f54756b, this.f54548a + androidx.media3.session.fe.F + i10);
    }

    public final File b(int i10) {
        return new File(this.f54552e.f54756b, this.f54548a + androidx.media3.session.fe.F + i10 + ".tmp");
    }
}
