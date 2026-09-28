package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class i8i implements f8i.a {
    public final k70 a;
    public final m70 b;
    public final y9h0 c;
    public final r8i d;
    public final aj10 e;
    public final t6d f;

    public i8i(k70 k70Var, m70 m70Var) {
        y9h0 y9h0Var = j8i.a;
        r8i r8iVar = new r8i(j8i.b);
        aj10 aj10Var = new aj10();
        this.a = k70Var;
        this.b = m70Var;
        this.c = y9h0Var;
        this.d = r8iVar;
        this.e = aj10Var;
        this.f = new t6d(this, 1);
    }

    @Override // f8i.a
    public final z9h0 b(f8i f8iVar, t9i t9iVar, int i, int i2) {
        int i3 = uj10.a;
        int i4 = this.b.b;
        return c(new w9h0(f8iVar, (i4 == 0 || i4 == Integer.MAX_VALUE) ? t9iVar : new t9i(f.e(t9iVar.a + i4, 1, 1000)), i, i2, null));
    }

    public final z9h0 c(final w9h0 w9h0Var) {
        final y9h0 y9h0Var = this.c;
        Function1 function1 = new Function1() { // from class: h8i
            /* JADX WARN: Code duplicated, block: B:239:0x03e5  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                Object aVar;
                Object objInvoke;
                z01.a aVarB;
                Object bVar;
                Typeface typefaceA;
                i8i i8iVar = this.a;
                w9h0 w9h0Var2 = w9h0Var;
                Function1 function2 = (Function1) obj;
                r8i r8iVar = i8iVar.d;
                k70 k70Var = i8iVar.a;
                t6d t6dVar = i8iVar.f;
                f8i f8iVar = w9h0Var2.a;
                if (f8iVar instanceof p8i) {
                    List<z7i> list = ((p8i) f8iVar).f;
                    t9i t9iVar = w9h0Var2.b;
                    int i = w9h0Var2.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        z7i z7iVar = list.get(i2);
                        z7i z7iVar2 = z7iVar;
                        if (Intrinsics.g(z7iVar2.b(), t9iVar) && z7iVar2.c() == i) {
                            arrayList.add(z7iVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            z7i z7iVar3 = list.get(i3);
                            if (z7iVar3.c() == i) {
                                arrayList2.add(z7iVar3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        int iCompareTo = t9iVar.compareTo(t9i.e);
                        int i4 = t9iVar.a;
                        if (iCompareTo < 0) {
                            int size3 = list.size();
                            t9i t9iVar2 = null;
                            t9i t9iVar3 = null;
                            for (int i5 = 0; i5 < size3; i5++) {
                                t9i t9iVarB = list.get(i5).b();
                                int i6 = t9iVarB.a;
                                if (Intrinsics.h(i6, i4) >= 0) {
                                    if (Intrinsics.h(i6, i4) <= 0) {
                                        t9iVar2 = t9iVarB;
                                        t9iVar3 = t9iVar2;
                                        break;
                                    }
                                    if (t9iVar3 == null || Intrinsics.h(i6, t9iVar3.a) < 0) {
                                        t9iVar3 = t9iVarB;
                                    }
                                } else if (t9iVar2 == null || Intrinsics.h(i6, t9iVar2.a) > 0) {
                                    t9iVar2 = t9iVarB;
                                }
                            }
                            if (t9iVar2 == null) {
                                t9iVar2 = t9iVar3;
                            }
                            arrayList = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                z7i z7iVar4 = list.get(i7);
                                if (Intrinsics.g(z7iVar4.b(), t9iVar2)) {
                                    arrayList.add(z7iVar4);
                                }
                            }
                        } else {
                            t9i t9iVar4 = t9i.f;
                            if (t9iVar.compareTo(t9iVar4) > 0) {
                                int size5 = list.size();
                                t9i t9iVar5 = null;
                                t9i t9iVar6 = null;
                                for (int i8 = 0; i8 < size5; i8++) {
                                    t9i t9iVarB2 = list.get(i8).b();
                                    int i9 = t9iVarB2.a;
                                    if (Intrinsics.h(i9, i4) >= 0) {
                                        if (Intrinsics.h(i9, i4) <= 0) {
                                            t9iVar5 = t9iVarB2;
                                            t9iVar6 = t9iVar5;
                                            break;
                                        }
                                        if (t9iVar6 == null || Intrinsics.h(i9, t9iVar6.a) < 0) {
                                            t9iVar6 = t9iVarB2;
                                        }
                                    } else if (t9iVar5 == null || Intrinsics.h(i9, t9iVar5.a) > 0) {
                                        t9iVar5 = t9iVarB2;
                                    }
                                }
                                if (t9iVar6 != null) {
                                    t9iVar5 = t9iVar6;
                                }
                                arrayList = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    z7i z7iVar5 = list.get(i10);
                                    if (Intrinsics.g(z7iVar5.b(), t9iVar5)) {
                                        arrayList.add(z7iVar5);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                t9i t9iVar7 = null;
                                t9i t9iVar8 = null;
                                for (int i11 = 0; i11 < size7; i11++) {
                                    t9i t9iVarB3 = list.get(i11).b();
                                    if (Intrinsics.h(t9iVarB3.a, t9iVar4.a) <= 0) {
                                        int i12 = t9iVarB3.a;
                                        if (Intrinsics.h(i12, i4) >= 0) {
                                            if (Intrinsics.h(i12, i4) <= 0) {
                                                t9iVar7 = t9iVarB3;
                                                t9iVar8 = t9iVar7;
                                                break;
                                            }
                                            if (t9iVar8 == null || Intrinsics.h(i12, t9iVar8.a) < 0) {
                                                t9iVar8 = t9iVarB3;
                                            }
                                        } else if (t9iVar7 == null || Intrinsics.h(i12, t9iVar7.a) > 0) {
                                            t9iVar7 = t9iVarB3;
                                        }
                                    }
                                }
                                if (t9iVar8 != null) {
                                    t9iVar7 = t9iVar8;
                                }
                                ArrayList arrayList3 = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i13 = 0; i13 < size8; i13++) {
                                    z7i z7iVar6 = list.get(i13);
                                    if (Intrinsics.g(z7iVar6.b(), t9iVar7)) {
                                        arrayList3.add(z7iVar6);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    t9i t9iVar9 = t9i.f;
                                    int size9 = list.size();
                                    t9i t9iVar10 = null;
                                    t9i t9iVar11 = null;
                                    for (int i14 = 0; i14 < size9; i14++) {
                                        t9i t9iVarB4 = list.get(i14).b();
                                        if (t9iVar9 == null || Intrinsics.h(t9iVarB4.a, t9iVar9.a) >= 0) {
                                            int i15 = t9iVarB4.a;
                                            if (Intrinsics.h(i15, i4) >= 0) {
                                                if (Intrinsics.h(i15, i4) <= 0) {
                                                    t9iVar10 = t9iVarB4;
                                                    t9iVar11 = t9iVar10;
                                                    break;
                                                }
                                                if (t9iVar11 == null || Intrinsics.h(i15, t9iVar11.a) < 0) {
                                                    t9iVar11 = t9iVarB4;
                                                }
                                            } else if (t9iVar10 == null || Intrinsics.h(i15, t9iVar10.a) > 0) {
                                                t9iVar10 = t9iVarB4;
                                            }
                                        }
                                    }
                                    if (t9iVar11 != null) {
                                        t9iVar10 = t9iVar11;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i16 = 0; i16 < size10; i16++) {
                                        z7i z7iVar7 = list.get(i16);
                                        if (Intrinsics.g(z7iVar7.b(), t9iVar10)) {
                                            arrayList.add(z7iVar7);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    }
                    z01 z01Var = r8iVar.a;
                    int size11 = arrayList.size();
                    ArrayList arrayListL = null;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size11) {
                            pair = new Pair(arrayListL, t6dVar.invoke(w9h0Var2));
                            break;
                        }
                        z7i z7iVar8 = (z7i) arrayList.get(i17);
                        int iA = z7iVar8.a();
                        if (iA == 0) {
                            synchronized (z01Var.c) {
                                try {
                                    z01.b bVar2 = new z01.b(z7iVar8, null);
                                    z01.a aVarB2 = z01Var.a.b(bVar2);
                                    if (aVarB2 == null) {
                                        aVarB2 = z01Var.b.d(bVar2);
                                    }
                                    if (aVarB2 != null) {
                                        objInvoke = aVarB2.a;
                                    } else {
                                        Unit unit = Unit.a;
                                        try {
                                            objInvoke = k70Var.b(z7iVar8);
                                        } catch (Exception unused) {
                                            objInvoke = t6dVar.invoke(w9h0Var2);
                                        }
                                        z01.a(z01Var, z7iVar8, k70Var, objInvoke);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (objInvoke == null) {
                                objInvoke = t6dVar.invoke(w9h0Var2);
                            }
                            pair = new Pair(arrayListL, p9i.a(w9h0Var2.d, objInvoke, z7iVar8, w9h0Var2.b, w9h0Var2.c));
                            break;
                        }
                        if (iA == 1) {
                            synchronized (z01Var.c) {
                                try {
                                    z01.b bVar3 = new z01.b(z7iVar8, null);
                                    z01.a aVarB3 = z01Var.a.b(bVar3);
                                    if (aVarB3 == null) {
                                        aVarB3 = z01Var.b.d(bVar3);
                                    }
                                    if (aVarB3 != null) {
                                        bVar = aVarB3.a;
                                    } else {
                                        Unit unit2 = Unit.a;
                                        try {
                                            zi50.a aVar2 = zi50.b;
                                            bVar = k70Var.b(z7iVar8);
                                        } catch (Throwable th2) {
                                            zi50.a aVar3 = zi50.b;
                                            bVar = new zi50.b(th2);
                                        }
                                        if (bVar instanceof zi50.b) {
                                            bVar = null;
                                        }
                                        z01.a(z01Var, z7iVar8, k70Var, bVar);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (bVar != null) {
                                pair = new Pair(arrayListL, p9i.a(w9h0Var2.d, bVar, z7iVar8, w9h0Var2.b, w9h0Var2.c));
                                break;
                            }
                            i17++;
                        } else {
                            if (iA != 2) {
                                rcp.a(z7iVar8, "Unknown font type ");
                                return null;
                            }
                            z01Var.getClass();
                            z01.b bVar4 = new z01.b(z7iVar8, null);
                            synchronized (z01Var.c) {
                                aVarB = z01Var.a.b(bVar4);
                                if (aVarB == null) {
                                    aVarB = z01Var.b.d(bVar4);
                                }
                            }
                            if (aVarB != null) {
                                Object obj2 = aVarB.a;
                                if (obj2 != null) {
                                    pair = new Pair(arrayListL, p9i.a(w9h0Var2.d, obj2, z7iVar8, w9h0Var2.b, w9h0Var2.c));
                                    break;
                                }
                            } else if (arrayListL == null) {
                                arrayListL = b.l(z7iVar8);
                            } else {
                                arrayListL.add(z7iVar8);
                            }
                            i17++;
                        }
                    }
                    List list2 = (List) pair.a;
                    B b = pair.b;
                    if (list2 == null) {
                        aVar = new z9h0.b(b, true);
                    } else {
                        vz0 vz0Var = new vz0(list2, b, w9h0Var2, r8iVar.a, function2, k70Var);
                        ej5.c(r8iVar.b, null, a6b.d, new q8i(vz0Var, null), 1);
                        aVar = new z9h0.a(vz0Var);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    xk10 xk10Var = i8iVar.e.a;
                    f8i f8iVar2 = w9h0Var2.a;
                    int i18 = w9h0Var2.c;
                    t9i t9iVar12 = w9h0Var2.b;
                    if (f8iVar2 == null || (f8iVar2 instanceof qcd)) {
                        typefaceA = xk10Var.a(t9iVar12, i18);
                    } else if (f8iVar2 instanceof v1k) {
                        typefaceA = xk10Var.b((v1k) f8iVar2, t9iVar12, i18);
                    } else {
                        if (f8iVar2 instanceof mxs) {
                            typefaceA = ((mxs) f8iVar2).f.a;
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                            ib5.a("Could not load font");
                            return null;
                        }
                    }
                    aVar = new z9h0.b(typefaceA, true);
                    if (aVar == null) {
                        ib5.a("Could not load font");
                        return null;
                    }
                }
                return aVar;
            }
        };
        synchronized (y9h0Var.a) {
            z9h0 z9h0VarB = y9h0Var.b.b(w9h0Var);
            if (z9h0VarB != null) {
                if (z9h0VarB.i()) {
                    return z9h0VarB;
                }
                y9h0Var.b.d(w9h0Var);
            }
            try {
                z9h0 z9h0Var = (z9h0) function1.invoke(new Function1() { // from class: x9h0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        y9h0 y9h0Var2 = y9h0Var;
                        w9h0 w9h0Var2 = w9h0Var;
                        z9h0 z9h0Var2 = (z9h0) obj;
                        synchronized (y9h0Var2.a) {
                            try {
                                boolean zI = z9h0Var2.i();
                                s4u<w9h0, z9h0> s4uVar = y9h0Var2.b;
                                if (zI) {
                                    s4uVar.c(w9h0Var2, z9h0Var2);
                                } else {
                                    s4uVar.d(w9h0Var2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return Unit.a;
                    }
                });
                synchronized (y9h0Var.a) {
                    try {
                        if (y9h0Var.b.b(w9h0Var) == null && z9h0Var.i()) {
                            y9h0Var.b.c(w9h0Var, z9h0Var);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return z9h0Var;
            } catch (Exception e) {
                rzk.b("Could not load font", e);
                return null;
            }
        }
    }
}
