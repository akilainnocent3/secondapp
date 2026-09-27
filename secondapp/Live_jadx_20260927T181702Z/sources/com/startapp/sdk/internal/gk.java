package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class gk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f74914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f74915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f74916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f74917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f74918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Point f74919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xf f74920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BannerOptions f74921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74922i;

    public gk(View view, Point point, xf xfVar, BannerOptions bannerOptions) {
        this.f74914a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f74917d = new Handler(Looper.getMainLooper());
        this.f74922i = true;
        this.f74918e = new WeakReference(view);
        this.f74919f = point;
        this.f74920g = xfVar;
        this.f74921h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            xf xfVar = this.f74920g;
            if (xfVar != null && (notDisplayedReason = this.f74914a) != null) {
                xfVar.a(notDisplayedReason.toString(), this.f74915b);
            }
            this.f74917d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = fk.a((View) this.f74918e.get(), this.f74919f, this.f74921h, atomicReference, false).f75066d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f74914a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f74914a = notDisplayedReason2;
            this.f74915b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        xf xfVar = this.f74920g;
        return (xfVar == null || xfVar.f75836j.get() != 0 || this.f74918e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean zB = b();
            if (zB && this.f74922i) {
                this.f74922i = false;
                this.f74920g.c();
            } else if (!zB && !this.f74922i) {
                this.f74922i = true;
                this.f74920g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f74916c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.f74917d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f74914a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public gk(WeakReference weakReference, xf xfVar, BannerOptions bannerOptions) {
        this.f74914a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f74917d = new Handler(Looper.getMainLooper());
        this.f74922i = true;
        this.f74918e = weakReference;
        this.f74919f = null;
        this.f74920g = xfVar;
        this.f74921h = bannerOptions;
    }
}
