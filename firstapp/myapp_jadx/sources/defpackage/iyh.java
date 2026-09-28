package defpackage;

import android.view.View;
import com.google.android.material.floatingtoolbar.FloatingToolbarLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class iyh implements zmy {
    public final /* synthetic */ FloatingToolbarLayout a;

    public iyh(FloatingToolbarLayout floatingToolbarLayout) {
        this.a = floatingToolbarLayout;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        FloatingToolbarLayout floatingToolbarLayout = this.a;
        if (!floatingToolbarLayout.a && !floatingToolbarLayout.c && !floatingToolbarLayout.b && !floatingToolbarLayout.d) {
            return l8j0Var;
        }
        ymn ymnVarG = l8j0Var.a.g(655);
        floatingToolbarLayout.f = ymnVarG.d;
        floatingToolbarLayout.i = ymnVarG.b;
        floatingToolbarLayout.w = ymnVarG.c;
        floatingToolbarLayout.v = ymnVarG.a;
        floatingToolbarLayout.a();
        return l8j0Var;
    }
}
