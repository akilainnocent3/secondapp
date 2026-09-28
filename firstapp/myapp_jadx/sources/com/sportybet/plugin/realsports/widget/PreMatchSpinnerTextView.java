package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.PreMatchSpinnerTextView;
import defpackage.iwh0;
import defpackage.lk20;

/* JADX INFO: loaded from: classes7.dex */
public class PreMatchSpinnerTextView extends AppCompatTextView {
    public static final /* synthetic */ int A = 0;
    public boolean v;
    public int w;
    public int y;
    public lk20 z;

    public PreMatchSpinnerTextView(Context context) {
        super(context);
        g(context);
    }

    public final void g(Context context) {
        setTextColor(context.getColor(R.color.text_type1_tertiary));
        this.w = context.getColor(R.color.text_disable_type1_primary);
        int color = context.getColor(R.color.brand_secondary);
        this.y = color;
        boolean z = this.v;
        int i = z ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down;
        if (!z) {
            color = this.w;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(context, i, color), (Drawable) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Runnable, lk20] */
    public void setExpanded(final boolean z, int i) {
        lk20 lk20Var = this.z;
        if (lk20Var != null) {
            removeCallbacks(lk20Var);
        }
        if (i == 0) {
            this.v = z;
        } else {
            ?? r0 = new Runnable() { // from class: lk20
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = PreMatchSpinnerTextView.A;
                    this.a.v = z;
                }
            };
            this.z = r0;
            postDelayed(r0, i);
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(getContext(), z ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down, z ? this.y : this.w), (Drawable) null);
    }

    public PreMatchSpinnerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, 0);
    }
}
