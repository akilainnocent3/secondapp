package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class htp {
    public final String a;
    public final String b;

    public htp(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htp)) {
            return false;
        }
        htp htpVar = (htp) obj;
        return Intrinsics.g(this.a, htpVar.a) && Intrinsics.g(this.b, htpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("KycNameData(firstName=", this.a, ", lastName=", this.b, ")");
    }
}
