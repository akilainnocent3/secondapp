package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.x8i0;

/* JADX INFO: loaded from: classes4.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public x8i0 a;
    public int b;

    public ViewOffsetBehavior() {
        this.b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        y(coordinatorLayout, v, i);
        x8i0 x8i0Var = this.a;
        if (x8i0Var == null) {
            x8i0Var = new x8i0(v);
            this.a = x8i0Var;
        }
        View view = x8i0Var.a;
        x8i0Var.b = view.getTop();
        x8i0Var.c = view.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public int w() {
        x8i0 x8i0Var = this.a;
        if (x8i0Var != null) {
            return x8i0Var.d;
        }
        return 0;
    }

    public int x() {
        return w();
    }

    public void y(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.u(i, v);
    }

    public boolean z(int i) {
        x8i0 x8i0Var = this.a;
        if (x8i0Var != null) {
            return x8i0Var.b(i);
        }
        this.b = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
