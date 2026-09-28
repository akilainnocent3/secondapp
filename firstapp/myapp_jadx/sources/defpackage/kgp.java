package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kgp {
    public final String a;
    public final boolean b;
    public final boolean c;

    public kgp(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public static kgp a(kgp kgpVar, int i) {
        String str = kgpVar.a;
        boolean z = (i & 2) != 0 ? kgpVar.b : false;
        boolean z2 = (i & 4) != 0 ? kgpVar.c : true;
        kgpVar.getClass();
        str.getClass();
        return new kgp(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgp)) {
            return false;
        }
        kgp kgpVar = (kgp) obj;
        return Intrinsics.g(this.a, kgpVar.a) && this.b == kgpVar.b && this.c == kgpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(z620.a("JumpBankState(jumpUrl=", this.a, ", isProgressIndicatorVisible=", ", isBackButtonVisible=", this.b), this.c, ")");
    }
}
