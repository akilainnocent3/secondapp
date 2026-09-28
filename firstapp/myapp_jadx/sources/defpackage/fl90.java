package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fl90 {
    public final int a;
    public final List<rq90> b;

    public fl90(int i, List<rq90> list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl90)) {
            return false;
        }
        fl90 fl90Var = (fl90) obj;
        return this.a == fl90Var.a && Intrinsics.g(this.b, fl90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SimulationBetHistory(totalTicketCount=" + this.a + ", ticketList=" + this.b + ")";
    }
}
