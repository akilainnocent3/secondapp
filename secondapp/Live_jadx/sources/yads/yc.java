package yads;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yc implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f158223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke1 f158224b;

    public yc(Dialog dialog, ke1 ke1Var) {
        this.f158223a = dialog;
        this.f158224b = ke1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f158224b.getClass();
        ke1.a(view);
        ng0.a(this.f158223a);
    }
}
