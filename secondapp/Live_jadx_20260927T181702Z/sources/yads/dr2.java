package yads;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq2 f148330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk2 f148331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f148332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f148333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f148334e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00 f148335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f148336g;

    public dr2(wq2 wq2Var, vk2 vk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f148330a = wq2Var;
        this.f148331b = vk2Var;
        this.f148332c = rh1Var;
        this.f148333d = mh1Var;
        this.f148335f = wq2Var.d();
        this.f148336g = wq2Var.e();
        wq2Var.a(vk2Var);
    }

    public final void a(final Activity activity) {
        this.f148332c.a();
        this.f148333d.a(new Runnable() { // from class: yads.rz3
            @Override // java.lang.Runnable
            public final void run() {
                dr2.a(this.f155207b, activity);
            }
        });
    }

    public static final void a(dr2 dr2Var, Activity activity) {
        if (!dr2Var.f148334e.getAndSet(true)) {
            Throwable thE = dr.i1.e(dr2Var.f148330a.a(activity));
            if (thE != null) {
                dr2Var.f148331b.a(new n7(String.valueOf(thE.getMessage())));
                return;
            }
            return;
        }
        dr2Var.f148331b.a(o7.f153372a);
    }
}
