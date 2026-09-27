package com.google.android.exoplayer2.drm;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f48418a;

    public m(byte[] bArr) {
        this.f48418a = (byte[]) eh.a.g(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] a(UUID uuid, j.b bVar) {
        return this.f48418a;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] b(UUID uuid, j.h hVar) {
        throw new UnsupportedOperationException();
    }
}
