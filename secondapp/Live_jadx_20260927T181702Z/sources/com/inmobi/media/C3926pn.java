package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3926pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv.s0 f57352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaPlayer f57353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3862n9 f57354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f57356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ud f57357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f57358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ij f57359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Wm f57360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3901on f57361j;

    public C3926pn(jv.s0 coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, Qm config, C3862n9 c3862n9) {
        kotlin.jvm.internal.m0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.m0.p(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.m0.p(mediaPlayerLayout, "mediaPlayerLayout");
        kotlin.jvm.internal.m0.p(config, "config");
        this.f57352a = coroutineScope;
        this.f57353b = mediaPlayer;
        this.f57354c = c3862n9;
        this.f57355d = new AtomicBoolean(false);
        this.f57356e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        kotlin.jvm.internal.m0.o(context, "getContext(...)");
        C3709h5 c3709h5 = new C3709h5(context);
        this.f57357f = new Ud(c3709h5, mediaPlayerLayout, mediaPlayer, c3862n9);
        this.f57360i = new Wm(coroutineScope, c3709h5, config.f55398e);
        this.f57361j = new C3901on(this);
    }

    public final void a() {
        if (this.f57358g != null && this.f57355d.get()) {
            C4093wg c4093wg = (C4093wg) this.f57360i.f55753d.getValue();
            c4093wg.f58020f.set(false);
            c4093wg.a();
        } else {
            C4093wg c4093wg2 = (C4093wg) this.f57360i.f55753d.getValue();
            c4093wg2.f58016b.setValue(Mn.HIDDEN);
            c4093wg2.f58020f.set(true);
            H6.a(c4093wg2.f58019e);
            c4093wg2.f58019e = null;
        }
    }

    public final void b() {
        P4.a(this.f57356e);
        Ud ud2 = this.f57357f;
        ud2.f55628e = null;
        ud2.f55624a.setSurfaceTextureListener(null);
        ud2.f55626c.setOnVideoSizeChangedListener(null);
        C4093wg c4093wg = (C4093wg) this.f57360i.f55753d.getValue();
        c4093wg.f58020f.set(true);
        H6.a(c4093wg.f58019e);
        c4093wg.f58019e = null;
        Surface surface = this.f57358g;
        if (surface != null) {
            surface.release();
        }
        this.f57358g = null;
        this.f57359h = null;
    }
}
