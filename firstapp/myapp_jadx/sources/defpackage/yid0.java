package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class yid0 implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final xid0 c;

    public yid0(ConstraintLayout constraintLayout, ComposeView composeView, xid0 xid0Var) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = xid0Var;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
