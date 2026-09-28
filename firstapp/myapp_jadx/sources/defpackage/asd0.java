package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class asd0 {
    public final String a;
    public final String b;
    public final a c;

    public enum a {
        c(R.color.text_disabled_action, "DISABLED"),
        d(R.color.text_primary, "ENABLED"),
        e(R.color.text_primary, "FOCUSED"),
        f(R.color.text_primary, "WARNING");

        public final int a;
        public final int b;

        a(int i2, String str) {
            this.a = i;
            this.b = i2;
        }
    }

    public asd0(String str, String str2, a aVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asd0)) {
            return false;
        }
        asd0 asd0Var = (asd0) obj;
        return Intrinsics.g(this.a, asd0Var.a) && Intrinsics.g(this.b, asd0Var.b) && this.c == asd0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("StakeInputState(minStakeHint=", this.a, ", stakeString=", this.b, ", state=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
