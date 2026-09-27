package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class O7 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P7 f55258a;

    public O7(P7 p10) {
        this.f55258a = p10;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.m0.p(surface, "surface");
        Hj hj2 = this.f55258a.f55302e;
        if (hj2 != null) {
            hj2.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        kotlin.jvm.internal.m0.p(surface, "surface");
        Hj hj2 = this.f55258a.f55302e;
        if (hj2 == null) {
            return true;
        }
        hj2.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.m0.p(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        kotlin.jvm.internal.m0.p(surface, "surface");
    }
}
