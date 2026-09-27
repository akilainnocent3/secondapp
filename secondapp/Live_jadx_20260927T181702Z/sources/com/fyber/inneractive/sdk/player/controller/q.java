package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45518a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f45521d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f45523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45524g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f45526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextureView f45527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f45528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Surface f45529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f45530m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45532o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f45522e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45531n = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f45519b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f45520c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.h f45525h = new com.fyber.inneractive.sdk.player.h(this);

    public q(Context context) {
        this.f45518a = context.getApplicationContext();
        this.f45526i = new Handler(context.getMainLooper());
        a(true);
    }

    public void a() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        k();
        this.f45525h = null;
        com.fyber.inneractive.sdk.util.v.a(this.f45527j);
        this.f45527j = null;
        SurfaceTexture surfaceTexture = this.f45528k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f45528k = null;
        }
        Surface surface = this.f45529l;
        if (surface != null) {
            surface.release();
            this.f45529l = null;
        }
        this.f45526i.removeCallbacksAndMessages(null);
        this.f45519b.clear();
        this.f45523f = null;
        this.f45524g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void a(int i10, boolean z10);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i10);

    public abstract void a(boolean z10);

    public abstract int b();

    public abstract void b(boolean z10);

    public abstract int c();

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f45523f;
        if (cVar == null || (fVar = cVar.f45432a.f47252e) == null) {
            return;
        }
        if (z10) {
            if (fVar.f45102c == null || !fVar.f45103d) {
                return;
            }
            IAlog.a("%s mute", "OMVideo");
            try {
                fVar.f45102c.volumeChange(0.0f);
                return;
            } catch (Throwable th2) {
                fVar.a(th2);
                return;
            }
        }
        if (fVar.f45102c == null || !fVar.f45103d) {
            return;
        }
        IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.f45102c.volumeChange(1.0f);
        } catch (Throwable th3) {
            fVar.a(th3);
        }
    }

    public abstract String d();

    public abstract void d(boolean z10);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public boolean h() {
        return this.f45522e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.f45525h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.f47265b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.f47265b = null;
    }

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f45527j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f45527j = textureView;
            if (textureView != null) {
                i iVar = this.f45530m;
                if (iVar == null) {
                    iVar = new i(this);
                    this.f45530m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.f45528k != null) {
                IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(this));
                if (this.f45527j.getSurfaceTexture() != null && this.f45527j.getSurfaceTexture().equals(this.f45528k)) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(this));
                } else {
                    IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(this));
                    this.f45527j.setSurfaceTexture(this.f45528k);
                }
            }
        }
    }

    public static void a(q qVar, SurfaceTexture surfaceTexture) {
        boolean zEquals = surfaceTexture.equals(qVar.f45528k);
        SurfaceTexture surfaceTexture2 = qVar.f45528k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.f45528k = surfaceTexture;
        Surface surface = qVar.f45529l;
        if (surface == null || !zEquals) {
            if (surface != null) {
                surface.release();
            }
            qVar.f45529l = new Surface(qVar.f45528k);
        }
        qVar.a(qVar.f45529l);
    }

    public void a(int i10) {
        this.f45526i.post(new l(this, i10));
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f45522e) {
            return;
        }
        this.f45522e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.f45525h;
            if (hVar != null && hVar.f47265b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                hVar.f47265b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.f47266c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.f45526i.post(new m(this, bVar));
    }
}
