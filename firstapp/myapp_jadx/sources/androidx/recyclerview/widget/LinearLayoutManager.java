package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.protobuf.Reader;
import defpackage.c7;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.ruw;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements r.h, RecyclerView.y.b {
    public int E;
    public c F;
    public c0 G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public int M;
    public int N;
    public SavedState O;
    public final a P;
    public final b Q;
    public final int R;
    public final int[] S;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public boolean c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt() == 1;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public static class a {
        public c0 a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            c();
        }

        public final void a() {
            boolean z = this.d;
            c0 c0Var = this.a;
            this.c = z ? c0Var.g() : c0Var.k();
        }

        public final void b(int i, View view) {
            int iM = this.a.m();
            if (iM >= 0) {
                boolean z = this.d;
                c0 c0Var = this.a;
                if (z) {
                    this.c = this.a.m() + c0Var.b(view);
                } else {
                    this.c = c0Var.e(view);
                }
                this.b = i;
                return;
            }
            this.b = i;
            boolean z2 = this.d;
            c0 c0Var2 = this.a;
            if (!z2) {
                int iE = c0Var2.e(view);
                int iK = iE - this.a.k();
                this.c = iE;
                if (iK > 0) {
                    int iG = (this.a.g() - Math.min(0, (this.a.g() - iM) - this.a.b(view))) - (this.a.c(view) + iE);
                    if (iG < 0) {
                        this.c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (c0Var2.g() - iM) - this.a.b(view);
            this.c = this.a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.c - this.a.c(view);
                int iK2 = this.a.k();
                int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.c = Math.min(iG2, -iMin) + this.c;
                }
            }
        }

        public final void c() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return ruw.a(sb, this.e, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List<RecyclerView.d0> k;
        public boolean l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i = Reader.READ_DONE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.a.isRemoved() && (layoutPosition = (layoutParams.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.u uVar) {
            List<RecyclerView.d0> list = this.k;
            if (list == null) {
                View viewD = uVar.d(this.d);
                this.d += this.e;
                return viewD;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.a.isRemoved() && this.d == layoutParams.a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.E = 1;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.O = null;
        this.P = new a();
        this.Q = new b();
        this.R = 2;
        this.S = new int[2];
        RecyclerView.o.c cVarV = RecyclerView.o.V(context, attributeSet, i, i2);
        x1(cVarV.a);
        boolean z = cVarV.c;
        q(null);
        if (z != this.I) {
            this.I = z;
            F0();
        }
        y1(cVarV.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return Y0(zVar);
    }

    public final void A1(int i, int i2) {
        this.F.c = this.G.g() - i2;
        c cVar = this.F;
        cVar.e = this.J ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int B(RecyclerView.z zVar) {
        return W0(zVar);
    }

    public final void B1(int i, int i2) {
        this.F.c = i2 - this.G.k();
        c cVar = this.F;
        cVar.d = i;
        cVar.e = this.J ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C(RecyclerView.z zVar) {
        return X0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D(RecyclerView.z zVar) {
        return Y0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View F(int i) {
        int iK = K();
        if (iK == 0) {
            return null;
        }
        int iU = i - RecyclerView.o.U(J(0));
        if (iU >= 0 && iU < iK) {
            View viewJ = J(iU);
            if (RecyclerView.o.U(viewJ) == i) {
                return viewJ;
            }
        }
        return super.F(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.LayoutParams G() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.E == 1) {
            return 0;
        }
        return v1(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(int i) {
        this.M = i;
        this.N = Integer.MIN_VALUE;
        SavedState savedState = this.O;
        if (savedState != null) {
            savedState.a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.E == 0) {
            return 0;
        }
        return v1(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean P0() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iK = K();
            for (int i = 0; i < iK; i++) {
                ViewGroup.LayoutParams layoutParams = J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.a = i;
        S0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean T0() {
        return this.O == null && this.H == this.K;
    }

    public void U0(RecyclerView.z zVar, int[] iArr) {
        int i;
        int iL = zVar.a != -1 ? this.G.l() : 0;
        if (this.F.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void V0(RecyclerView.z zVar, c cVar, q.b bVar) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.b()) {
            return;
        }
        bVar.a(i, Math.max(0, cVar.g));
    }

    public final int W0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        a1();
        c0 c0Var = this.G;
        boolean z = !this.L;
        return h0.a(zVar, c0Var, e1(z), d1(z), this, this.L);
    }

    public final int X0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        a1();
        c0 c0Var = this.G;
        boolean z = !this.L;
        return h0.b(zVar, c0Var, e1(z), d1(z), this, this.L, this.J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Y() {
        return true;
    }

    public final int Y0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        a1();
        c0 c0Var = this.G;
        boolean z = !this.L;
        return h0.c(zVar, c0Var, e1(z), d1(z), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Z() {
        return this.I;
    }

    public final int Z0(int i) {
        if (i == 1) {
            return (this.E != 1 && p1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.E != 1 && p1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.E == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.E == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.E == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.E == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void a1() {
        if (this.F == null) {
            c cVar = new c();
            cVar.a = true;
            cVar.h = 0;
            cVar.i = 0;
            cVar.k = null;
            this.F = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF b(int i) {
        if (K() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.o.U(J(0))) != this.J ? -1 : 1;
        return this.E == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int b1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i;
        int i2 = cVar.c;
        int i3 = cVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.g = i3 + i2;
            }
            s1(uVar, cVar);
        }
        int i4 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.l && i4 <= 0) || (i = cVar.d) < 0 || i >= zVar.b()) {
                break;
            }
            b bVar = this.Q;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            q1(uVar, zVar, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f * i6) + i5;
                if (!bVar.c || cVar.k != null || !zVar.g) {
                    cVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.g = i8 + i9;
                    }
                    s1(uVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    public final int c1() {
        View viewJ1 = j1(0, K(), true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return RecyclerView.o.U(viewJ1);
    }

    public int d() {
        return h1();
    }

    public final View d1(boolean z) {
        return this.J ? j1(0, K(), z, true) : j1(K() - 1, -1, z, true);
    }

    public final View e1(boolean z) {
        return this.J ? j1(K() - 1, -1, z, true) : j1(0, K(), z, true);
    }

    public final int f1() {
        View viewJ1 = j1(0, K(), false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return RecyclerView.o.U(viewJ1);
    }

    public final int g1() {
        View viewJ1 = j1(K() - 1, -1, true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return RecyclerView.o.U(viewJ1);
    }

    @Override // androidx.recyclerview.widget.r.h
    public final void h(View view, View view2) {
        q("Cannot drop a view during a scroll or layout calculation");
        a1();
        u1();
        int iU = RecyclerView.o.U(view);
        int iU2 = RecyclerView.o.U(view2);
        byte b2 = iU < iU2 ? (byte) 1 : (byte) -1;
        boolean z = this.J;
        c0 c0Var = this.G;
        if (z) {
            if (b2 == 1) {
                w1(iU2, c0Var.g() - (this.G.c(view) + this.G.e(view2)));
                return;
            } else {
                w1(iU2, c0Var.g() - this.G.b(view2));
                return;
            }
        }
        if (b2 == -1) {
            w1(iU2, c0Var.e(view2));
        } else {
            w1(iU2, c0Var.b(view2) - this.G.c(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h0(RecyclerView recyclerView, RecyclerView.u uVar) {
    }

    public final int h1() {
        View viewJ1 = j1(K() - 1, -1, false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return RecyclerView.o.U(viewJ1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View i0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iZ0;
        View viewI1;
        u1();
        if (K() != 0 && (iZ0 = Z0(i)) != Integer.MIN_VALUE) {
            a1();
            z1(iZ0, (int) (this.G.l() * 0.33333334f), false, zVar);
            c cVar = this.F;
            cVar.g = Integer.MIN_VALUE;
            cVar.a = false;
            b1(uVar, cVar, zVar, true);
            boolean z = this.J;
            if (iZ0 == -1) {
                viewI1 = z ? i1(K() - 1, -1) : i1(0, K());
            } else {
                viewI1 = z ? i1(0, K()) : i1(K() - 1, -1);
            }
            View viewO1 = iZ0 == -1 ? o1() : n1();
            if (!viewO1.hasFocusable()) {
                return viewI1;
            }
            if (viewI1 != null) {
                return viewO1;
            }
        }
        return null;
    }

    public final View i1(int i, int i2) {
        int i3;
        int i4;
        a1();
        if (i2 <= i && i2 >= i) {
            return J(i);
        }
        if (this.G.e(J(i)) < this.G.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.E == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(f1());
            accessibilityEvent.setToIndex(h1());
        }
    }

    public final View j1(int i, int i2, boolean z, boolean z2) {
        a1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.E == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k0(RecyclerView.u uVar, RecyclerView.z zVar, c7 c7Var) {
        super.k0(uVar, zVar, c7Var);
        RecyclerView.f fVar = this.b.B;
        if (fVar == null || fVar.getItemCount() <= 0) {
            return;
        }
        c7Var.b(c7.a.o);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View k1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int iK;
        int i2;
        a1();
        int iK2 = K();
        if (z2) {
            iK = K() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iK2;
            iK = 0;
            i2 = 1;
        }
        int iB = zVar.b();
        int iK3 = this.G.k();
        int iG = this.G.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iK != i) {
            View viewJ = J(iK);
            int iU = RecyclerView.o.U(viewJ);
            int iE = this.G.e(viewJ);
            int iB2 = this.G.b(viewJ);
            if (iU >= 0 && iU < iB) {
                if (!((RecyclerView.LayoutParams) viewJ.getLayoutParams()).a.isRemoved()) {
                    boolean z3 = iB2 <= iK3 && iE < iK3;
                    boolean z4 = iE >= iG && iB2 > iG;
                    if (!z3 && !z4) {
                        return viewJ;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewJ;
                        } else if (view == null) {
                            view = viewJ;
                        }
                    } else if (z3) {
                        view2 = viewJ;
                    } else if (view == null) {
                        view = viewJ;
                    }
                } else if (view3 == null) {
                    view3 = viewJ;
                }
            }
            iK += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int l1(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iG;
        int iG2 = this.G.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -v1(-iG2, uVar, zVar);
        int i3 = i + i2;
        if (!z || (iG = this.G.g() - i3) <= 0) {
            return i2;
        }
        this.G.p(iG);
        return iG + i2;
    }

    public final int m1(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iK;
        int iK2 = i - this.G.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -v1(iK2, uVar, zVar);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.G.k()) <= 0) {
            return i2;
        }
        this.G.p(-iK);
        return i2 - iK;
    }

    public final View n1() {
        return J(this.J ? 0 : K() - 1);
    }

    public final View o1() {
        return J(this.J ? K() - 1 : 0);
    }

    public final boolean p1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q(String str) {
        if (this.O == null) {
            super.q(str);
        }
    }

    public void q1(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int iD;
        int i;
        int paddingLeft;
        int i2;
        int iD2;
        View viewB = cVar.b(uVar);
        if (viewB == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        List<RecyclerView.d0> list = cVar.k;
        boolean z = this.J;
        int i3 = cVar.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                p(viewB, -1, false);
            } else {
                p(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                p(viewB, -1, true);
            } else {
                p(viewB, 0, true);
            }
        }
        c0(viewB);
        bVar.a = this.G.c(viewB);
        if (this.E == 1) {
            if (p1()) {
                iD2 = this.C - getPaddingRight();
                paddingLeft = iD2 - this.G.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD2 = this.G.d(viewB) + paddingLeft;
            }
            int i4 = cVar.f;
            int i5 = cVar.b;
            int i6 = bVar.a;
            if (i4 == -1) {
                i2 = i5 - i6;
                iD = i5;
            } else {
                iD = i6 + i5;
                i2 = i5;
            }
            i = iD2;
        } else {
            int paddingTop = getPaddingTop();
            iD = this.G.d(viewB) + paddingTop;
            int i7 = cVar.f;
            int i8 = cVar.b;
            int i9 = bVar.a;
            if (i7 == -1) {
                i = i8;
                paddingLeft = i8 - i9;
            } else {
                i = i8 + i9;
                paddingLeft = i8;
            }
            i2 = paddingTop;
        }
        b0(viewB, paddingLeft, i2, i, iD);
        if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
            bVar.c = true;
        }
        bVar.d = viewB.hasFocusable();
    }

    public void r1(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s() {
        return this.E == 0;
    }

    public final void s1(RecyclerView.u uVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            int iK = K();
            if (i < 0) {
                return;
            }
            int iF = (this.G.f() - i) + i2;
            if (this.J) {
                for (int i3 = 0; i3 < iK; i3++) {
                    View viewJ = J(i3);
                    if (this.G.e(viewJ) < iF || this.G.o(viewJ) < iF) {
                        t1(uVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iK - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewJ2 = J(i5);
                if (this.G.e(viewJ2) < iF || this.G.o(viewJ2) < iF) {
                    t1(uVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iK2 = K();
        if (!this.J) {
            for (int i7 = 0; i7 < iK2; i7++) {
                View viewJ3 = J(i7);
                if (this.G.b(viewJ3) > i6 || this.G.n(viewJ3) > i6) {
                    t1(uVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iK2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewJ4 = J(i9);
            if (this.G.b(viewJ4) > i6 || this.G.n(viewJ4) > i6) {
                t1(uVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean t() {
        return this.E == 1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:138:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewK1;
        boolean z3;
        c0 c0Var;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z4;
        boolean z5;
        RecyclerView.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        ?? r4;
        List<RecyclerView.d0> list;
        int i4;
        int i5;
        int iL1;
        int i6;
        View viewF;
        int iE2;
        int iG2;
        int i7;
        int i8 = -1;
        if (!(this.O == null && this.M == -1) && zVar.b() == 0) {
            B0(uVar);
            return;
        }
        SavedState savedState = this.O;
        if (savedState != null && (i7 = savedState.a) >= 0) {
            this.M = i7;
        }
        a1();
        boolean z6 = false;
        this.F.a = false;
        u1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.P;
        if (!aVar.e || this.M != -1 || this.O != null) {
            aVar.c();
            aVar.d = this.J ^ this.K;
            if (zVar.g || (i = this.M) == -1) {
                if (K() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                        if (!layoutParams.a.isRemoved() || layoutParams.a.getLayoutPosition() < 0 || layoutParams.a.getLayoutPosition() >= zVar.b()) {
                            z = this.H;
                            z2 = this.K;
                            if (z == z2 || (viewK1 = k1(uVar, zVar, aVar.d, z2)) == null) {
                                aVar.a();
                                if (this.K) {
                                    iB = zVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iU = RecyclerView.o.U(viewK1);
                                z3 = aVar.d;
                                c0Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.m() + c0Var.b(viewK1);
                                } else {
                                    aVar.c = c0Var.e(viewK1);
                                }
                                aVar.b = iU;
                                if (!zVar.g && T0()) {
                                    iE = this.G.e(viewK1);
                                    iB2 = this.G.b(viewK1);
                                    iK = this.G.k();
                                    iG = this.G.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            aVar.b(RecyclerView.o.U(focusedChild2), focusedChild2);
                        }
                    } else {
                        z = this.H;
                        z2 = this.K;
                        if (z == z2) {
                            aVar.a();
                            if (this.K) {
                                iB = zVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iU2 = RecyclerView.o.U(viewK1);
                            z3 = aVar.d;
                            c0Var = aVar.a;
                            if (z3) {
                                aVar.c = aVar.a.m() + c0Var.b(viewK1);
                            } else {
                                aVar.c = c0Var.e(viewK1);
                            }
                            aVar.b = iU2;
                            if (!zVar.g) {
                                iE = this.G.e(viewK1);
                                iB2 = this.G.b(viewK1);
                                iK = this.G.k();
                                iG = this.G.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.K) {
                        iB = zVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else if (i < 0 || i >= zVar.b()) {
                this.M = -1;
                this.N = Integer.MIN_VALUE;
                if (K() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                        if (layoutParams.a.isRemoved()) {
                            z = this.H;
                            z2 = this.K;
                            if (z == z2) {
                                aVar.a();
                                if (this.K) {
                                    iB = zVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iU3 = RecyclerView.o.U(viewK1);
                                z3 = aVar.d;
                                c0Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.m() + c0Var.b(viewK1);
                                } else {
                                    aVar.c = c0Var.e(viewK1);
                                }
                                aVar.b = iU3;
                                if (!zVar.g) {
                                    iE = this.G.e(viewK1);
                                    iB2 = this.G.b(viewK1);
                                    iK = this.G.k();
                                    iG = this.G.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            z = this.H;
                            z2 = this.K;
                            if (z == z2) {
                                aVar.a();
                                if (this.K) {
                                    iB = zVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iU4 = RecyclerView.o.U(viewK1);
                                z3 = aVar.d;
                                c0Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.m() + c0Var.b(viewK1);
                                } else {
                                    aVar.c = c0Var.e(viewK1);
                                }
                                aVar.b = iU4;
                                if (!zVar.g) {
                                    iE = this.G.e(viewK1);
                                    iB2 = this.G.b(viewK1);
                                    iK = this.G.k();
                                    iG = this.G.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.H;
                        z2 = this.K;
                        if (z == z2) {
                            aVar.a();
                            if (this.K) {
                                iB = zVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iU5 = RecyclerView.o.U(viewK1);
                            z3 = aVar.d;
                            c0Var = aVar.a;
                            if (z3) {
                                aVar.c = aVar.a.m() + c0Var.b(viewK1);
                            } else {
                                aVar.c = c0Var.e(viewK1);
                            }
                            aVar.b = iU5;
                            if (!zVar.g) {
                                iE = this.G.e(viewK1);
                                iB2 = this.G.b(viewK1);
                                iK = this.G.k();
                                iG = this.G.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.K) {
                        iB = zVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else {
                int i9 = this.M;
                aVar.b = i9;
                SavedState savedState2 = this.O;
                if (savedState2 != null && savedState2.a >= 0) {
                    boolean z7 = savedState2.c;
                    aVar.d = z7;
                    c0 c0Var2 = this.G;
                    if (z7) {
                        aVar.c = c0Var2.g() - this.O.b;
                    } else {
                        aVar.c = c0Var2.k() + this.O.b;
                    }
                } else if (this.N == Integer.MIN_VALUE) {
                    View viewF2 = F(i9);
                    if (viewF2 == null) {
                        if (K() > 0) {
                            aVar.d = (this.M < RecyclerView.o.U(J(0))) == this.J;
                        }
                        aVar.a();
                    } else if (this.G.c(viewF2) > this.G.l()) {
                        aVar.a();
                    } else {
                        int iE3 = this.G.e(viewF2) - this.G.k();
                        c0 c0Var3 = this.G;
                        if (iE3 < 0) {
                            aVar.c = c0Var3.k();
                            aVar.d = false;
                        } else if (c0Var3.g() - this.G.b(viewF2) < 0) {
                            aVar.c = this.G.g();
                            aVar.d = true;
                        } else {
                            boolean z8 = aVar.d;
                            c0 c0Var4 = this.G;
                            aVar.c = z8 ? this.G.m() + c0Var4.b(viewF2) : c0Var4.e(viewF2);
                        }
                    }
                } else {
                    boolean z9 = this.J;
                    aVar.d = z9;
                    c0 c0Var5 = this.G;
                    if (z9) {
                        aVar.c = c0Var5.g() - this.N;
                    } else {
                        aVar.c = c0Var5.k() + this.N;
                    }
                }
            }
            aVar.e = true;
        } else if (focusedChild != null && (this.G.e(focusedChild) >= this.G.g() || this.G.b(focusedChild) <= this.G.k())) {
            aVar.b(RecyclerView.o.U(focusedChild), focusedChild);
        }
        c cVar = this.F;
        cVar.f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.S;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(zVar, iArr);
        int iK2 = this.G.k() + Math.max(0, iArr[0]);
        int iH = this.G.h() + Math.max(0, iArr[1]);
        if (zVar.g && (i6 = this.M) != -1 && this.N != Integer.MIN_VALUE && (viewF = F(i6)) != null) {
            boolean z10 = this.J;
            c0 c0Var6 = this.G;
            if (z10) {
                iG2 = c0Var6.g() - this.G.b(viewF);
                iE2 = this.N;
            } else {
                iE2 = c0Var6.e(viewF) - this.G.k();
                iG2 = this.N;
            }
            int i10 = iG2 - iE2;
            if (i10 > 0) {
                iK2 += i10;
            } else {
                iH -= i10;
            }
        }
        boolean z11 = aVar.d;
        boolean z12 = this.J;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        r1(uVar, zVar, aVar, i8);
        E(uVar);
        this.F.l = this.G.i() == 0 && this.G.f() == 0;
        this.F.getClass();
        this.F.i = 0;
        boolean z13 = aVar.d;
        int i11 = aVar.b;
        if (z13) {
            B1(i11, aVar.c);
            c cVar2 = this.F;
            cVar2.h = iK2;
            b1(uVar, cVar2, zVar, false);
            c cVar3 = this.F;
            i3 = cVar3.b;
            int i12 = cVar3.d;
            int i13 = cVar3.c;
            if (i13 > 0) {
                iH += i13;
            }
            A1(aVar.b, aVar.c);
            c cVar4 = this.F;
            cVar4.h = iH;
            cVar4.d += cVar4.e;
            b1(uVar, cVar4, zVar, false);
            c cVar5 = this.F;
            i2 = cVar5.b;
            int i14 = cVar5.c;
            if (i14 > 0) {
                B1(i12, i3);
                c cVar6 = this.F;
                cVar6.h = i14;
                b1(uVar, cVar6, zVar, false);
                i3 = this.F.b;
            }
        } else {
            A1(i11, aVar.c);
            c cVar7 = this.F;
            cVar7.h = iH;
            b1(uVar, cVar7, zVar, false);
            c cVar8 = this.F;
            i2 = cVar8.b;
            int i15 = cVar8.d;
            int i16 = cVar8.c;
            if (i16 > 0) {
                iK2 += i16;
            }
            B1(aVar.b, aVar.c);
            c cVar9 = this.F;
            cVar9.h = iK2;
            cVar9.d += cVar9.e;
            b1(uVar, cVar9, zVar, false);
            c cVar10 = this.F;
            int i17 = cVar10.b;
            int i18 = cVar10.c;
            if (i18 > 0) {
                A1(i15, i2);
                c cVar11 = this.F;
                cVar11.h = i18;
                b1(uVar, cVar11, zVar, false);
                i2 = this.F.b;
            }
            i3 = i17;
        }
        if (K() > 0) {
            if (this.J ^ this.K) {
                int iL2 = l1(i2, uVar, zVar, true);
                i4 = i3 + iL2;
                i5 = i2 + iL2;
                iL1 = m1(i4, uVar, zVar, false);
            } else {
                int iM1 = m1(i3, uVar, zVar, true);
                i4 = i3 + iM1;
                i5 = i2 + iM1;
                iL1 = l1(i5, uVar, zVar, false);
            }
            i3 = i4 + iL1;
            i2 = i5 + iL1;
        }
        if (zVar.k && K() != 0 && !zVar.g && T0()) {
            List<RecyclerView.d0> list2 = uVar.d;
            int size = list2.size();
            int iU6 = RecyclerView.o.U(J(0));
            int i19 = 0;
            int iC = 0;
            int iC2 = 0;
            while (i19 < size) {
                RecyclerView.d0 d0Var = list2.get(i19);
                if (!d0Var.isRemoved()) {
                    boolean z14 = d0Var.getLayoutPosition() < iU6 ? true : z6;
                    boolean z15 = this.J;
                    c0 c0Var7 = this.G;
                    View view = d0Var.itemView;
                    if (z14 != z15) {
                        iC += c0Var7.c(view);
                    } else {
                        iC2 += c0Var7.c(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.F.k = list2;
            if (iC > 0) {
                B1(RecyclerView.o.U(o1()), i3);
                c cVar12 = this.F;
                cVar12.h = iC;
                r4 = 0;
                cVar12.c = 0;
                cVar12.a(null);
                b1(uVar, this.F, zVar, false);
            } else {
                r4 = 0;
            }
            if (iC2 > 0) {
                A1(RecyclerView.o.U(n1()), i2);
                c cVar13 = this.F;
                cVar13.h = iC2;
                cVar13.c = r4;
                list = null;
                cVar13.a(null);
                b1(uVar, this.F, zVar, r4);
            } else {
                list = null;
            }
            this.F.k = list;
        }
        if (zVar.g) {
            aVar.c();
        } else {
            c0 c0Var8 = this.G;
            c0Var8.b = c0Var8.l();
        }
        this.H = this.K;
    }

    public final void t1(RecyclerView.u uVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewJ = J(i);
                if (J(i) != null) {
                    this.a.j(i);
                }
                uVar.i(viewJ);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewJ2 = J(i3);
            if (J(i3) != null) {
                this.a.j(i3);
            }
            uVar.i(viewJ2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u0(RecyclerView.z zVar) {
        this.O = null;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.P.c();
    }

    public final void u1() {
        if (this.E == 1 || !p1()) {
            this.J = this.I;
        } else {
            this.J = !this.I;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void v0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.O = savedState;
            if (this.M != -1) {
                savedState.a = -1;
            }
            F0();
        }
    }

    public final int v1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (K() != 0 && i != 0) {
            a1();
            this.F.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            z1(i2, iAbs, true, zVar);
            c cVar = this.F;
            int iB1 = b1(uVar, cVar, zVar, false) + cVar.g;
            if (iB1 >= 0) {
                if (iAbs > iB1) {
                    i = i2 * iB1;
                }
                this.G.p(-i);
                this.F.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void w(int i, int i2, RecyclerView.z zVar, q.b bVar) {
        if (this.E != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        a1();
        z1(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        V0(zVar, this.F, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable w0() {
        SavedState savedState = this.O;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (K() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        a1();
        boolean z = this.H ^ this.J;
        savedState3.c = z;
        if (z) {
            View viewN1 = n1();
            savedState3.b = this.G.g() - this.G.b(viewN1);
            savedState3.a = RecyclerView.o.U(viewN1);
            return savedState3;
        }
        View viewO1 = o1();
        savedState3.a = RecyclerView.o.U(viewO1);
        savedState3.b = this.G.e(viewO1) - this.G.k();
        return savedState3;
    }

    public final void w1(int i, int i2) {
        this.M = i;
        this.N = i2;
        SavedState savedState = this.O;
        if (savedState != null) {
            savedState.a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void x(int i, q.b bVar) {
        boolean z;
        int i2;
        SavedState savedState = this.O;
        if (savedState == null || (i2 = savedState.a) < 0) {
            u1();
            z = this.J;
            i2 = this.M;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.R && i2 >= 0 && i2 < i; i4++) {
            bVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void x1(int i) {
        if (i != 0 && i != 1) {
            hb5.a(hce0.a(i, "invalid orientation:"));
            return;
        }
        q(null);
        if (i != this.E || this.G == null) {
            c0 c0VarA = c0.a(this, i);
            this.G = c0VarA;
            this.P.a = c0VarA;
            this.E = i;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.z zVar) {
        return W0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean y0(int i, Bundle bundle) {
        int iMin;
        if (super.y0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.E == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, W(recyclerView.c, recyclerView.x0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, M(recyclerView2.c, recyclerView2.x0) - 1);
            }
            if (iMin >= 0) {
                w1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public void y1(boolean z) {
        q(null);
        if (this.K == z) {
            return;
        }
        this.K = z;
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return X0(zVar);
    }

    public final void z1(int i, int i2, boolean z, RecyclerView.z zVar) {
        int iK;
        this.F.l = this.G.i() == 0 && this.G.f() == 0;
        this.F.f = i;
        int[] iArr = this.S;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(zVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        c cVar = this.F;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = this.G.h() + i3;
            View viewN1 = n1();
            c cVar2 = this.F;
            cVar2.e = this.J ? -1 : 1;
            int iU = RecyclerView.o.U(viewN1);
            c cVar3 = this.F;
            cVar2.d = iU + cVar3.e;
            cVar3.b = this.G.b(viewN1);
            iK = this.G.b(viewN1) - this.G.g();
        } else {
            View viewO1 = o1();
            c cVar4 = this.F;
            cVar4.h = this.G.k() + cVar4.h;
            c cVar5 = this.F;
            cVar5.e = this.J ? 1 : -1;
            int iU2 = RecyclerView.o.U(viewO1);
            c cVar6 = this.F;
            cVar5.d = iU2 + cVar6.e;
            cVar6.b = this.G.e(viewO1);
            iK = (-this.G.e(viewO1)) + this.G.k();
        }
        c cVar7 = this.F;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - iK;
        }
        cVar7.g = iK;
    }

    public LinearLayoutManager(int i, boolean z) {
        this.E = 1;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.O = null;
        this.P = new a();
        this.Q = new b();
        this.R = 2;
        this.S = new int[2];
        x1(i);
        q(null);
        if (z == this.I) {
            return;
        }
        this.I = z;
        F0();
    }

    public LinearLayoutManager() {
        this(1, false);
    }
}
