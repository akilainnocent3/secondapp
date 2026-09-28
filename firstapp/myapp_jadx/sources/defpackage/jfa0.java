package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jfa0 {
    public final List<d9a0> a;
    public final ijf0 b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public jfa0(int i) {
        this(R.string.personal_page__suggested_follow_accounts, new ijf0((String) null, 0L, 7), m2g.a, true, false);
    }

    public static jfa0 a(jfa0 jfa0Var, List list, ijf0 ijf0Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = jfa0Var.a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            ijf0Var = jfa0Var.b;
        }
        ijf0 ijf0Var2 = ijf0Var;
        boolean z2 = (i2 & 4) != 0 ? jfa0Var.c : false;
        if ((i2 & 8) != 0) {
            z = jfa0Var.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            i = jfa0Var.e;
        }
        jfa0Var.getClass();
        list2.getClass();
        ijf0Var2.getClass();
        return new jfa0(i, ijf0Var2, list2, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfa0)) {
            return false;
        }
        jfa0 jfa0Var = (jfa0) obj;
        return Intrinsics.g(this.a, jfa0Var.a) && Intrinsics.g(this.b, jfa0Var.b) && this.c == jfa0Var.c && this.d == jfa0Var.d && this.e == jfa0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + mtg0.a(mtg0.a(ey1.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialNetworkSuggestedUI(suggestedAccountsList=");
        sb.append(this.a);
        sb.append(", searchQuery=");
        sb.append(this.b);
        sb.append(", isLoading=");
        nng.a(", showEmpty=", ", title=", sb, this.c, this.d);
        return zk1.a(this.e, ")", sb);
    }

    public jfa0(int i, ijf0 ijf0Var, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = ijf0Var;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public jfa0() {
        this(0);
    }
}
