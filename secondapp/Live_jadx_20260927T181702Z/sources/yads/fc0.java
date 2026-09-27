package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fc0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f149044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f149045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f149046c;

    public fc0(View view, cw cwVar, z30 z30Var) {
        this.f149044a = cwVar;
        this.f149045b = z30Var;
        this.f149046c = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f149046c.get();
        if (view != null) {
            this.f149044a.b(view);
            this.f149045b.a(y30.f158113e);
        }
    }
}
