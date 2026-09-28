package com.sportybet.plugin.realsports.event.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.i1k;
import defpackage.i98;
import defpackage.j1k;
import defpackage.t6i0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_CommentSelectCountryView extends ConstraintLayout implements j1k {
    public t6i0 F;
    public final boolean G;

    public Hilt_CommentSelectCountryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.G) {
            return;
        }
        this.G = true;
        ((i98) generatedComponent()).g((CommentSelectCountryView) this);
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
}
