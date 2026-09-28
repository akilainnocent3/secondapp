package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class b850 {
    public final xmt a;
    public final xmt b;
    public final xmt c;
    public final xmt d;
    public final xmt e;

    public b850(xmt xmtVar, xmt xmtVar2, xmt xmtVar3, xmt xmtVar4, xmt xmtVar5) {
        this.a = xmtVar;
        this.b = xmtVar2;
        this.c = xmtVar3;
        this.d = xmtVar4;
        this.e = xmtVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b850)) {
            return false;
        }
        b850 b850Var = (b850) obj;
        return this.a == b850Var.a && this.b == b850Var.b && this.c == b850Var.c && this.d == b850Var.d && this.e == b850Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RenderedKickCompositions(goalkeeperIdleComposition=" + this.a + ", goalkeeperGuardComposition=" + this.b + ", playerIdleComposition=" + this.c + ", playerKickComposition=" + this.d + ", ballComposition=" + this.e + ")";
    }
}
