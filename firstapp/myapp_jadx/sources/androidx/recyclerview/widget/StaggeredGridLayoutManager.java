package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.protobuf.Reader;
import defpackage.c7;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.r6i0;
import defpackage.rh6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public final int E;
    public final c[] F;
    public final c0 G;
    public final c0 H;
    public final int I;
    public int J;
    public final u K;
    public boolean L;
    public final BitSet N;
    public final LazySpanLookup Q;
    public final int R;
    public boolean S;
    public boolean T;
    public SavedState U;
    public int V;
    public final Rect W;
    public final b X;
    public boolean Y;
    public final boolean Z;
    public int[] a0;
    public final a b0;
    public boolean M = false;
    public int O = -1;
    public int P = Integer.MIN_VALUE;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public c e;
        public boolean f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LazySpanLookup {
        public int[] a;
        public ArrayList b;

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int a;
            public int b;
            public int[] c;
            public boolean d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.a = parcel.readInt();
                    fullSpanItem.b = parcel.readInt();
                    fullSpanItem.d = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        fullSpanItem.c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                }
            }
        }

        public final void a(FullSpanItem fullSpanItem) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b = arrayList;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.b;
                if (i >= size) {
                    arrayList2.add(fullSpanItem);
                    return;
                }
                FullSpanItem fullSpanItem2 = (FullSpanItem) arrayList2.get(i);
                if (fullSpanItem2.a == fullSpanItem.a) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.a >= fullSpanItem.a) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
                i++;
            }
        }

        public final void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void d(int i) {
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            g(i);
        }

        public final FullSpanItem e(int i, int i2, int i3) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                int i5 = fullSpanItem.a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.b == i3 || fullSpanItem.d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem f(int i) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                if (fullSpanItem.a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        public final int g(int i) {
            int i2;
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.b != null) {
                FullSpanItem fullSpanItemF = f(i);
                if (fullSpanItemF != null) {
                    this.b.remove(fullSpanItemF);
                }
                int size = this.b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (((FullSpanItem) this.b.get(i3)).a >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i3);
                    this.b.remove(i3);
                    i2 = fullSpanItem.a;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            int[] iArr2 = this.a;
            if (i2 == -1) {
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int iMin = Math.min(i2 + 1, iArr2.length);
            Arrays.fill(this.a, i, iMin, -1);
            return iMin;
        }

        public final void h(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.a;
                if (i4 >= i) {
                    fullSpanItem.a = i4 + i2;
                }
            }
        }

        public final void i(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.a = i4 - i2;
                    }
                }
            }
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public ArrayList i;
        public boolean v;
        public boolean w;
        public boolean y;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                int i = parcel.readInt();
                savedState.c = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    savedState.d = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                savedState.e = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    savedState.f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.v = parcel.readInt() == 1;
                savedState.w = parcel.readInt() == 1;
                savedState.y = parcel.readInt() == 1;
                savedState.i = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
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
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeInt(this.w ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeList(this.i);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.U0();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class c {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public c(int i) {
            this.e = i;
        }

        public final void a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.e = this;
            ArrayList<View> arrayList = this.a;
            arrayList.add(view);
            this.c = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
                this.d = StaggeredGridLayoutManager.this.G.c(view) + this.d;
            }
        }

        public final void b() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) rh6.a(1, this.a);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.c = staggeredGridLayoutManager.G.b(view);
            if (layoutParams.f && (fullSpanItemF = staggeredGridLayoutManager.Q.f(layoutParams.a.getLayoutPosition())) != null && fullSpanItemF.b == 1) {
                int i = this.c;
                int[] iArr = fullSpanItemF.c;
                this.c = i + (iArr == null ? 0 : iArr[this.e]);
            }
        }

        public final void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.b = staggeredGridLayoutManager.G.e(view);
            if (layoutParams.f && (fullSpanItemF = staggeredGridLayoutManager.Q.f(layoutParams.a.getLayoutPosition())) != null && fullSpanItemF.b == -1) {
                int i = this.b;
                int[] iArr = fullSpanItemF.c;
                this.b = i - (iArr != null ? iArr[this.e] : 0);
            }
        }

        public final void d() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int e() {
            boolean z = StaggeredGridLayoutManager.this.L;
            ArrayList<View> arrayList = this.a;
            return z ? g(arrayList.size() - 1, -1, false, false, true) : g(0, arrayList.size(), false, false, true);
        }

        public final int f() {
            boolean z = StaggeredGridLayoutManager.this.L;
            ArrayList<View> arrayList = this.a;
            return z ? g(0, arrayList.size(), false, false, true) : g(arrayList.size() - 1, -1, false, false, true);
        }

        public final int g(int i, int i2, boolean z, boolean z2, boolean z3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.G.k();
            int iG = staggeredGridLayoutManager.G.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iE = staggeredGridLayoutManager.G.e(view);
                int iB = staggeredGridLayoutManager.G.b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iE >= iG : iE > iG;
                if (!z3 ? iB > iK : iB >= iK) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iE >= iK && iB <= iG) {
                            return RecyclerView.o.U(view);
                        }
                    } else {
                        if (z2) {
                            return RecyclerView.o.U(view);
                        }
                        if (iE < iK || iB > iG) {
                            return RecyclerView.o.U(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        public final int h(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            b();
            return this.c;
        }

        public final View i(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            ArrayList<View> arrayList = this.a;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.L && RecyclerView.o.U(view2) >= i) || ((!staggeredGridLayoutManager.L && RecyclerView.o.U(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.L && RecyclerView.o.U(view3) <= i) || ((!staggeredGridLayoutManager.L && RecyclerView.o.U(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int j(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.b;
        }

        public final void k() {
            ArrayList<View> arrayList = this.a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            LayoutParams layoutParams = (LayoutParams) viewRemove.getLayoutParams();
            layoutParams.e = null;
            if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
                this.d -= StaggeredGridLayoutManager.this.G.c(viewRemove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public final void l() {
            ArrayList<View> arrayList = this.a;
            View viewRemove = arrayList.remove(0);
            LayoutParams layoutParams = (LayoutParams) viewRemove.getLayoutParams();
            layoutParams.e = null;
            if (arrayList.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
                this.d -= StaggeredGridLayoutManager.this.G.c(viewRemove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public final void m(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.e = this;
            ArrayList<View> arrayList = this.a;
            arrayList.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParams.a.isRemoved() || layoutParams.a.isUpdated()) {
                this.d = StaggeredGridLayoutManager.this.G.c(view) + this.d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.E = -1;
        this.L = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.Q = lazySpanLookup;
        this.R = 2;
        this.W = new Rect();
        this.X = new b();
        this.Y = false;
        this.Z = true;
        this.b0 = new a();
        RecyclerView.o.c cVarV = RecyclerView.o.V(context, attributeSet, i, i2);
        int i3 = cVarV.a;
        if (i3 != 0 && i3 != 1) {
            hb5.a("invalid orientation.");
            throw null;
        }
        q(null);
        if (i3 != this.I) {
            this.I = i3;
            c0 c0Var = this.G;
            this.G = this.H;
            this.H = c0Var;
            F0();
        }
        int i4 = cVarV.b;
        q(null);
        if (i4 != this.E) {
            lazySpanLookup.b();
            F0();
            this.E = i4;
            this.N = new BitSet(this.E);
            this.F = new c[this.E];
            for (int i5 = 0; i5 < this.E; i5++) {
                this.F[i5] = new c(i5);
            }
            F0();
        }
        boolean z = cVarV.c;
        q(null);
        SavedState savedState = this.U;
        if (savedState != null && savedState.v != z) {
            savedState.v = z;
        }
        this.L = z;
        F0();
        u uVar = new u();
        uVar.a = true;
        uVar.f = 0;
        uVar.g = 0;
        this.K = uVar;
        this.G = c0.a(this, this.I);
        this.H = c0.a(this, 1 - this.I);
    }

    public static int v1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int A(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        boolean z = !this.Z;
        return h0.c(zVar, this.G, Y0(z), X0(z), this, this.Z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int B(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        boolean z = !this.Z;
        return h0.a(zVar, this.G, Y0(z), X0(z), this, this.Z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int C(RecyclerView.z zVar) {
        return V0(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int D(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        boolean z = !this.Z;
        return h0.c(zVar, this.G, Y0(z), X0(z), this, this.Z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams G() {
        return this.I == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return q1(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams H(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(int i) {
        SavedState savedState = this.U;
        if (savedState != null && savedState.a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.a = -1;
            savedState.b = -1;
        }
        this.O = i;
        this.P = Integer.MIN_VALUE;
        F0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams I(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        return q1(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void L0(Rect rect, int i, int i2) {
        int iV;
        int iV2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.I;
        int i4 = this.E;
        if (i3 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            iV2 = RecyclerView.o.v(i2, iHeight, recyclerView.getMinimumHeight());
            iV = RecyclerView.o.v(i, (this.J * i4) + paddingRight, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            iV = RecyclerView.o.v(i, iWidth, recyclerView2.getMinimumWidth());
            iV2 = RecyclerView.o.v(i2, (this.J * i4) + paddingBottom, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iV, iV2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int M(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.I == 1) {
            return Math.min(this.E, zVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R0(RecyclerView recyclerView, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.a = i;
        S0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean T0() {
        return this.U == null;
    }

    public final boolean U0() {
        int iB1;
        int iC1;
        if (K() != 0 && this.R != 0 && this.i) {
            if (this.M) {
                iB1 = c1();
                iC1 = b1();
            } else {
                iB1 = b1();
                iC1 = c1();
            }
            LazySpanLookup lazySpanLookup = this.Q;
            if (iB1 == 0 && g1() != null) {
                lazySpanLookup.b();
                this.f = true;
                F0();
                return true;
            }
            if (this.Y) {
                int i = this.M ? -1 : 1;
                int i2 = iC1 + 1;
                LazySpanLookup.FullSpanItem fullSpanItemE = lazySpanLookup.e(iB1, i2, i);
                if (fullSpanItemE == null) {
                    this.Y = false;
                    lazySpanLookup.d(i2);
                    return false;
                }
                LazySpanLookup.FullSpanItem fullSpanItemE2 = lazySpanLookup.e(iB1, fullSpanItemE.a, i * (-1));
                if (fullSpanItemE2 == null) {
                    lazySpanLookup.d(fullSpanItemE.a);
                } else {
                    lazySpanLookup.d(fullSpanItemE2.a + 1);
                }
                this.f = true;
                F0();
                return true;
            }
        }
        return false;
    }

    public final int V0(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        boolean z = !this.Z;
        return h0.b(zVar, this.G, Y0(z), X0(z), this, this.Z, this.M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int W(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.I == 0) {
            return Math.min(this.E, zVar.b());
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b9 A[LOOP:2: B:139:0x02b7->B:140:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cd A[LOOP:3: B:144:0x02cb->B:145:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x0307  */
    /* JADX WARN: Code duplicated, block: B:159:0x030b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0311  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:164:0x0330  */
    /* JADX WARN: Code duplicated, block: B:167:0x0341  */
    /* JADX WARN: Code duplicated, block: B:169:0x0349  */
    /* JADX WARN: Code duplicated, block: B:177:0x0363  */
    public final int W0(RecyclerView.u uVar, u uVar2, RecyclerView.z zVar) {
        int i;
        int i2;
        boolean z;
        c cVar;
        u uVar3;
        LazySpanLookup lazySpanLookup;
        int i3;
        int i4;
        LazySpanLookup lazySpanLookup2;
        int iE1;
        int iC;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        boolean zH1;
        c0 c0Var;
        int iK;
        int iC2;
        int i9;
        View view;
        boolean z3;
        u uVar4;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        RecyclerView.u uVar5 = uVar;
        BitSet bitSet = staggeredGridLayoutManager.N;
        boolean z5 = false;
        int i16 = staggeredGridLayoutManager.E;
        bitSet.set(0, i16, true);
        u uVar6 = staggeredGridLayoutManager.K;
        if (uVar6.i) {
            i = uVar2.e;
            i2 = i == 1 ? Reader.READ_DONE : Integer.MIN_VALUE;
        } else {
            i = uVar2.e;
            i2 = i == 1 ? uVar2.g + uVar2.b : uVar2.f - uVar2.b;
        }
        staggeredGridLayoutManager.s1(i, i2);
        boolean z6 = staggeredGridLayoutManager.M;
        c0 c0Var2 = staggeredGridLayoutManager.G;
        int iG = z6 ? c0Var2.g() : c0Var2.k();
        boolean z7 = false;
        while (true) {
            int i17 = uVar2.c;
            if (i17 < 0 || i17 >= zVar.b() || (!uVar6.i && bitSet.isEmpty())) {
                break;
            }
            View viewD = uVar5.d(uVar2.c);
            uVar2.c += uVar2.d;
            LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
            int layoutPosition = layoutParams.a.getLayoutPosition();
            LazySpanLookup lazySpanLookup3 = staggeredGridLayoutManager.Q;
            boolean z8 = z5;
            int[] iArr = lazySpanLookup3.a;
            int i18 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            boolean z9 = i18 == -1 ? true : z8 ? 1 : 0;
            c[] cVarArr = staggeredGridLayoutManager.F;
            if (z9) {
                if (layoutParams.f) {
                    cVar = cVarArr[z8 ? 1 : 0];
                    cVarArr = cVarArr;
                    bitSet = bitSet;
                } else {
                    if (staggeredGridLayoutManager.k1(uVar2.e)) {
                        i14 = i16 - 1;
                        i13 = -1;
                        i15 = -1;
                    } else {
                        i13 = i16;
                        i14 = z8 ? 1 : 0;
                        i15 = 1;
                    }
                    c cVar2 = null;
                    if (uVar2.e == 1) {
                        int iK2 = c0Var2.k();
                        int i19 = i14;
                        int i20 = Reader.READ_DONE;
                        while (i19 != i13) {
                            int i21 = i19;
                            c cVar3 = cVarArr[i21 == true ? 1 : 0];
                            int iH = cVar3.h(iK2);
                            if (iH < i20) {
                                i20 = iH;
                                cVar2 = cVar3;
                            }
                            i19 = (i21 == true ? 1 : 0) + i15;
                        }
                    } else {
                        int iG2 = c0Var2.g();
                        int i22 = i14;
                        int i23 = Integer.MIN_VALUE;
                        while (i22 != i13) {
                            c cVar4 = cVarArr[i22];
                            int i24 = i13;
                            int iJ = cVar4.j(iG2);
                            if (iJ > i23) {
                                i23 = iJ;
                                cVar2 = cVar4;
                            }
                            i22 += i15;
                            i13 = i24;
                        }
                    }
                    cVar = cVar2;
                }
                lazySpanLookup3.c(layoutPosition);
                lazySpanLookup3.a[layoutPosition] = cVar.e;
                z = z9;
            } else {
                cVarArr = cVarArr;
                bitSet = bitSet;
                z = z9 ? 1 : 0;
                cVar = cVarArr[i18];
            }
            layoutParams.e = cVar;
            if (uVar2.e == 1) {
                staggeredGridLayoutManager.p(viewD, -1, z8);
            } else {
                staggeredGridLayoutManager.p(viewD, z8 ? 1 : 0, z8);
            }
            boolean z10 = layoutParams.f;
            int i25 = staggeredGridLayoutManager.I;
            if (!z10) {
                uVar3 = uVar6;
                lazySpanLookup = lazySpanLookup3;
                i3 = i2;
                i4 = 1;
                if (i25 == 1) {
                    staggeredGridLayoutManager.i1(viewD, RecyclerView.o.L(false, staggeredGridLayoutManager.J, staggeredGridLayoutManager.A, 0, ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.o.L(true, staggeredGridLayoutManager.D, staggeredGridLayoutManager.B, staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                } else {
                    staggeredGridLayoutManager.i1(viewD, RecyclerView.o.L(true, staggeredGridLayoutManager.C, staggeredGridLayoutManager.A, staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.o.L(false, staggeredGridLayoutManager.J, staggeredGridLayoutManager.B, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            } else if (i25 == 1) {
                i3 = i2;
                uVar3 = uVar6;
                lazySpanLookup = lazySpanLookup3;
                i4 = 1;
                staggeredGridLayoutManager.i1(viewD, staggeredGridLayoutManager.V, RecyclerView.o.L(true, staggeredGridLayoutManager.D, staggeredGridLayoutManager.B, staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
            } else {
                uVar3 = uVar6;
                lazySpanLookup = lazySpanLookup3;
                i3 = i2;
                i4 = 1;
                staggeredGridLayoutManager.i1(viewD, RecyclerView.o.L(true, staggeredGridLayoutManager.C, staggeredGridLayoutManager.A, staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width), staggeredGridLayoutManager.V);
            }
            int i26 = uVar2.e;
            boolean z11 = layoutParams.f;
            if (i26 == i4) {
                iC = z11 ? staggeredGridLayoutManager.d1(iG) : cVar.h(iG);
                iE1 = c0Var2.c(viewD) + iC;
                if (z && layoutParams.f) {
                    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
                    fullSpanItem.c = new int[i16];
                    for (int i27 = 0; i27 < i16; i27++) {
                        fullSpanItem.c[i27] = iC - cVarArr[i27].h(iC);
                    }
                    fullSpanItem.b = -1;
                    fullSpanItem.a = layoutPosition;
                    lazySpanLookup2 = lazySpanLookup;
                    lazySpanLookup2.a(fullSpanItem);
                } else {
                    lazySpanLookup2 = lazySpanLookup;
                }
            } else {
                lazySpanLookup2 = lazySpanLookup;
                iE1 = z11 ? staggeredGridLayoutManager.e1(iG) : cVar.j(iG);
                iC = iE1 - c0Var2.c(viewD);
                if (z && layoutParams.f) {
                    LazySpanLookup.FullSpanItem fullSpanItem2 = new LazySpanLookup.FullSpanItem();
                    fullSpanItem2.c = new int[i16];
                    int i28 = 0;
                    while (i28 < i16) {
                        fullSpanItem2.c[i28] = cVarArr[i28].j(iE1) - iE1;
                        i28++;
                        iG = iG;
                    }
                    i5 = iG;
                    fullSpanItem2.b = 1;
                    fullSpanItem2.a = layoutPosition;
                    lazySpanLookup2.a(fullSpanItem2);
                }
                if (layoutParams.f || uVar2.d != -1) {
                    i6 = 1;
                } else if (z) {
                    i6 = 1;
                    staggeredGridLayoutManager.Y = true;
                } else {
                    if (uVar2.e != 1) {
                        int iJ2 = cVarArr[0].j(Integer.MIN_VALUE);
                        int i29 = 1;
                        while (true) {
                            if (i29 >= i16) {
                                z4 = true;
                                break;
                            }
                            if (cVarArr[i29].j(Integer.MIN_VALUE) != iJ2) {
                                z4 = false;
                                break;
                            }
                            i29++;
                        }
                    } else {
                        int iH2 = cVarArr[0].h(Integer.MIN_VALUE);
                        int i30 = 1;
                        while (true) {
                            if (i30 >= i16) {
                                z4 = true;
                                break;
                            }
                            if (cVarArr[i30].h(Integer.MIN_VALUE) != iH2) {
                                z4 = false;
                                break;
                            }
                            i30++;
                        }
                    }
                    i6 = 1;
                    if (!z4) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = lazySpanLookup2.f(layoutPosition);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.d = true;
                        }
                        staggeredGridLayoutManager.Y = true;
                    }
                }
                i7 = uVar2.e;
                z2 = layoutParams.f;
                if (i7 == i6) {
                    if (z2) {
                        for (i12 = i16 - 1; i12 >= 0; i12--) {
                            cVarArr[i12].a(viewD);
                        }
                    } else {
                        layoutParams.e.a(viewD);
                    }
                } else if (z2) {
                    for (i8 = i16 - 1; i8 >= 0; i8--) {
                        cVarArr[i8].m(viewD);
                    }
                } else {
                    layoutParams.e.m(viewD);
                }
                zH1 = staggeredGridLayoutManager.h1();
                c0Var = staggeredGridLayoutManager.H;
                if (zH1 || i25 != 1) {
                    if (layoutParams.f) {
                        iK = c0Var.k();
                    } else {
                        iK = c0Var.k() + (cVar.e * staggeredGridLayoutManager.J);
                    }
                    iC2 = c0Var.c(viewD) + iK;
                    i9 = iK;
                } else {
                    int iG3 = layoutParams.f ? c0Var.g() : c0Var.g() - (((i16 - 1) - cVar.e) * staggeredGridLayoutManager.J);
                    int iC3 = iG3 - c0Var.c(viewD);
                    iC2 = iG3;
                    i9 = iC3;
                }
                if (i25 == 1) {
                    view = viewD;
                    staggeredGridLayoutManager.b0(view, i9, iC, iC2, iE1);
                    staggeredGridLayoutManager = this;
                } else {
                    view = viewD;
                    staggeredGridLayoutManager.b0(view, iC, i9, iE1, iC2);
                }
                z3 = layoutParams.f;
                uVar4 = uVar3;
                i10 = uVar4.e;
                if (z3) {
                    i11 = i3;
                    staggeredGridLayoutManager.s1(i10, i11);
                } else {
                    i11 = i3;
                    staggeredGridLayoutManager.u1(cVar, i10, i11);
                }
                staggeredGridLayoutManager.m1(uVar, uVar4);
                if (uVar4.h || !view.hasFocusable()) {
                    bitSet = bitSet;
                } else if (layoutParams.f) {
                    bitSet.clear();
                    bitSet = bitSet;
                } else {
                    bitSet = bitSet;
                    bitSet.set(cVar.e, false);
                }
                i2 = i11;
                uVar6 = uVar4;
                c0Var2 = c0Var2;
                z7 = true;
                iG = i5;
                z5 = false;
                uVar5 = uVar;
            }
            i5 = iG;
            if (layoutParams.f) {
                i6 = 1;
            } else {
                i6 = 1;
            }
            i7 = uVar2.e;
            z2 = layoutParams.f;
            if (i7 == i6) {
                if (z2) {
                    while (i12 >= 0) {
                        cVarArr[i12].a(viewD);
                    }
                } else {
                    layoutParams.e.a(viewD);
                }
            } else if (z2) {
                while (i8 >= 0) {
                    cVarArr[i8].m(viewD);
                }
            } else {
                layoutParams.e.m(viewD);
            }
            zH1 = staggeredGridLayoutManager.h1();
            c0Var = staggeredGridLayoutManager.H;
            if (zH1) {
                if (layoutParams.f) {
                    iK = c0Var.k();
                } else {
                    iK = c0Var.k() + (cVar.e * staggeredGridLayoutManager.J);
                }
                iC2 = c0Var.c(viewD) + iK;
                i9 = iK;
            } else {
                if (layoutParams.f) {
                    iK = c0Var.k();
                } else {
                    iK = c0Var.k() + (cVar.e * staggeredGridLayoutManager.J);
                }
                iC2 = c0Var.c(viewD) + iK;
                i9 = iK;
            }
            if (i25 == 1) {
                view = viewD;
                staggeredGridLayoutManager.b0(view, i9, iC, iC2, iE1);
                staggeredGridLayoutManager = this;
            } else {
                view = viewD;
                staggeredGridLayoutManager.b0(view, iC, i9, iE1, iC2);
            }
            z3 = layoutParams.f;
            uVar4 = uVar3;
            i10 = uVar4.e;
            if (z3) {
                i11 = i3;
                staggeredGridLayoutManager.s1(i10, i11);
            } else {
                i11 = i3;
                staggeredGridLayoutManager.u1(cVar, i10, i11);
            }
            staggeredGridLayoutManager.m1(uVar, uVar4);
            if (uVar4.h) {
                bitSet = bitSet;
            } else {
                bitSet = bitSet;
            }
            i2 = i11;
            uVar6 = uVar4;
            c0Var2 = c0Var2;
            z7 = true;
            iG = i5;
            z5 = false;
            uVar5 = uVar;
        }
        RecyclerView.u uVar7 = uVar5;
        u uVar8 = uVar6;
        c0 c0Var3 = c0Var2;
        if (!z7) {
            staggeredGridLayoutManager.m1(uVar7, uVar8);
        }
        int iK3 = uVar8.e == -1 ? c0Var3.k() - staggeredGridLayoutManager.e1(c0Var3.k()) : staggeredGridLayoutManager.d1(c0Var3.g()) - c0Var3.g();
        if (iK3 > 0) {
            return Math.min(uVar2.b, iK3);
        }
        return 0;
    }

    public final View X0(boolean z) {
        c0 c0Var = this.G;
        int iK = c0Var.k();
        int iG = c0Var.g();
        View view = null;
        for (int iK2 = K() - 1; iK2 >= 0; iK2--) {
            View viewJ = J(iK2);
            int iE = c0Var.e(viewJ);
            int iB = c0Var.b(viewJ);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Y() {
        return this.R != 0;
    }

    public final View Y0(boolean z) {
        c0 c0Var = this.G;
        int iK = c0Var.k();
        int iG = c0Var.g();
        int iK2 = K();
        View view = null;
        for (int i = 0; i < iK2; i++) {
            View viewJ = J(i);
            int iE = c0Var.e(viewJ);
            if (c0Var.b(viewJ) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Z() {
        return this.L;
    }

    public final void Z0(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iG;
        int iD1 = d1(Integer.MIN_VALUE);
        if (iD1 != Integer.MIN_VALUE && (iG = this.G.g() - iD1) > 0) {
            int i = iG - (-q1(-iG, uVar, zVar));
            if (!z || i <= 0) {
                return;
            }
            this.G.p(i);
        }
    }

    public final void a1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iK;
        int iE1 = e1(Reader.READ_DONE);
        if (iE1 != Integer.MAX_VALUE && (iK = iE1 - this.G.k()) > 0) {
            int iQ1 = iK - q1(iK, uVar, zVar);
            if (!z || iQ1 <= 0) {
                return;
            }
            this.G.p(-iQ1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF b(int i) {
        int i2 = -1;
        if (K() != 0) {
            if ((i < b1()) == this.M) {
                i2 = 1;
            }
        } else if (this.M) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.I == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public final int b1() {
        if (K() == 0) {
            return 0;
        }
        return RecyclerView.o.U(J(0));
    }

    public final int c1() {
        int iK = K();
        if (iK == 0) {
            return 0;
        }
        return RecyclerView.o.U(J(iK - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(int i) {
        super.d0(i);
        for (int i2 = 0; i2 < this.E; i2++) {
            c cVar = this.F[i2];
            int i3 = cVar.b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.b = i3 + i;
            }
            int i4 = cVar.c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.c = i4 + i;
            }
        }
    }

    public final int d1(int i) {
        int iH = this.F[0].h(i);
        for (int i2 = 1; i2 < this.E; i2++) {
            int iH2 = this.F[i2].h(i);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i) {
        super.e0(i);
        for (int i2 = 0; i2 < this.E; i2++) {
            c cVar = this.F[i2];
            int i3 = cVar.b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.b = i3 + i;
            }
            int i4 = cVar.c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.c = i4 + i;
            }
        }
    }

    public final int e1(int i) {
        int iJ = this.F[0].j(i);
        for (int i2 = 1; i2 < this.E; i2++) {
            int iJ2 = this.F[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        this.Q.b();
        for (int i = 0; i < this.E; i++) {
            this.F[i].d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final void f1(int i, int i2, int i3) {
        int i4;
        int i5;
        LazySpanLookup lazySpanLookup;
        int iC1;
        int iC2 = this.M ? c1() : b1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            lazySpanLookup = this.Q;
            lazySpanLookup.g(i5);
            if (i3 != 1) {
                lazySpanLookup.h(i, i2);
            } else if (i3 != 2) {
                lazySpanLookup.i(i, i2);
            } else if (i3 == 8) {
                lazySpanLookup.i(i, 1);
                lazySpanLookup.h(i2, 1);
            }
            if (i4 <= iC2) {
                return;
            }
            if (this.M) {
                iC1 = b1();
            } else {
                iC1 = c1();
            }
            if (i5 <= iC1) {
                F0();
            }
        }
        i4 = i + i2;
        i5 = i;
        lazySpanLookup = this.Q;
        lazySpanLookup.g(i5);
        if (i3 != 1) {
            lazySpanLookup.h(i, i2);
        } else if (i3 != 2) {
            lazySpanLookup.i(i, i2);
        } else if (i3 == 8) {
            lazySpanLookup.i(i, 1);
            lazySpanLookup.h(i2, 1);
        }
        if (i4 <= iC2) {
            return;
        }
        if (this.M) {
            iC1 = b1();
        } else {
            iC1 = c1();
        }
        if (i5 <= iC1) {
            F0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0 A[SYNTHETIC] */
    public final View g1() {
        int i;
        View viewJ;
        int iE;
        int iE2;
        boolean z;
        boolean z2;
        int iB;
        int iB2;
        boolean z3;
        boolean z4;
        int iK = K();
        int i2 = iK - 1;
        int i3 = this.E;
        BitSet bitSet = new BitSet(i3);
        bitSet.set(0, i3, true);
        byte b2 = (this.I == 1 && h1()) ? (byte) 1 : (byte) -1;
        if (this.M) {
            iK = -1;
        } else {
            i2 = 0;
        }
        int i4 = i2 < iK ? 1 : -1;
        while (i2 != iK) {
            View viewJ2 = J(i2);
            LayoutParams layoutParams = (LayoutParams) viewJ2.getLayoutParams();
            boolean z5 = bitSet.get(layoutParams.e.e);
            c0 c0Var = this.G;
            if (z5) {
                c cVar = layoutParams.e;
                if (this.M) {
                    int i5 = cVar.c;
                    if (i5 == Integer.MIN_VALUE) {
                        cVar.b();
                        i5 = cVar.c;
                    }
                    if (i5 < c0Var.g()) {
                        z3 = ((LayoutParams) ((View) rh6.a(1, cVar.a)).getLayoutParams()).f;
                        z4 = !z3;
                    } else {
                        z4 = false;
                    }
                } else {
                    int i6 = cVar.b;
                    if (i6 == Integer.MIN_VALUE) {
                        cVar.c();
                        i6 = cVar.b;
                    }
                    if (i6 > c0Var.k()) {
                        z3 = ((LayoutParams) cVar.a.get(0).getLayoutParams()).f;
                        z4 = !z3;
                    } else {
                        z4 = false;
                    }
                }
                if (!z4) {
                    bitSet.clear(layoutParams.e.e);
                    if (!layoutParams.f && (i = i2 + i4) != iK) {
                        viewJ = J(i);
                        if (this.M) {
                            iB = c0Var.b(viewJ2);
                            iB2 = c0Var.b(viewJ);
                            if (iB >= iB2) {
                                if (iB == iB2) {
                                    if (layoutParams.e.e - ((LayoutParams) viewJ.getLayoutParams()).e.e < 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (b2 < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z != z2) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            iE = c0Var.e(viewJ2);
                            iE2 = c0Var.e(viewJ);
                            if (iE <= iE2) {
                                if (iE == iE2) {
                                    if (layoutParams.e.e - ((LayoutParams) viewJ.getLayoutParams()).e.e < 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (b2 < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z != z2) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2 += i4;
                }
            } else {
                if (!layoutParams.f) {
                    viewJ = J(i);
                    if (this.M) {
                        iB = c0Var.b(viewJ2);
                        iB2 = c0Var.b(viewJ);
                        if (iB >= iB2) {
                            if (iB == iB2) {
                                if (layoutParams.e.e - ((LayoutParams) viewJ.getLayoutParams()).e.e < 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (b2 < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z != z2) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iE = c0Var.e(viewJ2);
                        iE2 = c0Var.e(viewJ);
                        if (iE <= iE2) {
                            if (iE == iE2) {
                                if (layoutParams.e.e - ((LayoutParams) viewJ.getLayoutParams()).e.e < 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (b2 < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z != z2) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2 += i4;
            }
            return viewJ2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(RecyclerView recyclerView, RecyclerView.u uVar) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.b0);
        }
        for (int i = 0; i < this.E; i++) {
            this.F[i].d();
        }
        recyclerView.requestLayout();
    }

    public final boolean h1() {
        return this.b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View i0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewG;
        int i2;
        View viewI;
        if (K() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewG = recyclerView.G(view)) == null || this.a.c.contains(viewG)) {
                viewG = null;
            }
            if (viewG != null) {
                p1();
                int i3 = this.I;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && h1()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && h1()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    LayoutParams layoutParams = (LayoutParams) viewG.getLayoutParams();
                    boolean z = layoutParams.f;
                    c cVar = layoutParams.e;
                    int iC1 = i2 == 1 ? c1() : b1();
                    t1(iC1, zVar);
                    r1(i2);
                    u uVar2 = this.K;
                    uVar2.c = uVar2.d + iC1;
                    uVar2.b = (int) (this.G.l() * 0.33333334f);
                    uVar2.h = true;
                    uVar2.a = false;
                    W0(uVar, uVar2, zVar);
                    this.S = this.M;
                    if (!z && (viewI = cVar.i(iC1, i2)) != null && viewI != viewG) {
                        return viewI;
                    }
                    boolean zK1 = k1(i2);
                    c[] cVarArr = this.F;
                    int i4 = this.E;
                    if (zK1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewI2 = cVarArr[i5].i(iC1, i2);
                            if (viewI2 != null && viewI2 != viewG) {
                                return viewI2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewI3 = cVarArr[i6].i(iC1, i2);
                            if (viewI3 != null && viewI3 != viewG) {
                                return viewI3;
                            }
                        }
                    }
                    boolean z2 = (this.L ^ true) == (i2 == -1);
                    if (!z) {
                        View viewF = F(z2 ? cVar.e() : cVar.f());
                        if (viewF != null && viewF != viewG) {
                            return viewF;
                        }
                    }
                    if (k1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != cVar.e) {
                                View viewF2 = F(z2 ? cVarArr[i7].e() : cVarArr[i7].f());
                                if (viewF2 != null && viewF2 != viewG) {
                                    return viewF2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewF3 = F(z2 ? cVarArr[i8].e() : cVarArr[i8].f());
                            if (viewF3 != null && viewF3 != viewG) {
                                return viewF3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void i1(View view, int i, int i2) {
        Rect rect = this.W;
        r(rect, view);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iV1 = v1(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iV2 = v1(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (O0(view, iV1, iV2, layoutParams)) {
            view.measure(iV1, iV2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (K() > 0) {
            View viewY0 = Y0(false);
            View viewX0 = X0(false);
            if (viewY0 == null || viewX0 == null) {
                return;
            }
            int iU = RecyclerView.o.U(viewY0);
            int iU2 = RecyclerView.o.U(viewX0);
            if (iU < iU2) {
                accessibilityEvent.setFromIndex(iU);
                accessibilityEvent.setToIndex(iU2);
            } else {
                accessibilityEvent.setFromIndex(iU2);
                accessibilityEvent.setToIndex(iU);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:262:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:273:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01de A[SYNTHETIC] */
    public final void j1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int iK;
        int i2;
        int iU;
        int iU2;
        int iK2;
        boolean z4;
        int i3;
        boolean z5;
        SavedState savedState2 = this.U;
        b bVar = this.X;
        if (!(savedState2 == null && this.O == -1) && zVar.b() == 0) {
            B0(uVar);
            bVar.a();
            return;
        }
        boolean z6 = bVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z7 = (z6 && this.O == -1 && this.U == null) ? false : true;
        c[] cVarArr = this.F;
        int i4 = this.E;
        LazySpanLookup lazySpanLookup = this.Q;
        if (z7) {
            bVar.a();
            SavedState savedState3 = this.U;
            c0 c0Var = this.G;
            if (savedState3 != null) {
                int i5 = savedState3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            cVarArr[i6].d();
                            SavedState savedState4 = this.U;
                            int iG = savedState4.d[i6];
                            if (iG != Integer.MIN_VALUE) {
                                iG += savedState4.w ? c0Var.g() : c0Var.k();
                            }
                            c cVar = cVarArr[i6];
                            cVar.b = iG;
                            cVar.c = iG;
                        }
                    } else {
                        savedState3.d = null;
                        savedState3.c = 0;
                        savedState3.e = 0;
                        savedState3.f = null;
                        savedState3.i = null;
                        savedState3.a = savedState3.b;
                    }
                }
                SavedState savedState5 = this.U;
                this.T = savedState5.y;
                boolean z8 = savedState5.v;
                q(null);
                SavedState savedState6 = this.U;
                if (savedState6 != null && savedState6.v != z8) {
                    savedState6.v = z8;
                }
                this.L = z8;
                F0();
                p1();
                SavedState savedState7 = this.U;
                int i7 = savedState7.a;
                if (i7 != -1) {
                    this.O = i7;
                    bVar.c = savedState7.w;
                } else {
                    bVar.c = this.M;
                }
                if (savedState7.e > 1) {
                    lazySpanLookup.a = savedState7.f;
                    lazySpanLookup.b = savedState7.i;
                }
            } else {
                p1();
                bVar.c = this.M;
            }
            if (zVar.g || (i3 = this.O) == -1) {
                if (this.S) {
                    int iB = zVar.b();
                    iK2 = K() - 1;
                    while (true) {
                        if (iK2 < 0) {
                            iU2 = 0;
                            break;
                        }
                        iU2 = RecyclerView.o.U(J(iK2));
                        if (iU2 < 0 && iU2 < iB) {
                            break;
                        } else {
                            iK2--;
                        }
                    }
                } else {
                    int iB2 = zVar.b();
                    iK = K();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iK) {
                            iU2 = 0;
                            break;
                        }
                        iU = RecyclerView.o.U(J(i2));
                        if (iU < 0 && iU < iB2) {
                            iU2 = iU;
                            break;
                        }
                        i2++;
                    }
                }
                bVar.a = iU2;
                bVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= zVar.b()) {
                this.O = -1;
                this.P = Integer.MIN_VALUE;
                if (this.S) {
                    int iB3 = zVar.b();
                    iK2 = K() - 1;
                    while (true) {
                        if (iK2 < 0) {
                            iU2 = 0;
                            break;
                        } else {
                            iU2 = RecyclerView.o.U(J(iK2));
                            if (iU2 < 0) {
                            }
                            iK2--;
                        }
                    }
                } else {
                    int iB4 = zVar.b();
                    iK = K();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iK) {
                            iU2 = 0;
                            break;
                        } else {
                            iU = RecyclerView.o.U(J(i2));
                            if (iU < 0) {
                            }
                            i2++;
                        }
                    }
                }
                bVar.a = iU2;
                bVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                SavedState savedState8 = this.U;
                if (savedState8 == null || savedState8.a == -1 || savedState8.c < 1) {
                    View viewF = F(this.O);
                    if (viewF != null) {
                        bVar.a = this.M ? c1() : b1();
                        if (this.P != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (c0Var.g() - this.P) - c0Var.b(viewF);
                            } else {
                                bVar.b = (c0Var.k() + this.P) - c0Var.e(viewF);
                            }
                        } else if (c0Var.c(viewF) > c0Var.l()) {
                            bVar.b = bVar.c ? c0Var.g() : c0Var.k();
                        } else {
                            int iE = c0Var.e(viewF) - c0Var.k();
                            if (iE < 0) {
                                bVar.b = -iE;
                            } else {
                                int iG2 = c0Var.g() - c0Var.b(viewF);
                                if (iG2 < 0) {
                                    bVar.b = iG2;
                                } else {
                                    bVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.O;
                        bVar.a = i8;
                        int i9 = this.P;
                        if (i9 == Integer.MIN_VALUE) {
                            if (K() != 0) {
                                if ((i8 < b1()) != this.M) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.M) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            bVar.c = z5;
                            c0 c0Var2 = staggeredGridLayoutManager.G;
                            bVar.b = z5 ? c0Var2.g() : c0Var2.k();
                        } else {
                            boolean z9 = bVar.c;
                            c0 c0Var3 = staggeredGridLayoutManager.G;
                            if (z9) {
                                bVar.b = c0Var3.g() - i9;
                            } else {
                                bVar.b = c0Var3.k() + i9;
                            }
                        }
                        z4 = true;
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.O;
                }
                z4 = true;
            }
            bVar.e = z4;
        }
        if (this.U == null && this.O == -1 && !(bVar.c == this.S && h1() == this.T)) {
            lazySpanLookup.b();
            i = 1;
            bVar.d = true;
        } else {
            i = 1;
        }
        if (K() > 0 && ((savedState = this.U) == null || savedState.c < i)) {
            if (bVar.d) {
                for (int i10 = 0; i10 < i4; i10++) {
                    cVarArr[i10].d();
                    int i11 = bVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        c cVar2 = cVarArr[i10];
                        cVar2.b = i11;
                        cVar2.c = i11;
                    }
                }
            } else if (z7 || bVar.f == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    c cVar3 = cVarArr[i12];
                    boolean z10 = this.M;
                    int i13 = bVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int iH = z10 ? cVar3.h(Integer.MIN_VALUE) : cVar3.j(Integer.MIN_VALUE);
                    cVar3.d();
                    if (iH != Integer.MIN_VALUE && ((!z10 || iH >= staggeredGridLayoutManager2.G.g()) && (z10 || iH <= staggeredGridLayoutManager2.G.k()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iH += i13;
                        }
                        cVar3.c = iH;
                        cVar3.b = iH;
                    }
                }
                int length = cVarArr.length;
                int[] iArr = bVar.f;
                if (iArr == null || iArr.length < length) {
                    bVar.f = new int[staggeredGridLayoutManager.F.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    bVar.f[i14] = cVarArr[i14].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    c cVar4 = cVarArr[i15];
                    cVar4.d();
                    int i16 = bVar.f[i15];
                    cVar4.b = i16;
                    cVar4.c = i16;
                }
            }
        }
        E(uVar);
        u uVar2 = this.K;
        uVar2.a = false;
        this.Y = false;
        c0 c0Var4 = this.H;
        int iL = c0Var4.l();
        this.J = iL / i4;
        this.V = View.MeasureSpec.makeMeasureSpec(iL, c0Var4.i());
        t1(bVar.a, zVar);
        if (bVar.c) {
            r1(-1);
            W0(uVar, uVar2, zVar);
            r1(1);
            uVar2.c = bVar.a + uVar2.d;
            W0(uVar, uVar2, zVar);
        } else {
            r1(1);
            W0(uVar, uVar2, zVar);
            r1(-1);
            uVar2.c = bVar.a + uVar2.d;
            W0(uVar, uVar2, zVar);
        }
        if (c0Var4.i() != 1073741824) {
            int iK3 = K();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iK3; i17++) {
                View viewJ = J(i17);
                float fC = c0Var4.c(viewJ);
                if (fC >= fMax) {
                    if (((LayoutParams) viewJ.getLayoutParams()).f) {
                        fC = (fC * 1.0f) / i4;
                    }
                    fMax = Math.max(fMax, fC);
                }
            }
            int i18 = this.J;
            int iRound = Math.round(fMax * i4);
            if (c0Var4.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, c0Var4.l());
            }
            this.J = iRound / i4;
            this.V = View.MeasureSpec.makeMeasureSpec(iRound, c0Var4.i());
            if (this.J != i18) {
                for (int i19 = 0; i19 < iK3; i19++) {
                    View viewJ2 = J(i19);
                    LayoutParams layoutParams = (LayoutParams) viewJ2.getLayoutParams();
                    if (!layoutParams.f) {
                        boolean zH1 = h1();
                        int i20 = this.I;
                        if (zH1 && i20 == 1) {
                            int i21 = -((i4 - 1) - layoutParams.e.e);
                            viewJ2.offsetLeftAndRight((this.J * i21) - (i21 * i18));
                        } else {
                            int i22 = layoutParams.e.e;
                            int i23 = this.J * i22;
                            int i24 = i22 * i18;
                            if (i20 == 1) {
                                viewJ2.offsetLeftAndRight(i23 - i24);
                            } else {
                                viewJ2.offsetTopAndBottom(i23 - i24);
                            }
                        }
                    }
                }
            }
        }
        if (K() <= 0) {
            z2 = true;
        } else if (this.M) {
            z2 = true;
            Z0(uVar, zVar, true);
            a1(uVar, zVar, false);
        } else {
            z2 = true;
            a1(uVar, zVar, true);
            Z0(uVar, zVar, false);
        }
        if (!z || zVar.g || this.R == 0 || K() <= 0 || (!this.Y && g1() == null)) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.b0);
            }
            if (U0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (zVar.g) {
            bVar.a();
        }
        this.S = bVar.c;
        this.T = h1();
        if (z3) {
            bVar.a();
            j1(uVar, zVar, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.u uVar, RecyclerView.z zVar, c7 c7Var) {
        super.k0(uVar, zVar, c7Var);
        c7Var.l("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean k1(int i) {
        if (this.I == 0) {
            return (i == -1) != this.M;
        }
        return ((i == -1) == this.M) == h1();
    }

    public final void l1(int i, RecyclerView.z zVar) {
        int iB1;
        int i2;
        if (i > 0) {
            iB1 = c1();
            i2 = 1;
        } else {
            iB1 = b1();
            i2 = -1;
        }
        u uVar = this.K;
        uVar.a = true;
        t1(iB1, zVar);
        r1(i2);
        uVar.c = iB1 + uVar.d;
        uVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m0(RecyclerView.u uVar, RecyclerView.z zVar, View view, c7 c7Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            l0(view, c7Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        c cVar = layoutParams2.e;
        int i = this.E;
        if (this.I == 0) {
            c7Var.n(c7.f.a(cVar != null ? cVar.e : -1, layoutParams2.f ? i : 1, -1, -1, false, false));
        } else {
            c7Var.n(c7.f.a(-1, -1, cVar != null ? cVar.e : -1, layoutParams2.f ? i : 1, false, false));
        }
    }

    public final void m1(RecyclerView.u uVar, u uVar2) {
        if (!uVar2.a || uVar2.i) {
            return;
        }
        int i = uVar2.b;
        int i2 = uVar2.e;
        if (i == 0) {
            if (i2 == -1) {
                n1(uVar, uVar2.g);
                return;
            } else {
                o1(uVar, uVar2.f);
                return;
            }
        }
        int i3 = this.E;
        c[] cVarArr = this.F;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = uVar2.f;
            int iJ = cVarArr[0].j(i5);
            while (i4 < i3) {
                int iJ2 = cVarArr[i4].j(i5);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i4++;
            }
            int i6 = i5 - iJ;
            int iMin = uVar2.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, uVar2.b);
            }
            n1(uVar, iMin);
            return;
        }
        int i7 = uVar2.g;
        int iH = cVarArr[0].h(i7);
        while (i4 < i3) {
            int iH2 = cVarArr[i4].h(i7);
            if (iH2 < iH) {
                iH = iH2;
            }
            i4++;
        }
        int i8 = iH - uVar2.g;
        int iMin2 = uVar2.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, uVar2.b);
        }
        o1(uVar, iMin2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void n0(int i, int i2) {
        f1(i, i2, 1);
    }

    public final void n1(RecyclerView.u uVar, int i) {
        for (int iK = K() - 1; iK >= 0; iK--) {
            View viewJ = J(iK);
            c0 c0Var = this.G;
            if (c0Var.e(viewJ) < i || c0Var.o(viewJ) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewJ.getLayoutParams();
            if (layoutParams.f) {
                int i2 = 0;
                while (true) {
                    c[] cVarArr = this.F;
                    int i3 = this.E;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            cVarArr[i4].k();
                        }
                        break;
                    } else if (cVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.k();
            }
            D0(viewJ, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void o0() {
        this.Q.b();
        F0();
    }

    public final void o1(RecyclerView.u uVar, int i) {
        while (K() > 0) {
            View viewJ = J(0);
            c0 c0Var = this.G;
            if (c0Var.b(viewJ) > i || c0Var.n(viewJ) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewJ.getLayoutParams();
            if (layoutParams.f) {
                int i2 = 0;
                while (true) {
                    c[] cVarArr = this.F;
                    int i3 = this.E;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            cVarArr[i4].l();
                        }
                        break;
                    } else if (cVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.l();
            }
            D0(viewJ, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void p0(int i, int i2) {
        f1(i, i2, 8);
    }

    public final void p1() {
        if (this.I == 1 || !h1()) {
            this.M = this.L;
        } else {
            this.M = !this.L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q(String str) {
        if (this.U == null) {
            super.q(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q0(int i, int i2) {
        f1(i, i2, 2);
    }

    public final int q1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        l1(i, zVar);
        u uVar2 = this.K;
        int iW0 = W0(uVar, uVar2, zVar);
        if (uVar2.b >= iW0) {
            i = i < 0 ? -iW0 : iW0;
        }
        this.G.p(-i);
        this.S = this.M;
        uVar2.b = 0;
        m1(uVar, uVar2);
        return i;
    }

    public final void r1(int i) {
        u uVar = this.K;
        uVar.e = i;
        uVar.d = this.M != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean s() {
        return this.I == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void s0(RecyclerView recyclerView, int i, int i2) {
        f1(i, i2, 4);
    }

    public final void s1(int i, int i2) {
        for (int i3 = 0; i3 < this.E; i3++) {
            c[] cVarArr = this.F;
            if (!cVarArr[i3].a.isEmpty()) {
                u1(cVarArr[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean t() {
        return this.I == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        j1(uVar, zVar, true);
    }

    public final void t1(int i, RecyclerView.z zVar) {
        int iL;
        int iL2;
        int i2;
        u uVar = this.K;
        boolean z = false;
        uVar.b = 0;
        uVar.c = i;
        RecyclerView.y yVar = this.e;
        c0 c0Var = this.G;
        if (yVar == null || !yVar.e || (i2 = zVar.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.M == (i2 < i)) {
                iL = c0Var.l();
                iL2 = 0;
            } else {
                iL2 = c0Var.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.v) {
            uVar.g = c0Var.f() + iL;
            uVar.f = -iL2;
        } else {
            uVar.f = c0Var.k() - iL2;
            uVar.g = c0Var.g() + iL;
        }
        uVar.h = false;
        uVar.a = true;
        if (c0Var.i() == 0 && c0Var.f() == 0) {
            z = true;
        }
        uVar.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean u(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void u0(RecyclerView.z zVar) {
        this.O = -1;
        this.P = Integer.MIN_VALUE;
        this.U = null;
        this.X.a();
    }

    public final void u1(c cVar, int i, int i2) {
        int i3 = cVar.d;
        int i4 = cVar.e;
        BitSet bitSet = this.N;
        if (i == -1) {
            int i5 = cVar.b;
            if (i5 == Integer.MIN_VALUE) {
                cVar.c();
                i5 = cVar.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = cVar.c;
        if (i6 == Integer.MIN_VALUE) {
            cVar.b();
            i6 = cVar.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void v0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.U = savedState;
            if (this.O != -1) {
                savedState.a = -1;
                savedState.b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.i = null;
            }
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void w(int i, int i2, RecyclerView.z zVar, q.b bVar) {
        u uVar;
        int iH;
        if (this.I != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        l1(i, zVar);
        int[] iArr = this.a0;
        int i3 = this.E;
        if (iArr == null || iArr.length < i3) {
            this.a0 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            uVar = this.K;
            if (i4 >= i3) {
                break;
            }
            int i6 = uVar.d;
            c[] cVarArr = this.F;
            if (i6 == -1) {
                int i7 = uVar.f;
                iH = i7 - cVarArr[i4].j(i7);
            } else {
                iH = cVarArr[i4].h(uVar.g) - uVar.g;
            }
            if (iH >= 0) {
                this.a0[i5] = iH;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.a0, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = uVar.c;
            if (i9 < 0 || i9 >= zVar.b()) {
                return;
            }
            bVar.a(uVar.c, this.a0[i8]);
            uVar.c += uVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable w0() {
        int iJ;
        int iK;
        int[] iArr;
        SavedState savedState = this.U;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.c = savedState.c;
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            savedState2.v = savedState.v;
            savedState2.w = savedState.w;
            savedState2.y = savedState.y;
            savedState2.i = savedState.i;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.v = this.L;
        savedState3.w = this.S;
        savedState3.y = this.T;
        LazySpanLookup lazySpanLookup = this.Q;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState3.e = 0;
        } else {
            savedState3.f = iArr;
            savedState3.e = iArr.length;
            savedState3.i = lazySpanLookup.b;
        }
        if (K() <= 0) {
            savedState3.a = -1;
            savedState3.b = -1;
            savedState3.c = 0;
            return savedState3;
        }
        savedState3.a = this.S ? c1() : b1();
        View viewX0 = this.M ? X0(true) : Y0(true);
        savedState3.b = viewX0 != null ? RecyclerView.o.U(viewX0) : -1;
        int i = this.E;
        savedState3.c = i;
        savedState3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.S;
            c0 c0Var = this.G;
            c[] cVarArr = this.F;
            if (z) {
                iJ = cVarArr[i2].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = c0Var.g();
                    iJ -= iK;
                }
            } else {
                iJ = cVarArr[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = c0Var.k();
                    iJ -= iK;
                }
            }
            savedState3.d[i2] = iJ;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void x0(int i) {
        if (i == 0) {
            U0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        boolean z = !this.Z;
        return h0.a(zVar, this.G, Y0(z), X0(z), this, this.Z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.z zVar) {
        return V0(zVar);
    }
}
