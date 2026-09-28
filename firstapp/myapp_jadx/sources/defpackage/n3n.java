package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n3n {
    public final String a;
    public final c3n b;
    public final int c;

    public n3n(String str, c3n c3nVar, int i) {
        str.getClass();
        this.a = str;
        this.b = c3nVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3n)) {
            return false;
        }
        n3n n3nVar = (n3n) obj;
        return Intrinsics.g(this.a, n3nVar.a) && this.b == n3nVar.b && this.c == n3nVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(YAzniTbXHYQ.gkmFBHCA);
        sb.append(this.a);
        sb.append(", winnerColor=");
        sb.append(this.b);
        sb.append(rarBonoqWB.VUABVmmCSn);
        return zk1.a(this.c, ")", sb);
    }
}
