package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class to implements op0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f155993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f155995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0[] f155996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f155997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f155998f;

    public to(h73 h73Var, int[] iArr) {
        int i10 = 0;
        ni.b(iArr.length > 0);
        this.f155993a = (h73) ni.a(h73Var);
        int length = iArr.length;
        this.f155994b = length;
        this.f155996d = new mx0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f155996d[i11] = h73Var.a(iArr[i11]);
        }
        Arrays.sort(this.f155996d, new Comparator() { // from class: yads.nb4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return to.a((mx0) obj, (mx0) obj2);
            }
        });
        this.f155995c = new int[this.f155994b];
        while (true) {
            int i12 = this.f155994b;
            if (i10 >= i12) {
                this.f155997e = new long[i12];
                return;
            } else {
                this.f155995c[i10] = h73Var.a(this.f155996d[i10]);
                i10++;
            }
        }
    }

    @Override // yads.op0
    public void a() {
    }

    @Override // yads.op0
    public final int b(int i10) {
        return this.f155995c[i10];
    }

    @Override // yads.op0
    public final mx0 c() {
        return this.f155996d[e()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            to toVar = (to) obj;
            if (this.f155993a == toVar.f155993a && Arrays.equals(this.f155995c, toVar.f155995c)) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.op0
    public final int f() {
        return this.f155995c.length;
    }

    @Override // yads.op0
    public /* synthetic */ void h() {
        v74.c(this);
    }

    public final int hashCode() {
        if (this.f155998f == 0) {
            this.f155998f = Arrays.hashCode(this.f155995c) + (System.identityHashCode(this.f155993a) * 31);
        }
        return this.f155998f;
    }

    @Override // yads.op0
    public /* synthetic */ void i() {
        v74.d(this);
    }

    @Override // yads.op0
    public void a(float f10) {
    }

    @Override // yads.op0
    public final h73 b() {
        return this.f155993a;
    }

    @Override // yads.op0
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f155994b; i11++) {
            if (this.f155995c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // yads.op0
    public /* synthetic */ void a(boolean z10) {
        v74.a(this, z10);
    }

    @Override // yads.op0
    public final boolean b(int i10, long j10) {
        return this.f155997e[i10] > j10;
    }

    @Override // yads.op0
    public /* synthetic */ boolean a(long j10, cu cuVar, List list) {
        return v74.b(this, j10, cuVar, list);
    }

    @Override // yads.op0
    public final boolean a(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f155994b && !zB) {
            zB = (i11 == i10 || b(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f155997e;
        long j11 = jArr[i10];
        int i12 = ib3.f150516a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // yads.op0
    public int a(long j10, List list) {
        return list.size();
    }

    @Override // yads.op0
    public final mx0 a(int i10) {
        return this.f155996d[i10];
    }

    @Override // yads.op0
    public final int a(mx0 mx0Var) {
        for (int i10 = 0; i10 < this.f155994b; i10++) {
            if (this.f155996d[i10] == mx0Var) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(mx0 mx0Var, mx0 mx0Var2) {
        return mx0Var2.f152725i - mx0Var.f152725i;
    }

    @Override // yads.op0
    public void disable() {
    }
}
