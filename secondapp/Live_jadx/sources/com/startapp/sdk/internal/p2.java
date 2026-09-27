package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f75357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f75358b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f75359c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75360d = false;

    public p2(w2 w2Var) {
        this.f75357a = w2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f75359c = null;
        this.f75360d = false;
        w2 w2Var = this.f75357a;
        w2Var.getClass();
        MetaData metaDataE = MetaData.E();
        if (metaDataE.f0() && w2Var.f75767w < metaDataE.Y()) {
            w2Var.f75767w++;
            w2Var.a(null, null, true, false, null);
        } else {
            m mVar = w2Var.f75770z;
            if (mVar != null) {
                mVar.a(w2Var);
            }
        }
    }

    public final void d() {
        if (this.f75360d) {
            return;
        }
        if (this.f75359c == null) {
            this.f75359c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f75358b == null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.getMainLooper();
                }
                this.f75358b = new Handler(looperMyLooper);
            }
            long jB = b();
            if (jB >= 0) {
                this.f75360d = true;
                this.f75358b.postDelayed(new o2(this), jB);
            }
        }
    }

    public final void e() {
        Handler handler = this.f75358b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f75359c = null;
        this.f75360d = false;
    }
}
