package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class gx70 implements pdd0 {
    public final String a;
    public final String b;

    public gx70(String str, String str2) {
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
        if (!(obj instanceof gx70)) {
            return false;
        }
        gx70 gx70Var = (gx70) obj;
        return this.a.equals(gx70Var.a) && this.b.equals(gx70Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__recent__click";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SearchRecentClick(queryText=", this.a, ", searchId=", this.b, ")");
    }
}
