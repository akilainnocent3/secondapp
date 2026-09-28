package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.sportybet.android.gp.tz.R;
import defpackage.bfn;
import defpackage.cfn;
import defpackage.dbe;
import defpackage.eo7;
import defpackage.fo7;
import defpackage.hwh0;
import defpackage.ib5;
import defpackage.io7;
import defpackage.j42;
import defpackage.th50;

/* JADX INFO: loaded from: classes4.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final /* synthetic */ int D = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.a;
        eo7 eo7Var = new eo7(circularProgressIndicatorSpec);
        Context context2 = getContext();
        cfn cfnVar = new cfn(context2, circularProgressIndicatorSpec, eo7Var, circularProgressIndicatorSpec.o == 1 ? new io7(context2, circularProgressIndicatorSpec) : new fo7(circularProgressIndicatorSpec));
        Resources resources = context2.getResources();
        hwh0 hwh0Var = new hwh0();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        hwh0Var.a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        cfnVar.E = hwh0Var;
        setIndeterminateDrawable(cfnVar);
        setProgressDrawable(new dbe(getContext(), circularProgressIndicatorSpec, eo7Var));
        this.w = true;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final j42 a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.a).r;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.a).q;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.a).p;
    }

    public void setIndeterminateAnimationType(int i) {
        S s = this.a;
        if (((CircularProgressIndicatorSpec) s).o == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            ib5.a("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((CircularProgressIndicatorSpec) s).o = i;
        ((CircularProgressIndicatorSpec) s).d();
        bfn<ObjectAnimator> io7Var = i == 1 ? new io7(getContext(), (CircularProgressIndicatorSpec) s) : new fo7((CircularProgressIndicatorSpec) s);
        cfn<CircularProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.D = io7Var;
        io7Var.a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.a).r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.a;
        if (((CircularProgressIndicatorSpec) s).q != i) {
            ((CircularProgressIndicatorSpec) s).q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s = this.a;
        if (((CircularProgressIndicatorSpec) s).p != iMax) {
            ((CircularProgressIndicatorSpec) s).p = iMax;
            ((CircularProgressIndicatorSpec) s).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.a).d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
