package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c58 {
    public final String a;
    public final ArrayList b;

    public c58(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c58)) {
            return false;
        }
        c58 c58Var = (c58) obj;
        return this.a.equals(c58Var.a) && this.b.equals(c58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollectionsUiModel(collectionsTitle=" + this.a + ", caveConfigurations=" + this.b + ')';
    }
}
