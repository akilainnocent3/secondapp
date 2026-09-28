package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.v;
import defpackage.avh;
import defpackage.rr1;
import defpackage.ruw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements avh, RecyclerView.y.b {
    public static final Rect c0 = new Rect();
    public int E;
    public int F;
    public int G;
    public boolean I;
    public boolean J;
    public RecyclerView.u M;
    public RecyclerView.z N;
    public b O;
    public c0 Q;
    public c0 R;
    public SavedState S;
    public final Context Y;
    public View Z;
    public final int H = -1;
    public List<com.google.android.flexbox.a> K = new ArrayList();
    public final com.google.android.flexbox.b L = new com.google.android.flexbox.b(this);
    public final a P = new a();
    public int T = -1;
    public int U = Integer.MIN_VALUE;
    public int V = Integer.MIN_VALUE;
    public int W = Integer.MIN_VALUE;
    public final SparseArray<View> X = new SparseArray<>();
    public int a0 = -1;
    public final com.google.android.flexbox.b.a b0 = new com.google.android.flexbox.b.a();

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public int A;
        public boolean B;
        public float e;
        public float f;
        public int i;
        public float v;
        public int w;
        public int y;
        public int z;

        public class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.e = 0.0f;
                layoutParams.f = 1.0f;
                layoutParams.i = -1;
                layoutParams.v = -1.0f;
                layoutParams.z = 16777215;
                layoutParams.A = 16777215;
                layoutParams.e = parcel.readFloat();
                layoutParams.f = parcel.readFloat();
                layoutParams.i = parcel.readInt();
                layoutParams.v = parcel.readFloat();
                layoutParams.w = parcel.readInt();
                layoutParams.y = parcel.readInt();
                layoutParams.z = parcel.readInt();
                layoutParams.A = parcel.readInt();
                layoutParams.B = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = 0.0f;
            this.f = 1.0f;
            this.i = -1;
            this.v = -1.0f;
            this.z = 16777215;
            this.A = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int A1() {
            return this.A;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int F() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float H() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int J() {
            return this.w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int V() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void W0(int i) {
            this.w = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int X0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void Y(int i) {
            this.y = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int a1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b0() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float h0() {
            return this.v;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean n0() {
            return this.B;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int u0() {
            return this.z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int v1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.i);
            parcel.writeFloat(this.v);
            parcel.writeInt(this.w);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int x1() {
            return this.y;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.a);
            sb.append(", mAnchorOffset=");
            return rr1.b(sb, this.b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    public class a {
        public int a;
        public int b;
        public int c;
        public int d = 0;
        public boolean e;
        public boolean f;
        public boolean g;

        public a() {
        }

        public final void a() {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (!flexboxLayoutManager.o() && flexboxLayoutManager.I) {
                this.c = this.e ? flexboxLayoutManager.Q.g() : flexboxLayoutManager.C - flexboxLayoutManager.Q.k();
                return;
            }
            boolean z = this.e;
            c0 c0Var = flexboxLayoutManager.Q;
            this.c = z ? c0Var.g() : c0Var.k();
        }

        public final void b() {
            this.a = -1;
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.f = false;
            this.g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            boolean zO = flexboxLayoutManager.o();
            int i = flexboxLayoutManager.F;
            if (zO) {
                if (i == 0) {
                    this.e = flexboxLayoutManager.E == 1;
                    return;
                } else {
                    this.e = i == 2;
                    return;
                }
            }
            if (i == 0) {
                this.e = flexboxLayoutManager.E == 3;
            } else {
                this.e = i == 2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.e);
            sb.append(", mValid=");
            sb.append(this.f);
            sb.append(", mAssignedFromSavedState=");
            return ruw.a(sb, this.g, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.c);
            sb.append(", mPosition=");
            sb.append(this.d);
            sb.append(", mOffset=");
            sb.append(this.e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.g);
            sb.append(", mItemDirection=1, mLayoutDirection=");
            return rr1.b(sb, this.h, '}');
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.c cVarV = RecyclerView.o.V(context, attributeSet, i, i2);
        int i3 = cVarV.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (cVarV.c) {
                    l1(3);
                } else {
                    l1(2);
                }
            }
        } else if (cVarV.c) {
            l1(1);
        } else {
            l1(0);
        }
        m1(1);
        k1(4);
        this.Y = context;
    }

    public static boolean a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int A(RecyclerView.z zVar) {
        return W0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int B(RecyclerView.z zVar) {
        return U0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int C(RecyclerView.z zVar) {
        return V0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int D(RecyclerView.z zVar) {
        return W0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams G() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.e = 0.0f;
        layoutParams.f = 1.0f;
        layoutParams.i = -1;
        layoutParams.v = -1.0f;
        layoutParams.z = 16777215;
        layoutParams.A = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!o() || this.F == 0) {
            int iH1 = h1(i, uVar, zVar);
            this.X.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.P.d += iI1;
        this.R.p(-iI1);
        return iI1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams H(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(int i) {
        this.T = i;
        this.U = Integer.MIN_VALUE;
        SavedState savedState = this.S;
        if (savedState != null) {
            savedState.a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (o() || (this.F == 0 && !o())) {
            int iH1 = h1(i, uVar, zVar);
            this.X.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.P.d += iI1;
        this.R.p(-iI1);
        return iI1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R0(RecyclerView recyclerView, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.a = i;
        S0(vVar);
    }

    public final int U0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        int iB = zVar.b();
        X0();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (zVar.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        return Math.min(this.Q.l(), this.Q.b(viewB1) - this.Q.e(viewZ0));
    }

    public final int V0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        int iB = zVar.b();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (zVar.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        int iU = RecyclerView.o.U(viewZ0);
        int iU2 = RecyclerView.o.U(viewB1);
        int iAbs = Math.abs(this.Q.b(viewB1) - this.Q.e(viewZ0));
        int[] iArr = this.L.c;
        int i = iArr[iU];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iU2] - i) + 1))) + (this.Q.k() - this.Q.e(viewZ0)));
    }

    public final int W0(RecyclerView.z zVar) {
        if (K() != 0) {
            int iB = zVar.b();
            View viewZ0 = Z0(iB);
            View viewB1 = b1(iB);
            if (zVar.b() != 0 && viewZ0 != null && viewB1 != null) {
                View viewD1 = d1(0, K());
                int iU = viewD1 == null ? -1 : RecyclerView.o.U(viewD1);
                View viewD2 = d1(K() - 1, -1);
                return (int) ((Math.abs(this.Q.b(viewB1) - this.Q.e(viewZ0)) / (((viewD2 != null ? RecyclerView.o.U(viewD2) : -1) - iU) + 1)) * zVar.b());
            }
        }
        return 0;
    }

    public final void X0() {
        if (this.Q != null) {
            return;
        }
        boolean zO = o();
        int i = this.F;
        if (zO) {
            if (i == 0) {
                this.Q = new a0(this);
                this.R = new b0(this);
                return;
            } else {
                this.Q = new b0(this);
                this.R = new a0(this);
                return;
            }
        }
        if (i == 0) {
            this.Q = new b0(this);
            this.R = new a0(this);
        } else {
            this.Q = new a0(this);
            this.R = new b0(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Y() {
        return true;
    }

    public final int Y0(RecyclerView.u uVar, RecyclerView.z zVar, b bVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect rect;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10 = bVar.f;
        if (i10 != Integer.MIN_VALUE) {
            int i11 = bVar.a;
            if (i11 < 0) {
                bVar.f = i10 + i11;
            }
            j1(uVar, bVar);
        }
        int i12 = bVar.a;
        boolean zO = o();
        int i13 = i12;
        int i14 = 0;
        while (true) {
            if (i13 <= 0 && !this.O.b) {
                break;
            }
            List<com.google.android.flexbox.a> list = this.K;
            int i15 = bVar.d;
            if (i15 < 0 || i15 >= zVar.b() || (i = bVar.c) < 0 || i >= list.size()) {
                break;
            }
            com.google.android.flexbox.a aVar = this.K.get(bVar.c);
            bVar.d = aVar.o;
            boolean zO2 = o();
            a aVar2 = this.P;
            Rect rect3 = c0;
            com.google.android.flexbox.b bVar2 = this.L;
            if (zO2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i16 = this.C;
                int i17 = bVar.e;
                if (bVar.h == -1) {
                    i17 -= aVar.g;
                }
                int i18 = i17;
                int i19 = bVar.d;
                float f = aVar2.d;
                float f2 = paddingLeft - f;
                float measuredWidth = (i16 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i20 = aVar.h;
                int i21 = i19;
                int i22 = 0;
                while (i21 < i19 + i20) {
                    int i23 = i20;
                    View viewF = f(i21);
                    if (viewF == null) {
                        i19 = i19;
                        i9 = i21;
                        rect2 = rect3;
                    } else {
                        if (bVar.h == 1) {
                            r(rect3, viewF);
                            p(viewF, -1, false);
                        } else {
                            r(rect3, viewF);
                            int i24 = i22;
                            p(viewF, i24, false);
                            i22 = i24 + 1;
                        }
                        float f3 = measuredWidth;
                        long j = bVar2.d[i21];
                        int i25 = (int) j;
                        int i26 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewF.getLayoutParams();
                        if (n1(viewF, i25, i26, layoutParams)) {
                            viewF.measure(i25, i26);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.right);
                        int i27 = i18 + ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.top;
                        boolean z2 = this.I;
                        com.google.android.flexbox.b bVar3 = this.L;
                        if (z2) {
                            int iRound = Math.round(f5) - viewF.getMeasuredWidth();
                            Rect rect4 = rect3;
                            int iRound2 = Math.round(f5);
                            int measuredHeight = viewF.getMeasuredHeight() + i27;
                            i9 = i21;
                            rect2 = rect4;
                            bVar3.o(viewF, aVar, iRound, i27, iRound2, measuredHeight);
                        } else {
                            i9 = i21;
                            rect2 = rect3;
                            bVar3.o(viewF, aVar, Math.round(f4), i27, viewF.getMeasuredWidth() + Math.round(f4), viewF.getMeasuredHeight() + i27);
                        }
                        float measuredWidth2 = viewF.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.right + fMax + f4;
                        measuredWidth = f5 - (((viewF.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.left) + fMax);
                        f2 = measuredWidth2;
                    }
                    i21 = i9 + 1;
                    i19 = i19;
                    i12 = i12;
                    zO = zO;
                    i20 = i23;
                    rect3 = rect2;
                }
                i2 = i12;
                z = zO;
                bVar.c += this.O.h;
                i6 = aVar.g;
                i5 = i13;
            } else {
                i2 = i12;
                z = zO;
                Rect rect5 = rect3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i28 = this.D;
                int i29 = bVar.e;
                if (bVar.h == -1) {
                    int i30 = aVar.g;
                    i4 = i29 + i30;
                    i3 = i29 - i30;
                } else {
                    i3 = i29;
                    i4 = i3;
                }
                int i31 = bVar.d;
                float f6 = i28 - paddingBottom;
                float f7 = aVar2.d;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i32 = aVar.h;
                float measuredHeight2 = f9;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    int i35 = i32;
                    View viewF2 = f(i33);
                    if (viewF2 == null) {
                        i13 = i13;
                        i7 = i33;
                        rect = rect5;
                        i8 = i35;
                    } else {
                        float f10 = f8;
                        long j2 = bVar2.d[i33];
                        int i36 = (int) j2;
                        int i37 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewF2.getLayoutParams();
                        if (n1(viewF2, i36, i37, layoutParams2)) {
                            viewF2.measure(i36, i37);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.top;
                        float f12 = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.bottom);
                        if (bVar.h == 1) {
                            rect = rect5;
                            r(rect, viewF2);
                            p(viewF2, -1, false);
                        } else {
                            rect = rect5;
                            r(rect, viewF2);
                            p(viewF2, i34, false);
                            i34++;
                        }
                        int i38 = i3 + ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.left;
                        int i39 = i4 - ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.right;
                        boolean z3 = this.I;
                        boolean z4 = this.J;
                        com.google.android.flexbox.b bVar4 = this.L;
                        if (!z3) {
                            i7 = i33;
                            i8 = i35;
                            if (z4) {
                                bVar4.p(viewF2, aVar, z3, i38, Math.round(f12) - viewF2.getMeasuredHeight(), viewF2.getMeasuredWidth() + i38, Math.round(f12));
                            } else {
                                bVar4.p(viewF2, aVar, z3, i38, Math.round(f11), viewF2.getMeasuredWidth() + i38, viewF2.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (z4) {
                            i7 = i33;
                            i8 = i35;
                            bVar4.p(viewF2, aVar, z3, i39 - viewF2.getMeasuredWidth(), Math.round(f12) - viewF2.getMeasuredHeight(), i39, Math.round(f12));
                        } else {
                            i7 = i33;
                            i8 = i35;
                            bVar4.p(viewF2, aVar, z3, i39 - viewF2.getMeasuredWidth(), Math.round(f11), i39, viewF2.getMeasuredHeight() + Math.round(f11));
                        }
                        float measuredHeight3 = viewF2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.bottom + fMax2 + f11;
                        measuredHeight2 = f12 - (((viewF2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((RecyclerView.LayoutParams) viewF2.getLayoutParams()).b.top) + fMax2);
                        f8 = measuredHeight3;
                    }
                    i33 = i7 + 1;
                    i13 = i13;
                    i31 = i31;
                    i32 = i8;
                    rect5 = rect;
                    bVar2 = bVar2;
                }
                i5 = i13;
                bVar.c += this.O.h;
                i6 = aVar.g;
            }
            int i40 = i6;
            i14 += i6;
            if (z || !this.I) {
                bVar.e += bVar.h * i40;
            } else {
                bVar.e -= bVar.h * i40;
            }
            i13 = i5 - i40;
            i12 = i2;
            zO = z;
        }
        int i41 = i12;
        int i42 = bVar.a - i14;
        bVar.a = i42;
        int i43 = bVar.f;
        if (i43 != Integer.MIN_VALUE) {
            int i44 = i43 + i14;
            bVar.f = i44;
            if (i42 < 0) {
                bVar.f = i44 + i42;
            }
            j1(uVar, bVar);
        }
        return i41 - bVar.a;
    }

    public final View Z0(int i) {
        View viewE1 = e1(0, K(), i);
        if (viewE1 == null) {
            return null;
        }
        int i2 = this.L.c[RecyclerView.o.U(viewE1)];
        if (i2 == -1) {
            return null;
        }
        return a1(viewE1, this.K.get(i2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View a1(View view, com.google.android.flexbox.a aVar) {
        boolean zO = o();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewJ = J(i2);
            if (viewJ != null && viewJ.getVisibility() != 8) {
                if (!this.I || zO) {
                    if (this.Q.e(view) > this.Q.e(viewJ)) {
                        view = viewJ;
                    }
                } else if (this.Q.b(view) < this.Q.b(viewJ)) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF b(int i) {
        View viewJ;
        if (K() == 0 || (viewJ = J(0)) == null) {
            return null;
        }
        int i2 = i < RecyclerView.o.U(viewJ) ? -1 : 1;
        return o() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    public final View b1(int i) {
        View viewE1 = e1(K() - 1, -1, i);
        if (viewE1 == null) {
            return null;
        }
        return c1(viewE1, this.K.get(this.L.c[RecyclerView.o.U(viewE1)]));
    }

    @Override // defpackage.avh
    public final void c(View view, int i, int i2, com.google.android.flexbox.a aVar) {
        r(c0, view);
        if (o()) {
            int i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right;
            aVar.e += i3;
            aVar.f += i3;
        } else {
            int i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.top + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.bottom;
            aVar.e += i4;
            aVar.f += i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View c1(View view, com.google.android.flexbox.a aVar) {
        boolean zO = o();
        int iK = (K() - aVar.h) - 1;
        for (int iK2 = K() - 2; iK2 > iK; iK2--) {
            View viewJ = J(iK2);
            if (viewJ != null && viewJ.getVisibility() != 8) {
                if (!this.I || zO) {
                    if (this.Q.b(view) < this.Q.b(viewJ)) {
                        view = viewJ;
                    }
                } else if (this.Q.e(view) > this.Q.e(viewJ)) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    public final View d1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewJ = J(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.C - getPaddingRight();
            int paddingBottom = this.D - getPaddingBottom();
            int iP = RecyclerView.o.P(viewJ) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewJ.getLayoutParams())).leftMargin;
            int iT = RecyclerView.o.T(viewJ) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewJ.getLayoutParams())).topMargin;
            int iS = RecyclerView.o.S(viewJ) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewJ.getLayoutParams())).rightMargin;
            int iN = RecyclerView.o.N(viewJ) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewJ.getLayoutParams())).bottomMargin;
            boolean z = iP >= paddingRight || iS >= paddingLeft;
            boolean z2 = iT >= paddingBottom || iN >= paddingTop;
            if (z && z2) {
                return viewJ;
            }
            i += i3;
        }
        return null;
    }

    @Override // defpackage.avh
    public final int e(int i, int i2, int i3) {
        return RecyclerView.o.L(s(), this.C, this.A, i2, i3);
    }

    public final View e1(int i, int i2, int i3) {
        int iU;
        X0();
        if (this.O == null) {
            b bVar = new b();
            bVar.h = 1;
            this.O = bVar;
        }
        int iK = this.Q.k();
        int iG = this.Q.g();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewJ = J(i);
            if (viewJ != null && (iU = RecyclerView.o.U(viewJ)) >= 0 && iU < i3) {
                if (((RecyclerView.LayoutParams) viewJ.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewJ;
                    }
                } else {
                    if (this.Q.e(viewJ) >= iK && this.Q.b(viewJ) <= iG) {
                        return viewJ;
                    }
                    if (view == null) {
                        view = viewJ;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // defpackage.avh
    public final View f(int i) {
        View view = this.X.get(i);
        return view != null ? view : this.M.d(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        A0();
    }

    public final int f1(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iH1;
        int iG;
        if (o() || !this.I) {
            int iG2 = this.Q.g() - i;
            if (iG2 <= 0) {
                return 0;
            }
            iH1 = -h1(-iG2, uVar, zVar);
        } else {
            int iK = i - this.Q.k();
            if (iK <= 0) {
                return 0;
            }
            iH1 = h1(iK, uVar, zVar);
        }
        int i2 = i + iH1;
        if (!z || (iG = this.Q.g() - i2) <= 0) {
            return iH1;
        }
        this.Q.p(iG);
        return iG + iH1;
    }

    @Override // defpackage.avh
    public final int g(int i, int i2, int i3) {
        return RecyclerView.o.L(t(), this.D, this.B, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(RecyclerView recyclerView) {
        this.Z = (View) recyclerView.getParent();
    }

    public final int g1(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iH1;
        int iK;
        if (o() || !this.I) {
            int iK2 = i - this.Q.k();
            if (iK2 <= 0) {
                return 0;
            }
            iH1 = -h1(iK2, uVar, zVar);
        } else {
            int iG = this.Q.g() - i;
            if (iG <= 0) {
                return 0;
            }
            iH1 = h1(-iG, uVar, zVar);
        }
        int i2 = i + iH1;
        if (!z || (iK = i2 - this.Q.k()) <= 0) {
            return iH1;
        }
        this.Q.p(-iK);
        return iH1 - iK;
    }

    @Override // defpackage.avh
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.avh
    public final int getAlignItems() {
        return this.G;
    }

    @Override // defpackage.avh
    public final int getFlexDirection() {
        return this.E;
    }

    @Override // defpackage.avh
    public final int getFlexItemCount() {
        return this.N.b();
    }

    @Override // defpackage.avh
    public final List<com.google.android.flexbox.a> getFlexLinesInternal() {
        return this.K;
    }

    @Override // defpackage.avh
    public final int getFlexWrap() {
        return this.F;
    }

    @Override // defpackage.avh
    public final int getLargestMainSize() {
        if (this.K.size() == 0) {
            return 0;
        }
        int size = this.K.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.K.get(i).e);
        }
        return iMax;
    }

    @Override // defpackage.avh
    public final int getMaxLine() {
        return this.H;
    }

    @Override // defpackage.avh
    public final int getSumOfCrossSize() {
        int size = this.K.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.K.get(i2).g;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(RecyclerView recyclerView, RecyclerView.u uVar) {
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    public final int h1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int i2;
        if (K() != 0 && i != 0) {
            X0();
            this.O.i = true;
            boolean z = !o() && this.I;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.O.h = i3;
            boolean zO = o();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.C, this.A);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.D, this.B);
            boolean z2 = !zO && this.I;
            com.google.android.flexbox.b bVar = this.L;
            if (i3 == 1) {
                View viewJ = J(K() - 1);
                if (viewJ != null) {
                    this.O.e = this.Q.b(viewJ);
                    int iU = RecyclerView.o.U(viewJ);
                    View viewC1 = c1(viewJ, this.K.get(bVar.c[iU]));
                    b bVar2 = this.O;
                    bVar2.getClass();
                    int i4 = iU + 1;
                    bVar2.d = i4;
                    int[] iArr = bVar.c;
                    if (iArr.length <= i4) {
                        bVar2.c = -1;
                    } else {
                        bVar2.c = iArr[i4];
                    }
                    c0 c0Var = this.Q;
                    if (z2) {
                        bVar2.e = c0Var.e(viewC1);
                        this.O.f = this.Q.k() + (-this.Q.e(viewC1));
                        b bVar3 = this.O;
                        bVar3.f = Math.max(bVar3.f, 0);
                    } else {
                        bVar2.e = c0Var.b(viewC1);
                        this.O.f = this.Q.b(viewC1) - this.Q.g();
                    }
                    int i5 = this.O.c;
                    if ((i5 == -1 || i5 > this.K.size() - 1) && this.O.d <= this.N.b()) {
                        b bVar4 = this.O;
                        int i6 = iAbs - bVar4.f;
                        com.google.android.flexbox.b.a aVar = this.b0;
                        aVar.a = null;
                        aVar.b = 0;
                        if (i6 > 0) {
                            com.google.android.flexbox.b bVar5 = this.L;
                            if (zO) {
                                bVar5.b(aVar, iMakeMeasureSpec, iMakeMeasureSpec2, i6, bVar4.d, -1, this.K);
                            } else {
                                bVar5.b(aVar, iMakeMeasureSpec2, iMakeMeasureSpec, i6, bVar4.d, -1, this.K);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.O.d);
                            bVar.u(this.O.d);
                        }
                    }
                    b bVar6 = this.O;
                    bVar6.a = iAbs - bVar6.f;
                }
            } else {
                View viewJ2 = J(0);
                if (viewJ2 != null) {
                    this.O.e = this.Q.e(viewJ2);
                    int iU2 = RecyclerView.o.U(viewJ2);
                    View viewA1 = a1(viewJ2, this.K.get(bVar.c[iU2]));
                    b bVar7 = this.O;
                    bVar7.getClass();
                    int i7 = bVar.c[iU2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        com.google.android.flexbox.a aVar2 = this.K.get(i7 - 1);
                        bVar7 = this.O;
                        bVar7.d = iU2 - aVar2.h;
                    } else {
                        bVar7.d = -1;
                    }
                    bVar7.c = i7 > 0 ? i7 - 1 : 0;
                    c0 c0Var2 = this.Q;
                    if (z2) {
                        bVar7.e = c0Var2.b(viewA1);
                        this.O.f = this.Q.b(viewA1) - this.Q.g();
                        b bVar8 = this.O;
                        bVar8.f = Math.max(bVar8.f, 0);
                    } else {
                        bVar7.e = c0Var2.e(viewA1);
                        this.O.f = this.Q.k() + (-this.Q.e(viewA1));
                    }
                    b bVar9 = this.O;
                    bVar9.a = iAbs - bVar9.f;
                }
            }
            b bVar10 = this.O;
            int iY0 = Y0(uVar, zVar, bVar10) + bVar10.f;
            if (iY0 >= 0) {
                if (z) {
                    if (iAbs > iY0) {
                        i2 = (-i3) * iY0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iY0) {
                    i2 = i3 * iY0;
                } else {
                    i2 = i;
                }
                this.Q.p(-i2);
                this.O.g = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // defpackage.avh
    public final int i(View view) {
        int i;
        int i2;
        if (o()) {
            i = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.top;
            i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.bottom;
        } else {
            i = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left;
            i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right;
        }
        return i + i2;
    }

    public final int i1(int i) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        X0();
        boolean zO = o();
        View view = this.Z;
        int width = zO ? view.getWidth() : view.getHeight();
        int i2 = zO ? this.C : this.D;
        int layoutDirection = this.b.getLayoutDirection();
        a aVar = this.P;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + aVar.d) - width, iAbs);
            }
            int i3 = aVar.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - aVar.d) - width, i);
            }
            int i4 = aVar.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // defpackage.avh
    public final void j(com.google.android.flexbox.a aVar) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0114 A[EDGE_INSN: B:95:0x0114->B:103:? BREAK  A[LOOP:2: B:55:0x00c3->B:74:0x0110], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[SYNTHETIC] */
    public final void j1(RecyclerView.u uVar, b bVar) {
        int iK;
        int i;
        int iK2;
        int i2;
        View viewJ;
        int i3;
        if (bVar.i) {
            int i4 = bVar.h;
            int i5 = bVar.f;
            com.google.android.flexbox.b bVar2 = this.L;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (iK2 = K()) == 0 || (viewJ = J((i2 = iK2 - 1))) == null || (i3 = bVar2.c[RecyclerView.o.U(viewJ)]) == -1) {
                    return;
                }
                com.google.android.flexbox.a aVar = this.K.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewJ2 = J(i7);
                    if (viewJ2 != null) {
                        int i8 = bVar.f;
                        if (!o() && this.I) {
                            if (this.Q.b(viewJ2) > i8) {
                                break;
                            }
                            if (aVar.o != RecyclerView.o.U(viewJ2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iK2 = i7;
                                break;
                            } else {
                                i3 += bVar.h;
                                aVar = this.K.get(i3);
                                iK2 = i7;
                            }
                        } else {
                            if (this.Q.e(viewJ2) < this.Q.f() - i8) {
                                break;
                            }
                            if (aVar.o != RecyclerView.o.U(viewJ2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iK2 = i7;
                                break;
                            } else {
                                i3 += bVar.h;
                                aVar = this.K.get(i3);
                                iK2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= iK2) {
                    View viewJ3 = J(i2);
                    if (J(i2) != null) {
                        this.a.j(i2);
                    }
                    uVar.i(viewJ3);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (iK = K()) != 0) {
                int i9 = 0;
                View viewJ4 = J(0);
                if (viewJ4 == null || (i = bVar2.c[RecyclerView.o.U(viewJ4)]) == -1) {
                    return;
                }
                com.google.android.flexbox.a aVar2 = this.K.get(i);
                while (true) {
                    if (i9 < iK) {
                        View viewJ5 = J(i9);
                        if (viewJ5 != null) {
                            int i10 = bVar.f;
                            if (o() || !this.I) {
                                if (this.Q.b(viewJ5) <= i10) {
                                    if (aVar2.p != RecyclerView.o.U(viewJ5)) {
                                        continue;
                                    } else {
                                        if (i >= this.K.size() - 1) {
                                            break;
                                        }
                                        i += bVar.h;
                                        aVar2 = this.K.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.Q.f() - this.Q.e(viewJ5) <= i10) {
                                if (aVar2.p != RecyclerView.o.U(viewJ5)) {
                                    continue;
                                } else if (i >= this.K.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += bVar.h;
                                    aVar2 = this.K.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    View viewJ6 = J(i9);
                    if (J(i9) != null) {
                        this.a.j(i9);
                    }
                    uVar.i(viewJ6);
                    i9--;
                }
            }
        }
    }

    @Override // defpackage.avh
    public final View k(int i) {
        return f(i);
    }

    public final void k1(int i) {
        int i2 = this.G;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                A0();
                this.K.clear();
                a aVar = this.P;
                aVar.b();
                aVar.d = 0;
            }
            this.G = i;
            F0();
        }
    }

    @Override // defpackage.avh
    public final void l(int i, View view) {
        this.X.put(i, view);
    }

    public final void l1(int i) {
        if (this.E != i) {
            A0();
            this.E = i;
            this.Q = null;
            this.R = null;
            this.K.clear();
            a aVar = this.P;
            aVar.b();
            aVar.d = 0;
            F0();
        }
    }

    @Override // defpackage.avh
    public final int m(View view, int i, int i2) {
        int i3;
        int i4;
        if (o()) {
            i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left;
            i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right;
        } else {
            i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.top;
            i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b.bottom;
        }
        return i3 + i4;
    }

    public final void m1(int i) {
        int i2 = this.F;
        if (i2 != 1) {
            if (i2 == 0) {
                A0();
                this.K.clear();
                a aVar = this.P;
                aVar.b();
                aVar.d = 0;
            }
            this.F = 1;
            this.Q = null;
            this.R = null;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void n0(int i, int i2) {
        o1(i);
    }

    public final boolean n1(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.v && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // defpackage.avh
    public final boolean o() {
        int i = this.E;
        return i == 0 || i == 1;
    }

    public final void o1(int i) {
        View viewD1 = d1(K() - 1, -1);
        if (i >= (viewD1 != null ? RecyclerView.o.U(viewD1) : -1)) {
            return;
        }
        int iK = K();
        com.google.android.flexbox.b bVar = this.L;
        bVar.j(iK);
        bVar.k(iK);
        bVar.i(iK);
        if (i >= bVar.c.length) {
            return;
        }
        this.a0 = i;
        View viewJ = J(0);
        if (viewJ == null) {
            return;
        }
        this.T = RecyclerView.o.U(viewJ);
        if (o() || !this.I) {
            this.U = this.Q.e(viewJ) - this.Q.k();
        } else {
            this.U = this.Q.h() + this.Q.b(viewJ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void p0(int i, int i2) {
        o1(Math.min(i, i2));
    }

    public final void p1(a aVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = o() ? this.B : this.A;
            this.O.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.O.b = false;
        }
        if (o() || !this.I) {
            this.O.a = this.Q.g() - aVar.c;
        } else {
            this.O.a = aVar.c - getPaddingRight();
        }
        b bVar = this.O;
        bVar.d = aVar.a;
        bVar.h = 1;
        bVar.e = aVar.c;
        bVar.f = Integer.MIN_VALUE;
        bVar.c = aVar.b;
        if (!z || this.K.size() <= 1 || (i = aVar.b) < 0 || i >= this.K.size() - 1) {
            return;
        }
        com.google.android.flexbox.a aVar2 = this.K.get(aVar.b);
        b bVar2 = this.O;
        bVar2.c++;
        bVar2.d += aVar2.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q0(int i, int i2) {
        o1(i);
    }

    public final void q1(a aVar, boolean z, boolean z2) {
        if (z2) {
            int i = o() ? this.B : this.A;
            this.O.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.O.b = false;
        }
        if (o() || !this.I) {
            this.O.a = aVar.c - this.Q.k();
        } else {
            this.O.a = (this.Z.getWidth() - aVar.c) - this.Q.k();
        }
        b bVar = this.O;
        bVar.d = aVar.a;
        bVar.h = -1;
        bVar.e = aVar.c;
        bVar.f = Integer.MIN_VALUE;
        int i2 = aVar.b;
        bVar.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.K.size();
        int i3 = aVar.b;
        if (size > i3) {
            com.google.android.flexbox.a aVar2 = this.K.get(i3);
            b bVar2 = this.O;
            bVar2.c--;
            bVar2.d -= aVar2.h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void r0(int i) {
        o1(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean s() {
        if (this.F == 0) {
            return o();
        }
        if (!o()) {
            return true;
        }
        int i = this.C;
        View view = this.Z;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void s0(RecyclerView recyclerView, int i, int i2) {
        o1(i);
        o1(i);
    }

    @Override // defpackage.avh
    public final void setFlexLines(List<com.google.android.flexbox.a> list) {
        this.K = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean t() {
        if (this.F == 0) {
            return !o();
        }
        if (!o()) {
            int i = this.D;
            View view = this.Z;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x0211  */
    /* JADX WARN: Code duplicated, block: B:139:0x0217  */
    /* JADX WARN: Code duplicated, block: B:142:0x0224  */
    /* JADX WARN: Code duplicated, block: B:143:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewZ0;
        FlexboxLayoutManager flexboxLayoutManager;
        c0 c0Var;
        int iU;
        int i;
        int size;
        int i2;
        int i3;
        View viewF;
        View viewJ;
        boolean z;
        int iE;
        c0 c0Var2;
        boolean z2;
        c0 c0Var3;
        int iE2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.M = uVar;
        this.N = zVar;
        int iB = zVar.b();
        if (iB == 0 && zVar.g) {
            return;
        }
        int layoutDirection = this.b.getLayoutDirection();
        int i8 = this.E;
        if (i8 == 0) {
            this.I = layoutDirection == 1;
            this.J = this.F == 2;
        } else if (i8 == 1) {
            this.I = layoutDirection != 1;
            this.J = this.F == 2;
        } else if (i8 == 2) {
            boolean z5 = layoutDirection == 1;
            this.I = z5;
            if (this.F == 2) {
                this.I = !z5;
            }
            this.J = false;
        } else if (i8 != 3) {
            this.I = false;
            this.J = false;
        } else {
            boolean z6 = layoutDirection == 1;
            this.I = z6;
            if (this.F == 2) {
                this.I = !z6;
            }
            this.J = true;
        }
        X0();
        if (this.O == null) {
            b bVar = new b();
            bVar.h = 1;
            this.O = bVar;
        }
        com.google.android.flexbox.b bVar2 = this.L;
        bVar2.j(iB);
        bVar2.k(iB);
        bVar2.i(iB);
        this.O.i = false;
        SavedState savedState = this.S;
        if (savedState != null && (i7 = savedState.a) >= 0 && i7 < iB) {
            this.T = i7;
        }
        a aVar = this.P;
        if (!aVar.f || this.T != -1 || savedState != null) {
            aVar.b();
            SavedState savedState2 = this.S;
            if (zVar.g || (i3 = this.T) == -1) {
                if (K() != 0) {
                    if (aVar.e) {
                        viewZ0 = b1(zVar.b());
                    } else {
                        viewZ0 = Z0(zVar.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.F == 0) {
                            c0Var = flexboxLayoutManager.R;
                        } else {
                            c0Var = flexboxLayoutManager.Q;
                        }
                        if (flexboxLayoutManager.o() && flexboxLayoutManager.I) {
                            if (aVar.e) {
                                aVar.c = c0Var.m() + c0Var.e(viewZ0);
                            } else {
                                aVar.c = c0Var.b(viewZ0);
                            }
                        } else if (aVar.e) {
                            aVar.c = c0Var.m() + c0Var.b(viewZ0);
                        } else {
                            aVar.c = c0Var.e(viewZ0);
                        }
                        iU = RecyclerView.o.U(viewZ0);
                        aVar.a = iU;
                        aVar.g = false;
                        int[] iArr = flexboxLayoutManager.L.c;
                        if (iU == -1) {
                            iU = 0;
                        }
                        i = iArr[iU];
                        if (i == -1) {
                            i = 0;
                        }
                        aVar.b = i;
                        size = flexboxLayoutManager.K.size();
                        i2 = aVar.b;
                        if (size > i2) {
                            aVar.a = flexboxLayoutManager.K.get(i2).o;
                        }
                    } else {
                        aVar.a();
                        aVar.a = 0;
                        aVar.b = 0;
                    }
                } else {
                    aVar.a();
                    aVar.a = 0;
                    aVar.b = 0;
                }
            } else if (i3 < 0 || i3 >= zVar.b()) {
                this.T = -1;
                this.U = Integer.MIN_VALUE;
                if (K() != 0) {
                    if (aVar.e) {
                        viewZ0 = b1(zVar.b());
                    } else {
                        viewZ0 = Z0(zVar.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.F == 0) {
                            c0Var = flexboxLayoutManager.R;
                        } else {
                            c0Var = flexboxLayoutManager.Q;
                        }
                        if (flexboxLayoutManager.o()) {
                            if (aVar.e) {
                                aVar.c = c0Var.m() + c0Var.b(viewZ0);
                            } else {
                                aVar.c = c0Var.e(viewZ0);
                            }
                        } else if (aVar.e) {
                            aVar.c = c0Var.m() + c0Var.b(viewZ0);
                        } else {
                            aVar.c = c0Var.e(viewZ0);
                        }
                        iU = RecyclerView.o.U(viewZ0);
                        aVar.a = iU;
                        aVar.g = false;
                        int[] iArr2 = flexboxLayoutManager.L.c;
                        if (iU == -1) {
                            iU = 0;
                        }
                        i = iArr2[iU];
                        if (i == -1) {
                            i = 0;
                        }
                        aVar.b = i;
                        size = flexboxLayoutManager.K.size();
                        i2 = aVar.b;
                        if (size > i2) {
                            aVar.a = flexboxLayoutManager.K.get(i2).o;
                        }
                    } else {
                        aVar.a();
                        aVar.a = 0;
                        aVar.b = 0;
                    }
                } else {
                    aVar.a();
                    aVar.a = 0;
                    aVar.b = 0;
                }
            } else {
                int i9 = this.T;
                aVar.a = i9;
                aVar.b = bVar2.c[i9];
                SavedState savedState3 = this.S;
                if (savedState3 != null) {
                    int iB2 = zVar.b();
                    int i10 = savedState3.a;
                    if (i10 >= 0 && i10 < iB2) {
                        aVar.c = this.Q.k() + savedState2.b;
                        aVar.g = true;
                        aVar.b = -1;
                    } else if (this.U == Integer.MIN_VALUE) {
                        viewF = F(this.T);
                        if (viewF != null) {
                            if (K() > 0 && (viewJ = J(0)) != null) {
                                if (this.T < RecyclerView.o.U(viewJ)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aVar.e = z;
                            }
                            aVar.a();
                        } else if (this.Q.c(viewF) > this.Q.l()) {
                            aVar.a();
                        } else {
                            iE = this.Q.e(viewF) - this.Q.k();
                            c0Var2 = this.Q;
                            if (iE < 0) {
                                aVar.c = c0Var2.k();
                                aVar.e = false;
                            } else if (c0Var2.g() - this.Q.b(viewF) < 0) {
                                aVar.c = this.Q.g();
                                aVar.e = true;
                            } else {
                                z2 = aVar.e;
                                c0Var3 = this.Q;
                                if (z2) {
                                    iE2 = this.Q.m() + c0Var3.b(viewF);
                                } else {
                                    iE2 = c0Var3.e(viewF);
                                }
                                aVar.c = iE2;
                            }
                        }
                    } else if (o() && this.I) {
                        aVar.c = this.U - this.Q.h();
                    } else {
                        aVar.c = this.Q.k() + this.U;
                    }
                } else if (this.U == Integer.MIN_VALUE) {
                    viewF = F(this.T);
                    if (viewF != null) {
                        if (K() > 0) {
                            if (this.T < RecyclerView.o.U(viewJ)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.e = z;
                        }
                        aVar.a();
                    } else if (this.Q.c(viewF) > this.Q.l()) {
                        aVar.a();
                    } else {
                        iE = this.Q.e(viewF) - this.Q.k();
                        c0Var2 = this.Q;
                        if (iE < 0) {
                            aVar.c = c0Var2.k();
                            aVar.e = false;
                        } else if (c0Var2.g() - this.Q.b(viewF) < 0) {
                            aVar.c = this.Q.g();
                            aVar.e = true;
                        } else {
                            z2 = aVar.e;
                            c0Var3 = this.Q;
                            if (z2) {
                                iE2 = this.Q.m() + c0Var3.b(viewF);
                            } else {
                                iE2 = c0Var3.e(viewF);
                            }
                            aVar.c = iE2;
                        }
                    }
                } else if (o()) {
                    aVar.c = this.Q.k() + this.U;
                } else {
                    aVar.c = this.Q.k() + this.U;
                }
            }
            aVar.f = true;
        }
        E(uVar);
        if (aVar.e) {
            q1(aVar, false, true);
        } else {
            p1(aVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.C, this.A);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.D, this.B);
        int i11 = this.C;
        int i12 = this.D;
        boolean zO = o();
        Context context = this.Y;
        if (zO) {
            int i13 = this.V;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            b bVar3 = this.O;
            i4 = bVar3.b ? context.getResources().getDisplayMetrics().heightPixels : bVar3.a;
        } else {
            int i14 = this.W;
            z3 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
            b bVar4 = this.O;
            i4 = bVar4.b ? context.getResources().getDisplayMetrics().widthPixels : bVar4.a;
        }
        int i15 = i4;
        this.V = i11;
        this.W = i12;
        int i16 = this.a0;
        com.google.android.flexbox.b.a aVar2 = this.b0;
        if (i16 != -1 || (this.T == -1 && !z3)) {
            int iMin = aVar.a;
            if (i16 != -1) {
                iMin = Math.min(i16, iMin);
            }
            aVar2.a = null;
            aVar2.b = 0;
            boolean zO2 = o();
            List<com.google.android.flexbox.a> list = this.K;
            if (zO2) {
                if (list.size() > 0) {
                    bVar2.d(iMin, this.K);
                    this.L.b(this.b0, iMakeMeasureSpec, iMakeMeasureSpec2, i15, iMin, aVar.a, this.K);
                } else {
                    bVar2.i(iB);
                    this.L.b(this.b0, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, -1, this.K);
                }
            } else if (list.size() > 0) {
                bVar2.d(iMin, this.K);
                int i17 = iMin;
                this.L.b(this.b0, iMakeMeasureSpec2, iMakeMeasureSpec, i15, i17, aVar.a, this.K);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i17;
            } else {
                bVar2.i(iB);
                this.L.b(this.b0, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, -1, this.K);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.K = aVar2.a;
            bVar2.h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            bVar2.u(iMin);
        } else if (!aVar.e) {
            this.K.clear();
            aVar2.a = null;
            aVar2.b = 0;
            boolean zO3 = o();
            int i18 = aVar.a;
            com.google.android.flexbox.b bVar5 = this.L;
            com.google.android.flexbox.b.a aVar3 = this.b0;
            if (zO3) {
                bVar5.b(aVar3, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, i18, this.K);
            } else {
                bVar5.b(aVar3, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, i18, this.K);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.K = aVar2.a;
            bVar2.h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            bVar2.u(0);
            int i19 = bVar2.c[aVar.a];
            aVar.b = i19;
            this.O.c = i19;
        }
        Y0(uVar, zVar, this.O);
        boolean z7 = aVar.e;
        b bVar6 = this.O;
        if (z7) {
            i6 = bVar6.e;
            z4 = true;
            p1(aVar, true, false);
            Y0(uVar, zVar, this.O);
            i5 = this.O.e;
        } else {
            z4 = true;
            i5 = bVar6.e;
            q1(aVar, true, false);
            Y0(uVar, zVar, this.O);
            i6 = this.O.e;
        }
        if (K() > 0) {
            if (aVar.e) {
                g1(f1(i5, uVar, zVar, z4) + i6, uVar, zVar, false);
            } else {
                f1(g1(i6, uVar, zVar, z4) + i5, uVar, zVar, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean u(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void u0(RecyclerView.z zVar) {
        this.S = null;
        this.T = -1;
        this.U = Integer.MIN_VALUE;
        this.a0 = -1;
        this.P.b();
        this.X.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void v0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.S = (SavedState) parcelable;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable w0() {
        SavedState savedState = this.S;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (K() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        View viewJ = J(0);
        savedState3.a = RecyclerView.o.U(viewJ);
        savedState3.b = this.Q.e(viewJ) - this.Q.k();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.z zVar) {
        return U0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.z zVar) {
        return V0(zVar);
    }

    public FlexboxLayoutManager(e eVar) {
        l1(0);
        m1(1);
        k1(4);
        this.Y = eVar;
    }
}
