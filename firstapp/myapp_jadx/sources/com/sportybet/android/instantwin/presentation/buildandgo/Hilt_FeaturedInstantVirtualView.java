package com.sportybet.android.instantwin.presentation.buildandgo;

import android.content.Context;
import android.util.AttributeSet;
import com.sporty.android.compose.ui.component.RevivableComposeView;
import defpackage.i1k;
import defpackage.j1k;
import defpackage.seh;
import defpackage.t6i0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_FeaturedInstantVirtualView extends RevivableComposeView implements j1k {
    public t6i0 c;
    public final boolean d;

    public Hilt_FeaturedInstantVirtualView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.d) {
            return;
        }
        this.d = true;
        seh sehVar = (seh) generatedComponent();
        sehVar.getClass();
    }

    @Override // defpackage.j1k
    public final i1k componentManager() {
        t6i0 t6i0Var = this.c;
        if (t6i0Var != null) {
            return t6i0Var;
        }
        t6i0 t6i0Var2 = new t6i0(this);
        this.c = t6i0Var2;
        return t6i0Var2;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        t6i0 t6i0Var = this.c;
        if (t6i0Var == null) {
            t6i0Var = new t6i0(this);
            this.c = t6i0Var;
        }
        return t6i0Var.generatedComponent();
    }

    public Hilt_FeaturedInstantVirtualView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.d) {
            return;
        }
        this.d = true;
        ((seh) generatedComponent()).getClass();
    }
}
