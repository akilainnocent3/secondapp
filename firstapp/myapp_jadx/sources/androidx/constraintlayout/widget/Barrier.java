package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import defpackage.ixa;
import defpackage.jxa;
import defpackage.vx1;
import defpackage.wk30;
import defpackage.yil;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int y;
    public vx1 z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.z.y0;
    }

    public int getMargin() {
        return this.z.z0;
    }

    public int getType() {
        return this.y;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.z = new vx1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.z.y0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.z.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.z;
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(b.a aVar, yil yilVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.o(aVar, yilVar, layoutParams, sparseArray);
        b.C0054b c0054b = aVar.e;
        if (yilVar instanceof vx1) {
            vx1 vx1Var = (vx1) yilVar;
            u(vx1Var, c0054b.g0, ((jxa) yilVar.W).A0);
            vx1Var.y0 = c0054b.o0;
            vx1Var.z0 = c0054b.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(ixa ixaVar, boolean z) {
        u(ixaVar, this.y, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.z.y0 = z;
    }

    public void setDpMargin(int i) {
        this.z.z0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.z.z0 = i;
    }

    public void setType(int i) {
        this.y = i;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public final void u(ixa ixaVar, int i, boolean z) {
        int i2 = this.y;
        if (z) {
            if (i2 == 5) {
                i = 1;
            } else if (i2 == 6) {
                i = 0;
            }
        } else if (i2 == 5) {
            i = 0;
        } else if (i2 == 6) {
            i = 1;
        }
        if (ixaVar instanceof vx1) {
            ((vx1) ixaVar).x0 = i;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
