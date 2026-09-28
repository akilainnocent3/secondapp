package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class clr {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public clr(String str, String str2, boolean z, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clr)) {
            return false;
        }
        clr clrVar = (clr) obj;
        return Intrinsics.g(this.a, clrVar.a) && Intrinsics.g(this.b, clrVar.b) && this.c == clrVar.c && Intrinsics.g(this.d, clrVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return nyf.a(", ticketId=", this.d, ")", ux5.a("LNWinningPopupState(amount=", this.a, ", lotteryName=", this.b, ", showOffEnable="), this.c);
    }

    public /* synthetic */ clr(int i) {
        this("", null, false, "");
    }

    public clr() {
        this(0);
    }
}
