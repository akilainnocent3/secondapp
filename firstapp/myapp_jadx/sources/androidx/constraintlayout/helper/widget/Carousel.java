package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.c;
import defpackage.wk30;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public final ArrayList<View> C;
    public int D;
    public MotionLayout E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public float O;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel.this.E.setProgress(0.0f);
            throw null;
        }
    }

    public interface b {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new ArrayList<>();
        this.D = 0;
        this.F = -1;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 0.9f;
        this.M = 4;
        this.N = 1;
        this.O = 2.0f;
        new a();
        v(context, attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void c(int i, MotionLayout motionLayout) {
        int i2 = this.D;
        if (i == this.K) {
            this.D = i2 + 1;
        } else if (i == this.J) {
            this.D = i2 - 1;
        }
        if (!this.G) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.D;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        c cVar;
        c cVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            ArrayList<View> arrayList = this.C;
            arrayList.clear();
            for (int i = 0; i < this.b; i++) {
                arrayList.add(motionLayout.v(this.a[i]));
            }
            this.E = motionLayout;
            if (this.N == 2) {
                androidx.constraintlayout.motion.widget.b.C0051b c0051bL = motionLayout.L(this.I);
                if (c0051bL != null && (cVar2 = c0051bL.l) != null) {
                    cVar2.c = 5;
                }
                androidx.constraintlayout.motion.widget.b.C0051b c0051bL2 = this.E.L(this.H);
                if (c0051bL2 == null || (cVar = c0051bL2.l) == null) {
                    return;
                }
                cVar.c = 5;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C.clear();
    }

    public void setAdapter(b bVar) {
    }

    public void setInfinite(boolean z) {
        this.G = z;
    }

    public final void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.F = typedArrayObtainStyledAttributes.getResourceId(index, this.F);
                } else if (index == 1) {
                    this.H = typedArrayObtainStyledAttributes.getResourceId(index, this.H);
                } else if (index == 4) {
                    this.I = typedArrayObtainStyledAttributes.getResourceId(index, this.I);
                } else if (index == 2) {
                    this.M = typedArrayObtainStyledAttributes.getInt(index, this.M);
                } else if (index == 7) {
                    this.J = typedArrayObtainStyledAttributes.getResourceId(index, this.J);
                } else if (index == 6) {
                    this.K = typedArrayObtainStyledAttributes.getResourceId(index, this.K);
                } else if (index == 9) {
                    this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                } else if (index == 8) {
                    this.N = typedArrayObtainStyledAttributes.getInt(index, this.N);
                } else if (index == 10) {
                    this.O = typedArrayObtainStyledAttributes.getFloat(index, this.O);
                } else if (index == 5) {
                    this.G = typedArrayObtainStyledAttributes.getBoolean(index, this.G);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void b(MotionLayout motionLayout) {
    }

    public Carousel(Context context) {
        super(context);
        this.C = new ArrayList<>();
        this.D = 0;
        this.F = -1;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 0.9f;
        this.M = 4;
        this.N = 1;
        this.O = 2.0f;
        new a();
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new ArrayList<>();
        this.D = 0;
        this.F = -1;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 0.9f;
        this.M = 4;
        this.N = 1;
        this.O = 2.0f;
        new a();
        v(context, attributeSet);
    }
}
