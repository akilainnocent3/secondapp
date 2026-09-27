package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kj2 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f151559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f151560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f151561c;

    public kj2(View view, am0 am0Var, z30 z30Var) {
        this.f151559a = am0Var;
        this.f151560b = z30Var;
        this.f151561c = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f151561c.get();
        if (view != null) {
            this.f151559a.b(view);
            this.f151560b.a(y30.f158113e);
        }
    }
}
