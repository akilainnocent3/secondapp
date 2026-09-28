package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class hth implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ith a;

    public hth(ith ithVar) {
        this.a = ithVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.a);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
