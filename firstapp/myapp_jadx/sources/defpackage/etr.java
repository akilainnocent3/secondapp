package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class etr implements g6i0 {
    public final CardView a;
    public final TextView b;
    public final ShimmerFrameLayout c;
    public final TextView d;

    public etr(CardView cardView, TextView textView, ShimmerFrameLayout shimmerFrameLayout, TextView textView2) {
        this.a = cardView;
        this.b = textView;
        this.c = shimmerFrameLayout;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
