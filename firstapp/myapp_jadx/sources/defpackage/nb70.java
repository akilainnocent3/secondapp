package defpackage;

import com.appsflyer.internal.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class nb70 {
    public static final nb70 c = new nb70(0, 0);
    public final int a;
    public final long b;

    public nb70(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb70)) {
            return false;
        }
        nb70 nb70Var = (nb70) obj;
        return this.a == nb70Var.a && this.b == nb70Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbA = a0.a("ScheduledFootballOpenBetsCountInfo(count=", ", timestampMillis=", this.a, this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
