package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class az3 {
    public final Boolean a;
    public final wtt b;
    public final vxj c;
    public final ztt d;

    public az3(Boolean bool, wtt wttVar, vxj vxjVar, ztt zttVar) {
        this.a = bool;
        this.b = wttVar;
        this.c = vxjVar;
        this.d = zttVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof az3) {
            az3 az3Var = (az3) obj;
            return Intrinsics.g(this.a, az3Var.a) && this.b == az3Var.b && this.c == az3Var.c && this.d == az3Var.d;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BetslipTooltipState(acked=" + this.a + ", onSeen=" + this.b + ", onLearnMore=" + this.c + ", onClose=" + this.d + ")";
    }
}
