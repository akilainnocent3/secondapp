package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class g9j0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ jvd0 a;

    public g9j0(jvd0 jvd0Var) {
        this.a = jvd0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.a.cancel((CancellationException) null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
