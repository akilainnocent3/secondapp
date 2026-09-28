package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class md5 {
    public final boolean a;
    public final boolean b;
    public final ld5 c;

    public md5(boolean z, boolean z2, ld5 ld5Var) {
        ld5Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = ld5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md5)) {
            return false;
        }
        md5 md5Var = (md5) obj;
        return this.a == md5Var.a && this.b == md5Var.b && Intrinsics.g(this.c, md5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a(LxHElgWAiSeM.dCfkjzyVZRglpl, ", showHowToPlay=", ", content=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
