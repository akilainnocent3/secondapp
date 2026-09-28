package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class ue00<K, V, T> extends qe00<K, V, T> {
    public final se00<K, V> d;
    public K e;
    public boolean f;
    public int i;

    public ue00(se00<K, V> se00Var, dwg0<K, V, T>[] dwg0VarArr) {
        super(se00Var.c, dwg0VarArr);
        this.d = se00Var;
        this.i = se00Var.e;
    }

    public final void d(int i, cwg0<?, ?> cwg0Var, K k, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2 * 5;
        dwg0<K, V, T>[] dwg0VarArr = this.a;
        if (i5 <= 30) {
            int iA = 1 << fwm.a(i, i5);
            if (!cwg0Var.i(iA)) {
                int iT = cwg0Var.t(iA);
                cwg0<?, ?> cwg0VarS = cwg0Var.s(iT);
                dwg0<K, V, T> dwg0Var = dwg0VarArr[i2];
                Object[] objArr = cwg0Var.d;
                int iBitCount = Integer.bitCount(cwg0Var.a) * 2;
                dwg0Var.getClass();
                objArr.getClass();
                dwg0Var.a = objArr;
                dwg0Var.b = iBitCount;
                dwg0Var.c = iT;
                d(i, cwg0VarS, k, i2 + 1, i3, z);
                return;
            }
            int iF = cwg0Var.f(iA);
            if (iA == (z ? 1 << fwm.a(i3, i5) : 0) && i2 < (i4 = this.b)) {
                dwg0<K, V, T> dwg0Var2 = dwg0VarArr[i4];
                Object[] objArr2 = cwg0Var.d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                dwg0Var2.getClass();
                dwg0Var2.a = objArr3;
                dwg0Var2.b = 2;
                dwg0Var2.c = 0;
                return;
            }
            dwg0<K, V, T> dwg0Var3 = dwg0VarArr[i2];
            Object[] objArr4 = cwg0Var.d;
            int iBitCount2 = Integer.bitCount(cwg0Var.a) * 2;
            dwg0Var3.getClass();
            objArr4.getClass();
            dwg0Var3.a = objArr4;
            dwg0Var3.b = iBitCount2;
            dwg0Var3.c = iF;
            this.b = i2;
            return;
        }
        dwg0<K, V, T> dwg0Var4 = dwg0VarArr[i2];
        Object[] objArr5 = cwg0Var.d;
        int length = objArr5.length;
        dwg0Var4.getClass();
        dwg0Var4.a = objArr5;
        dwg0Var4.b = length;
        dwg0Var4.c = 0;
        while (true) {
            dwg0<K, V, T> dwg0Var5 = dwg0VarArr[i2];
            if (Intrinsics.g(dwg0Var5.a[dwg0Var5.c], k)) {
                this.b = i2;
                return;
            } else {
                dwg0VarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.qe00, java.util.Iterator
    public final T next() {
        if (this.d.e != this.i) {
            sx0.a();
            return null;
        }
        if (!this.c) {
            lrh0.a();
            return null;
        }
        dwg0<K, V, T> dwg0Var = this.a[this.b];
        this.e = (K) dwg0Var.a[dwg0Var.c];
        this.f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qe00, java.util.Iterator
    public final void remove() {
        ue00 ue00Var;
        if (!this.f) {
            fm20.a();
            return;
        }
        boolean z = this.c;
        se00<K, V> se00Var = this.d;
        if (!z) {
            ue00 ue00Var2 = this;
            y8h0.c(se00Var).remove(ue00Var2.e);
            ue00Var = ue00Var2;
        } else {
            if (!z) {
                lrh0.a();
                return;
            }
            dwg0<K, V, T> dwg0Var = this.a[this.b];
            Object obj = dwg0Var.a[dwg0Var.c];
            y8h0.c(se00Var).remove(this.e);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            cwg0<K, V> cwg0Var = se00Var.c;
            K k = this.e;
            ue00 ue00Var3 = this;
            ue00Var3.d(iHashCode, cwg0Var, obj, 0, k != null ? k.hashCode() : 0, true);
            ue00Var = ue00Var3;
        }
        ue00Var.e = null;
        ue00Var.f = false;
        ue00Var.i = se00Var.e;
    }
}
