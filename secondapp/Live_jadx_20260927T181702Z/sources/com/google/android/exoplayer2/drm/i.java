package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d.a f48383f;

    public i(d.a aVar) {
        this.f48383f = (d.a) eh.a.g(aVar);
    }

    @Override // com.google.android.exoplayer2.drm.d
    public boolean a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.d
    @Nullable
    public ye.c b() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final UUID c() {
        return re.k.f125809d2;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public boolean d(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.d
    @Nullable
    public d.a getError() {
        return this.f48383f;
    }

    @Override // com.google.android.exoplayer2.drm.d
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.d
    @Nullable
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public void e(@Nullable e.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.d
    public void f(@Nullable e.a aVar) {
    }
}
