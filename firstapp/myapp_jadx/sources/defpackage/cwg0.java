package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes8.dex */
public final class cwg0<K, V> {
    public static final cwg0 e = new cwg0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final el9 c;
    public Object[] d;

    public cwg0(int i, int i2, Object[] objArr, el9 el9Var) {
        this.a = i;
        this.b = i2;
        this.c = el9Var;
        this.d = objArr;
    }

    public static cwg0 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, el9 el9Var) {
        if (i3 > 30) {
            return new cwg0(0, 0, new Object[]{obj, obj2, obj3, obj4}, el9Var);
        }
        int iA = fwm.a(i, i3);
        int iA2 = fwm.a(i2, i3);
        if (iA != iA2) {
            return new cwg0((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, el9Var);
        }
        return new cwg0(0, 1 << iA, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, el9Var)}, el9Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, el9 el9Var) {
        Object obj = this.d[i];
        cwg0 cwg0VarK = k(obj != null ? obj.hashCode() : 0, obj, v(i), i3, k, v, i4 + 5, el9Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = cwg0VarK;
        xx0.e(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        c cVarL = f.l(2, f.n(0, this.d.length));
        int i = cVarL.a;
        int i2 = cVarL.b;
        int i3 = cVarL.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!Intrinsics.g(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iA = 1 << fwm.a(i, i2);
        if (i(iA)) {
            return Intrinsics.g(obj, this.d[f(iA)]);
        }
        if (!j(iA)) {
            return false;
        }
        cwg0<K, V> cwg0VarS = s(t(iA));
        if (i2 == 30) {
            return cwg0VarS.c(obj) != -1;
        }
        return cwg0VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(cwg0<K, V> cwg0Var) {
        if (this == cwg0Var) {
            return true;
        }
        if (this.b == cwg0Var.b && this.a == cwg0Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == cwg0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[LOOP:2: B:44:0x00b9->B:48:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:51:0x00cf BREAK  A[LOOP:1: B:35:0x008e->B:42:0x00b4], SYNTHETIC] */
    public final <K1, V1> boolean g(cwg0<K1, V1> cwg0Var, Function2<? super V, ? super V1, Boolean> function2) {
        int i;
        int length;
        cwg0Var.getClass();
        function2.getClass();
        if (this == cwg0Var) {
            return true;
        }
        int i2 = this.a;
        if (i2 == cwg0Var.a && (i = this.b) == cwg0Var.b) {
            if (i2 == 0 && i == 0) {
                Object[] objArr = this.d;
                if (objArr.length == cwg0Var.d.length) {
                    Iterable iterableL = f.l(2, f.n(0, objArr.length));
                    if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
                        return true;
                    }
                    Iterator<Integer> it = iterableL.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((zvo) it).nextInt();
                        Object obj = cwg0Var.d[iNextInt];
                        V1 v1V = cwg0Var.v(iNextInt);
                        int iC = c(obj);
                        if (!(iC != -1 ? function2.invoke(v(iC), v1V).booleanValue() : false)) {
                        }
                    }
                    return true;
                }
            } else {
                int iBitCount = Integer.bitCount(i2) * 2;
                c cVarL = f.l(2, f.n(0, iBitCount));
                int i3 = cVarL.a;
                int i4 = cVarL.b;
                int i5 = cVarL.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    length = this.d.length;
                    while (iBitCount < length) {
                        if (!s(iBitCount).g(cwg0Var.s(iBitCount), function2)) {
                            break;
                        }
                        iBitCount++;
                    }
                    return true;
                }
                while (Intrinsics.g(this.d[i3], cwg0Var.d[i3]) && function2.invoke(v(i3), cwg0Var.v(i3)).booleanValue()) {
                    if (i3 == i4) {
                        length = this.d.length;
                        while (iBitCount < length) {
                            if (!s(iBitCount).g(cwg0Var.s(iBitCount), function2)) {
                                break;
                                break;
                            }
                            iBitCount++;
                        }
                        return true;
                    }
                    i3 += i5;
                }
            }
        }
        return false;
    }

    public final Object h(int i, int i2, Object obj) {
        int iA = 1 << fwm.a(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            if (Intrinsics.g(obj, this.d[iF])) {
                return v(iF);
            }
            return null;
        }
        if (!j(iA)) {
            return null;
        }
        cwg0<K, V> cwg0VarS = s(t(iA));
        if (i2 != 30) {
            return cwg0VarS.h(i, i2 + 5, obj);
        }
        int iC = cwg0VarS.c(obj);
        if (iC != -1) {
            return cwg0VarS.v(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final cwg0<K, V> l(int i, se00<K, V> se00Var) {
        se00Var.i(se00Var.f - 1);
        se00Var.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != se00Var.b) {
            return new cwg0<>(0, 0, fwm.c(i, objArr), se00Var.b);
        }
        this.d = fwm.c(i, objArr);
        return this;
    }

    public final cwg0<K, V> m(int i, K k, V v, int i2, se00<K, V> se00Var) {
        cwg0<K, V> cwg0VarM;
        int iA = 1 << fwm.a(i, i2);
        boolean zI = i(iA);
        el9 el9Var = this.c;
        if (zI) {
            int iF = f(iA);
            if (!Intrinsics.g(k, this.d[iF])) {
                se00Var.i(se00Var.f + 1);
                el9 el9Var2 = se00Var.b;
                if (el9Var != el9Var2) {
                    return new cwg0<>(this.a ^ iA, this.b | iA, a(iF, iA, i, k, v, i2, el9Var2), el9Var2);
                }
                this.d = a(iF, iA, i, k, v, i2, el9Var2);
                this.a ^= iA;
                this.b |= iA;
                return this;
            }
            se00Var.d = v(iF);
            if (v(iF) != v) {
                if (el9Var == se00Var.b) {
                    this.d[iF + 1] = v;
                    return this;
                }
                se00Var.e++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = v;
                return new cwg0<>(this.a, this.b, objArrCopyOf, se00Var.b);
            }
        } else {
            if (!j(iA)) {
                se00Var.i(se00Var.f + 1);
                el9 el9Var3 = se00Var.b;
                int iF2 = f(iA);
                Object[] objArr2 = this.d;
                if (el9Var != el9Var3) {
                    return new cwg0<>(this.a | iA, this.b, fwm.b(objArr2, iF2, k, v), el9Var3);
                }
                this.d = fwm.b(objArr2, iF2, k, v);
                this.a |= iA;
                return this;
            }
            int iT = t(iA);
            cwg0<K, V> cwg0VarS = s(iT);
            if (i2 == 30) {
                int iC = cwg0VarS.c(k);
                if (iC != -1) {
                    se00Var.d = cwg0VarS.v(iC);
                    if (cwg0VarS.c == se00Var.b) {
                        cwg0VarS.d[iC + 1] = v;
                        cwg0VarM = cwg0VarS;
                    } else {
                        se00Var.e++;
                        Object[] objArr3 = cwg0VarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        objArrCopyOf2[iC + 1] = v;
                        cwg0VarM = new cwg0<>(0, 0, objArrCopyOf2, se00Var.b);
                    }
                } else {
                    se00Var.i(se00Var.f + 1);
                    cwg0VarM = new cwg0<>(0, 0, fwm.b(cwg0VarS.d, 0, k, v), se00Var.b);
                }
            } else {
                cwg0VarM = cwg0VarS.m(i, k, v, i2 + 5, se00Var);
            }
            if (cwg0VarS != cwg0VarM) {
                return u(iT, iA, se00Var.b, cwg0VarM);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r5v14, types: [cwg0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [cwg0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [cwg0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [cwg0] */
    /* JADX WARN: Type inference failed for: r5v29, types: [cwg0] */
    public final cwg0<K, V> n(cwg0<K, V> cwg0Var, int i, jmd jmdVar, se00<K, V> se00Var) {
        cwg0<K, V> cwg0Var2;
        ?? r17;
        cwg0<K, V> cwg0VarM;
        cwg0Var.getClass();
        if (this == cwg0Var) {
            jmdVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            el9 el9Var = se00Var.b;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + cwg0Var.d.length);
            int length = this.d.length;
            c cVarL = f.l(2, f.n(0, cwg0Var.d.length));
            int i3 = cVarL.a;
            int i4 = cVarL.b;
            int i5 = cVarL.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(cwg0Var.d[i3]) != -1) {
                        jmdVar.a++;
                    } else {
                        Object[] objArr2 = cwg0Var.d;
                        objArrCopyOf[length] = objArr2[i3];
                        objArrCopyOf[length + 1] = objArr2[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != cwg0Var.d.length) {
                    return length == objArrCopyOf.length ? new cwg0<>(0, 0, objArrCopyOf, el9Var) : new cwg0<>(0, 0, Arrays.copyOf(objArrCopyOf, length), el9Var);
                }
            }
            return this;
        }
        int i6 = this.b | cwg0Var.b;
        int i7 = this.a;
        int i8 = cwg0Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (Intrinsics.g(this.d[f(iLowestOneBit)], cwg0Var.d[cwg0Var.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            ib5.a("Check failed.");
            return null;
        }
        if (Intrinsics.g(this.c, se00Var.b) && this.a == i11 && this.b == i6) {
            cwg0Var2 = this;
        } else {
            cwg0Var2 = new cwg0<>(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr3 = cwg0Var2.d;
            int length2 = (objArr3.length - 1) - i13;
            if (j(iLowestOneBit2)) {
                cwg0VarM = s(t(iLowestOneBit2));
                if (cwg0Var.j(iLowestOneBit2)) {
                    cwg0VarM = (cwg0<K, V>) cwg0VarM.n(cwg0Var.s(cwg0Var.t(iLowestOneBit2)), i + 5, jmdVar, se00Var);
                    r17 = objArr3;
                } else if (cwg0Var.i(iLowestOneBit2)) {
                    int iF = cwg0Var.f(iLowestOneBit2);
                    Object obj = cwg0Var.d[iF];
                    V v = cwg0Var.v(iF);
                    int i14 = se00Var.f;
                    r17 = objArr3;
                    cwg0VarM = (cwg0<K, V>) cwg0VarM.m(obj != null ? obj.hashCode() : i2, obj, v, i + 5, se00Var);
                    if (se00Var.f == i14) {
                        jmdVar.a++;
                    }
                } else {
                    r17 = objArr3;
                }
            } else {
                r17 = objArr3;
                if (cwg0Var.j(iLowestOneBit2)) {
                    cwg0<K, V> cwg0VarS = cwg0Var.s(cwg0Var.t(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (cwg0VarS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            jmdVar.a++;
                            cwg0VarM = cwg0VarS;
                        } else {
                            cwg0VarM = cwg0VarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(iF2), i15, se00Var);
                        }
                    } else {
                        cwg0VarM = cwg0VarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    V v2 = v(iF3);
                    int iF4 = cwg0Var.f(iLowestOneBit2);
                    Object obj4 = cwg0Var.d[iF4];
                    cwg0VarM = (cwg0<K, V>) k(obj3 != null ? obj3.hashCode() : 0, obj3, v2, obj4 != null ? obj4.hashCode() : 0, obj4, cwg0Var.v(iF4), i + 5, se00Var.b);
                }
            }
            r17[length2] = cwg0VarM;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (cwg0Var.i(iLowestOneBit3)) {
                int iF5 = cwg0Var.f(iLowestOneBit3);
                Object[] objArr4 = cwg0Var2.d;
                objArr4[i17] = cwg0Var.d[iF5];
                objArr4[i17 + 1] = cwg0Var.v(iF5);
                if (i(iLowestOneBit3)) {
                    jmdVar.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr5 = cwg0Var2.d;
                objArr5[i17] = this.d[iF6];
                objArr5[i17 + 1] = v(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(cwg0Var2)) {
            return cwg0Var.e(cwg0Var2) ? cwg0Var : cwg0Var2;
        }
        return this;
    }

    public final cwg0<K, V> o(int i, K k, int i2, se00<K, V> se00Var) {
        int iA = 1 << fwm.a(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            return Intrinsics.g(k, this.d[iF]) ? q(iF, iA, se00Var) : this;
        }
        if (!j(iA)) {
            return this;
        }
        int iT = t(iA);
        cwg0<K, V> cwg0VarS = s(iT);
        if (i2 == 30) {
            int iC = cwg0VarS.c(k);
            if (iC != -1) {
                cwg0VarS = cwg0VarS.l(iC, se00Var);
            }
        } else {
            cwg0VarS = cwg0VarS.o(i, k, i2 + 5, se00Var);
        }
        return r(iT, iA, se00Var.b, cwg0VarS);
    }

    public final cwg0<K, V> p(int i, K k, V v, int i2, se00<K, V> se00Var) {
        se00<K, V> se00Var2;
        int iA = 1 << fwm.a(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            return (Intrinsics.g(k, this.d[iF]) && Intrinsics.g(v, v(iF))) ? q(iF, iA, se00Var) : this;
        }
        if (!j(iA)) {
            return this;
        }
        int iT = t(iA);
        cwg0<K, V> cwg0VarS = s(iT);
        if (i2 == 30) {
            int iC = cwg0VarS.c(k);
            if (iC != -1 && Intrinsics.g(v, cwg0VarS.v(iC))) {
                cwg0VarS = cwg0VarS.l(iC, se00Var);
            }
            se00Var2 = se00Var;
        } else {
            se00Var2 = se00Var;
            cwg0VarS = cwg0VarS.p(i, k, v, i2 + 5, se00Var2);
        }
        return r(iT, iA, se00Var2.b, cwg0VarS);
    }

    public final cwg0<K, V> q(int i, int i2, se00<K, V> se00Var) {
        se00Var.i(se00Var.f - 1);
        se00Var.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != se00Var.b) {
            return new cwg0<>(i2 ^ this.a, this.b, fwm.c(i, objArr), se00Var.b);
        }
        this.d = fwm.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final cwg0 r(int i, int i2, el9 el9Var, cwg0 cwg0Var) {
        if (cwg0Var != null) {
            return u(i, i2, el9Var, cwg0Var);
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != el9Var) {
            Object[] objArr2 = new Object[objArr.length - 1];
            xx0.i(0, i, 6, objArr, objArr2);
            xx0.e(i, i + 1, objArr.length, objArr, objArr2);
            return new cwg0(this.a, this.b ^ i2, objArr2, el9Var);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        xx0.i(0, i, 6, objArr, objArr3);
        xx0.e(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final cwg0<K, V> s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (cwg0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final cwg0 u(int i, int i2, el9 el9Var, cwg0 cwg0Var) {
        Object[] objArr = cwg0Var.d;
        if (objArr.length != 2 || cwg0Var.b != 0) {
            Object[] objArr2 = this.d;
            if (this.c == el9Var) {
                objArr2[i] = cwg0Var;
                return this;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = cwg0Var;
            return new cwg0(this.a, this.b, objArrCopyOf, el9Var);
        }
        if (this.d.length == 1) {
            cwg0Var.a = this.b;
            return cwg0Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        xx0.e(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        xx0.e(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new cwg0(this.a ^ i2, this.b ^ i2, objArrCopyOf2, el9Var);
    }

    public final V v(int i) {
        return (V) this.d[i + 1];
    }
}
