package defpackage;

import com.appsflyer.internal.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class q470 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final t470 e;
    public final r470 f;
    public final s470 g;
    public final String h;

    public q470(int i, long j, long j2, long j3, t470 t470Var, r470 r470Var, s470 s470Var, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = t470Var;
        this.f = r470Var;
        this.g = s470Var;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q470)) {
            return false;
        }
        q470 q470Var = (q470) obj;
        return this.a == q470Var.a && this.b == q470Var.b && this.c == q470Var.c && this.d == q470Var.d && this.e == q470Var.e && this.f == q470Var.f && this.g == q470Var.g && this.h.equals(q470Var.h);
    }

    public final int hashCode() {
        int iA = f87.a(f87.a(f87.a(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        t470 t470Var = this.e;
        int iHashCode = (iA + (t470Var == null ? 0 : t470Var.hashCode())) * 31;
        r470 r470Var = this.f;
        int iHashCode2 = (iHashCode + (r470Var == null ? 0 : r470Var.hashCode())) * 31;
        s470 s470Var = this.g;
        return this.h.hashCode() + ((iHashCode2 + (s470Var != null ? s470Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = a0.a("ScheduledFootballEventResultTimeline(segmentId=", ", startTimestampMillis=", this.a, this.b);
        g41.a(this.c, ", endTimestampMillis=", ", attackResultStartTimestampMillis=", sbA);
        sbA.append(this.d);
        sbA.append(", type=");
        sbA.append(this.e);
        sbA.append(", action=");
        sbA.append(this.f);
        sbA.append(", side=");
        sbA.append(this.g);
        return pr0.a(sbA, ", resourceUrl=", this.h, ")");
    }
}
