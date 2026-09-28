package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.lzg;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    public int a;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ lzg c;

        public a(View view, int i, lzg lzgVar) {
            this.a = view;
            this.b = i;
            this.c = lzgVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.b) {
                lzg lzgVar = this.c;
                expandableBehavior.w((View) lzgVar, view, lzgVar.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        lzg lzgVar = (lzg) view2;
        boolean zIsExpanded = lzgVar.isExpanded();
        int i = this.a;
        if (zIsExpanded) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        this.a = lzgVar.isExpanded() ? 1 : 2;
        w((View) lzgVar, view, lzgVar.isExpanded(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        lzg lzgVar;
        if (!view.isLaidOut()) {
            ArrayList arrayListL = coordinatorLayout.l(view);
            int size = arrayListL.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    lzgVar = null;
                    break;
                }
                View view2 = (View) arrayListL.get(i2);
                if (f(view, view2)) {
                    lzgVar = (lzg) view2;
                    break;
                }
                i2++;
            }
            if (lzgVar != null) {
                boolean zIsExpanded = lzgVar.isExpanded();
                int i3 = this.a;
                if (!zIsExpanded ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = lzgVar.isExpanded() ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, lzgVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
