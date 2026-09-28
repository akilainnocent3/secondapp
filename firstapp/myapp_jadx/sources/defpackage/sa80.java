package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sa80 implements pb80, Iterable<Map.Entry<? extends ob80<?>, ? extends Object>>, dhp {
    public final rtw<ob80<?>, Object> a = fz60.b();
    public you b;
    public boolean c;
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pb80
    public final <T> void b(ob80<T> ob80Var, T t) {
        boolean z = t instanceof c6;
        rtw<ob80<?>, Object> rtwVar = this.a;
        if (z && rtwVar.b(ob80Var)) {
            Object objD = rtwVar.d(ob80Var);
            objD.getClass();
            c6 c6Var = (c6) objD;
            c6 c6Var2 = (c6) t;
            String str = c6Var2.a;
            if (str == null) {
                str = c6Var.a;
            }
            haj hajVar = c6Var2.b;
            if (hajVar == null) {
                hajVar = c6Var.b;
            }
            rtwVar.m(ob80Var, new c6(str, hajVar));
        } else {
            rtwVar.m(ob80Var, t);
        }
        ob80Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final sa80 c() {
        sa80 sa80Var = new sa80();
        sa80Var.c = this.c;
        sa80Var.d = this.d;
        rtw<ob80<?>, Object> rtwVar = sa80Var.a;
        rtwVar.getClass();
        rtw<ob80<?>, Object> rtwVar2 = this.a;
        rtwVar2.getClass();
        Object[] objArr = rtwVar2.b;
        Object[] objArr2 = rtwVar2.c;
        long[] jArr = rtwVar2.a;
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
                            int i4 = (i << 3) + i3;
                            rtwVar.m((ob80<?>) objArr[i4], objArr2[i4]);
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
        return sa80Var;
    }

    public final <T> T d(ob80<T> ob80Var) {
        T t = (T) this.a.d(ob80Var);
        if (t != null) {
            return t;
        }
        lx5.b(ob80Var, "Key not present: ", " - consider getOrElse or getOrNull");
        return null;
    }

    public final <T> T e(ob80<T> ob80Var, Function0<? extends T> function0) {
        T t = (T) this.a.d(ob80Var);
        return t == null ? function0.invoke() : t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa80)) {
            return false;
        }
        sa80 sa80Var = (sa80) obj;
        return Intrinsics.g(this.a, sa80Var.a) && this.c == sa80Var.c && this.d == sa80Var.d;
    }

    public final void f(sa80 sa80Var) {
        rtw<ob80<?>, Object> rtwVar = sa80Var.a;
        Object[] objArr = rtwVar.b;
        Object[] objArr2 = rtwVar.c;
        long[] jArr = rtwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ob80<?> ob80Var = (ob80) obj;
                        rtw<ob80<?>, Object> rtwVar2 = this.a;
                        Object objD = rtwVar2.d(ob80Var);
                        ob80Var.getClass();
                        Object objInvoke = ob80Var.b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            rtwVar2.m(ob80Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends ob80<?>, ? extends Object>> iterator() {
        you youVar = this.b;
        if (youVar == null) {
            rtw<ob80<?>, Object> rtwVar = this.a;
            rtwVar.getClass();
            you youVar2 = new you(rtwVar);
            this.b = youVar2;
            youVar = youVar2;
        }
        return ((hag) youVar.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        rtw<ob80<?>, Object> rtwVar = this.a;
        Object[] objArr = rtwVar.b;
        Object[] objArr2 = rtwVar.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((ob80) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return sgp.b(this) + "{ " + ((Object) sb) + " }";
    }
}
