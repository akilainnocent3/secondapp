package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qup {
    public final String a;
    public final String b;

    public qup(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qup)) {
            return false;
        }
        qup qupVar = (qup) obj;
        return Intrinsics.g(this.a, qupVar.a) && Intrinsics.g(this.b, qupVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return tx5.a("KycVerifyFailedInfo(rejectTitle=", this.a, ", rejectReason=", this.b, ")");
    }
}
