package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class w3t implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final ComposeView c;
    public final ComposeView d;
    public final do80 e;

    public w3t(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, do80 do80Var) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = composeView3;
        this.e = do80Var;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
