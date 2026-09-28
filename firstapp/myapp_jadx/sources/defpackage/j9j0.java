package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j9j0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ wj40 b;

    public j9j0(View view, wj40 wj40Var) {
        this.a = view;
        this.b = wj40Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
