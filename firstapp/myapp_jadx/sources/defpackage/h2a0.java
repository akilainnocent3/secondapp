package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h2a0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public h2a0(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2a0)) {
            return false;
        }
        h2a0 h2a0Var = (h2a0) obj;
        return Intrinsics.g(this.a, h2a0Var.a) && Intrinsics.g(this.b, h2a0Var.b) && Intrinsics.g(this.c, h2a0Var.c) && Intrinsics.g(this.d, h2a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("SmartRemixSelectionKey(eventId=", this.a, ", marketId=", this.b, ", specifier="), this.c, ", outcomeId=", this.d, ")");
    }
}
