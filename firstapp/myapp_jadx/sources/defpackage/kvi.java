package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;

/* JADX INFO: loaded from: classes6.dex */
public final class kvi implements g6i0 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final LoadingViewNew c;
    public final ComposeView d;
    public final LoadingViewNew e;
    public final ComposeView f;

    public kvi(FrameLayout frameLayout, FrameLayout frameLayout2, LoadingViewNew loadingViewNew, ComposeView composeView, LoadingViewNew loadingViewNew2, ComposeView composeView2) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = loadingViewNew;
        this.d = composeView;
        this.e = loadingViewNew2;
        this.f = composeView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
