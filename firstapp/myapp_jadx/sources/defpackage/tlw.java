package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class tlw<K, V> {
    public final rtw<Object, Object> a;

    public /* synthetic */ tlw(rtw rtwVar) {
        this.a = rtwVar;
    }

    public static final void a(rtw<Object, Object> rtwVar, K k, V v) {
        int i = rtwVar.i(k);
        boolean z = i < 0;
        Object obj = z ? null : rtwVar.c[i];
        if (obj != null) {
            if (obj instanceof etw) {
                etw etwVar = (etw) obj;
                etwVar.g(v);
                v = (V) etwVar;
            } else {
                Object[] objArr = dcy.a;
                etw etwVar2 = new etw(2);
                etwVar2.g(obj);
                etwVar2.g(v);
                v = (V) etwVar2;
            }
        }
        if (!z) {
            rtwVar.c[i] = v;
            return;
        }
        int i2 = ~i;
        rtwVar.b[i2] = k;
        rtwVar.c[i2] = v;
    }

    public static rtw b() {
        return new rtw((Object) null);
    }

    public static final Object c(rtw rtwVar, w6w w6wVar) {
        Object objD = rtwVar.d(w6wVar);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof etw)) {
            rtwVar.k(w6wVar);
            return objD;
        }
        etw etwVar = (etw) objD;
        if (etwVar.d()) {
            ibh0.a("List is empty.");
            return null;
        }
        int i = etwVar.b - 1;
        E eB = etwVar.b(i);
        etwVar.k(i);
        eB.getClass();
        if (etwVar.d()) {
            rtwVar.k(w6wVar);
        }
        if (etwVar.b == 1) {
            rtwVar.m(w6wVar, etwVar.a());
        }
        return eB;
    }

    public static final void d(rtw rtwVar, w6w w6wVar, Function1 function1) {
        Object objD = rtwVar.d(w6wVar);
        if (objD != null) {
            if (!(objD instanceof etw)) {
                if (((Boolean) function1.invoke(objD)).booleanValue()) {
                    rtwVar.k(w6wVar);
                    return;
                }
                return;
            }
            etw etwVar = (etw) objD;
            int i = etwVar.b;
            Object[] objArr = etwVar.a;
            int i2 = 0;
            IntRange intRangeN = f.n(0, i);
            int i3 = intRangeN.a;
            int i4 = intRangeN.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            xx0.l(i - i2, i, null, objArr);
            etwVar.b -= i2;
            if (etwVar.d()) {
                rtwVar.k(w6wVar);
            }
            if (etwVar.b == 0) {
                rtwVar.m(w6wVar, etwVar.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[LOOP:0: B:9:0x001d->B:28:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[EDGE_INSN: B:31:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:9:0x001d->B:28:0x0082], SYNTHETIC] */
    public static final etw e(rtw rtwVar) {
        if (rtwVar.e()) {
            etw etwVar = dcy.b;
            etwVar.getClass();
            return etwVar;
        }
        etw etwVar2 = new etw((Object) null);
        Object[] objArr = rtwVar.c;
        long[] jArr = rtwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof etw) {
                                etw etwVar3 = (etw) obj;
                                if (!etwVar3.d()) {
                                    int i4 = etwVar2.b + etwVar3.b;
                                    Object[] objArr2 = etwVar2.a;
                                    if (objArr2.length < i4) {
                                        etwVar2.m(i4, objArr2);
                                    }
                                    xx0.e(etwVar2.b, 0, etwVar3.b, etwVar3.a, etwVar2.a);
                                    etwVar2.b += etwVar3.b;
                                }
                            } else {
                                obj.getClass();
                                etwVar2.g(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return etwVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tlw) {
            return this.a.equals(((tlw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
