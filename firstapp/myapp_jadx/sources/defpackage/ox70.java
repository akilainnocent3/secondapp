package defpackage;

import com.appsflyer.internal.m;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ox70 implements pdd0 {
    public final String a;
    public final String b;
    public final String c;

    public ox70(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("result_type", this.a), new Pair("search_id", this.b), new Pair("entity_id", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox70)) {
            return false;
        }
        ox70 ox70Var = (ox70) obj;
        return Intrinsics.g(this.a, ox70Var.a) && Intrinsics.g(this.b, ox70Var.b) && Intrinsics.g(this.c, ox70Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__result__click";
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("SearchResultClick(resultType=", this.a, ", searchId=", this.b, ", entityId="), this.c, ")");
    }
}
