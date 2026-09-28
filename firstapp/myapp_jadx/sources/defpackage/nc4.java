package defpackage;

import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nc4 {
    public final CryptoPurpose a;
    public final qd4.c b;

    public nc4(CryptoPurpose cryptoPurpose, qd4.c cVar) {
        cryptoPurpose.getClass();
        cVar.getClass();
        this.a = cryptoPurpose;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc4)) {
            return false;
        }
        nc4 nc4Var = (nc4) obj;
        return this.a == nc4Var.a && Intrinsics.g(this.b, nc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BiometricAuthContext(purpose=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
