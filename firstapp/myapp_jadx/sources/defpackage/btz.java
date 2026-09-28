package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class btz {
    public final s24 a;
    public final r24 b;
    public final String c;

    public btz(s24 s24Var, r24 r24Var, String str) {
        str.getClass();
        this.a = s24Var;
        this.b = r24Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btz)) {
            return false;
        }
        btz btzVar = (btz) obj;
        return this.a == btzVar.a && this.b == btzVar.b && Intrinsics.g(this.c, btzVar.c);
    }

    public final int hashCode() {
        s24 s24Var = this.a;
        int iHashCode = (s24Var == null ? 0 : s24Var.hashCode()) * 31;
        r24 r24Var = this.b;
        return this.c.hashCode() + ((iHashCode + (r24Var != null ? r24Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipateBettingStreakMissionResult(type=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", message=");
        return uf80.a(sb, this.c, LGxrN.VimchcMXg);
    }
}
