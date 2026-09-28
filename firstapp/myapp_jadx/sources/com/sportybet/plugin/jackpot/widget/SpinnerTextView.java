package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;

/* JADX INFO: loaded from: classes4.dex */
public class SpinnerTextView extends AppCompatTextView {
    public boolean v;

    public SpinnerTextView(Context context) {
        super(context);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(context, this.v ? R.drawable.jap_arrow_up : R.drawable.jap_arrow_down), (Drawable) null);
    }

    public void setChecked(boolean z) {
        this.v = z;
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(getContext(), this.v ? R.drawable.jap_arrow_up : R.drawable.jap_arrow_down), (Drawable) null);
    }

    public SpinnerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(context, this.v ? R.drawable.jap_arrow_up : R.drawable.jap_arrow_down), (Drawable) null);
    }
}
