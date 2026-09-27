package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vx1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa1 f157121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7 f157122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r91 f157123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ux1 f157124d;

    public vx1(pa1 pa1Var, b7 b7Var, r91 r91Var, ux1 ux1Var) {
        this.f157121a = pa1Var;
        this.f157122b = b7Var;
        this.f157123c = r91Var;
        this.f157124d = ux1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = this.f157121a.getVolume() == 0.0f;
        boolean z11 = !z10;
        this.f157122b.f147095a.setVolume(z10 ? this.f157123c.f154821b : 0.0f);
        ux1 ux1Var = this.f157124d;
        if (ux1Var != null) {
            ux1Var.setMuted(z11);
        }
    }
}
