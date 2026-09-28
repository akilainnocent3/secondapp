package defpackage;

import com.appsflyer.internal.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o470 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final List<q470> e;

    public o470(String str, String str2, String str3, long j, List<q470> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o470)) {
            return false;
        }
        o470 o470Var = (o470) obj;
        return this.a.equals(o470Var.a) && this.b.equals(o470Var.b) && this.c.equals(o470Var.c) && this.d == o470Var.d && Intrinsics.g(this.e, o470Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f87.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballEventResult(eventId=", this.a, ", finalScore=", this.b, ", resultSequence=");
        l.a(this.d, this.c, ", endTimestampMillis=", sbA);
        return ka1.a(sbA, ", timelines=", this.e, ")");
    }
}
