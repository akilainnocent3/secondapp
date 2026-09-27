package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;

/* JADX INFO: renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3615dd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f56262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rg f56263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hc f56264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gc f56265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3564be f56266e;

    public C3615dd(InMobiNative inMobiNative, Context context, long j10) {
        kotlin.jvm.internal.m0.p(inMobiNative, "inMobiNative");
        kotlin.jvm.internal.m0.p(context, "context");
        Jg jg2 = new Jg();
        jg2.f54918a = j10;
        this.f56262a = jg2;
        C3589cd c3589cd = new C3589cd(this);
        Rg rg2 = new Rg();
        this.f56263b = rg2;
        Hc hc2 = new Hc(inMobiNative, rg2, c3589cd);
        this.f56264c = hc2;
        this.f56265d = new Gc(context, jg2, hc2);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f56265d.a(d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f56265d.a(i10, d10);
    }
}
