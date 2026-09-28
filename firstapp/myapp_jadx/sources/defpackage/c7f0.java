package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c7f0 {
    public final List<fng> a;
    public final String b;
    public final boolean c;

    public c7f0(List<fng> list, String str, boolean z) {
        list.getClass();
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7f0)) {
            return false;
        }
        c7f0 c7f0Var = (c7f0) obj;
        return Intrinsics.g(this.a, c7f0Var.a) && Intrinsics.g(this.b, c7f0Var.b) && this.c == c7f0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamMatchesPaginationState(events=");
        sb.append(this.a);
        sb.append(", flag=");
        sb.append(this.b);
        sb.append(", hasNextPage=");
        return mq0.a(sb, this.c, ")");
    }

    public c7f0(int i) {
        this(m2g.a, null, false);
    }
}
