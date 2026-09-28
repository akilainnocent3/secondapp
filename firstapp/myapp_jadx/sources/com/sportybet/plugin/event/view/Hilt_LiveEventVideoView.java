package com.sportybet.plugin.event.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.fms;
import defpackage.i1k;
import defpackage.j1k;
import defpackage.t6i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_LiveEventVideoView extends ConstraintLayout implements j1k {
    public t6i0 F;
    public final boolean G;

    public Hilt_LiveEventVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.G) {
            return;
        }
        this.G = true;
        ((fms) generatedComponent()).E((LiveEventVideoView) this);
    }

    @Override // defpackage.j1k
    public final i1k componentManager() {
        t6i0 t6i0Var = this.F;
        if (t6i0Var != null) {
            return t6i0Var;
        }
        t6i0 t6i0Var2 = new t6i0(this);
        this.F = t6i0Var2;
        return t6i0Var2;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        t6i0 t6i0Var = this.F;
        if (t6i0Var == null) {
            t6i0Var = new t6i0(this);
            this.F = t6i0Var;
        }
        return t6i0Var.generatedComponent();
    }

    public Hilt_LiveEventVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.G) {
            return;
        }
        this.G = true;
        ((fms) generatedComponent()).E((LiveEventVideoView) this);
    }
}
