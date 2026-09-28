package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import com.sportybet.android.gp.tz.R;
import defpackage.cfn;
import defpackage.dbe;
import defpackage.efs;
import defpackage.ib5;
import defpackage.j42;
import defpackage.jfs;
import defpackage.kef;
import defpackage.mfs;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final /* synthetic */ int D = 0;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        efs efsVar = new efs(linearProgressIndicatorSpec);
        efsVar.f = 300.0f;
        efsVar.o = new Pair<>(new kef.b(), new kef.b());
        Context context2 = getContext();
        setIndeterminateDrawable(new cfn(context2, linearProgressIndicatorSpec, efsVar, linearProgressIndicatorSpec.o == 0 ? new jfs(linearProgressIndicatorSpec) : new mfs(context2, linearProgressIndicatorSpec)));
        setProgressDrawable(new dbe(getContext(), linearProgressIndicatorSpec, efsVar));
        this.w = true;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final j42 a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.a).p;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.a).t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.a).s;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.a).r;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).p != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) s).p != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) s).p != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        cfn<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        dbe<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        S s = this.a;
        if (((LinearProgressIndicatorSpec) s).o == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            ib5.a("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((LinearProgressIndicatorSpec) s).o = i;
        ((LinearProgressIndicatorSpec) s).d();
        if (i == 0) {
            cfn<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            jfs jfsVar = new jfs((LinearProgressIndicatorSpec) s);
            indeterminateDrawable.D = jfsVar;
            jfsVar.a = indeterminateDrawable;
        } else {
            cfn<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            mfs mfsVar = new mfs(getContext(), (LinearProgressIndicatorSpec) s);
            indeterminateDrawable2.D = mfsVar;
            mfsVar.a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.a).d();
    }

    public void setIndicatorDirection(int i) {
        S s = this.a;
        ((LinearProgressIndicatorSpec) s).p = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) s).p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.q = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        S s = this.a;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).o == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        S s = this.a;
        if (((LinearProgressIndicatorSpec) s).t != i) {
            ((LinearProgressIndicatorSpec) s).t = Math.round(Math.min(i, ((LinearProgressIndicatorSpec) s).a / 2.0f));
            ((LinearProgressIndicatorSpec) s).v = false;
            ((LinearProgressIndicatorSpec) s).w = true;
            ((LinearProgressIndicatorSpec) s).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        S s = this.a;
        if (((LinearProgressIndicatorSpec) s).u != f) {
            ((LinearProgressIndicatorSpec) s).u = Math.min(f, 0.5f);
            ((LinearProgressIndicatorSpec) s).v = true;
            ((LinearProgressIndicatorSpec) s).w = true;
            ((LinearProgressIndicatorSpec) s).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        S s = this.a;
        if (Objects.equals(((LinearProgressIndicatorSpec) s).s, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) s).s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        S s = this.a;
        if (((LinearProgressIndicatorSpec) s).r != i) {
            ((LinearProgressIndicatorSpec) s).r = Math.min(i, ((LinearProgressIndicatorSpec) s).a);
            ((LinearProgressIndicatorSpec) s).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
