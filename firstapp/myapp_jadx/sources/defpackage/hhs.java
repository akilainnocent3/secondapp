package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hhs {
    public final boolean a;
    public final List<gdc> b;
    public final String c;

    public hhs(String str, boolean z, List list) {
        list.getClass();
        str.getClass();
        this.a = z;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhs)) {
            return false;
        }
        hhs hhsVar = (hhs) obj;
        return this.a == hhsVar.a && Intrinsics.g(this.b, hhsVar.b) && Intrinsics.g(this.c, hhsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ai50.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListCustomCodeUIState(isLoading=");
        sb.append(this.a);
        sb.append(dqvOSm.mShkI);
        sb.append(this.b);
        sb.append(", sportySocialName=");
        return uf80.a(sb, this.c, ")");
    }

    public hhs() {
        this(0);
    }

    public hhs(int i) {
        this("", true, m2g.a);
    }
}
