package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ibf0 implements pdd0 {
    public final String a;
    public final String b;

    public ibf0(String str) {
        str.getClass();
        this.a = "otp__option__click";
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("type", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf0)) {
            return false;
        }
        ibf0 ibf0Var = (ibf0) obj;
        return this.a.equals(ibf0Var.a) && Intrinsics.g(this.b, ibf0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("OtpOptionClickEvent(name=", this.a, ", channel=", this.b, ")");
    }
}
