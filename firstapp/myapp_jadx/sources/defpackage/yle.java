package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yle {
    public final boolean a;
    public final boolean b;
    public final l380 c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public yle(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        l380 l380Var = l380.a;
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 8) != 0 ? true : z3;
        z4 = (i & 16) != 0 ? true : z4;
        this.a = z;
        this.b = z2;
        this.c = l380Var;
        this.d = z3;
        this.e = z4;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yle)) {
            return false;
        }
        yle yleVar = (yle) obj;
        return this.a == yleVar.a && this.b == yleVar.b && this.c == yleVar.c && this.d == yleVar.d && this.e == yleVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a((this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public /* synthetic */ yle(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yle(boolean z, boolean z2, boolean z3) {
        this(32, z, z2, z3, true);
        l380 l380Var = l380.a;
    }
}
