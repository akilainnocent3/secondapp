package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class la30 implements pdd0 {
    public final String a = "pn__delivered";
    public final String b;
    public final String c;

    public la30(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("purposeId", this.b), new Pair("purpose", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la30)) {
            return false;
        }
        la30 la30Var = (la30) obj;
        return this.a.equals(la30Var.a) && this.b.equals(la30Var.b) && this.c.equals(la30Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("DeliveredToDeviceEvent(name=", this.a, ", purposeId=", this.b, ", purpose="), this.c, ")");
    }
}
