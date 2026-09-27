package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zd extends j6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib f75983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ib f75984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f75986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yd f75987i;

    public zd(Context context, ib ibVar, ib ibVar2, String str, String str2) {
        super(context, 1000L);
        this.f75987i = new yd(this);
        this.f75983e = ibVar;
        this.f75984f = ibVar2;
        this.f75985g = str;
        this.f75986h = str2;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a() {
        Object objA;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            objA = a(((sf) this.f75983e.a()).getString(this.f75985g, null));
        }
        return objA;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            try {
                rf rfVarEdit = ((sf) this.f75983e.a()).edit();
                String str = this.f75985g;
                String strC = c(obj);
                rfVarEdit.a(str, strC);
                rfVarEdit.f75462a.putString(str, strC);
                String str2 = this.f75986h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                rfVarEdit.a(str2, Long.valueOf(jCurrentTimeMillis));
                rfVarEdit.f75462a.putLong(str2, jCurrentTimeMillis);
                rfVarEdit.apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(Math.max(60000L, d()));
    }

    public String c(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public abstract long d();

    public final synchronized void e() {
        a(Math.max(0L, (Math.max(60000L, d()) + ((sf) this.f75983e.a()).getLong(this.f75986h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j10) {
        if (f()) {
            k8 k8Var = (k8) this.f75984f.a();
            k8Var.f75082a.removeCallbacks(this.f75987i);
            k8 k8Var2 = (k8) this.f75984f.a();
            k8Var2.f75082a.postDelayed(this.f75987i, j10);
        }
    }
}
