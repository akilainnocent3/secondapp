package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3901on implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3926pn f57248a;

    public C3901on(C3926pn c3926pn) {
        this.f57248a = c3926pn;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surface) {
        kotlin.jvm.internal.m0.p(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3926pn c3926pn = this.f57248a;
        c3926pn.f57358g = surface2;
        MediaPlayer mediaPlayer = c3926pn.f57353b;
        kotlin.jvm.internal.m0.p(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (IllegalStateException unused) {
        }
        this.f57248a.a();
        Ij ij2 = this.f57248a.f57359h;
        if (ij2 != null) {
            ij2.c();
        }
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        Surface surface = this.f57248a.f57358g;
        if (surface != null) {
            surface.release();
        }
        C3926pn c3926pn = this.f57248a;
        c3926pn.f57358g = null;
        MediaPlayer mediaPlayer = c3926pn.f57353b;
        kotlin.jvm.internal.m0.p(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.f57248a.a();
    }
}
