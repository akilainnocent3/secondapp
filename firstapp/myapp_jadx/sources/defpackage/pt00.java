package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pt00 {
    public final String a;
    public final String b;

    public pt00(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt00)) {
            return false;
        }
        pt00 pt00Var = (pt00) obj;
        return Intrinsics.g(this.a, pt00Var.a) && Intrinsics.g(this.b, pt00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("PickTournament(id=", this.a, ", name=", this.b, ")");
    }
}
