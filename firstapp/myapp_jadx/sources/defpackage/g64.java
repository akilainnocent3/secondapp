package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class g64 {
    public final y8i0 a;
    public final int b;

    public g64(y8i0 y8i0Var) {
        this.a = y8i0Var;
        ViewGroup.LayoutParams layoutParams = y8i0Var.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.b = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
    }

    public final void a(boolean z) {
        LinearLayout linearLayout = this.a.a;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int dimensionPixelSize = this.b + (z ? linearLayout.getResources().getDimensionPixelSize(R.dimen.flash_boost_pill_height) : 0);
        if (marginLayoutParams.topMargin == dimensionPixelSize) {
            return;
        }
        marginLayoutParams.topMargin = dimensionPixelSize;
        linearLayout.setLayoutParams(marginLayoutParams);
    }
}
