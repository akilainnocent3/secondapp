package androidx.compose.runtime;

import defpackage.etw;
import defpackage.h8l;
import defpackage.hb5;
import defpackage.ibh0;
import defpackage.ixo;
import defpackage.j1a0;
import defpackage.k350;
import defpackage.l00;
import defpackage.lm20;
import defpackage.lsw;
import defpackage.lxo;
import defpackage.m2g;
import defpackage.mae0;
import defpackage.msw;
import defpackage.nsw;
import defpackage.xx0;
import defpackage.xyf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final g a;
    public int[] b;
    public Object[] c;
    public ArrayList<l00> d;
    public HashMap<l00, h8l> e;
    public msw<nsw> f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final lxo p;
    public final lxo q;
    public final lxo r;
    public msw<etw<Object>> s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public lsw x;

    public static final class a {
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static List a(h hVar, int i, h hVar2, boolean z, boolean z2, boolean z3) {
            List list;
            List list2;
            boolean z4;
            List list3;
            int i2;
            l00 l00VarR;
            List list4;
            List list5;
            int iS = hVar.s(i);
            int i3 = i + iS;
            int iF = hVar.f(hVar.b, hVar.q(i));
            int iF2 = hVar.f(hVar.b, hVar.q(i3));
            int i4 = iF2 - iF;
            boolean z5 = i >= 0 && (hVar.b[(hVar.q(i) * 5) + 1] & 201326592) != 0;
            hVar2.u(iS);
            hVar2.v(i4, hVar2.t);
            if (hVar.g < i3) {
                hVar.z(i3);
            }
            if (hVar.k < iF2) {
                hVar.A(iF2, i3);
            }
            int[] iArr = hVar2.b;
            int i5 = hVar2.t;
            int i6 = i5 * 5;
            xx0.d(i6, i * 5, i3 * 5, hVar.b, iArr);
            Object[] objArr = hVar2.c;
            int i7 = hVar2.i;
            System.arraycopy(hVar.c, iF, objArr, i7, i4);
            int i8 = hVar2.v;
            iArr[i6 + 2] = i8;
            int i9 = i5 - i;
            int i10 = i5 + iS;
            int iF3 = i7 - hVar2.f(iArr, i5);
            int i11 = hVar2.m;
            int i12 = hVar2.l;
            int length = objArr.length;
            boolean z6 = z5;
            int i13 = i11;
            int i14 = i5;
            while (i14 < i10) {
                if (i14 != i5) {
                    int i15 = (i14 * 5) + 2;
                    iArr[i15] = iArr[i15] + i9;
                }
                int[] iArr2 = iArr;
                iArr2[(i14 * 5) + 4] = h.h(hVar2.f(iArr, i14) + iF3, i13 < i14 ? 0 : hVar2.k, i12, length);
                if (i14 == i13) {
                    i13++;
                }
                i14++;
                i5 = i5;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            hVar2.m = i13;
            int iA = j1a0.a(hVar.d, i, hVar.o());
            int iA2 = j1a0.a(hVar.d, i3, hVar.o());
            if (iA < iA2) {
                ArrayList<l00> arrayList = hVar.d;
                ArrayList arrayList2 = new ArrayList(iA2 - iA);
                for (int i16 = iA; i16 < iA2; i16++) {
                    l00 l00Var = arrayList.get(i16);
                    l00Var.a += i9;
                    arrayList2.add(l00Var);
                }
                hVar2.d.addAll(j1a0.a(hVar2.d, hVar2.t, hVar2.o()), arrayList2);
                arrayList.subList(iA, iA2).clear();
                list = arrayList2;
            } else {
                list = m2g.a;
            }
            if (!list.isEmpty()) {
                HashMap<l00, h8l> map = hVar.e;
                HashMap<l00, h8l> map2 = hVar2.e;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        l00 l00Var2 = (l00) list.get(i17);
                        h8l h8lVar = map.get(l00Var2);
                        if (h8lVar != null) {
                            map.remove(l00Var2);
                            map2.put(l00Var2, h8lVar);
                        }
                    }
                }
            }
            int i18 = hVar2.v;
            h8l h8lVarO = hVar2.O(i8);
            if (h8lVarO != null) {
                int i19 = i18 + 1;
                int i20 = hVar2.t;
                int i21 = -1;
                while (i19 < i20) {
                    i21 = i19;
                    i19 = hVar2.b[(i19 * 5) + 3] + i19;
                }
                ArrayList<Object> arrayList3 = h8lVarO.a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    h8lVarO.a = arrayList3;
                }
                if (i21 >= 0 && (l00VarR = hVar2.R(i21)) != null) {
                    int size2 = arrayList3.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size2) {
                            list4 = list;
                            list3 = list4;
                            i2 = -1;
                            break;
                        }
                        Object obj = arrayList3.get(i22);
                        if (Intrinsics.g(obj, l00VarR)) {
                            list4 = list;
                            list5 = list4;
                        } else {
                            list5 = list4;
                            if ((obj instanceof h8l) && ((h8l) obj).a(l00VarR)) {
                                list4 = list;
                            } else {
                                list4 = list;
                                i22++;
                                list4 = list5;
                            }
                        }
                        i2 = i22;
                        list3 = list5;
                        break;
                    }
                }
                list3 = list;
                i2 = 0;
                arrayList3.add(i2, hVar2.b(i20));
                list2 = list3;
            } else {
                list2 = list;
            }
            int iE = hVar.E(hVar.b, i);
            if (!z3) {
                z4 = false;
            } else if (z) {
                boolean z7 = iE >= 0;
                if (z7) {
                    hVar.P();
                    hVar.a(iE - hVar.t);
                    hVar.P();
                }
                hVar.a(i - hVar.t);
                boolean zH = hVar.H();
                if (z7) {
                    hVar.M();
                    hVar.i();
                    hVar.M();
                    hVar.i();
                }
                z4 = zH;
            } else {
                boolean zI = hVar.I(i, iS);
                hVar.J(iF, i4, i - 1);
                z4 = zI;
            }
            if (z4) {
                c.b("Unexpectedly removed anchors");
            }
            int i23 = hVar2.o;
            int i24 = iArr3[i6 + 1];
            hVar2.o = i23 + ((1073741824 & i24) != 0 ? 1 : i24 & 67108863);
            if (z2) {
                hVar2.t = i10;
                hVar2.i = i7 + i4;
            }
            if (z6) {
                hVar2.U(i8);
            }
            return list2;
        }
    }

    public h(g gVar) {
        this.a = gVar;
        int[] iArr = gVar.a;
        this.b = iArr;
        Object[] objArr = gVar.c;
        this.c = objArr;
        this.d = gVar.w;
        this.e = gVar.y;
        this.f = gVar.z;
        int i = gVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = gVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new lxo();
        this.q = new lxo();
        this.r = new lxo();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(h hVar) {
        int i = hVar.v;
        int iQ = hVar.q(i);
        int[] iArr = hVar.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        hVar.U(hVar.E(iArr, i));
    }

    public final void A(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        c.b("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        c.b("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List B(l00 l00Var, h hVar) {
        if (hVar.n <= 0) {
            c.b("Check failed");
        }
        if (this.n != 0) {
            c.b("Check failed");
        }
        if (!l00Var.a()) {
            c.b("Check failed");
        }
        int iC = c(l00Var) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            c.b("Check failed");
        }
        int iE = E(this.b, iC);
        int iS = s(iC);
        int iD = w(iC) ? 1 : D(iC);
        List listA = a.a(this, iC, hVar, false, false, true);
        U(iE);
        boolean z = iD > 0;
        while (iE >= i) {
            int iQ = q(iE);
            int[] iArr = this.b;
            int i2 = iQ * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iS;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    j1a0.e(iQ, (i4 & 67108863) - iD, iArr);
                }
            }
            iE = E(this.b, iE);
        }
        if (z) {
            if (this.o < iD) {
                c.b("Check failed");
            }
            this.o -= iD;
        }
        return listA;
    }

    public final Object C(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int D(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int E(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            c.b("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        lsw lswVar = this.x;
        if (lswVar != null) {
            while (lswVar.b != 0) {
                int iB = xyf.b(lswVar);
                int iQ = q(iB);
                int iS = iB + 1;
                int iS2 = s(iB) + iB;
                while (true) {
                    if (iS >= iS2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iE = E(iArr, iB);
                    if (iE >= 0) {
                        xyf.a(lswVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        l00 l00VarR;
        if (this.n != 0) {
            c.b("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(this.b, q(i));
        int iL = L();
        h8l h8lVarO = O(this.v);
        if (h8lVarO != null && (l00VarR = R(i)) != null) {
            h8lVarO.c(l00VarR);
        }
        lsw lswVar = this.x;
        if (lswVar != null) {
            while (true) {
                int i3 = lswVar.b;
                if (i3 != 0) {
                    if (i3 == 0) {
                        ibh0.a("IntList is empty.");
                        return false;
                    }
                    if (lswVar.a[0] >= i) {
                        xyf.b(lswVar);
                    }
                }
            }
        }
        boolean zI = I(i, this.t - i);
        J(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iL;
        return zI;
    }

    public final boolean I(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<l00> arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap<l00, h8l> map = this.e;
                int i3 = i + i2;
                int iA = j1a0.a(this.d, i3, n() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    l00 l00Var = this.d.get(iA);
                    int iC = c(l00Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        l00Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(l00Var);
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                U(i8);
            }
        }
        return z;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            A(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object K(int i, int i2, Object obj) {
        int iN = N(this.b, q(i));
        int iF = f(this.b, q(i + 1));
        int i3 = iN + i2;
        if (i3 < iN || i3 >= iF) {
            c.b("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int L() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void M() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int N(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iC = j1a0.c(iArr, i);
        return iC < 0 ? (this.c.length - this.l) + iC + 1 : iC;
    }

    public final h8l O(int i) {
        l00 l00VarR;
        HashMap<l00, h8l> map = this.e;
        if (map == null || (l00VarR = R(i)) == null) {
            return null;
        }
        return map.get(l00VarR);
    }

    public final void P() {
        if (this.n != 0) {
            c.b("Key must be supplied when inserting");
        }
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        Q(0, c0042a, false, c0042a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i, Object obj, boolean z, Object obj2) {
        int i2;
        h8l h8lVarO;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(this.b, q(i4));
            u(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != c0042a ? 1 : 0;
            int i6 = (z || obj2 == c0042a) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                v(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (h8lVarO = O(i3)) != null) {
                h8l h8lVarB = h8lVarO.b();
                l00 l00VarB = b(i4);
                ArrayList<Object> arrayList = h8lVarB.a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                h8lVarB.a = arrayList;
                arrayList.add(l00VarB);
            }
        } else {
            this.p.c(i3);
            this.q.c((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!Intrinsics.g(obj2, c0042a)) {
                if (z) {
                    V(this.t, obj2);
                } else {
                    T(obj2);
                }
            }
            this.i = N(this.b, iQ2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final l00 R(int i) {
        ArrayList<l00> arrayList;
        int iB;
        if (i < 0 || i >= o() || (iB = j1a0.b((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return arrayList.get(iB);
    }

    public final void S(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            F(obj);
            return;
        }
        msw<etw<Object>> mswVar = this.s;
        if (mswVar == null) {
            mswVar = new msw<>();
        }
        this.s = mswVar;
        int i = this.v;
        etw<Object> etwVarB = mswVar.b(i);
        if (etwVarB == null) {
            etwVarB = new etw<>((Object) null);
            mswVar.h(i, etwVarB);
        }
        etwVarB.g(obj);
    }

    public final void T(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            c.b("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void U(int i) {
        if (i >= 0) {
            lsw lswVar = this.x;
            if (lswVar == null) {
                lswVar = new lsw();
                this.x = lswVar;
            }
            xyf.a(lswVar, i);
        }
    }

    public final void V(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            c.b("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, iQ))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            c.b("Cannot seek backwards");
        }
        if (this.n > 0) {
            lm20.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            c.b("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iF = f(this.b, q(i2));
        this.i = iF;
        this.j = iF;
    }

    public final l00 b(int i) {
        ArrayList<l00> arrayList = this.d;
        int iB = j1a0.b(arrayList, i, o());
        if (iB >= 0) {
            return arrayList.get(iB);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        l00 l00Var = new l00(i);
        arrayList.add(-(iB + 1), l00Var);
        return l00Var;
    }

    public final int c(l00 l00Var) {
        int i = l00Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(o());
            A(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList<l00> arrayList = this.d;
        HashMap<l00, h8l> map = this.e;
        msw<nsw> mswVar = this.f;
        g gVar = this.a;
        if (!gVar.i) {
            lm20.a("Unexpected writer close()");
        }
        gVar.i = false;
        gVar.a = iArr;
        gVar.b = i2;
        gVar.c = objArr;
        gVar.d = i3;
        gVar.w = arrayList;
        gVar.y = map;
        gVar.z = mswVar;
    }

    public final int f(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        etw<Object> etwVarB;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        lxo lxoVar = this.r;
        if (z) {
            msw<etw<Object>> mswVar = this.s;
            if (mswVar != null && (etwVarB = mswVar.b(i3)) != null) {
                Object[] objArr = etwVarB.a;
                int i8 = etwVarB.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
                mswVar.g(i3);
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            j1a0.e(iQ, i4, iArr);
            int iB = lxoVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iE = E(this.b, i3);
            this.v = iE;
            int iO = iE < 0 ? o() : q(iE + 1);
            int iF = iO >= 0 ? f(this.b, iO) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i2) {
            c.b("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        j1a0.e(iQ, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = iB2;
        int iE2 = E(this.b, i3);
        int iB3 = lxoVar.b();
        this.o = iB3;
        if (iE2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iE2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    j1a0.e(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            lm20.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                c.b("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            c.b("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                c.b("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void m(int i, Function2<? super Integer, Object, Unit> function2) {
        int i2;
        int i3;
        l00 l00Var;
        int iE = E(this.b, i);
        int iO = o();
        int iS = s(i) + i;
        Object obj = null;
        int i4 = i;
        nsw nswVar = null;
        lsw lswVar = null;
        while (i4 < iS) {
            int i5 = i4 + 1;
            int iF = f(this.b, q(i5));
            for (int iF2 = f(this.b, q(i4)); iF2 < iF; iF2++) {
                Object obj2 = this.c[g(iF2)];
                if ((obj2 instanceof k350) && (l00Var = ((k350) obj2).b) != null && l00Var.a()) {
                    int iC = c(l00Var);
                    if (nswVar == null) {
                        int[] iArr = ixo.a;
                        nswVar = new nsw(obj);
                    }
                    if (lswVar == null) {
                        lswVar = new lsw();
                    }
                    nswVar.a(iC);
                    lswVar.a(iC);
                    lswVar.a(iF2);
                } else {
                    function2.invoke(Integer.valueOf(iF2), obj2);
                }
            }
            int iE2 = i5 < iO ? E(this.b, i5) : -1;
            if (iE2 != i4) {
                while (true) {
                    if (lswVar == null || nswVar == null || !nswVar.e(i4)) {
                        i2 = iO;
                    } else {
                        int i6 = lswVar.b;
                        int i7 = i6 / 2;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < i7) {
                            int i10 = i8 * 2;
                            int i11 = iO;
                            int iC2 = lswVar.c(i10);
                            if (iC2 == i4) {
                                int iC3 = lswVar.c(i10 + 1);
                                function2.invoke(Integer.valueOf(iC3), this.c[g(iC3)]);
                            } else if (i10 != i9) {
                                int i12 = i9 + 1;
                                lswVar.f(i9, iC2);
                                i9 += 2;
                                lswVar.f(i12, lswVar.c(i10 + 1));
                            } else {
                                i9 += 2;
                            }
                            i8++;
                            function2 = function2;
                            iO = i11;
                        }
                        i2 = iO;
                        if (i9 != i6) {
                            if (i9 < 0 || i9 > (i3 = lswVar.b) || i6 < 0 || i6 > i3) {
                                mae0.a("Index must be between 0 and size");
                                return;
                            }
                            if (i6 < i9) {
                                hb5.a("The end index must be < start index");
                                return;
                            } else if (i6 != i9) {
                                if (i6 < i3) {
                                    int[] iArr2 = lswVar.a;
                                    xx0.d(i9, i6, i3, iArr2, iArr2);
                                }
                                lswVar.b -= i6 - i9;
                            }
                        }
                    }
                    if (i4 == i || iE == iE2) {
                        break;
                    }
                    i4 = iE;
                    iO = i2;
                    iE = E(this.b, iE);
                    function2 = function2;
                }
            } else {
                i2 = iO;
            }
            iE = iE2;
            i4 = i5;
            iO = i2;
            obj = null;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return androidx.compose.runtime.a.C0041a.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int iN;
        int iS;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            lxo lxoVar = this.p;
            if (i2 > lxoVar.a(0)) {
                iS = s(i2);
            } else {
                int[] iArr = lxoVar.a;
                int iMin = Math.min(iArr.length, lxoVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iS = s(i2);
                } else {
                    iN = (n() - this.h) - this.q.a[i3];
                }
            }
            iN = iS + i2;
        }
        return i > i2 && i < iN;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                xx0.d(0, 0, i3 * 5, iArr, iArr2);
                xx0.d((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(iArr, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            A(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(g gVar, int i) {
        if (this.n <= 0) {
            c.b("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = gVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = gVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr3 = this.c;
                ArrayList<l00> arrayList = this.d;
                HashMap<l00, h8l> map = this.e;
                msw<nsw> mswVar = this.f;
                Object[] objArr4 = gVar.c;
                int i4 = gVar.d;
                HashMap<l00, h8l> map2 = gVar.y;
                msw<nsw> mswVar2 = gVar.z;
                this.b = iArr;
                this.c = objArr4;
                this.d = gVar.w;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr4.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = mswVar2;
                gVar.a = iArr2;
                gVar.b = objArr2 == true ? 1 : 0;
                gVar.c = objArr3;
                gVar.d = objArr == true ? 1 : 0;
                gVar.w = arrayList;
                gVar.y = map;
                gVar.z = mswVar;
                return;
            }
        }
        h hVarE = gVar.e();
        try {
            a.a(hVarE, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            hVarE.e(z);
        }
    }

    public final void z(int i) {
        l00 l00Var;
        int i2;
        l00 l00Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList<l00> arrayList = this.d;
                if (i6 < i) {
                    for (int iA = j1a0.a(arrayList, i6, iN); iA < this.d.size() && (i3 = (l00Var2 = this.d.get(iA)).a) < 0 && (i4 = i3 + iN) < i; iA++) {
                        l00Var2.a = i4;
                    }
                } else {
                    for (int iA2 = j1a0.a(arrayList, i, iN); iA2 < this.d.size() && (i2 = (l00Var = this.d.get(iA2)).a) >= 0; iA2++) {
                        l00Var.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    xx0.d(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    xx0.d(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                c.b("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
