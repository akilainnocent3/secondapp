package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Space;
import com.sportybet.android.gp.tz.R;
import defpackage.bl30;
import defpackage.mq0;
import defpackage.q7i0;
import defpackage.r6i0;
import defpackage.rr1;
import defpackage.t7l;
import defpackage.zk1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final c G;
    public static final d H;
    public static final c I;
    public static final d J;
    public static final androidx.gridlayout.widget.a K;
    public static final androidx.gridlayout.widget.a L;
    public static final e M;
    public static final f N;
    public static final g O;
    public final k a;
    public final k b;
    public int c;
    public boolean d;
    public int e;
    public final int f;
    public int i;
    public Printer v;
    public static final LogPrinter w = new LogPrinter(3, GridLayout.class.getName());
    public static final a y = new a();
    public static final int z = 3;
    public static final int A = 4;
    public static final int B = 1;
    public static final int C = 6;
    public static final int D = 5;
    public static final int E = 2;
    public static final b F = new b();

    public class a implements Printer {
        @Override // android.util.Printer
        public final void println(String str) {
        }
    }

    public class b extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return Integer.MIN_VALUE;
        }
    }

    public class c extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return 0;
        }
    }

    public class e extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            return i >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return i >> 1;
        }
    }

    public class f extends h {

        public class a extends l {
            public int d;

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final int a(GridLayout gridLayout, View view, h hVar, int i, boolean z) {
                return Math.max(0, super.a(gridLayout, view, hVar, i, z));
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final void b(int i, int i2) {
                super.b(i, i2);
                this.d = Math.max(this.d, i + i2);
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final void c() {
                super.c();
                this.d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.l
            public final int d(boolean z) {
                return Math.max(super.d(z), this.d);
            }
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final l b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return 0;
        }
    }

    public static final class i {
        public final m a;
        public final n b;
        public boolean c = true;

        public i(m mVar, n nVar) {
            this.a = mVar;
            this.b = nVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" ");
            sb.append(!this.c ? "+>" : "->");
            sb.append(" ");
            sb.append(this.b);
            return sb.toString();
        }
    }

    public static final class j<K, V> extends ArrayList<Pair<K, V>> {
        public final Class<K> a;
        public final Class<V> b;

        public j(Class<K> cls, Class<V> cls2) {
            this.a = cls;
            this.b = cls2;
        }

        public final o<K, V> a() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new o<>(objArr, objArr2);
        }
    }

    public final class k {
        public final boolean a;
        public o<p, l> d;
        public o<m, n> f;
        public o<m, n> h;
        public int[] j;
        public int[] l;
        public i[] n;
        public int[] p;
        public boolean r;
        public int[] t;
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public boolean e = false;
        public boolean g = false;
        public boolean i = false;
        public boolean k = false;
        public boolean m = false;
        public boolean o = false;
        public boolean q = false;
        public boolean s = false;
        public boolean u = true;
        public final n v = new n(0);
        public final n w = new n(-100000);

        public k(boolean z) {
            this.a = z;
        }

        public static void k(ArrayList arrayList, m mVar, n nVar, boolean z) {
            if (mVar.a() == 0) {
                return;
            }
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((i) obj).a.equals(mVar)) {
                        return;
                    }
                }
            }
            arrayList.add(new i(mVar, nVar));
        }

        public static boolean n(int[] iArr, i iVar) {
            if (!iVar.c) {
                return false;
            }
            m mVar = iVar.a;
            int i = mVar.a;
            int i2 = mVar.b;
            int i3 = iArr[i] + iVar.b.a;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        public final String a(ArrayList arrayList) {
            String strB;
            String str = this.a ? "x" : "y";
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            boolean z = true;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i iVar = (i) obj;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                m mVar = iVar.a;
                int i2 = mVar.a;
                int i3 = mVar.b;
                int i4 = iVar.b.a;
                if (i2 < i3) {
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(i3);
                    sb2.append("-");
                    sb2.append(str);
                    sb2.append(i2);
                    strB = t7l.b(i4, ">=", sb2);
                } else {
                    strB = str + i2 + "-" + str + i3 + "<=" + (-i4);
                }
                sb.append(strB);
            }
            return sb.toString();
        }

        public final void b(o<m, n> oVar, boolean z) {
            for (n nVar : oVar.c) {
                nVar.a = Integer.MIN_VALUE;
            }
            l[] lVarArr = g().c;
            for (int i = 0; i < lVarArr.length; i++) {
                int iD = lVarArr[i].d(z);
                n nVar2 = oVar.c[oVar.a[i]];
                int i2 = nVar2.a;
                if (!z) {
                    iD = -iD;
                }
                nVar2.a = Math.max(i2, iD);
            }
        }

        public final void c(boolean z) {
            int[] iArr = z ? this.j : this.l;
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = gridLayout.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    boolean z2 = this.a;
                    m mVar = (z2 ? layoutParams.b : layoutParams.a).b;
                    int i2 = z ? mVar.a : mVar.b;
                    iArr[i2] = Math.max(iArr[i2], gridLayout.f(childAt, z2, z));
                }
            }
        }

        public final o<m, n> d(boolean z) {
            m mVar;
            j jVar = new j(m.class, n.class);
            p[] pVarArr = g().b;
            int length = pVarArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    mVar = pVarArr[i].b;
                } else {
                    m mVar2 = pVarArr[i].b;
                    mVar = new m(mVar2.b, mVar2.a);
                }
                jVar.add(Pair.create(mVar, new n()));
            }
            return jVar.a();
        }

        public final i[] e() {
            if (this.n == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                o<m, n> oVarD = this.f;
                if (oVarD == null) {
                    oVarD = d(true);
                    this.f = oVarD;
                }
                if (!this.g) {
                    b(oVarD, true);
                    this.g = true;
                }
                o<m, n> oVar = this.f;
                int i = 0;
                while (true) {
                    m[] mVarArr = oVar.b;
                    if (i >= mVarArr.length) {
                        break;
                    }
                    k(arrayList, mVarArr[i], oVar.c[i], false);
                    i++;
                }
                o<m, n> oVarD2 = this.h;
                if (oVarD2 == null) {
                    oVarD2 = d(false);
                    this.h = oVarD2;
                }
                if (!this.i) {
                    b(oVarD2, false);
                    this.i = true;
                }
                o<m, n> oVar2 = this.h;
                int i2 = 0;
                while (true) {
                    m[] mVarArr2 = oVar2.b;
                    if (i2 >= mVarArr2.length) {
                        break;
                    }
                    k(arrayList2, mVarArr2[i2], oVar2.c[i2], false);
                    i2++;
                }
                if (this.u) {
                    int i3 = 0;
                    while (i3 < f()) {
                        int i4 = i3 + 1;
                        k(arrayList, new m(i3, i4), new n(0), true);
                        i3 = i4;
                    }
                }
                int iF = f();
                k(arrayList, new m(0, iF), this.v, false);
                k(arrayList2, new m(iF, 0), this.w, false);
                i[] iVarArrR = r(arrayList);
                i[] iVarArrR2 = r(arrayList2);
                LogPrinter logPrinter = GridLayout.w;
                Object[] objArr = (Object[]) Array.newInstance(i[].class.getComponentType(), iVarArrR.length + iVarArrR2.length);
                System.arraycopy(iVarArrR, 0, objArr, 0, iVarArrR.length);
                System.arraycopy(iVarArrR2, 0, objArr, iVarArrR.length, iVarArrR2.length);
                this.n = (i[]) objArr;
            }
            if (!this.o) {
                o<m, n> oVarD3 = this.f;
                if (oVarD3 == null) {
                    oVarD3 = d(true);
                    this.f = oVarD3;
                }
                if (!this.g) {
                    b(oVarD3, true);
                    this.g = true;
                }
                o<m, n> oVarD4 = this.h;
                if (oVarD4 == null) {
                    oVarD4 = d(false);
                    this.h = oVarD4;
                }
                if (!this.i) {
                    b(oVarD4, false);
                    this.i = true;
                }
                this.o = true;
            }
            return this.n;
        }

        public final int f() {
            return Math.max(this.b, i());
        }

        public final o<p, l> g() {
            int iE;
            int i;
            o<p, l> oVarA = this.d;
            boolean z = this.a;
            GridLayout gridLayout = GridLayout.this;
            if (oVarA == null) {
                j jVar = new j(p.class, l.class);
                int childCount = gridLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    LayoutParams layoutParams = (LayoutParams) gridLayout.getChildAt(i2).getLayoutParams();
                    p pVar = z ? layoutParams.b : layoutParams.a;
                    jVar.add(Pair.create(pVar, pVar.a(z).b()));
                }
                oVarA = jVar.a();
                this.d = oVarA;
            }
            if (!this.e) {
                for (l lVar : oVarA.c) {
                    lVar.c();
                }
                int childCount2 = gridLayout.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt = gridLayout.getChildAt(i3);
                    LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                    p pVar2 = z ? layoutParams2.b : layoutParams2.a;
                    if (childAt.getVisibility() == 8) {
                        iE = 0;
                    } else {
                        iE = gridLayout.e(childAt, z, false) + gridLayout.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                    }
                    if (pVar2.d == 0.0f) {
                        i = 0;
                    } else {
                        int[] iArr = this.t;
                        if (iArr == null) {
                            iArr = new int[gridLayout.getChildCount()];
                            this.t = iArr;
                        }
                        i = iArr[i3];
                    }
                    int i4 = iE + i;
                    o<p, l> oVar = this.d;
                    l lVar2 = oVar.c[oVar.a[i3]];
                    lVar2.c = ((pVar2.c == GridLayout.F && pVar2.d == 0.0f) ? 0 : 2) & lVar2.c;
                    h hVarA = pVar2.a(z);
                    WindowInsets windowInsets = q7i0.a;
                    int iA = hVarA.a(childAt, i4, gridLayout.getLayoutMode());
                    lVar2.b(iA, i4 - iA);
                }
                this.e = true;
            }
            return this.d;
        }

        public final int[] h() {
            boolean z;
            int[] iArr = this.p;
            if (iArr == null) {
                iArr = new int[f() + 1];
                this.p = iArr;
            }
            if (!this.q) {
                boolean z2 = this.s;
                GridLayout gridLayout = GridLayout.this;
                float f = 0.0f;
                boolean z3 = this.a;
                if (!z2) {
                    int childCount = gridLayout.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            z = false;
                            break;
                        }
                        View childAt = gridLayout.getChildAt(i);
                        if (childAt.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            if ((z3 ? layoutParams.b : layoutParams.a).d != 0.0f) {
                                z = true;
                                break;
                            }
                        }
                        i++;
                    }
                    this.r = z;
                    this.s = true;
                }
                if (this.r) {
                    int[] iArr2 = this.t;
                    if (iArr2 == null) {
                        iArr2 = new int[gridLayout.getChildCount()];
                        this.t = iArr2;
                    }
                    Arrays.fill(iArr2, 0);
                    q(e(), iArr, true);
                    int childCount2 = (gridLayout.getChildCount() * this.v.a) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = gridLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount3; i2++) {
                            View childAt2 = gridLayout.getChildAt(i2);
                            if (childAt2.getVisibility() != 8) {
                                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                                f += (z3 ? layoutParams2.b : layoutParams2.a).d;
                            }
                        }
                        int i3 = -1;
                        boolean z4 = true;
                        int i4 = 0;
                        while (i4 < childCount2) {
                            int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                            m();
                            p(i5, f);
                            boolean zQ = q(e(), iArr, false);
                            if (zQ) {
                                i4 = i5 + 1;
                                i3 = i5;
                            } else {
                                childCount2 = i5;
                            }
                            z4 = zQ;
                        }
                        if (i3 > 0 && !z4) {
                            m();
                            p(i3, f);
                            q(e(), iArr, true);
                        }
                    }
                } else {
                    q(e(), iArr, true);
                }
                if (!this.u) {
                    int i6 = iArr[0];
                    int length = iArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr[i7] = iArr[i7] - i6;
                    }
                }
                this.q = true;
            }
            return this.p;
        }

        public final int i() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            int iMax = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = (LayoutParams) gridLayout.getChildAt(i2).getLayoutParams();
                m mVar = (this.a ? layoutParams.b : layoutParams.a).b;
                iMax = Math.max(Math.max(Math.max(iMax, mVar.a), mVar.b), mVar.a());
            }
            int iMax2 = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
            this.c = iMax2;
            return iMax2;
        }

        public final int j(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            n nVar = this.w;
            n nVar2 = this.v;
            if (mode == Integer.MIN_VALUE) {
                nVar2.a = 0;
                nVar.a = -size;
                this.q = false;
                return h()[f()];
            }
            if (mode == 0) {
                nVar2.a = 0;
                nVar.a = -100000;
                this.q = false;
                return h()[f()];
            }
            if (mode != 1073741824) {
                return 0;
            }
            nVar2.a = size;
            nVar.a = -size;
            this.q = false;
            return h()[f()];
        }

        public final void l() {
            this.c = Integer.MIN_VALUE;
            this.d = null;
            this.f = null;
            this.h = null;
            this.j = null;
            this.l = null;
            this.n = null;
            this.p = null;
            this.t = null;
            this.s = false;
            m();
        }

        public final void m() {
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
        }

        public final void o(int i) {
            if (i == Integer.MIN_VALUE || i >= i()) {
                this.b = i;
            } else {
                GridLayout.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
                throw null;
            }
        }

        public final void p(int i, float f) {
            Arrays.fill(this.t, 0);
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = gridLayout.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    float f2 = (this.a ? layoutParams.b : layoutParams.a).d;
                    if (f2 != 0.0f) {
                        int iRound = Math.round((i * f2) / f);
                        this.t[i2] = iRound;
                        i -= iRound;
                        f -= f2;
                    }
                }
            }
        }

        public final boolean q(i[] iVarArr, int[] iArr, boolean z) {
            String str = this.a ? "horizontal" : "vertical";
            int iF = f() + 1;
            boolean[] zArr = null;
            loop0: for (int i = 0; i < iVarArr.length; i++) {
                Arrays.fill(iArr, 0);
                for (int i2 = 0; i2 < iF; i2++) {
                    boolean zN = false;
                    for (i iVar : iVarArr) {
                        zN |= n(iArr, iVar);
                    }
                    if (!zN) {
                        if (zArr == null) {
                            break loop0;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < iVarArr.length; i3++) {
                            i iVar2 = iVarArr[i3];
                            if (zArr[i3]) {
                                arrayList.add(iVar2);
                            }
                            if (!iVar2.c) {
                                arrayList2.add(iVar2);
                            }
                        }
                        Printer printer = GridLayout.this.v;
                        StringBuilder sbB = mq0.b(str, " constraints: ");
                        sbB.append(a(arrayList));
                        sbB.append(" are inconsistent; permanently removing: ");
                        sbB.append(a(arrayList2));
                        sbB.append(". ");
                        printer.println(sbB.toString());
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[iVarArr.length];
                for (int i4 = 0; i4 < iF; i4++) {
                    int length = iVarArr.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        zArr2[i5] = zArr2[i5] | n(iArr, iVarArr[i5]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                for (int i6 = 0; i6 < iVarArr.length; i6++) {
                    if (zArr2[i6]) {
                        i iVar3 = iVarArr[i6];
                        m mVar = iVar3.a;
                        if (mVar.a >= mVar.b) {
                            iVar3.c = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        public final i[] r(ArrayList arrayList) {
            androidx.gridlayout.widget.b bVar = new androidx.gridlayout.widget.b(this, (i[]) arrayList.toArray(new i[arrayList.size()]));
            int length = bVar.c.length;
            for (int i = 0; i < length; i++) {
                bVar.a(i);
            }
            return bVar.a;
        }
    }

    public static class l {
        public int a;
        public int b;
        public int c;

        public l() {
            c();
        }

        public int a(GridLayout gridLayout, View view, h hVar, int i, boolean z) {
            int i2 = this.a;
            WindowInsets windowInsets = q7i0.a;
            return i2 - hVar.a(view, i, gridLayout.getLayoutMode());
        }

        public void b(int i, int i2) {
            this.a = Math.max(this.a, i);
            this.b = Math.max(this.b, i2);
        }

        public void c() {
            this.a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            this.c = 2;
        }

        public int d(boolean z) {
            if (!z) {
                int i = this.c;
                LogPrinter logPrinter = GridLayout.w;
                if ((i & 2) != 0) {
                    return 100000;
                }
            }
            return this.a + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bounds{before=");
            sb.append(this.a);
            sb.append(", after=");
            return rr1.b(sb, this.b, '}');
        }
    }

    public static final class m {
        public final int a;
        public final int b;

        public m(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b - this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.a == mVar.a;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.a);
            sb.append(", ");
            return zk1.a(this.b, "]", sb);
        }
    }

    public static final class o<K, V> {
        public final int[] a;
        public final K[] b;
        public final V[] c;

        public o(K[] kArr, V[] vArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer numValueOf = (Integer) map.get(k);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(k, numValueOf);
                }
                iArr[i] = numValueOf.intValue();
            }
            this.a = iArr;
            this.b = (K[]) a(kArr, iArr);
            this.c = (V[]) a(vArr, iArr);
        }

        public static <K> K[] a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            Class<?> componentType = kArr.getClass().getComponentType();
            LogPrinter logPrinter = GridLayout.w;
            int iMax = -1;
            for (int i : iArr) {
                iMax = Math.max(iMax, i);
            }
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(componentType, iMax + 1));
            for (int i2 = 0; i2 < length; i2++) {
                kArr2[iArr[i2]] = kArr[i2];
            }
            return kArr2;
        }
    }

    public static class p {
        public static final p e = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.F, 0.0f);
        public final boolean a;
        public final m b;
        public final h c;
        public final float d;

        public p(boolean z, m mVar, h hVar, float f) {
            this.a = z;
            this.b = mVar;
            this.c = hVar;
            this.d = f;
        }

        public final h a(boolean z) {
            b bVar = GridLayout.F;
            h hVar = this.c;
            if (hVar != bVar) {
                return hVar;
            }
            if (this.d == 0.0f) {
                return z ? GridLayout.I : GridLayout.N;
            }
            return GridLayout.O;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.c.equals(pVar.c) && this.b.equals(pVar.b);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }
    }

    static {
        c cVar = new c();
        d dVar = new d();
        G = cVar;
        H = dVar;
        I = cVar;
        J = dVar;
        K = new androidx.gridlayout.widget.a(cVar, dVar);
        L = new androidx.gridlayout.widget.a(dVar, cVar);
        M = new e();
        N = new f();
        O = new g();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new k(true);
        this.b = new k(false);
        this.c = 0;
        this.d = false;
        this.e = 1;
        this.i = 0;
        this.v = w;
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        int[] iArr = bl30.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        r6i0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(A, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(B, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(z, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(C, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(D, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(E, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static h d(int i2, boolean z2) {
        int i3 = (i2 & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);
        if (i3 == 1) {
            return M;
        }
        if (i3 == 3) {
            return z2 ? K : G;
        }
        if (i3 == 5) {
            return z2 ? L : H;
        }
        if (i3 == 7) {
            return O;
        }
        if (i3 != 8388611) {
            return i3 != 8388613 ? F : J;
        }
        return I;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(LayoutParams layoutParams, int i2, int i3, int i4, int i5) {
        m mVar = new m(i2, i3 + i2);
        p pVar = layoutParams.a;
        layoutParams.a = new p(pVar.a, mVar, pVar.c, pVar.d);
        m mVar2 = new m(i4, i5 + i4);
        p pVar2 = layoutParams.b;
        layoutParams.b = new p(pVar2.a, mVar2, pVar2.c, pVar2.d);
    }

    public static p l(int i2, int i3, h hVar, float f2) {
        return new p(i2 != Integer.MIN_VALUE, new m(i2, i3 + i2), hVar, f2);
    }

    public final void a(LayoutParams layoutParams, boolean z2) {
        String str = z2 ? "column" : "row";
        m mVar = (z2 ? layoutParams.b : layoutParams.a).b;
        int i2 = mVar.a;
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i3 = (z2 ? this.a : this.b).b;
        if (i3 != Integer.MIN_VALUE) {
            if (mVar.b > i3) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (mVar.a() <= i3) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i2 = this.i;
        if (i2 != 0) {
            if (i2 != b()) {
                this.v.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z2 = this.c == 0;
        int i3 = (z2 ? this.a : this.b).b;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 0;
        }
        int[] iArr = new int[i3];
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            p pVar = z2 ? layoutParams.a : layoutParams.b;
            m mVar = pVar.b;
            boolean z3 = pVar.a;
            int iA = mVar.a();
            if (z3) {
                i4 = mVar.a;
            }
            p pVar2 = z2 ? layoutParams.b : layoutParams.a;
            m mVar2 = pVar2.b;
            boolean z4 = pVar2.a;
            int iA2 = mVar2.a();
            int i7 = mVar2.a;
            if (i3 != 0) {
                iA2 = Math.min(iA2, i3 - (z4 ? Math.min(i7, i3) : 0));
            }
            if (z4) {
                i5 = i7;
            }
            if (i3 != 0) {
                if (!z3 || !z4) {
                    while (true) {
                        int i8 = i5 + iA2;
                        if (i8 <= i3) {
                            int i9 = i5;
                            while (true) {
                                if (i9 >= i8) {
                                    break;
                                } else if (iArr[i9] > i4) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        if (z4) {
                            i4++;
                        } else if (i8 <= i3) {
                            i5++;
                        } else {
                            i4++;
                            i5 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i5, i3), Math.min(i5 + iA2, i3), i4 + iA);
            }
            if (z2) {
                k(layoutParams, i4, iA, i5, iA2);
            } else {
                k(layoutParams, i5, iA2, i4, iA);
            }
            i5 += iA2;
        }
        this.i = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        a(layoutParams2, true);
        a(layoutParams2, false);
        return true;
    }

    public final int e(View view, boolean z2, boolean z3) {
        int[] iArr;
        if (this.e == 1) {
            return f(view, z2, z3);
        }
        k kVar = z2 ? this.a : this.b;
        if (z3) {
            if (kVar.j == null) {
                kVar.j = new int[kVar.f() + 1];
            }
            if (!kVar.k) {
                kVar.c(true);
                kVar.k = true;
            }
            iArr = kVar.j;
        } else {
            if (kVar.l == null) {
                kVar.l = new int[kVar.f() + 1];
            }
            if (!kVar.m) {
                kVar.c(false);
                kVar.m = true;
            }
            iArr = kVar.l;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        m mVar = (z2 ? layoutParams.b : layoutParams.a).b;
        return iArr[z3 ? mVar.a : mVar.b];
    }

    public final int f(View view, boolean z2, boolean z3) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z2) {
            i2 = z3 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i2 = z3 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.d && view.getClass() != Space.class) {
            return this.f / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            p pVar = p.e;
            layoutParams3.a = pVar;
            layoutParams3.b = pVar;
            layoutParams3.a = layoutParams2.a;
            layoutParams3.b = layoutParams2.b;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            p pVar2 = p.e;
            layoutParams4.a = pVar2;
            layoutParams4.b = pVar2;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        p pVar3 = p.e;
        layoutParams5.a = pVar3;
        layoutParams5.b = pVar3;
        return layoutParams5;
    }

    public int getAlignmentMode() {
        return this.e;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.v;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.d;
    }

    public final void h() {
        this.i = 0;
        k kVar = this.a;
        if (kVar != null) {
            kVar.l();
        }
        k kVar2 = this.b;
        if (kVar2 != null) {
            kVar2.l();
        }
        if (kVar == null || kVar2 == null) {
            return;
        }
        kVar.m();
        kVar2.m();
    }

    public final void i(View view, int i2, int i3, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, e(view, true, false) + e(view, true, true), i4), ViewGroup.getChildMeasureSpec(i3, e(view, false, false) + e(view, false, true), i5));
    }

    public final void j(int i2, int i3, boolean z2) {
        int i4;
        int i5;
        GridLayout gridLayout;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i4 = i2;
                i5 = i3;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    gridLayout = this;
                    i4 = i2;
                    i5 = i3;
                    gridLayout.i(childAt, i4, i5, i7, i8);
                } else {
                    i4 = i2;
                    i5 = i3;
                    boolean z3 = this.c == 0;
                    p pVar = z3 ? layoutParams.b : layoutParams.a;
                    if (pVar.a(z3) == O) {
                        m mVar = pVar.b;
                        int[] iArrH = (z3 ? this.a : this.b).h();
                        int iE = (iArrH[mVar.b] - iArrH[mVar.a]) - (this.e(childAt, z3, false) + this.e(childAt, z3, true));
                        if (z3) {
                            int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                            gridLayout = this;
                            gridLayout.i(childAt, i4, i5, iE, i9);
                        } else {
                            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                            gridLayout = this;
                            gridLayout.i(childAt, i4, i5, i10, iE);
                        }
                    } else {
                        gridLayout = this;
                    }
                }
            }
            i6++;
            this = gridLayout;
            i2 = i4;
            i3 = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        GridLayout gridLayout = this;
        gridLayout.c();
        int i10 = i4 - i2;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i11 = (i10 - paddingLeft) - paddingRight;
        k kVar = gridLayout.a;
        kVar.v.a = i11;
        kVar.w.a = -i11;
        boolean z4 = false;
        kVar.q = false;
        kVar.h();
        int i12 = ((i5 - i3) - paddingTop) - paddingBottom;
        k kVar2 = gridLayout.b;
        kVar2.v.a = i12;
        kVar2.w.a = -i12;
        kVar2.q = false;
        kVar2.h();
        int[] iArrH = kVar.h();
        int[] iArrH2 = kVar2.h();
        int childCount = gridLayout.getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = gridLayout.getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i7 = i13;
                i6 = i10;
                i8 = paddingLeft;
                i9 = paddingTop;
                z3 = z4;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                p pVar = layoutParams.b;
                p pVar2 = layoutParams.a;
                m mVar = pVar.b;
                m mVar2 = pVar2.b;
                int i14 = i13;
                int i15 = iArrH[mVar.a];
                int i16 = iArrH2[mVar2.a];
                int i17 = iArrH[mVar.b];
                int i18 = iArrH2[mVar2.b];
                int i19 = i17 - i15;
                int i20 = i18 - i16;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                h hVarA = pVar.a(true);
                h hVarA2 = pVar2.a(false);
                o<p, l> oVarG = kVar.g();
                l lVar = oVarG.c[oVarG.a[i14]];
                o<p, l> oVarG2 = kVar2.g();
                i6 = i10;
                l lVar2 = oVarG2.c[oVarG2.a[i14]];
                int iD = hVarA.d(i19 - lVar.d(true), childAt);
                int iD2 = hVarA2.d(i20 - lVar2.d(true), childAt);
                int iE = gridLayout.e(childAt, true, true);
                int iE2 = gridLayout.e(childAt, false, true);
                int iE3 = gridLayout.e(childAt, true, false);
                int i21 = iE + iE3;
                int iE4 = iE2 + gridLayout.e(childAt, false, false);
                i7 = i14;
                i8 = paddingLeft;
                i9 = paddingTop;
                z3 = false;
                int iA = lVar.a(gridLayout, childAt, hVarA, measuredWidth + i21, true);
                int iA2 = lVar2.a(this, childAt, hVarA2, measuredHeight + iE4, false);
                int iE5 = hVarA.e(measuredWidth, i19 - i21);
                int iE6 = hVarA2.e(measuredHeight, i20 - iE4);
                int i22 = i15 + iD + iA;
                int i23 = getLayoutDirection() == 1 ? (((i6 - iE5) - paddingRight) - iE3) - i22 : i8 + iE + i22;
                int i24 = i9 + i16 + iD2 + iA2 + iE2;
                if (iE5 != childAt.getMeasuredWidth() || iE6 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iE5, 1073741824), View.MeasureSpec.makeMeasureSpec(iE6, 1073741824));
                }
                childAt.layout(i23, i24, iE5 + i23, iE6 + i24);
            }
            i13 = i7 + 1;
            gridLayout = this;
            paddingLeft = i8;
            paddingTop = i9;
            i10 = i6;
            z4 = z3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iJ;
        int iJ2;
        c();
        k kVar = this.b;
        k kVar2 = this.a;
        if (kVar2 != null && kVar != null) {
            kVar2.m();
            kVar.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i2), View.MeasureSpec.getMode(i2));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i3), View.MeasureSpec.getMode(i3));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.c == 0) {
            iJ2 = kVar2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = kVar.j(iMakeMeasureSpec2);
        } else {
            iJ = kVar.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = kVar2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i2, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i3, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i2) {
        this.e = i2;
        requestLayout();
    }

    public void setColumnCount(int i2) {
        this.a.o(i2);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z2) {
        k kVar = this.a;
        kVar.u = z2;
        kVar.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i2) {
        if (this.c != i2) {
            this.c = i2;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = y;
        }
        this.v = printer;
    }

    public void setRowCount(int i2) {
        this.b.o(i2);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z2) {
        k kVar = this.b;
        kVar.u = z2;
        kVar.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z2) {
        this.d = z2;
        requestLayout();
    }

    public static final class n {
        public int a;

        public n() {
            this.a = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.a);
        }

        public n(int i) {
            this.a = i;
        }
    }

    public class d extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            return i;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return i;
        }
    }

    public class g extends h {
        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final String c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int d(int i, View view) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.h
        public final int e(int i, int i2) {
            return i2;
        }
    }

    public static abstract class h {
        public abstract int a(View view, int i, int i2);

        public l b() {
            return new l();
        }

        public abstract String c();

        public abstract int d(int i, View view);

        public final String toString() {
            return "Alignment:".concat(c());
        }

        public int e(int i, int i2) {
            return i;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int c = (-2147483647) - Integer.MIN_VALUE;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        public static final int h = 6;
        public static final int i = 7;
        public static final int j = 8;
        public static final int k = 9;
        public static final int l = 11;
        public static final int m = 12;
        public static final int n = 13;
        public static final int o = 10;
        public p a;
        public p b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            p pVar = p.e;
            this.a = pVar;
            this.b = pVar;
            int[] iArr = bl30.b;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(e, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(h, dimensionPixelSize);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i2 = typedArrayObtainStyledAttributes2.getInt(o, 0);
                    int i3 = typedArrayObtainStyledAttributes2.getInt(i, Integer.MIN_VALUE);
                    int i4 = j;
                    int i5 = c;
                    this.b = GridLayout.l(i3, typedArrayObtainStyledAttributes2.getInt(i4, i5), GridLayout.d(i2, true), typedArrayObtainStyledAttributes2.getFloat(k, 0.0f));
                    this.a = GridLayout.l(typedArrayObtainStyledAttributes2.getInt(l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes2.getInt(m, i5), GridLayout.d(i2, false), typedArrayObtainStyledAttributes2.getFloat(n, 0.0f));
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }

        public final void a(int i2) {
            p pVar = this.a;
            this.a = new p(pVar.a, pVar.b, GridLayout.d(i2, false), pVar.d);
            p pVar2 = this.b;
            this.b = new p(pVar2.a, pVar2.b, GridLayout.d(i2, true), pVar2.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutParams)) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.b.equals(layoutParams.b) && this.a.equals(layoutParams.a);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i2, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i3, -2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LayoutParams() {
            p pVar = p.e;
            this(pVar, pVar);
        }

        public LayoutParams(p pVar, p pVar2) {
            super(-2, -2);
            p pVar3 = p.e;
            this.a = pVar3;
            this.b = pVar3;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.a = pVar;
            this.b = pVar2;
        }
    }
}
