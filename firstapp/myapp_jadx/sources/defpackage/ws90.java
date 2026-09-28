package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ws90 {
    public final String a;
    public final String b;
    public final List<xs90> c;

    public ws90(String str, String str2, List<xs90> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws90)) {
            return false;
        }
        ws90 ws90Var = (ws90) obj;
        return this.a.equals(ws90Var.a) && this.b.equals(ws90Var.b) && Intrinsics.g(this.c, ws90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(ux5.a("SimulationTicketMarket(id=", this.a, ", title=", this.b, ", outcomes="), this.c, ")");
    }
}
