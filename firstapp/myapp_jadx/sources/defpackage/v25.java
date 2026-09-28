package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v25 {
    public final String a;
    public final String b;
    public final String c;

    public v25(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v25)) {
            return false;
        }
        v25 v25Var = (v25) obj;
        return this.a.equals(v25Var.a) && Intrinsics.g(this.b, v25Var.b) && this.c.equals(v25Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("BoostRakebackItem(baseRate=", this.a, ", multiplier=", this.b, ", boostedValue="), this.c, ")");
    }
}
