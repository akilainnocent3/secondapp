package defpackage;

import com.sporty.android.book.domain.entity.SimpleMarket;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class er5 {
    public final String a;
    public final List<SimpleMarket> b;

    public er5(String str, List<SimpleMarket> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5)) {
            return false;
        }
        er5 er5Var = (er5) obj;
        return Intrinsics.g(this.a, er5Var.a) && Intrinsics.g(this.b, er5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("CacheBetBuilderMarkets(sportId=", this.a, ", availableMarkets=", ")", this.b);
    }
}
