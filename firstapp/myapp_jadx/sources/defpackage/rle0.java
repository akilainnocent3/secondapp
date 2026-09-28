package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class rle0 extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public rle0(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        float f2 = swipeRefreshLayout.M;
        swipeRefreshLayout.setAnimationProgress(((-f2) * f) + f2);
        swipeRefreshLayout.e(f);
    }
}
