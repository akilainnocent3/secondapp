package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fx70 implements pdd0 {
    public final String a;
    public final String b;

    public fx70(String str, String str2) {
        str.getClass();
        str2.getClass();
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
        if (!(obj instanceof fx70)) {
            return false;
        }
        fx70 fx70Var = (fx70) obj;
        return Intrinsics.g(this.a, fx70Var.a) && Intrinsics.g(this.b, fx70Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__query__enter";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SearchQueryEnter(queryText=", this.a, ", searchId=", this.b, ")");
    }
}
