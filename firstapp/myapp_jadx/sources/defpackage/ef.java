package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ef implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final LinearLayout c;

    public ef(ConstraintLayout constraintLayout, ComposeView composeView, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = linearLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
