package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ix7 {
    public String a;
    public String b;
    public String c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix7)) {
            return false;
        }
        ix7 ix7Var = (ix7) obj;
        return Intrinsics.g(this.a, ix7Var.a) && Intrinsics.g(this.b, ix7Var.b) && Intrinsics.g(this.c, ix7Var.c) && this.d == ix7Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        return x9d.a(str3, ", sortChange=", siPCzPFw.TIWMKNFh, ux5.a("CodeHubFilterButtonText(countryLabel=null, timeLabel=", str, ", foldsLabel=", str2, ", oddsLabel="), z);
    }
}
