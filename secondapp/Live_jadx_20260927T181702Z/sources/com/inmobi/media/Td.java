package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Td implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ud f55542a;

    public Td(Ud ud2) {
        this.f55542a = ud2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.m0.p(surface, "surface");
        Hj hj2 = this.f55542a.f55628e;
        if (hj2 != null) {
            hj2.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        kotlin.jvm.internal.m0.p(surface, "surface");
        Hj hj2 = this.f55542a.f55628e;
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
