package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class poo {
    public final String a;
    public final String b;
    public final String c;

    public poo(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poo)) {
            return false;
        }
        poo pooVar = (poo) obj;
        return Intrinsics.g(this.a, pooVar.a) && this.b.equals(pooVar.b) && this.c.equals(pooVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantWinTicketDetailSelectionItemState(pickText=", this.a, ", marketText=", this.b, ", hitOutcomeText="), this.c, ")");
    }
}
