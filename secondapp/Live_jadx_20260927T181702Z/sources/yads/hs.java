package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f150262c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f150263d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc0 f150264e;

    public hs(int i10, String str, jc0 jc0Var) {
        this.f150260a = i10;
        this.f150261b = str;
        this.f150264e = jc0Var;
    }

    public final long a(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        yy2 yy2VarB = b(j10, j11);
        if (!yy2VarB.f159001e) {
            long j12 = yy2VarB.f159000d;
            return -Math.min(j12 != -1 ? j12 : Long.MAX_VALUE, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = yy2VarB.f158999c + yy2VarB.f159000d;
        if (jMax < j14) {
            for (yy2 yy2Var : this.f150262c.tailSet(yy2VarB, false)) {
                long j15 = yy2Var.f158999c;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + yy2Var.f159000d);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final yy2 b(long j10, long j11) {
        long j12;
        long jMin = j11;
        yy2 yy2Var = new yy2(this.f150261b, j10, -1L, -9223372036854775807L, null);
        yy2 yy2Var2 = (yy2) this.f150262c.floor(yy2Var);
        if (yy2Var2 != null && yy2Var2.f158999c + yy2Var2.f159000d > j10) {
            return yy2Var2;
        }
        yy2 yy2Var3 = (yy2) this.f150262c.ceiling(yy2Var);
        if (yy2Var3 != null) {
            long j13 = yy2Var3.f158999c - j10;
            if (jMin == -1) {
                j12 = j13;
            } else {
                jMin = Math.min(j13, jMin);
                j12 = jMin;
            }
        } else {
            j12 = jMin;
        }
        return new yy2(this.f150261b, j10, j12, -9223372036854775807L, null);
    }

    public final boolean c(long j10, long j11) {
        for (int i10 = 0; i10 < this.f150263d.size(); i10++) {
            gs gsVar = (gs) this.f150263d.get(i10);
            long j12 = gsVar.f149754b;
            if (j12 == -1) {
                if (j10 >= gsVar.f149753a) {
                    return true;
                }
            } else if (j11 == -1) {
                continue;
            } else {
                long j13 = gsVar.f149753a;
                if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hs.class == obj.getClass()) {
            hs hsVar = (hs) obj;
            if (this.f150260a == hsVar.f150260a && this.f150261b.equals(hsVar.f150261b) && this.f150262c.equals(hsVar.f150262c) && this.f150264e.equals(hsVar.f150264e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f150264e.hashCode() + k4.a(this.f150261b, this.f150260a * 31, 31);
    }
}
