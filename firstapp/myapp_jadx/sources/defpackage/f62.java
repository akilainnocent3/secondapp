package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f62 implements oyg {
    public final jjg0 a;
    public final int b;
    public final int[] c;
    public final a[] d;
    public final long[] e;
    public int f;

    public f62(jjg0 jjg0Var, int[] iArr) {
        a[] aVarArr;
        int i = 0;
        ly0.f(iArr.length > 0);
        jjg0Var.getClass();
        this.a = jjg0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new a[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            aVarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            aVarArr[i2] = jjg0Var.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(aVarArr, new e62());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = jjg0Var.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.oyg
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.pjg0
    public final a e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f62 f62Var = (f62) obj;
            if (this.a.equals(f62Var.a) && Arrays.equals(this.c, f62Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pjg0
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.oyg
    public final boolean g(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zB) {
            zB = (i2 == i || b(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        String str = jrh0.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.pjg0
    public final int k(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.pjg0
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.pjg0
    public final jjg0 m() {
        return this.a;
    }

    @Override // defpackage.oyg
    public int p(long j, List<? extends siv> list) {
        return list.size();
    }

    @Override // defpackage.oyg
    public final int q() {
        return this.c[c()];
    }

    @Override // defpackage.oyg
    public final a r() {
        return this.d[c()];
    }

    @Override // defpackage.oyg
    public void a() {
    }

    @Override // defpackage.oyg
    public void o() {
    }

    @Override // defpackage.oyg
    public void h(float f) {
    }

    @Override // defpackage.oyg
    public final void n(boolean z) {
    }
}
