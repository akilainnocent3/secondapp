package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rwn {
    public final bxn a;
    public final String b;
    public final List<jzn> c;

    /* JADX WARN: Multi-variable type inference failed */
    public rwn(bxn bxnVar, String str, List<? extends jzn> list) {
        list.getClass();
        this.a = bxnVar;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwn)) {
            return false;
        }
        rwn rwnVar = (rwn) obj;
        return this.a == rwnVar.a && this.b.equals(rwnVar.b) && Intrinsics.g(this.c, rwnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingMarketCategory(type=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", marketTypes=");
        return ng1.a(sb, this.c, ")");
    }
}
