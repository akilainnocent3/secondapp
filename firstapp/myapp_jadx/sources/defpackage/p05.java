package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p05 {
    public final String a;

    public p05(String str) {
        g08 g08Var = g08.UNKNOWN;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05) || !Intrinsics.g(this.a, ((p05) obj).a)) {
            return false;
        }
        g08 g08Var = g08.UNKNOWN;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return g08.LOAD_BOOKING_CODE_EMPTY_BETSLIP.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LoadCode(code=" + this.a + ", codeSource=" + g08.LOAD_BOOKING_CODE_EMPTY_BETSLIP + ")";
    }
}
