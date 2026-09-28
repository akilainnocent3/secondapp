package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hpg {
    public final String a;
    public final String b;

    public hpg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpg)) {
            return false;
        }
        hpg hpgVar = (hpg) obj;
        return Intrinsics.g(this.a, hpgVar.a) && Intrinsics.g(this.b, hpgVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return tx5.a("EventIcons(homeTeamIcon=", this.a, ", awayTeamIcon=", this.b, ")");
    }
}
