package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class n5o {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public n5o(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static n5o a(n5o n5oVar, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? n5oVar.a : true;
        if ((i & 2) != 0) {
            z = n5oVar.b;
        }
        if ((i & 4) != 0) {
            z2 = n5oVar.c;
        }
        n5oVar.getClass();
        return new n5o(z3, z, z2);
    }

    public final boolean b() {
        return (!this.a || this.b || this.c) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5o)) {
            return false;
        }
        n5o n5oVar = (n5o) obj;
        return this.a == n5oVar.a && this.b == n5oVar.b && this.c == n5oVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("InstantVirtualShowOffBottomBarState(visible=", ", imageSaving=", ", imageGenerating=", this.a, this.b), this.c, ")");
    }
}
