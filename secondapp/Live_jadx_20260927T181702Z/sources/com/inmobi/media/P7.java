package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3709h5 f55298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f55299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayer f55300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3837m9 f55301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f55302e;

    public P7(C3709h5 textureView, G1 parentView, ExoPlayer mediaPlayer, InterfaceC3837m9 interfaceC3837m9) {
        kotlin.jvm.internal.m0.p(textureView, "textureView");
        kotlin.jvm.internal.m0.p(parentView, "parentView");
        kotlin.jvm.internal.m0.p(mediaPlayer, "mediaPlayer");
        this.f55298a = textureView;
        this.f55299b = parentView;
        this.f55300c = mediaPlayer;
        this.f55301d = interfaceC3837m9;
    }

    public final void a(int i10, int i11) {
        InterfaceC3837m9 interfaceC3837m9 = this.f55301d;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int i12 = this.f55300c.n().f138742a;
        int i13 = this.f55300c.n().f138743b;
        if (i13 == 0) {
            this.f55298a.setAspectRatio(1.0f);
        } else {
            this.f55298a.setAspectRatio(i12 / i13);
        }
    }

    public final void a(Hj surfaceTextureListener) {
        kotlin.jvm.internal.m0.p(surfaceTextureListener, "surfaceTextureListener");
        this.f55302e = surfaceTextureListener;
        this.f55299b.addView(this.f55298a, new FrameLayout.LayoutParams(-1, -1));
        int i10 = this.f55300c.n().f138742a;
        int i11 = this.f55300c.n().f138743b;
        if (i11 == 0) {
            this.f55298a.setAspectRatio(1.0f);
        } else {
            this.f55298a.setAspectRatio(i10 / i11);
        }
        this.f55298a.setSurfaceTextureListener(new O7(this));
    }
}
