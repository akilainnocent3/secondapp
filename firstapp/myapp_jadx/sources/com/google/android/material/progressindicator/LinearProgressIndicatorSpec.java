package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.sportybet.android.gp.tz.R;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.j42;
import defpackage.pk30;

/* JADX INFO: loaded from: classes4.dex */
public final class LinearProgressIndicatorSpec extends j42 {
    public int o;
    public int p;
    public boolean q;
    public int r;
    public Integer s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i2 = LinearProgressIndicator.D;
        gof0.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = pk30.y;
        gof0.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        this.o = typedArrayObtainStyledAttributes.getInt(0, 1);
        this.p = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.r = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), this.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.s = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (i3 == 6) {
                this.u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
        this.q = this.p == 1;
    }

    @Override // defpackage.j42
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // defpackage.j42
    public final void d() {
        super.d();
        if (this.r < 0) {
            hb5.a("Stop indicator size must be >= 0.");
            return;
        }
        if (this.o == 0) {
            if ((a() > 0 || (this.w && e() > 0)) && this.i == 0) {
                hb5.a("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                hb5.a("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        if (this.w) {
            return this.v ? (int) (this.a * this.u) : this.t;
        }
        return a();
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }
}
