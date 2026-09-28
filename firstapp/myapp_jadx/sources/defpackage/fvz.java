package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class fvz {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public fvz(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvz)) {
            return false;
        }
        fvz fvzVar = (fvz) obj;
        return this.a == fvzVar.a && this.b == fvzVar.b && this.c == fvzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("PasswordEntryScreenConfig(showBackButton=", ", showCloseButton=", ", showTermsAndConditions=", this.a, this.b), this.c, ")");
    }
}
