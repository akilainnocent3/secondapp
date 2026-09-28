package com.sportybet.android.virtual.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.ffo;
import defpackage.i1k;
import defpackage.j1k;
import defpackage.t6i0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_InstantWinFooterLayout extends RelativeLayout implements j1k {
    public t6i0 a;
    public boolean b;

    public Hilt_InstantWinFooterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((ffo) generatedComponent()).n((InstantWinFooterLayout) this);
    }

    @Override // defpackage.j1k
    public final i1k componentManager() {
        t6i0 t6i0Var = this.a;
        if (t6i0Var != null) {
            return t6i0Var;
        }
        t6i0 t6i0Var2 = new t6i0(this);
        this.a = t6i0Var2;
        return t6i0Var2;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        t6i0 t6i0Var = this.a;
        if (t6i0Var == null) {
            t6i0Var = new t6i0(this);
            this.a = t6i0Var;
        }
        return t6i0Var.generatedComponent();
    }
}
