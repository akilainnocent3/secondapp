package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class zc30 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public zc30(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc30)) {
            return false;
        }
        zc30 zc30Var = (zc30) obj;
        return this.a == zc30Var.a && this.b == zc30Var.b && this.c == zc30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("QuickBetStyle(disableQuickPlace=", ", hideMiniBtn=", ", hasSimulateTimesPanel=", this.a, this.b), this.c, ")");
    }
}
