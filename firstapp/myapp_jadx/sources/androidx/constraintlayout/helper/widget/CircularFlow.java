package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import defpackage.wk30;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    public static int K;
    public static float L;
    public ConstraintLayout A;
    public int B;
    public float[] C;
    public int[] D;
    public int E;
    public int F;
    public String G;
    public String H;
    public Float I;
    public Integer J;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.F = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                v(str.substring(i).trim());
                return;
            } else {
                v(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.E = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                w(str.substring(i).trim());
                return;
            } else {
                w(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.C, this.F);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.D, this.E);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 33) {
                    this.B = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.G = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.H = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, L));
                    this.I = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == 31) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, K));
                    this.J = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setDefaultAngle(float f) {
        L = f;
    }

    public void setDefaultRadius(int i) {
        K = i;
    }

    public final void v(String str) {
        float[] fArrCopyOf;
        if (str == null || str.length() == 0 || this.c == null || (fArrCopyOf = this.C) == null) {
            return;
        }
        if (this.F + 1 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, fArrCopyOf.length + 1);
            this.C = fArrCopyOf;
        }
        fArrCopyOf[this.F] = Integer.parseInt(str);
        this.F++;
    }

    public final void w(String str) {
        Context context;
        int[] iArrCopyOf;
        if (str == null || str.length() == 0 || (context = this.c) == null || (iArrCopyOf = this.D) == null) {
            return;
        }
        if (this.E + 1 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 1);
            this.D = iArrCopyOf;
        }
        iArrCopyOf[this.E] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.E++;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.G;
        if (str != null) {
            this.C = new float[1];
            setAngles(str);
        }
        String str2 = this.H;
        if (str2 != null) {
            this.D = new int[1];
            setRadius(str2);
        }
        Float f = this.I;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.J;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.A = (ConstraintLayout) getParent();
        for (int i = 0; i < this.b; i++) {
            View viewV = this.A.v(this.a[i]);
            if (viewV != null) {
                int i2 = K;
                float f2 = L;
                int[] iArr = this.D;
                HashMap<Integer, String> map = this.w;
                String str3 = LxHElgWAiSeM.bbShDOFgD;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num2 = this.J;
                    if (num2 != null && num2.intValue() != -1) {
                        this.E++;
                        if (this.D == null) {
                            this.D = new int[1];
                        }
                        int[] radius = getRadius();
                        this.D = radius;
                        radius[this.E - 1] = i2;
                    } else {
                        Log.e(str3, "Added radius to view with id: " + map.get(Integer.valueOf(viewV.getId())));
                    }
                }
                float[] fArr = this.C;
                if (fArr != null && i < fArr.length) {
                    f2 = fArr[i];
                } else {
                    Float f3 = this.I;
                    if (f3 != null && f3.floatValue() != -1.0f) {
                        this.F++;
                        if (this.C == null) {
                            this.C = new float[1];
                        }
                        float[] angles = getAngles();
                        this.C = angles;
                        angles[this.F - 1] = f2;
                    } else {
                        Log.e(str3, "Added angle to view with id: " + map.get(Integer.valueOf(viewV.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewV.getLayoutParams();
                layoutParams.r = f2;
                layoutParams.p = this.B;
                layoutParams.q = i2;
                viewV.setLayoutParams(layoutParams);
            }
        }
        h();
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
