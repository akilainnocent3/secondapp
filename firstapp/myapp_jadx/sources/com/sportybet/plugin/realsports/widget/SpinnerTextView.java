package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;

/* JADX INFO: loaded from: classes7.dex */
public class SpinnerTextView extends TextView {
    public boolean a;

    public SpinnerTextView(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        setBackgroundResource(this.a ? R.drawable.spr_green_text_up_bg : R.drawable.spr_green_text_down_bg);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(context, this.a ? R.drawable.spr_arrow_up_white_32_32dp : R.drawable.spr_arrow_down_jungle_green_32_32dp), (Drawable) null);
    }

    public void setChecked(boolean z) {
        this.a = z;
        setBackgroundResource(z ? R.drawable.spr_green_text_up_bg : R.drawable.spr_green_text_down_bg);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(getContext(), this.a ? R.drawable.spr_arrow_up_white_32_32dp : R.drawable.spr_arrow_down_jungle_green_32_32dp), (Drawable) null);
    }

    public SpinnerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
