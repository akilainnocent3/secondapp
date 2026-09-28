package defpackage;

import com.sporty.android.book.domain.entity.MarketGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ur5 {
    public final String a;
    public final int b;
    public final String c;
    public final List<MarketGroup> d;

    public ur5(String str, int i, String str2, List<MarketGroup> list) {
        bt6.a(str, str2, list);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur5)) {
            return false;
        }
        ur5 ur5Var = (ur5) obj;
        return Intrinsics.g(this.a, ur5Var.a) && this.b == ur5Var.b && Intrinsics.g(this.c, ur5Var.c) && Intrinsics.g(this.d, ur5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return nve.a(this.c, ", marketGroups=", ")", ml5.a(this.b, "CacheMarketGroup(eventId=", this.a, ", productType=", ", language="), this.d);
    }
}
