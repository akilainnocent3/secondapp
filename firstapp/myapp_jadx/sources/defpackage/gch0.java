package defpackage;

import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gch0 {
    public final long a;
    public final CrashInitiatedCoeffListResponse b;

    public gch0(long j, CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse) {
        crashInitiatedCoeffListResponse.getClass();
        this.a = j;
        this.b = crashInitiatedCoeffListResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gch0)) {
            return false;
        }
        gch0 gch0Var = (gch0) obj;
        return this.a == gch0Var.a && Intrinsics.g(this.b, gch0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "UiCoeffNew(id=" + this.a + ", data=" + this.b + ")";
    }
}
