package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j48 {
    public final List<nu6> a;
    public final Throwable b;

    public j48(ArrayList arrayList, Throwable th, int i) {
        List<nu6> list = (i & 1) != 0 ? m2g.a : arrayList;
        th = (i & 2) != 0 ? null : th;
        list.getClass();
        this.a = list;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j48)) {
            return false;
        }
        j48 j48Var = (j48) obj;
        return Intrinsics.g(this.a, j48Var.a) && Intrinsics.g(this.b, j48Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionsDomainModel(caveConfigurationList=");
        sb.append(this.a);
        sb.append(", throwable=");
        return vt5.b(sb, this.b, ')');
    }

    public j48() {
        this(null, null, 3);
    }
}
