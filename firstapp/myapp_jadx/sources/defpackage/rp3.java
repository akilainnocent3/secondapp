package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes6.dex */
public final class rp3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ r4p a;
    public final /* synthetic */ jp3 b;

    public rp3(jp3 jp3Var, r4p r4pVar) {
        this.a = r4pVar;
        this.b = jp3Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        jp3 jp3Var = this.b;
        int size = ((n4p) jp3Var.s0()).d.size();
        y03 y03Var = jp3Var.B;
        if (y03Var != null) {
            y03Var.M0(jp3Var.m0(size), jp3Var.v);
        }
    }
}
