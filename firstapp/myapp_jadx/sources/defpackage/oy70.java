package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oy70 implements pdd0 {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public oy70(int i, String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("top_result_entity_type", this.a), new Pair("result_count", Integer.valueOf(this.b)), new Pair("is_error", Boolean.valueOf(this.c)), new Pair("search_id", this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy70)) {
            return false;
        }
        oy70 oy70Var = (oy70) obj;
        return Intrinsics.g(this.a, oy70Var.a) && this.b == oy70Var.b && this.c == oy70Var.c && Intrinsics.g(this.d, oy70Var.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__results__view";
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + mtg0.a(gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return nyf.a(", searchId=", this.d, ")", ml5.a(this.b, "SearchResultsViewed(topResultEntityType=", this.a, ", resultCount=", ", isError="), this.c);
    }
}
