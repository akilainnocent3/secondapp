package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class grx {
    public final List<wgh> a;
    public final String b;
    public final boolean c;

    public grx(List<wgh> list, String str, boolean z) {
        list.getClass();
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grx)) {
            return false;
        }
        grx grxVar = (grx) obj;
        return Intrinsics.g(this.a, grxVar.a) && Intrinsics.g(this.b, grxVar.b) && this.c == grxVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsPaginationState(feedItems=");
        sb.append(this.a);
        sb.append(", flag=");
        sb.append(this.b);
        sb.append(", hasNextPage=");
        return mq0.a(sb, this.c, ")");
    }
}
