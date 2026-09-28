package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class e970 {
    public final String a;
    public final int b;
    public final int c;
    public final k970 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final List<z370> i;

    public e970(String str, int i, int i2, k970 k970Var, long j, long j2, long j3, long j4, List<z370> list) {
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = k970Var;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = list;
    }

    public final boolean a(long j) {
        long jI = c.i(this.f - j, rgf.MILLISECONDS);
        b.a aVar = b.b;
        return b.j(jI, rgf.SECONDS) <= 0;
    }

    public final boolean b(long j) {
        long jI = c.i(this.g - j, rgf.MILLISECONDS);
        b.a aVar = b.b;
        return b.j(jI, rgf.SECONDS) <= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e970)) {
            return false;
        }
        e970 e970Var = (e970) obj;
        return this.a.equals(e970Var.a) && this.b == e970Var.b && this.c == e970Var.c && this.d == e970Var.d && this.e == e970Var.e && this.f == e970Var.f && this.g == e970Var.g && this.h == e970Var.h && Intrinsics.g(this.i, e970Var.i);
    }

    public final int hashCode() {
        int iA = gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31);
        k970 k970Var = this.d;
        return this.i.hashCode() + f87.a(f87.a(f87.a(f87.a((iA + (k970Var == null ? 0 : k970Var.hashCode())) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "ScheduledFootballMatchday(id=", this.a, ", season=", ", day=");
        sbA.append(this.c);
        sbA.append(", status=");
        sbA.append(this.d);
        sbA.append(", betOpenTimestampMillis=");
        sbA.append(this.e);
        g41.a(this.f, ", betCloseTimestampMillis=", ", kickoffTimestampMillis=", sbA);
        sbA.append(this.g);
        g41.a(this.h, ", hideTimestampMillis=", ", events=", sbA);
        return ng1.a(sbA, this.i, ")");
    }
}
