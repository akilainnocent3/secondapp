package defpackage;

import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class psy {
    public final long a;
    public final String b;

    public psy(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psy)) {
            return false;
        }
        psy psyVar = (psy) obj;
        return this.a == psyVar.a && Intrinsics.g(this.b, psyVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "OneUpExperimentSessionToken(generation=", ", accountName=", this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
