package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w9i0 implements View.OnAttachStateChangeListener {
    public final View a;
    public t9i0 b;
    public jvd0 c;
    public u9i0 d;
    public boolean e;

    public w9i0(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        u9i0 u9i0Var = this.d;
        if (u9i0Var == null) {
            return;
        }
        this.e = true;
        u9i0Var.a.a(u9i0Var.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u9i0 u9i0Var = this.d;
        if (u9i0Var != null) {
            u9i0Var.d();
        }
    }
}
