package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p8j0 implements tse {
    public final /* synthetic */ q8j0 a;
    public final /* synthetic */ View b;

    public p8j0(q8j0 q8j0Var, View view) {
        this.a = q8j0Var;
        this.b = view;
    }

    @Override // defpackage.tse
    public final void dispose() {
        q8j0 q8j0Var = this.a;
        int i = q8j0Var.t - 1;
        q8j0Var.t = i;
        if (i == 0) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            View view = this.b;
            r6i0.d.n(view, null);
            h8j0.a(view, null);
            view.removeOnAttachStateChangeListener(q8j0Var.u);
        }
    }
}
