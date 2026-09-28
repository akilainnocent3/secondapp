package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uz60 {
    public final long a;
    public final long b;
    public final List<l770> c;

    public uz60(long j, long j2, List<l770> list) {
        list.getClass();
        this.a = j;
        this.b = j2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz60)) {
            return false;
        }
        uz60 uz60Var = (uz60) obj;
        return this.a == uz60Var.a && this.b == uz60Var.b && Intrinsics.g(this.c, uz60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbA = q6a0.a(this.a, "ScheduledFootballActiveEvents(receiveTimestampMillis=", YAzniTbXHYQ.RPmYCqqVvrAD);
        sbA.append(this.b);
        sbA.append(", leagues=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
