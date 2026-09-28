package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class l2p implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final View c;
    public final ShimmerFrameLayout d;
    public final ShimmerFrameLayout e;

    public l2p(ConstraintLayout constraintLayout, View view, View view2, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = view2;
        this.d = shimmerFrameLayout;
        this.e = shimmerFrameLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
