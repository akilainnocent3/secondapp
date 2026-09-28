package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;

/* JADX INFO: loaded from: classes2.dex */
public final class c850 {
    public final xmt a;
    public final xmt b;
    public final xmt c;
    public final xmt d;
    public final xmt e;

    public c850(xmt xmtVar, xmt xmtVar2, xmt xmtVar3, xmt xmtVar4, xmt xmtVar5) {
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
        if (!(obj instanceof c850)) {
            return false;
        }
        c850 c850Var = (c850) obj;
        return this.a == c850Var.a && this.b == c850Var.b && this.c == c850Var.c && this.d == c850Var.d && this.e == c850Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RenderedKickCompositions(goalkeeperIdleComposition=" + this.a + ACKxwYRsuWyGz.IhIvjhLdnwH + this.b + ", playerIdleComposition=" + this.c + ", playerKickComposition=" + this.d + ", ballComposition=" + this.e + ")";
    }
}
