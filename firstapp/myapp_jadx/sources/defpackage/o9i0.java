package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class o9i0 implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ p9i0<View> b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ bc6 d;

    public o9i0(p9i0 p9i0Var, ViewTreeObserver viewTreeObserver, bc6 bc6Var) {
        this.b = p9i0Var;
        this.c = viewTreeObserver;
        this.d = bc6Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        p9i0<View> p9i0Var = this.b;
        ww90 ww90VarA = p9i0Var.a();
        if (ww90VarA != null) {
            p9i0Var.q(this.c, this);
            if (!this.a) {
                this.a = true;
                zi50.a aVar = zi50.b;
                this.d.resumeWith(ww90VarA);
            }
        }
        return true;
    }
}
