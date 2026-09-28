package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public final class l1g0 {
    public final String a;
    public final String b;
    public final int c;
    public final List<Market> d;

    /* JADX WARN: Multi-variable type inference failed */
    public l1g0(String str, String str2, int i, List<? extends Market> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1g0)) {
            return false;
        }
        l1g0 l1g0Var = (l1g0) obj;
        return Intrinsics.g(this.a, l1g0Var.a) && Intrinsics.g(this.b, l1g0Var.b) && this.c == l1g0Var.c && Intrinsics.g(this.d, l1g0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + gpp.a(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return at6.b(ux5.a("TopBetBuilderFilterItem(oddsMin=", this.a, ", oddsMax=", this.b, Chyeyik.tgEUrX), this.c, ", filteredMarkets=", this.d, ")");
    }

    public l1g0() {
        this(null, null, 0, m2g.a);
    }
}
