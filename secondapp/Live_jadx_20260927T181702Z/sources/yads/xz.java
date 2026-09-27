package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xz implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx1 f158061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f158062b;

    public xz(bx1 bx1Var, vw1 vw1Var) {
        this.f158061a = bx1Var;
        this.f158062b = vw1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        vw1 vw1Var = this.f158062b;
        if (vw1Var != null) {
            vw1Var.a();
            vw1Var.f157111f = false;
        }
        bx1 bx1Var = this.f158061a;
        if (bx1Var.f147389c) {
            bx1Var.a("first_click_on_controls");
            bx1Var.f147389c = false;
        }
    }

    public /* synthetic */ xz(bx1 bx1Var, vw1 vw1Var, int i10) {
        this(bx1Var, vw1Var);
    }
}
