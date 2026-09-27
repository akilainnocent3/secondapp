package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f70136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f70137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f70138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f70139d;

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f70136a = uVar;
            this.f70137b = i10;
            this.f70138c = bArr;
            this.f70139d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f70137b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        @zq.h
        public u b() {
            return this.f70136a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f70138c, this.f70139d, this.f70137b);
        }
    }

    public static z a(@zq.h u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    @zq.h
    public abstract u b();

    public static z a(@zq.h u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
