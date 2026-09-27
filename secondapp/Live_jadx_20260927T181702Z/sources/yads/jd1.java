package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd1 f151043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk2 f151044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f151045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f151046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f151047e = new AtomicBoolean(false);

    public jd1(cd1 cd1Var, tk2 tk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f151043a = cd1Var;
        this.f151044b = tk2Var;
        this.f151045c = rh1Var;
        this.f151046d = mh1Var;
        cd1Var.a(tk2Var);
    }

    public final void a(final Activity activity) {
        this.f151045c.a();
        this.f151046d.a(new Runnable() { // from class: yads.t24
            @Override // java.lang.Runnable
            public final void run() {
                jd1.a(this.f155681b, activity);
            }
        });
    }

    public static final void a(jd1 jd1Var, Activity activity) {
        if (!jd1Var.f151047e.getAndSet(true)) {
            Throwable thE = dr.i1.e(jd1Var.f151043a.a(activity));
            if (thE != null) {
                jd1Var.f151044b.a(new n7(String.valueOf(thE.getMessage())));
                return;
            }
            return;
        }
        jd1Var.f151044b.a(o7.f153372a);
    }
}
