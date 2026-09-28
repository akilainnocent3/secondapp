package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ugy {
    public final String a;
    public final String b;
    public final int c;

    public ugy(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugy)) {
            return false;
        }
        ugy ugyVar = (ugy) obj;
        return Intrinsics.g(this.a, ugyVar.a) && Intrinsics.g(this.b, ugyVar.b) && this.c == ugyVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", ux5.a("OddsFilterDropDownItem(oddsMin=", this.a, ", oddsMax=", this.b, ", count="));
    }

    public ugy() {
        this(null, null, 0);
    }
}
