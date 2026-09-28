package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lrd0 extends qsf0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public lrd0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrd0)) {
            return false;
        }
        lrd0 lrd0Var = (lrd0) obj;
        return Intrinsics.g(this.a, lrd0Var.a) && Intrinsics.g(this.b, lrd0Var.b) && Intrinsics.g(this.c, lrd0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StakeCount(currency=" + this.a + ", stakeAmount=" + this.b + ", supportedGames=" + this.c + ')';
    }
}
