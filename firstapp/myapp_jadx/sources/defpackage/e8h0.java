package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e8h0 {
    public final List<brg0> a;
    public final boolean b;
    public final boolean c;

    public e8h0(List<brg0> list, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8h0)) {
            return false;
        }
        e8h0 e8h0Var = (e8h0) obj;
        return Intrinsics.g(this.a, e8h0Var.a) && this.b == e8h0Var.b && this.c == e8h0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxPage(txList=");
        sb.append(this.a);
        sb.append(", shouldFixStatus=");
        sb.append(this.b);
        sb.append(", shouldShowKycHint=");
        return mq0.a(sb, this.c, ")");
    }
}
