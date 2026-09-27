package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p63 implements xq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wq f153758i = new wq() { // from class: yads.a84
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return p63.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f153759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f153760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f153762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f153763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f153764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e6 f153765h = e6.f148512h;

    public static p63 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), 0);
        long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        e6 e6Var = bundle2 != null ? (e6) e6.f148514j.fromBundle(bundle2) : e6.f148512h;
        p63 p63Var = new p63();
        p63Var.a(null, null, i10, j10, j11, e6Var, z10);
        return p63Var;
    }

    public final int b(long j10) {
        e6 e6Var = this.f153765h;
        long j11 = this.f153762e;
        int i10 = e6Var.f148516c - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = e6Var.a(i10).f148078b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            d6 d6VarA = e6Var.a(i10);
            if (d6VarA.f148079c != -1) {
                for (int i11 = 0; i11 < d6VarA.f148079c; i11++) {
                    int i12 = d6VarA.f148081e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p63.class.equals(obj.getClass())) {
            p63 p63Var = (p63) obj;
            if (ib3.a(this.f153759b, p63Var.f153759b) && ib3.a(this.f153760c, p63Var.f153760c) && this.f153761d == p63Var.f153761d && this.f153762e == p63Var.f153762e && this.f153763f == p63Var.f153763f && this.f153764g == p63Var.f153764g && ib3.a(this.f153765h, p63Var.f153765h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f153759b;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f153760c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f153761d) * 31;
        long j10 = this.f153762e;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f153763f;
        return this.f153765h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f153764g ? 1 : 0)) * 31);
    }

    public final long a(int i10, int i11) {
        d6 d6VarA = this.f153765h.a(i10);
        if (d6VarA.f148079c != -1) {
            return d6VarA.f148082f[i11];
        }
        return -9223372036854775807L;
    }

    public final int a(long j10) {
        e6 e6Var = this.f153765h;
        long j11 = this.f153762e;
        e6Var.getClass();
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = e6Var.f148519f;
            while (i10 < e6Var.f148516c) {
                if (e6Var.a(i10).f148078b == Long.MIN_VALUE || e6Var.a(i10).f148078b > j10) {
                    d6 d6VarA = e6Var.a(i10);
                    if (d6VarA.f148079c == -1 || d6VarA.a(-1) < d6VarA.f148079c) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 < e6Var.f148516c) {
                return i10;
            }
        }
        return -1;
    }

    public final int a(int i10) {
        return this.f153765h.a(i10).a(-1);
    }

    public final long a() {
        return this.f153763f;
    }

    public final p63 a(Object obj, Object obj2, int i10, long j10, long j11, e6 e6Var, boolean z10) {
        this.f153759b = obj;
        this.f153760c = obj2;
        this.f153761d = i10;
        this.f153762e = j10;
        this.f153763f = j11;
        this.f153765h = e6Var;
        this.f153764g = z10;
        return this;
    }
}
