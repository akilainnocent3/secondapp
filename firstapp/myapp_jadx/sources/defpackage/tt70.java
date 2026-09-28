package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tt70 implements pdd0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public tt70(String str, String str2, int i, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("query_text", this.a), new Pair("suggestion_text", this.b), new Pair("position", Integer.valueOf(this.c)), new Pair("search_id", this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt70)) {
            return false;
        }
        tt70 tt70Var = (tt70) obj;
        return this.a.equals(tt70Var.a) && this.b.equals(tt70Var.b) && this.c == tt70Var.c && Intrinsics.g(this.d, tt70Var.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__autocomplete_suggestion__click";
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SearchAutocompleteSuggestionClick(queryText=", this.a, ", suggestionText=", this.b, ", position=");
        sbA.append(this.c);
        sbA.append(", searchId=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
