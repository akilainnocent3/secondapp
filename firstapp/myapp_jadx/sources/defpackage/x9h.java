package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x9h {
    public final String a;
    public final String b;

    public x9h(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9h)) {
            return false;
        }
        x9h x9hVar = (x9h) obj;
        return Intrinsics.g(this.a, x9hVar.a) && Intrinsics.g(this.b, x9hVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tx5.a("FastPathShare(verifyShareUrl=", this.a, dqvOSm.uvfFb, this.b, ")");
    }
}
