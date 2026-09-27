package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3709h5 f55624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f55625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f55626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3862n9 f55627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f55628e;

    public Ud(C3709h5 textureView, RelativeLayout parentView, MediaPlayer mediaPlayer, C3862n9 c3862n9) {
        kotlin.jvm.internal.m0.p(textureView, "textureView");
        kotlin.jvm.internal.m0.p(parentView, "parentView");
        kotlin.jvm.internal.m0.p(mediaPlayer, "mediaPlayer");
        this.f55624a = textureView;
        this.f55625b = parentView;
        this.f55626c = mediaPlayer;
        this.f55627d = c3862n9;
    }

    public final void a(Hj surfaceTextureListener) {
        kotlin.jvm.internal.m0.p(surfaceTextureListener, "surfaceTextureListener");
        this.f55628e = surfaceTextureListener;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f55625b.addView(this.f55624a, layoutParams);
        a();
        int videoWidth = this.f55626c.getVideoWidth();
        int videoHeight = this.f55626c.getVideoHeight();
        if (videoHeight == 0) {
            this.f55624a.setAspectRatio(1.0f);
        } else {
            this.f55624a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f55624a.setSurfaceTextureListener(new Td(this));
    }

    public final void a() {
        this.f55626c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.tu
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                Ud.a(this.f57750b, mediaPlayer, i10, i11);
            }
        });
    }

    public static final void a(Ud ud2, MediaPlayer mediaPlayer, int i10, int i11) {
        C3862n9 c3862n9 = ud2.f55627d;
        if (c3862n9 != null) {
            c3862n9.a("NativePlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int videoWidth = ud2.f55626c.getVideoWidth();
        int videoHeight = ud2.f55626c.getVideoHeight();
        if (videoHeight == 0) {
            ud2.f55624a.setAspectRatio(1.0f);
        } else {
            ud2.f55624a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
