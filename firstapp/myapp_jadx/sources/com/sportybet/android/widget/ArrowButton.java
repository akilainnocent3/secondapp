package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.sportybet.android.gp.tz.R;
import defpackage.iwh0;
import defpackage.rk30;

/* JADX INFO: loaded from: classes6.dex */
public class ArrowButton extends AppCompatImageButton {
    public final boolean d;

    public ArrowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.a);
        this.d = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setStateAvailable(boolean z) {
        setImageDrawable(iwh0.a(getContext(), this.d ? R.drawable.spr_ic_arrow_drop_up_green_24dp : R.drawable.spr_ic_arrow_drop_down_green_24dp, getContext().getColor(z ? R.color.brand_quaternary : R.color.brand_secondary_disable)));
    }

    public ArrowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArrowButton(Context context) {
        this(context, null);
    }
}
