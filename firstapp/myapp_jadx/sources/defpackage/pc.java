package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;

/* JADX INFO: loaded from: classes5.dex */
public final class pc implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ImageButton c;
    public final TabLayout d;
    public final ImageButton e;
    public final LoadingViewNew f;
    public final ComposeView i;
    public final View v;
    public final SwipeRefreshLayout w;

    public pc(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, TabLayout tabLayout, ImageButton imageButton3, LoadingViewNew loadingViewNew, ComposeView composeView, View view, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = imageButton2;
        this.d = tabLayout;
        this.e = imageButton3;
        this.f = loadingViewNew;
        this.i = composeView;
        this.v = view;
        this.w = swipeRefreshLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
