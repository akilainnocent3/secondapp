package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class giw {
    public final Long a;
    public final Long b;

    public giw(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giw)) {
            return false;
        }
        giw giwVar = (giw) obj;
        return Intrinsics.g(this.a, giwVar.a) && Intrinsics.g(this.b, giwVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "MultiMakerTimeRange(startTime=" + this.a + ", endTime=" + this.b + ")";
    }
}
