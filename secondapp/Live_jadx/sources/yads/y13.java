package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y13 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a23 f158102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db3 f158103b;

    public y13(a23 a23Var, db3 db3Var) {
        this.f158102a = a23Var;
        this.f158103b = db3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f158103b.a(view.getContext(), this.f158102a.f146627a);
    }
}
