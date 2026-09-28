package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import defpackage.wk30;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {
    public View[] A;
    public ConstraintLayout B;
    public int C;
    public int D;
    public int E;
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean[][] O;
    public final HashSet P;
    public int[] Q;

    public Grid(Context context) {
        super(context);
        this.N = 0;
        this.P = new HashSet();
    }

    public static int[][] E(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public static float[] F(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.N;
            if (i >= this.C * this.E) {
                return -1;
            }
            int iA = A(i);
            int iZ = z(this.N);
            boolean[] zArr = this.O[iA];
            if (zArr[iZ]) {
                zArr[iZ] = false;
                z = true;
            }
            this.N++;
        }
        return i;
    }

    public static void v(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.H = -1.0f;
        layoutParams.f = -1;
        layoutParams.e = -1;
        layoutParams.g = -1;
        layoutParams.h = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public static void w(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.I = -1.0f;
        layoutParams.j = -1;
        layoutParams.i = -1;
        layoutParams.k = -1;
        layoutParams.l = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public final int A(int i) {
        return this.M == 1 ? i % this.C : i / this.E;
    }

    public final void B() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.C, this.E);
        this.O = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean C(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.O;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final View D() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.B.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public final void G() {
        int i;
        int i2 = this.D;
        if (i2 != 0 && (i = this.F) != 0) {
            this.C = i2;
            this.E = i;
            return;
        }
        int i3 = this.F;
        if (i3 > 0) {
            this.E = i3;
            this.C = ((this.b + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.C = i2;
            this.E = ((this.b + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.b) + 1.5d);
            this.C = iSqrt;
            this.E = ((this.b + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.J;
    }

    public int getColumns() {
        return this.F;
    }

    public float getHorizontalGaps() {
        return this.K;
    }

    public int getOrientation() {
        return this.M;
    }

    public String getRowWeights() {
        return this.I;
    }

    public int getRows() {
        return this.D;
    }

    public String getSkips() {
        return this.H;
    }

    public String getSpans() {
        return this.G;
    }

    public float getVerticalGaps() {
        return this.L;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 5) {
                    this.D = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 1) {
                    this.F = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 7) {
                    this.G = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 6) {
                    this.H = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.I = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 0) {
                    this.J = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 3) {
                    this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 2) {
                    this.K = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 10) {
                    this.L = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 9) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == 8) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            G();
            B();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = (ConstraintLayout) getParent();
        y(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            View[] viewArr = this.A;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View view = viewArr[i];
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                Canvas canvas2 = canvas;
                canvas2.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas2.drawRect(0.0f, top2, right - left, bottom2, paint);
                i++;
                canvas = canvas2;
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.J;
        if (str2 == null || !str2.equals(str)) {
            this.J = str;
            y(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.F != i) {
            this.F = i;
            G();
            B();
            y(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= 0.0f && this.K != f) {
            this.K = f;
            y(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.M != i) {
            this.M = i;
            y(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.I;
        if (str2 == null || !str2.equals(str)) {
            this.I = str;
            y(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.D != i) {
            this.D = i;
            G();
            B();
            y(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.H;
        if (str2 == null || !str2.equals(str)) {
            this.H = str;
            y(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.G;
        if (str == null || !str.contentEquals(charSequence)) {
            this.G = charSequence.toString();
            y(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= 0.0f && this.L != f) {
            this.L = f;
            y(true);
            invalidate();
        }
    }

    public final void x(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = this.Q;
        layoutParams.e = iArr[i2];
        layoutParams.i = iArr[i];
        layoutParams.h = iArr[(i2 + i4) - 1];
        layoutParams.l = iArr[(i + i3) - 1];
        view.setLayoutParams(layoutParams);
    }

    public final void y(boolean z) {
        int i;
        int i2;
        int[][] iArrE;
        int[][] iArrE2;
        if (this.B == null || this.C < 1 || this.E < 1) {
            return;
        }
        HashSet hashSet = this.P;
        if (z) {
            for (int i3 = 0; i3 < this.O.length; i3++) {
                int i4 = 0;
                while (true) {
                    boolean[][] zArr = this.O;
                    if (i4 < zArr[0].length) {
                        zArr[i3][i4] = true;
                        i4++;
                    }
                }
            }
            hashSet.clear();
        }
        this.N = 0;
        int iMax = Math.max(this.C, this.E);
        View[] viewArr = this.A;
        if (viewArr == null) {
            this.A = new View[iMax];
            int i5 = 0;
            while (true) {
                View[] viewArr2 = this.A;
                if (i5 >= viewArr2.length) {
                    break;
                }
                viewArr2[i5] = D();
                i5++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i6 = 0; i6 < iMax; i6++) {
                View[] viewArr4 = this.A;
                if (i6 < viewArr4.length) {
                    viewArr3[i6] = viewArr4[i6];
                } else {
                    viewArr3[i6] = D();
                }
            }
            int i7 = iMax;
            while (true) {
                View[] viewArr5 = this.A;
                if (i7 >= viewArr5.length) {
                    break;
                }
                this.B.removeView(viewArr5[i7]);
                i7++;
            }
            this.A = viewArr3;
        }
        this.Q = new int[iMax];
        int i8 = 0;
        while (true) {
            View[] viewArr6 = this.A;
            if (i8 >= viewArr6.length) {
                break;
            }
            this.Q[i8] = viewArr6[i8].getId();
            i8++;
        }
        int id = getId();
        int iMax2 = Math.max(this.C, this.E);
        float[] fArrF = F(this.C, this.I);
        if (this.C == 1) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.A[0].getLayoutParams();
            w(this.A[0]);
            layoutParams.i = id;
            layoutParams.l = id;
            this.A[0].setLayoutParams(layoutParams);
        } else {
            int i9 = 0;
            while (true) {
                i = this.C;
                if (i9 >= i) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.A[i9].getLayoutParams();
                w(this.A[i9]);
                if (fArrF != null) {
                    layoutParams2.I = fArrF[i9];
                }
                if (i9 > 0) {
                    layoutParams2.j = this.Q[i9 - 1];
                } else {
                    layoutParams2.i = id;
                }
                if (i9 < this.C - 1) {
                    layoutParams2.k = this.Q[i9 + 1];
                } else {
                    layoutParams2.l = id;
                }
                if (i9 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.K;
                }
                this.A[i9].setLayoutParams(layoutParams2);
                i9++;
            }
            while (i < iMax2) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.A[i].getLayoutParams();
                w(this.A[i]);
                layoutParams3.i = id;
                layoutParams3.l = id;
                this.A[i].setLayoutParams(layoutParams3);
                i++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.C, this.E);
        float[] fArrF2 = F(this.E, this.J);
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.A[0].getLayoutParams();
        if (this.E == 1) {
            v(this.A[0]);
            layoutParams4.e = id2;
            layoutParams4.h = id2;
            this.A[0].setLayoutParams(layoutParams4);
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.E;
                if (i10 >= i2) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) this.A[i10].getLayoutParams();
                v(this.A[i10]);
                if (fArrF2 != null) {
                    layoutParams5.H = fArrF2[i10];
                }
                if (i10 > 0) {
                    layoutParams5.f = this.Q[i10 - 1];
                } else {
                    layoutParams5.e = id2;
                }
                if (i10 < this.E - 1) {
                    layoutParams5.g = this.Q[i10 + 1];
                } else {
                    layoutParams5.h = id2;
                }
                if (i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.K;
                }
                this.A[i10].setLayoutParams(layoutParams5);
                i10++;
            }
            while (i2 < iMax3) {
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) this.A[i2].getLayoutParams();
                v(this.A[i2]);
                layoutParams6.e = id2;
                layoutParams6.h = id2;
                this.A[i2].setLayoutParams(layoutParams6);
                i2++;
            }
        }
        String str = this.H;
        if (str != null && !str.trim().isEmpty() && (iArrE2 = E(this.H)) != null) {
            for (int i11 = 0; i11 < iArrE2.length; i11++) {
                int iA = A(iArrE2[i11][0]);
                int iZ = z(iArrE2[i11][0]);
                int[] iArr = iArrE2[i11];
                if (!C(iA, iZ, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.G;
        if (str2 != null && !str2.trim().isEmpty() && (iArrE = E(this.G)) != null) {
            int[] iArr2 = this.a;
            View[] viewArrM = m(this.B);
            for (int i12 = 0; i12 < iArrE.length; i12++) {
                int iA2 = A(iArrE[i12][0]);
                int iZ2 = z(iArrE[i12][0]);
                int[] iArr3 = iArrE[i12];
                if (!C(iA2, iZ2, iArr3[1], iArr3[2])) {
                    break;
                }
                View view = viewArrM[i12];
                int[] iArr4 = iArrE[i12];
                x(view, iA2, iZ2, iArr4[1], iArr4[2]);
                hashSet.add(Integer.valueOf(iArr2[i12]));
            }
        }
        View[] viewArrM2 = m(this.B);
        for (int i13 = 0; i13 < this.b; i13++) {
            if (!hashSet.contains(Integer.valueOf(this.a[i13]))) {
                int nextPosition = getNextPosition();
                int iA3 = A(nextPosition);
                int iZ3 = z(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    x(viewArrM2[i13], iA3, iZ3, 1, 1);
                }
            }
        }
    }

    public final int z(int i) {
        return this.M == 1 ? i / this.C : i % this.E;
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = 0;
        this.P = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N = 0;
        this.P = new HashSet();
    }
}
