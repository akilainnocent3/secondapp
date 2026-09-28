package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.n5w;
import defpackage.wk30;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.h {
    public float A;
    public View[] B;
    public boolean y;
    public boolean z;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = false;
        this.z = false;
        n(attributeSet);
    }

    public float getProgress() {
        return this.A;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.y = typedArrayObtainStyledAttributes.getBoolean(index, this.y);
                } else if (index == 0) {
                    this.z = typedArrayObtainStyledAttributes.getBoolean(index, this.z);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.A = f;
        int i = 0;
        if (this.b > 0) {
            this.B = m((ConstraintLayout) getParent());
            while (i < this.b) {
                setProgress(this.B[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public void u(MotionLayout motionLayout, HashMap<View, n5w> map) {
    }

    public MotionHelper(Context context) {
        super(context);
        this.y = false;
        this.z = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = false;
        this.z = false;
        n(attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(MotionLayout motionLayout) {
    }

    public void b(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void d(MotionLayout motionLayout) {
    }

    public void c(int i, MotionLayout motionLayout) {
    }

    public void setProgress(View view, float f) {
    }
}
