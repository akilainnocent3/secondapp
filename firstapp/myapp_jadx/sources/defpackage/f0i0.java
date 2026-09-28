package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f0i0 {
    public final String a;
    public final String b;

    public f0i0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0i0)) {
            return false;
        }
        f0i0 f0i0Var = (f0i0) obj;
        return Intrinsics.g(this.a, f0i0Var.a) && Intrinsics.g(this.b, f0i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("VerifyOtpParam(callingCodeWithoutSymbol=", this.a, ", phoneNumber=", this.b, DZsoPoBl.bamFIDKA);
    }
}
