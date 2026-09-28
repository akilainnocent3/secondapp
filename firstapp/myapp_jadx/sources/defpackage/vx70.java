package defpackage;

import com.sporty.android.book.domain.entity.Category;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vx70 implements pdd0 {
    public final String a;
    public final String b;

    public vx70(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(Category.CATEGORY_ID, this.a), new Pair("search_id", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx70)) {
            return false;
        }
        vx70 vx70Var = (vx70) obj;
        return Intrinsics.g(this.a, vx70Var.a) && Intrinsics.g(this.b, vx70Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "search__results_expand__click";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SearchResultsExpand(category=", this.a, ", searchId=", this.b, ")");
    }
}
