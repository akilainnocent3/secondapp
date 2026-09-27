package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f47646b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f47653i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47647c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47648d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f47649e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47650f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47651g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47652h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f47654j = new b(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.j f47645a = new com.fyber.inneractive.sdk.util.j(4, new c());

    public d(com.fyber.inneractive.sdk.response.f fVar, RelativeLayout relativeLayout, g gVar) {
        this.f47646b = relativeLayout;
        this.f47653i = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    public final void a() {
        boolean z10;
        String str;
        IAlog.a("IAVisibilityTracker: onCheckVisibility", new Object[0]);
        float f10 = this.f47648d / 100.0f;
        com.fyber.inneractive.sdk.util.j jVar = this.f47645a;
        Object objPoll = jVar.f47870a.poll();
        if (objPoll == null) {
            objPoll = jVar.f47871b.a();
        }
        Rect rect = (Rect) objPoll;
        RelativeLayout relativeLayout = this.f47646b;
        float fWidth = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.f47645a.f47870a.offer(rect);
        this.f47647c = fWidth;
        if (fWidth >= f10) {
            float f11 = this.f47649e * 1000.0f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f47650f;
            if (f11 >= jCurrentTimeMillis - j10 || j10 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z10), Float.valueOf(f10));
        if (!z10 || !this.f47651g) {
            if (this.f47651g) {
                float f12 = this.f47647c;
                if (f12 < f10) {
                    this.f47650f = 0L;
                } else if (f12 >= f10 && this.f47650f == 0) {
                    this.f47650f = System.currentTimeMillis();
                }
                Handler handler = com.fyber.inneractive.sdk.util.r.f47892b;
                handler.removeCallbacks(this.f47654j);
                handler.postDelayed(this.f47654j, 50L);
                return;
            }
            return;
        }
        if (this.f47653i == null || this.f47652h) {
            return;
        }
        this.f47652h = true;
        IAlog.a("BannerVisibilityTracker | firing viewable", new Object[0]);
        l lVar = this.f47653i.f47659a;
        lVar.getClass();
        try {
            com.fyber.inneractive.sdk.flow.x xVar = lVar.f44618b;
            if (xVar == null || ((q0) xVar).f45032b == null || (str = ((com.fyber.inneractive.sdk.response.f) ((q0) xVar).f45032b).f47740x) == null || str.trim().length() <= 0) {
                return;
            }
            IAlog.e("%sfiring banner mrc visibility impression!", IAlog.a(lVar));
            z0.b(str);
        } catch (Exception unused) {
        }
    }
}
