package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ma30 implements pdd0 {
    public final String a = "pn__received__click";
    public final String b;
    public final String c;

    public ma30(String str, String str2) {
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
        if (!(obj instanceof ma30)) {
            return false;
        }
        ma30 ma30Var = (ma30) obj;
        return this.a.equals(ma30Var.a) && this.b.equals(ma30Var.b) && this.c.equals(ma30Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("NotificationClickedEvent(name=", this.a, ", purposeId=", this.b, ", purpose="), this.c, ")");
    }
}
