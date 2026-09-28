package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bl70 {
    public final String a;
    public final String b;

    public bl70(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl70)) {
            return false;
        }
        bl70 bl70Var = (bl70) obj;
        return Intrinsics.g(this.a, bl70Var.a) && this.b.equals(bl70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("ScheduledFootballUniversalSpecifierSelection(marketType=", this.a, ", universalSpecifierType=", this.b, ")");
    }
}
