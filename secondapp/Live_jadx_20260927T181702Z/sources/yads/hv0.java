package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f150316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z52 f150317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d72 f150318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f150319d;

    public /* synthetic */ hv0(Context context, w5 w5Var) {
        this(w5Var, new z52(context), new d72());
    }

    public final void a() {
        synchronized (this.f150319d) {
            this.f150317b.a();
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public hv0(w5 w5Var, z52 z52Var, d72 d72Var) {
        this.f150316a = w5Var;
        this.f150317b = z52Var;
        this.f150318c = d72Var;
        this.f150319d = new Object();
    }
}
