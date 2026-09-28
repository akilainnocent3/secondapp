package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class msf0 extends c5c {
    public final Double a;

    public msf0(Double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msf0) && Intrinsics.g(this.a, ((msf0) obj).a);
    }

    public final int hashCode() {
        Double d = this.a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return itu.a(new StringBuilder("TierNotReached(maxReward="), this.a, ')');
    }
}
