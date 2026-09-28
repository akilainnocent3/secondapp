package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m1f0 {
    public final String a;
    public final int b;
    public final Integer c;
    public final op8 d;

    public m1f0() {
        throw null;
    }

    public m1f0(String str, Integer num, op8 op8Var, int i) {
        num = (i & 4) != 0 ? null : num;
        this.a = str;
        this.b = R.color.text_type1_primary;
        this.c = num;
        this.d = op8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1f0)) {
            return false;
        }
        m1f0 m1f0Var = (m1f0) obj;
        return Intrinsics.g(this.a, m1f0Var.a) && this.b == m1f0Var.b && Intrinsics.g(this.c, m1f0Var.c) && Intrinsics.g(this.d, m1f0Var.d);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "TabItem(title=", this.a, ", unselectedTitleColor=", ", icon=");
        sbA.append(this.c);
        sbA.append(", screen=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
