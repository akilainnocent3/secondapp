package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dlr {
    public final String a;
    public final String b;

    public dlr(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlr)) {
            return false;
        }
        dlr dlrVar = (dlr) obj;
        return Intrinsics.g(this.a, dlrVar.a) && Intrinsics.g(this.b, dlrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LNWinningPopupTournament(id=", this.a, ", name=", this.b, ")");
    }
}
