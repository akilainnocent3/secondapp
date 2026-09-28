package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class r4p implements g6i0 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final NextButtonLayout c;
    public final ComposeView d;
    public final InstantWinFooterLayout e;
    public final NestedScrollView f;

    public r4p(ConstraintLayout constraintLayout, RecyclerView recyclerView, NextButtonLayout nextButtonLayout, ComposeView composeView, InstantWinFooterLayout instantWinFooterLayout, NestedScrollView nestedScrollView) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = nextButtonLayout;
        this.d = composeView;
        this.e = instantWinFooterLayout;
        this.f = nestedScrollView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
