package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wq40 implements pdd0 {
    public final String a;
    public final String b;
    public final String c = "auth__refresh_token__transient_failure";

    public wq40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        HashMap<String, Object> mapD = kpu.d(new Pair("errorReason", this.a));
        String str = this.b;
        if (str != null) {
            mapD.put("errorType", str);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq40)) {
            return false;
        }
        wq40 wq40Var = (wq40) obj;
        return Intrinsics.g(this.a, wq40Var.a) && Intrinsics.g(this.b, wq40Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tx5.a("TransientFailure(reason=", this.a, ", errorCategory=", this.b, ")");
    }
}
