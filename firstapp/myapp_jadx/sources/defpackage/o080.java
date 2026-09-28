package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class o080 implements pdd0 {
    public final String a;
    public final String b;

    public o080(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("query_text", this.a), new Pair("search_id", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o080)) {
            return false;
        }
        o080 o080Var = (o080) obj;
        return this.a.equals(o080Var.a) && this.b.equals(o080Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__trending__click";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SearchTrendingClick(queryText=", this.a, ", searchId=", this.b, ")");
    }
}
