package defpackage;

import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x8c {
    public final AliasCodeList a;
    public final j8c b;
    public final String c;
    public final boolean d;

    public x8c(AliasCodeList aliasCodeList, j8c j8cVar, String str, boolean z) {
        aliasCodeList.getClass();
        str.getClass();
        this.a = aliasCodeList;
        this.b = j8cVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8c)) {
            return false;
        }
        x8c x8cVar = (x8c) obj;
        return Intrinsics.g(this.a, x8cVar.a) && this.b.equals(x8cVar.b) && Intrinsics.g(this.c, x8cVar.c) && this.d == x8cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomCodeListState(codeList=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", username=");
        return x9d.a(this.c, ", isCreator=", ")", sb, this.d);
    }
}
