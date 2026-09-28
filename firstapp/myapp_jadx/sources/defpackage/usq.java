package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class usq {
    public final String a;
    public final String b;
    public final boolean c;

    public usq(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usq)) {
            return false;
        }
        usq usqVar = (usq) obj;
        return Intrinsics.g(this.a, usqVar.a) && Intrinsics.g(this.b, usqVar.b) && this.c == usqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(ux5.a("LNMarketGroupState(id=", this.a, ", name=", this.b, ", isSelected="), this.c, ")");
    }
}
