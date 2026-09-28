package defpackage;

import android.util.Log;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.y;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class niv implements n92.b, uae {
    public final jxa a;
    public Map<vhv, y> b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final qwd0 e;
    public final int[] f;
    public final int[] g;

    public niv(mmd mmdVar) {
        jxa jxaVar = new jxa(0, 0);
        jxaVar.v0 = new ArrayList<>();
        jxaVar.w0 = new n92(jxaVar);
        ymd ymdVar = new ymd(jxaVar);
        jxaVar.x0 = ymdVar;
        jxaVar.z0 = null;
        jxaVar.A0 = false;
        jxaVar.B0 = new ofs();
        jxaVar.E0 = 0;
        jxaVar.F0 = 0;
        jxaVar.G0 = new ew6[4];
        jxaVar.H0 = new ew6[4];
        jxaVar.I0 = 257;
        jxaVar.J0 = false;
        jxaVar.K0 = false;
        jxaVar.L0 = null;
        jxaVar.M0 = null;
        jxaVar.N0 = null;
        jxaVar.O0 = null;
        jxaVar.P0 = new HashSet<>();
        jxaVar.Q0 = new n92.a();
        jxaVar.z0 = this;
        ymdVar.f = this;
        this.a = jxaVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new qwd0(mmdVar);
        this.f = new int[2];
        this.g = new int[2];
    }

    public static void d(ixa.a aVar, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (iOrdinal == 2) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 3) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((aVar + " is not supported").toString());
        }
    }

    @Override // n92.b
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // n92.b
    public final void b(ixa ixaVar, n92.a aVar) {
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i4;
        int i5;
        Integer numValueOf3;
        int i6;
        Integer numValueOf4;
        Integer num2;
        int iIntValue2;
        boolean z;
        boolean z2;
        int iF0;
        char c;
        Object obj;
        String str = ixaVar.k;
        LinkedHashMap linkedHashMap = this.c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        ixa.a aVar2 = aVar.a;
        int i7 = aVar.c;
        int i8 = ixaVar.s;
        int i9 = aVar.j;
        boolean z3 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != ixaVar.m()) {
            z3 = false;
        }
        boolean zC = ixaVar.C();
        qwd0 qwd0Var = this.e;
        d(aVar2, i7, i8, i9, z3, zC, kxa.i(qwd0Var.l), this.f);
        d(aVar.b, aVar.d, ixaVar.t, aVar.j, (numArr != null ? numArr[0].intValue() : 0) == ixaVar.s(), ixaVar.D(), kxa.h(qwd0Var.l), this.g);
        int[] iArr = this.f;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = this.g;
        long jA = oxa.a(i10, i11, iArr2[0], iArr2[1]);
        int i12 = aVar.j;
        if (i12 == 1 || i12 == 2) {
            long jC = c(ixaVar, jA);
            ixaVar.g = false;
            i = (int) (jC >> 32);
            Integer numValueOf5 = Integer.valueOf(i);
            i2 = ixaVar.v;
            numValueOf = Integer.valueOf(i2);
            if (i2 <= 0) {
                numValueOf = null;
            }
            i3 = ixaVar.w;
            numValueOf2 = Integer.valueOf(i3);
            if (i3 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) f.i(numValueOf5, numValueOf, num)).intValue();
            i4 = (int) (jC & 4294967295L);
            Integer numValueOf6 = Integer.valueOf(i4);
            i5 = ixaVar.y;
            numValueOf3 = Integer.valueOf(i5);
            if (i5 <= 0) {
                numValueOf3 = null;
            }
            i6 = ixaVar.z;
            numValueOf4 = Integer.valueOf(i6);
            if (i6 > 0) {
                num2 = numValueOf4;
            } else {
                num2 = null;
            }
            iIntValue2 = ((Number) f.i(numValueOf6, numValueOf3, num2)).intValue();
            if (iIntValue != i) {
                jA = oxa.a(iIntValue, iIntValue, kxa.j(jA), kxa.h(jA));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != i4) {
                jA = oxa.a(kxa.k(jA), kxa.i(jA), iIntValue2, iIntValue2);
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                c(ixaVar, jA);
                ixaVar.g = false;
            }
        } else {
            ixa.a aVar3 = aVar.a;
            ixa.a aVar4 = ixa.a.c;
            if (aVar3 != aVar4 || ixaVar.s != 0 || aVar.b != aVar4 || ixaVar.t != 0) {
                long jC2 = c(ixaVar, jA);
                ixaVar.g = false;
                i = (int) (jC2 >> 32);
                Integer numValueOf7 = Integer.valueOf(i);
                i2 = ixaVar.v;
                numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                i3 = ixaVar.w;
                numValueOf2 = Integer.valueOf(i3);
                if (i3 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) f.i(numValueOf7, numValueOf, num)).intValue();
                i4 = (int) (jC2 & 4294967295L);
                Integer numValueOf8 = Integer.valueOf(i4);
                i5 = ixaVar.y;
                numValueOf3 = Integer.valueOf(i5);
                if (i5 <= 0) {
                    numValueOf3 = null;
                }
                i6 = ixaVar.z;
                numValueOf4 = Integer.valueOf(i6);
                if (i6 > 0) {
                    num2 = numValueOf4;
                } else {
                    num2 = null;
                }
                iIntValue2 = ((Number) f.i(numValueOf8, numValueOf3, num2)).intValue();
                if (iIntValue != i) {
                    jA = oxa.a(iIntValue, iIntValue, kxa.j(jA), kxa.h(jA));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != i4) {
                    jA = oxa.a(kxa.k(jA), kxa.i(jA), iIntValue2, iIntValue2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c(ixaVar, jA);
                    ixaVar.g = false;
                }
            }
        }
        y yVar = this.b.get(ixaVar.i0);
        aVar.e = yVar != null ? yVar.a : ixaVar.s();
        aVar.f = yVar != null ? yVar.b : ixaVar.m();
        if (yVar != null) {
            ArrayList<ixa> arrayList = qwd0Var.i;
            if (qwd0Var.j) {
                arrayList.clear();
                ArrayList<Object> arrayList2 = qwd0Var.h;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    ixa ixaVarA = qwd0Var.c.get(obj2).a();
                    if (ixaVarA != null) {
                        arrayList.add(ixaVarA);
                    }
                }
                qwd0Var.j = false;
            }
            if (arrayList.contains(ixaVar)) {
                iF0 = yVar.f0(mt.a);
            } else {
                iF0 = Integer.MIN_VALUE;
            }
        } else {
            iF0 = Integer.MIN_VALUE;
        }
        aVar.h = iF0 != Integer.MIN_VALUE;
        aVar.g = iF0;
        Object obj3 = linkedHashMap.get(str);
        if (obj3 == null) {
            c = 0;
            Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            c = 0;
            obj = obj3;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[c] = Integer.valueOf(aVar.e);
        numArr3[1] = Integer.valueOf(aVar.f);
        numArr3[2] = Integer.valueOf(aVar.g);
        aVar.i = (aVar.e == aVar.c && aVar.f == aVar.d) ? c : 1;
    }

    public final void e(y.a aVar, List<? extends vhv> list, Map<vhv, y> map) {
        String string;
        y yVar;
        y.a aVar2;
        String string2;
        this.b = map;
        LinkedHashMap linkedHashMap = this.d;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            ArrayList<ixa> arrayList = this.a.v0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ixa ixaVar = arrayList.get(i2);
                Object obj = ixaVar.i0;
                if (obj instanceof vhv) {
                    u6j0 u6j0Var = ixaVar.j;
                    ixa ixaVar2 = u6j0Var.a;
                    if (ixaVar2 != null) {
                        u6j0Var.b = ixaVar2.t();
                        u6j0Var.c = ixaVar2.u();
                        ixaVar2.t();
                        ixaVar2.u();
                        u6j0Var.a(ixaVar2.j);
                    }
                    u6j0 u6j0Var2 = new u6j0(u6j0Var);
                    vhv vhvVar = (vhv) obj;
                    Object objA = i.a(vhvVar);
                    if (objA == null) {
                        Object objG = vhvVar.g();
                        pwa pwaVar = objG instanceof pwa ? (pwa) objG : null;
                        objA = pwaVar != null ? pwaVar.a() : null;
                    }
                    if (objA == null || (string2 = objA.toString()) == null) {
                        string2 = "null";
                    }
                    linkedHashMap.put(string2, u6j0Var2);
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            vhv vhvVar2 = list.get(i);
            Object objA2 = i.a(vhvVar2);
            if (objA2 == null) {
                Object objG2 = vhvVar2.g();
                pwa pwaVar2 = objG2 instanceof pwa ? (pwa) objG2 : null;
                objA2 = pwaVar2 != null ? pwaVar2.a() : null;
            }
            if (objA2 == null || (string = objA2.toString()) == null) {
                string = "null";
            }
            u6j0 u6j0Var3 = (u6j0) linkedHashMap.get(string);
            if (u6j0Var3 == null || (yVar = this.b.get(vhvVar2)) == null || u6j0Var3.o == 8) {
                aVar2 = aVar;
            } else if (Float.isNaN(u6j0Var3.f) && Float.isNaN(u6j0Var3.g) && Float.isNaN(u6j0Var3.h) && Float.isNaN(u6j0Var3.i) && Float.isNaN(u6j0Var3.j) && Float.isNaN(u6j0Var3.k) && Float.isNaN(u6j0Var3.l) && Float.isNaN(u6j0Var3.m) && Float.isNaN(u6j0Var3.n)) {
                y.a.x(aVar, yVar, (((long) u6j0Var3.c) & 4294967295L) | (((long) u6j0Var3.b) << 32));
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                aVar2.E(yVar, u6j0Var3.b, u6j0Var3.c, Float.isNaN(u6j0Var3.k) ? 0.0f : u6j0Var3.k, new kwa(u6j0Var3));
            }
            i++;
            aVar = aVar2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final long f(long j, asr asrVar, swa swaVar, List list, LinkedHashMap linkedHashMap) {
        cqe cqeVar;
        cqe cqeVar2;
        wil wilVar;
        yil yilVarS;
        yil yilVarS2;
        this.b = linkedHashMap;
        if (list.isEmpty()) {
            return kc6.a(kxa.k(j), kxa.j(j));
        }
        boolean zG = kxa.g(j);
        String str = cqe.i;
        if (zG) {
            cqeVar = cqe.b(kxa.i(j));
        } else {
            cqeVar = new cqe(str);
            int iK = kxa.k(j);
            if (iK >= 0) {
                cqeVar.a = iK;
            }
        }
        qwd0 qwd0Var = this.e;
        rwa rwaVar = qwd0Var.f;
        HashMap<Object, wil> map = qwd0Var.d;
        HashMap<Object, eq40> map2 = qwd0Var.c;
        rwa rwaVar2 = qwd0Var.f;
        rwaVar.e0 = cqeVar;
        if (kxa.f(j)) {
            cqeVar2 = cqe.b(kxa.h(j));
        } else {
            cqeVar2 = new cqe(str);
            int iJ = kxa.j(j);
            if (iJ >= 0) {
                cqeVar2.a = iJ;
            }
        }
        rwaVar2.f0 = cqeVar2;
        cqe cqeVar3 = rwaVar2.e0;
        jxa jxaVar = this.a;
        cqeVar3.a(jxaVar, 0);
        rwaVar2.f0.a(jxaVar, 1);
        qwd0Var.l = j;
        qwd0Var.b = !(asrVar == asr.b);
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (swaVar.a(list)) {
            Iterator<Object> it = map2.keySet().iterator();
            while (it.hasNext()) {
                map2.get(it.next()).a().E();
            }
            map2.clear();
            map2.put((Object) 0, rwaVar2);
            map.clear();
            qwd0Var.e.clear();
            qwd0Var.h.clear();
            qwd0Var.j = true;
            swaVar.b(qwd0Var, list);
            lwa.a(qwd0Var, list);
            jxaVar.v0.clear();
            rwaVar2.e0.a(jxaVar, 0);
            rwaVar2.f0.a(jxaVar, 1);
            for (Object obj : map.keySet()) {
                yil yilVarS3 = map.get(obj).s();
                if (yilVarS3 != null) {
                    eq40 eq40VarB = map2.get(obj);
                    if (eq40VarB == null) {
                        eq40VarB = qwd0Var.b(obj);
                    }
                    eq40VarB.b(yilVarS3);
                }
            }
            for (Object obj2 : map2.keySet()) {
                eq40 eq40Var = map2.get(obj2);
                if (eq40Var != rwaVar2 && (eq40Var.c() instanceof wil) && (yilVarS2 = ((wil) eq40Var.c()).s()) != null) {
                    eq40 eq40VarB2 = map2.get(obj2);
                    if (eq40VarB2 == null) {
                        eq40VarB2 = qwd0Var.b(obj2);
                    }
                    eq40VarB2.b(yilVarS2);
                }
            }
            Iterator<Object> it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                eq40 eq40Var2 = map2.get(it2.next());
                if (eq40Var2 != rwaVar2) {
                    ixa ixaVarA = eq40Var2.a();
                    ixaVarA.l0 = eq40Var2.getKey().toString();
                    ixaVarA.W = null;
                    if (eq40Var2.c() instanceof sal) {
                        eq40Var2.apply();
                    }
                    jxaVar.W(ixaVarA);
                } else {
                    eq40Var2.b(jxaVar);
                }
            }
            Iterator<Object> it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                wil wilVar2 = map.get(it3.next());
                if (wilVar2.s() != null) {
                    ArrayList<Object> arrayList = wilVar2.m0;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        wilVar2.s().W(map2.get(obj3).a());
                    }
                    wilVar2.apply();
                } else {
                    wilVar2.apply();
                }
            }
            Iterator<Object> it4 = map2.keySet().iterator();
            while (it4.hasNext()) {
                eq40 eq40Var3 = map2.get(it4.next());
                if (eq40Var3 != rwaVar2 && (eq40Var3.c() instanceof wil) && (yilVarS = (wilVar = (wil) eq40Var3.c()).s()) != null) {
                    ArrayList<Object> arrayList2 = wilVar.m0;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj4 = arrayList2.get(i2);
                        i2++;
                        eq40 eq40Var4 = map2.get(obj4);
                        if (eq40Var4 != null) {
                            yilVarS.W(eq40Var4.a());
                        } else if (obj4 instanceof eq40) {
                            yilVarS.W(((eq40) obj4).a());
                        } else {
                            System.out.println("couldn't find reference for " + obj4);
                        }
                    }
                    eq40Var3.apply();
                }
            }
            for (Object obj5 : map2.keySet()) {
                eq40 eq40Var5 = map2.get(obj5);
                eq40Var5.apply();
                ixa ixaVarA2 = eq40Var5.a();
                if (ixaVarA2 != null && obj5 != null) {
                    ixaVarA2.k = obj5.toString();
                }
            }
        } else {
            lwa.a(qwd0Var, list);
        }
        jxaVar.T(kxa.i(j));
        jxaVar.O(kxa.h(j));
        jxaVar.w0.c(jxaVar);
        jxaVar.I0 = 257;
        ofs.q = jxaVar.d0(512);
        jxaVar.b0(jxaVar.I0, 0, 0, 0, 0, 0, 0);
        return kc6.a(jxaVar.s(), jxaVar.m());
    }

    public final long c(ixa ixaVar, long j) {
        int i;
        Object obj = ixaVar.i0;
        String str = ixaVar.k;
        int i2 = 0;
        if (!(ixaVar instanceof rfi0)) {
            if (obj instanceof vhv) {
                y yVarD0 = ((vhv) obj).d0(j);
                this.b.put((vhv) obj, yVarD0);
                return yvo.a(yVarD0.a, yVarD0.b);
            }
            Log.w("CCL", lTGEJfVytU.GmRZK + str);
            return yvo.a(0, 0);
        }
        if (kxa.g(j)) {
            i = 1073741824;
        } else {
            i = kxa.e(j) ? Integer.MIN_VALUE : 0;
        }
        if (kxa.f(j)) {
            i2 = 1073741824;
        } else if (kxa.d(j)) {
            i2 = Integer.MIN_VALUE;
        }
        rfi0 rfi0Var = (rfi0) ixaVar;
        rfi0Var.a0(i, kxa.i(j), i2, kxa.h(j));
        return yvo.a(rfi0Var.E0, rfi0Var.F0);
    }
}
