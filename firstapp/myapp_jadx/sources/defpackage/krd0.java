package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class krd0 extends psf0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public krd0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krd0)) {
            return false;
        }
        krd0 krd0Var = (krd0) obj;
        return Intrinsics.g(this.a, krd0Var.a) && Intrinsics.g(this.b, krd0Var.b) && Intrinsics.g(this.c, krd0Var.c);
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
