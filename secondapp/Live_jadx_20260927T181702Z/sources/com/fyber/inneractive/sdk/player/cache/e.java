package com.fyber.inneractive.sdk.player.cache;

import androidx.media3.session.fe;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f45440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f45442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f45443e;

    public e(g gVar, String str) {
        this.f45443e = gVar;
        this.f45439a = str;
        this.f45440b = new long[gVar.f45452g];
    }

    public final File a(int i10) {
        return new File(this.f45443e.f45446a, this.f45439a + fe.F + i10);
    }

    public final File b(int i10) {
        return new File(this.f45443e.f45446a, this.f45439a + fe.F + i10 + ".tmp");
    }
}
