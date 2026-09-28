package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes6.dex */
public final class lvi implements g6i0 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final AppCompatImageView c;
    public final SimpleDescriptionListView d;
    public final AppCompatTextView e;
    public final HintView f;
    public final LoadingViewNew i;
    public final ComposeView v;
    public final LoadingViewNew w;
    public final AppCompatTextView y;

    public lvi(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, SimpleDescriptionListView simpleDescriptionListView, AppCompatTextView appCompatTextView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView, LoadingViewNew loadingViewNew2, AppCompatTextView appCompatTextView2) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = appCompatImageView;
        this.d = simpleDescriptionListView;
        this.e = appCompatTextView;
        this.f = hintView;
        this.i = loadingViewNew;
        this.v = composeView;
        this.w = loadingViewNew2;
        this.y = appCompatTextView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
