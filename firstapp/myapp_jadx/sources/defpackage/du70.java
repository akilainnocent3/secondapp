package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class du70 implements pdd0 {
    public final String a;
    public final String b;

    public du70(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("query", this.a), new Pair("search_id", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du70)) {
            return false;
        }
        du70 du70Var = (du70) obj;
        return Intrinsics.g(this.a, du70Var.a) && Intrinsics.g(this.b, du70Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__deeplink_query_page__enter";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SearchDeeplinkQueryPageEnter(query=", this.a, ", searchId=", this.b, ")");
    }
}
