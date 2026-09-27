package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh f156421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rk2 f156422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f156423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f156424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f156425e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dr.i0 f156426f = dr.k0.b(new th(this));

    public uh(kh khVar, rk2 rk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f156421a = khVar;
        this.f156422b = rk2Var;
        this.f156423c = rh1Var;
        this.f156424d = mh1Var;
        khVar.a(rk2Var);
    }

    public final void a(final Activity activity) {
        this.f156423c.a();
        this.f156424d.a(new Runnable() { // from class: yads.xb4
            @Override // java.lang.Runnable
            public final void run() {
                uh.a(this.f157769b, activity);
            }
        });
    }

    public static final void a(uh uhVar, Activity activity) {
        if (!uhVar.f156425e.getAndSet(true)) {
            Throwable thE = dr.i1.e(uhVar.f156421a.a(activity));
            if (thE != null) {
                uhVar.f156422b.a(new n7(String.valueOf(thE.getMessage())));
                return;
            }
            return;
        }
        uhVar.f156422b.a(o7.f153372a);
    }
}
