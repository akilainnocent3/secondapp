package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5322qa f95952a = new C5322qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f95953b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5080gm f95954c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gl f95955d = new Gl(this);

    public static final Il a() {
        return Hl.f95914a;
    }

    public final Bm a(Context context, R4 r10, C4925am c4925am) {
        Bm bm2 = (Bm) this.f95953b.get(r10.f96407a);
        boolean z10 = true;
        if (bm2 == null) {
            synchronized (this.f95953b) {
                try {
                    bm2 = (Bm) this.f95953b.get(r10.f96407a);
                    if (bm2 == null) {
                        bm2 = new Bm(new Cm(context, r10.f96407a, c4925am, this.f95955d));
                        bm2.f();
                        this.f95953b.put(r10.f96407a, bm2);
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            bm2.a(c4925am);
        }
        return bm2;
    }

    public final void a(R4 r10, Rl rl2) {
        synchronized (this.f95953b) {
            try {
                this.f95952a.a(r10.f96407a, rl2);
                C5080gm c5080gm = this.f95954c;
                if (c5080gm != null) {
                    rl2.a(c5080gm);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
