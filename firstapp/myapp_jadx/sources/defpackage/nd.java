package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class nd implements g6i0 {
    public final ConstraintLayout a;
    public final ij90 b;
    public final ComposeView c;

    public nd(ConstraintLayout constraintLayout, ij90 ij90Var, ComposeView composeView) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = composeView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
