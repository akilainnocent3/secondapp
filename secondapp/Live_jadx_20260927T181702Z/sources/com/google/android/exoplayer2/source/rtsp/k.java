package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k implements a.InterfaceC0450a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49108b = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49109a;

    public k(long j10) {
        this.f49109a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a
    public /* synthetic */ a.InterfaceC0450a a() {
        return jg.d.a(this);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a
    public a b(int i10) {
        j jVar = new j(this.f49109a);
        jVar.a(jg.k.a(i10 * 2));
        return jVar;
    }
}
