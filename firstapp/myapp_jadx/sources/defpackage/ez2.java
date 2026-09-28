package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ez2 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ez2(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        return Intrinsics.g(this.a, ez2Var.a) && this.b == ez2Var.b && this.c == ez2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(DZsoPoBl.BJbtYeEM);
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", enable=");
        return ruw.a(sb, this.c, ')');
    }
}
