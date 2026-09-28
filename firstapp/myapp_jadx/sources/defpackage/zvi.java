package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class zvi implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ComposeView d;
    public final View e;
    public final FragmentContainerView f;

    public zvi(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ComposeView composeView, View view, FragmentContainerView fragmentContainerView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = composeView;
        this.e = view;
        this.f = fragmentContainerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
