package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ixa;
import defpackage.wk30;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float A;
    public ConstraintLayout B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final boolean K;
    public View[] L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public float y;
    public float z;

    public Layer(Context context) {
        super(context);
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.A = Float.NaN;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = true;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.O = true;
                } else if (index == 22) {
                    this.P = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = (ConstraintLayout) getParent();
        if (this.O || this.P) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.b; i++) {
                View viewV = this.B.v(this.a[i]);
                if (viewV != null) {
                    if (this.O) {
                        viewV.setVisibility(visibility);
                    }
                    if (this.P && elevation > 0.0f) {
                        viewV.setTranslationZ(viewV.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void q() {
        v();
        this.E = Float.NaN;
        this.F = Float.NaN;
        ixa ixaVar = ((ConstraintLayout.LayoutParams) getLayoutParams()).q0;
        ixaVar.T(0);
        ixaVar.O(0);
        u();
        layout(((int) this.I) - getPaddingLeft(), ((int) this.J) - getPaddingTop(), getPaddingRight() + ((int) this.G), getPaddingBottom() + ((int) this.H));
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void r(ConstraintLayout constraintLayout) {
        this.B = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.A = rotation;
        } else {
            if (Float.isNaN(this.A)) {
                return;
            }
            this.A = rotation;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.y = f;
        w();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.z = f;
        w();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.A = f;
        w();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.C = f;
        w();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.D = f;
        w();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.M = f;
        w();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.N = f;
        w();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        h();
    }

    public final void u() {
        if (this.B == null) {
            return;
        }
        if (this.K || Float.isNaN(this.E) || Float.isNaN(this.F)) {
            if (!Float.isNaN(this.y) && !Float.isNaN(this.z)) {
                this.F = this.z;
                this.E = this.y;
                return;
            }
            View[] viewArrM = m(this.B);
            int left = viewArrM[0].getLeft();
            int top = viewArrM[0].getTop();
            int right = viewArrM[0].getRight();
            int bottom = viewArrM[0].getBottom();
            for (int i = 0; i < this.b; i++) {
                View view = viewArrM[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.G = right;
            this.H = bottom;
            this.I = left;
            this.J = top;
            if (Float.isNaN(this.y)) {
                this.E = (left + right) / 2;
            } else {
                this.E = this.y;
            }
            if (Float.isNaN(this.z)) {
                this.F = (top + bottom) / 2;
            } else {
                this.F = this.z;
            }
        }
    }

    public final void v() {
        int i;
        if (this.B == null || (i = this.b) == 0) {
            return;
        }
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != i) {
            this.L = new View[i];
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            this.L[i2] = this.B.v(this.a[i2]);
        }
    }

    public final void w() {
        if (this.B == null) {
            return;
        }
        if (this.L == null) {
            v();
        }
        u();
        double radians = Float.isNaN(this.A) ? 0.0d : Math.toRadians(this.A);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.C;
        float f2 = f * fCos;
        float f3 = this.D;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.b; i++) {
            View view = this.L[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.E;
            float f8 = bottom - this.F;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.M;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.N;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.D);
            view.setScaleX(this.C);
            if (!Float.isNaN(this.A)) {
                view.setRotation(this.A);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.A = Float.NaN;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = true;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.A = Float.NaN;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = true;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
    }
}
