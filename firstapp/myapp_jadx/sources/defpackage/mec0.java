package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;

/* JADX INFO: loaded from: classes2.dex */
public final class mec0 {
    public final String a;
    public final String b;

    public mec0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mec0)) {
            return false;
        }
        mec0 mec0Var = (mec0) obj;
        return this.a.equals(mec0Var.a) && this.b.equals(mec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsMarketCategoryTabState(id=", this.a, gvQvkPPtA.fUScwgv, this.b, ")");
    }
}
