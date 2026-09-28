package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u670 {
    public final String a;
    public final d670 b;

    public u670(String str, d670 d670Var) {
        str.getClass();
        d670Var.getClass();
        this.a = str;
        this.b = d670Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u670)) {
            return false;
        }
        u670 u670Var = (u670) obj;
        return Intrinsics.g(this.a, u670Var.a) && Intrinsics.g(this.b, u670Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStatsState(eventId=" + this.a + ", contentStatus=" + this.b + ")";
    }
}
