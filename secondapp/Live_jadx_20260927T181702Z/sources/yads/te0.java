package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class te0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f03 f155857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f155858b;

    public te0(View view, f03 f03Var) {
        this.f155857a = f03Var;
        this.f155858b = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f155858b.get();
        if (view != null) {
            this.f155857a.b(view);
        }
    }
}
