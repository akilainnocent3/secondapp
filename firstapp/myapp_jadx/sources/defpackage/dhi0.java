package defpackage;

import com.sporty.android.core.model.virtual.MainCardSize;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dhi0 {
    public final MainCardSize a;
    public final int b;
    public final qcn<chi0> c;

    public dhi0(MainCardSize mainCardSize, int i, uf00 uf00Var) {
        mainCardSize.getClass();
        uf00Var.getClass();
        this.a = mainCardSize;
        this.b = i;
        this.c = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhi0)) {
            return false;
        }
        dhi0 dhi0Var = (dhi0) obj;
        return this.a == dhi0Var.a && this.b == dhi0Var.b && Intrinsics.g(this.c, dhi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualLobbyEntranceCardRow(cardSize=");
        sb.append(this.a);
        sb.append(", cardSlotCount=");
        sb.append(this.b);
        sb.append(", entranceCards=");
        return ts3.a(sb, this.c, ")");
    }
}
