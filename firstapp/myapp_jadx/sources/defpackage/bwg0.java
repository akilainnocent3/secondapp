package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class bwg0<K, V> {
    public static final bwg0 e = new bwg0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final yrw c;
    public Object[] d;

    public static final class a<K, V> {
        public bwg0<K, V> a;
        public final int b;

        public a(bwg0<K, V> bwg0Var, int i) {
            this.a = bwg0Var;
            this.b = i;
        }
    }

    public bwg0(int i, int i2, Object[] objArr, yrw yrwVar) {
        this.a = i;
        this.b = i2;
        this.c = yrwVar;
        this.d = objArr;
    }

    public static bwg0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, yrw yrwVar) {
        if (i3 > 30) {
            return new bwg0(0, 0, new Object[]{obj, obj2, obj3, obj4}, yrwVar);
        }
        int iA = jwg0.a(i, i3);
        int iA2 = jwg0.a(i2, i3);
        if (iA != iA2) {
            return new bwg0((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, yrwVar);
        }
        return new bwg0(0, 1 << iA, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, yrwVar)}, yrwVar);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, yrw yrwVar) {
        Object obj = this.d[i];
        bwg0 bwg0VarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i), i3, k, v, i4 + 5, yrwVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = bwg0VarJ;
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

    public final boolean c(K k) {
        c cVarL = f.l(2, f.n(0, this.d.length));
        int i = cVarL.a;
        int i2 = cVarL.b;
        int i3 = cVarL.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.g(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i, int i2, Object obj) {
        int iA = 1 << jwg0.a(i, i2);
        if (h(iA)) {
            return Intrinsics.g(obj, this.d[f(iA)]);
        }
        if (!i(iA)) {
            return false;
        }
        bwg0<K, V> bwg0VarS = s(t(iA));
        return i2 == 30 ? bwg0VarS.c(obj) : bwg0VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(bwg0<K, V> bwg0Var) {
        if (this == bwg0Var) {
            return true;
        }
        if (this.b == bwg0Var.b && this.a == bwg0Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == bwg0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iA = 1 << jwg0.a(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (Intrinsics.g(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iA)) {
            return null;
        }
        bwg0<K, V> bwg0VarS = s(t(iA));
        if (i2 != 30) {
            return bwg0VarS.g(i, i2 + 5, obj);
        }
        c cVarL = f.l(2, f.n(0, bwg0VarS.d.length));
        int i3 = cVarL.a;
        int i4 = cVarL.b;
        int i5 = cVarL.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.g(obj, bwg0VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return bwg0VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final bwg0<K, V> k(int i, te00<K, V> te00Var) {
        te00Var.h(te00Var.f - 1);
        te00Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != te00Var.b) {
            return new bwg0<>(0, 0, jwg0.c(i, objArr), te00Var.b);
        }
        this.d = jwg0.c(i, objArr);
        return this;
    }

    public final bwg0<K, V> l(int i, K k, V v, int i2, te00<K, V> te00Var) {
        te00<K, V> te00Var2;
        bwg0<K, V> bwg0VarL;
        int iA = 1 << jwg0.a(i, i2);
        boolean zH = h(iA);
        yrw yrwVar = this.c;
        if (zH) {
            int iF = f(iA);
            if (!Intrinsics.g(k, this.d[iF])) {
                te00Var.h(te00Var.f + 1);
                yrw yrwVar2 = te00Var.b;
                if (yrwVar != yrwVar2) {
                    return new bwg0<>(this.a ^ iA, this.b | iA, a(iF, iA, i, k, v, i2, yrwVar2), yrwVar2);
                }
                this.d = a(iF, iA, i, k, v, i2, yrwVar2);
                this.a ^= iA;
                this.b |= iA;
                return this;
            }
            te00Var.d = x(iF);
            if (x(iF) == v) {
                return this;
            }
            if (yrwVar == te00Var.b) {
                this.d[iF + 1] = v;
                return this;
            }
            te00Var.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = v;
            return new bwg0<>(this.a, this.b, objArrCopyOf, te00Var.b);
        }
        if (!i(iA)) {
            te00Var.h(te00Var.f + 1);
            yrw yrwVar3 = te00Var.b;
            int iF2 = f(iA);
            Object[] objArr2 = this.d;
            if (yrwVar != yrwVar3) {
                return new bwg0<>(this.a | iA, this.b, jwg0.b(objArr2, iF2, k, v), yrwVar3);
            }
            this.d = jwg0.b(objArr2, iF2, k, v);
            this.a |= iA;
            return this;
        }
        int iT = t(iA);
        bwg0<K, V> bwg0VarS = s(iT);
        if (i2 == 30) {
            c cVarL = f.l(2, f.n(0, bwg0VarS.d.length));
            int i3 = cVarL.a;
            int i4 = cVarL.b;
            int i5 = cVarL.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.g(k, bwg0VarS.d[i3])) {
                        if (i3 == i4) {
                            te00Var.h(te00Var.f + 1);
                            bwg0VarL = new bwg0<>(0, 0, jwg0.b(bwg0VarS.d, 0, k, v), te00Var.b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        te00Var.d = bwg0VarS.x(i3);
                        if (bwg0VarS.c != te00Var.b) {
                            te00Var.e++;
                            Object[] objArr3 = bwg0VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = v;
                            bwg0VarL = new bwg0<>(0, 0, objArrCopyOf2, te00Var.b);
                            break;
                        }
                        bwg0VarS.d[i3 + 1] = v;
                        bwg0VarL = bwg0VarS;
                        break;
                    }
                }
            } else {
                te00Var.h(te00Var.f + 1);
                bwg0VarL = new bwg0<>(0, 0, jwg0.b(bwg0VarS.d, 0, k, v), te00Var.b);
                break;
            }
            te00Var2 = te00Var;
        } else {
            te00Var2 = te00Var;
            bwg0VarL = bwg0VarS.l(i, k, v, i2 + 5, te00Var2);
        }
        return bwg0VarS == bwg0VarL ? this : r(iT, bwg0VarL, te00Var2.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [bwg0, bwg0<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [bwg0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [bwg0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [bwg0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [bwg0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [bwg0] */
    /* JADX WARN: Type inference failed for: r5v29, types: [bwg0] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type bwg0<K, V> to ?? for r27v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final defpackage.bwg0<K, V> m(defpackage.bwg0<K, V> r28, int r29, defpackage.kmd r30, defpackage.te00<K, V> r31) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg0.m(bwg0, int, kmd, te00):bwg0");
    }

    public final bwg0<K, V> n(int i, K k, int i2, te00<K, V> te00Var) {
        bwg0<K, V> bwg0VarN;
        int iA = 1 << jwg0.a(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (Intrinsics.g(k, this.d[iF])) {
                return p(iF, iA, te00Var);
            }
        } else if (i(iA)) {
            int iT = t(iA);
            bwg0<K, V> bwg0VarS = s(iT);
            if (i2 == 30) {
                c cVarL = f.l(2, f.n(0, bwg0VarS.d.length));
                int i3 = cVarL.a;
                int i4 = cVarL.b;
                int i5 = cVarL.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.g(k, bwg0VarS.d[i3])) {
                            if (i3 == i4) {
                                bwg0VarN = bwg0VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            bwg0VarN = bwg0VarS.k(i3, te00Var);
                            break;
                        }
                    }
                } else {
                    bwg0VarN = bwg0VarS;
                    break;
                }
            } else {
                bwg0VarN = bwg0VarS.n(i, k, i2 + 5, te00Var);
            }
            return q(bwg0VarS, bwg0VarN, iT, iA, te00Var.b);
        }
        return this;
    }

    public final bwg0<K, V> o(int i, K k, V v, int i2, te00<K, V> te00Var) {
        te00<K, V> te00Var2;
        bwg0<K, V> bwg0VarO;
        int iA = 1 << jwg0.a(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            return (Intrinsics.g(k, this.d[iF]) && Intrinsics.g(v, x(iF))) ? p(iF, iA, te00Var) : this;
        }
        if (!i(iA)) {
            return this;
        }
        int iT = t(iA);
        bwg0<K, V> bwg0VarS = s(iT);
        if (i2 == 30) {
            c cVarL = f.l(2, f.n(0, bwg0VarS.d.length));
            int i3 = cVarL.a;
            int i4 = cVarL.b;
            int i5 = cVarL.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.g(k, bwg0VarS.d[i3]) || !Intrinsics.g(v, bwg0VarS.x(i3))) {
                        if (i3 == i4) {
                            bwg0VarO = bwg0VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        bwg0VarO = bwg0VarS.k(i3, te00Var);
                        break;
                    }
                }
            } else {
                bwg0VarO = bwg0VarS;
                break;
            }
            te00Var2 = te00Var;
        } else {
            te00Var2 = te00Var;
            bwg0VarO = bwg0VarS.o(i, k, v, i2 + 5, te00Var2);
        }
        return q(bwg0VarS, bwg0VarO, iT, iA, te00Var2.b);
    }

    public final bwg0<K, V> p(int i, int i2, te00<K, V> te00Var) {
        te00Var.h(te00Var.f - 1);
        te00Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != te00Var.b) {
            return new bwg0<>(i2 ^ this.a, this.b, jwg0.c(i, objArr), te00Var.b);
        }
        this.d = jwg0.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final bwg0<K, V> q(bwg0<K, V> bwg0Var, bwg0<K, V> bwg0Var2, int i, int i2, yrw yrwVar) {
        yrw yrwVar2 = this.c;
        if (bwg0Var2 != null) {
            return (yrwVar2 == yrwVar || bwg0Var != bwg0Var2) ? r(i, bwg0Var2, yrwVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (yrwVar2 != yrwVar) {
            return new bwg0<>(this.a, this.b ^ i2, jwg0.d(i, objArr), yrwVar);
        }
        this.d = jwg0.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final bwg0<K, V> r(int i, bwg0<K, V> bwg0Var, yrw yrwVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && bwg0Var.d.length == 2 && bwg0Var.b == 0) {
            bwg0Var.a = this.b;
            return bwg0Var;
        }
        if (this.c == yrwVar) {
            objArr[i] = bwg0Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = bwg0Var;
        return new bwg0<>(this.a, this.b, objArrCopyOf, yrwVar);
    }

    public final bwg0<K, V> s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (bwg0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.a = w(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bwg0.a u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg0.u(java.lang.Object, int, int, java.lang.Object):bwg0$a");
    }

    public final bwg0 v(int i, int i2, Object obj) {
        bwg0<K, V> bwg0VarV;
        int iA = 1 << jwg0.a(i, i2);
        if (h(iA)) {
            int iF = f(iA);
            if (!Intrinsics.g(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new bwg0(this.a ^ iA, this.b, jwg0.c(iF, objArr), null);
            }
        } else {
            if (!i(iA)) {
                return this;
            }
            int iT = t(iA);
            bwg0<K, V> bwg0VarS = s(iT);
            if (i2 == 30) {
                c cVarL = f.l(2, f.n(0, bwg0VarS.d.length));
                int i3 = cVarL.a;
                int i4 = cVarL.b;
                int i5 = cVarL.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.g(obj, bwg0VarS.d[i3])) {
                            if (i3 == i4) {
                                bwg0VarV = bwg0VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = bwg0VarS.d;
                            if (objArr2.length != 2) {
                                bwg0VarV = new bwg0<>(0, 0, jwg0.c(i3, objArr2), null);
                                break;
                            }
                            bwg0VarV = null;
                            break;
                        }
                    }
                } else {
                    bwg0VarV = bwg0VarS;
                    break;
                }
            } else {
                bwg0VarV = bwg0VarS.v(i, i2 + 5, obj);
            }
            if (bwg0VarV != null) {
                return bwg0VarS != bwg0VarV ? w(iT, iA, bwg0VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new bwg0(this.a, this.b ^ iA, jwg0.d(iT, objArr3), null);
            }
        }
        return null;
    }

    public final bwg0<K, V> w(int i, int i2, bwg0<K, V> bwg0Var) {
        Object[] objArr = bwg0Var.d;
        if (objArr.length != 2 || bwg0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = bwg0Var;
            return new bwg0<>(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            bwg0Var.a = this.b;
            return bwg0Var;
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
        return new bwg0<>(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
