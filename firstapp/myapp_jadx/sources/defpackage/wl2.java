package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wl2 extends qsf0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public wl2(String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2)) {
            return false;
        }
        wl2 wl2Var = (wl2) obj;
        return Intrinsics.g(this.a, wl2Var.a) && Intrinsics.g(this.b, wl2Var.b) && Intrinsics.g(this.c, wl2Var.c) && Intrinsics.g(this.d, wl2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BetCount(requiredBets=" + this.a + ", currency=" + this.b + ", stakeAmount=" + this.c + ", supportedGames=" + this.d + ')';
    }
}
