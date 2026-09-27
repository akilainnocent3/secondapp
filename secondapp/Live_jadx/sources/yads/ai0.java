package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ai0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f146811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f146812b;

    public ai0(zh0 zh0Var, ci0 ci0Var) {
        this.f146811a = zh0Var;
        this.f146812b = ci0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.f146811a.a(this.f146812b.f147738a, view);
        }
    }
}
