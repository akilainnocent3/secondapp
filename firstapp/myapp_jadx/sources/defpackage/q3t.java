package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class q3t implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final FrameLayout c;
    public final ComposeView d;
    public final do80 e;

    public q3t(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, ComposeView composeView2, do80 do80Var) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = frameLayout;
        this.d = composeView2;
        this.e = do80Var;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
